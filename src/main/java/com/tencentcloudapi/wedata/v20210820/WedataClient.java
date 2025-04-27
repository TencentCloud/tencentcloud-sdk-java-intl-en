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
package com.tencentcloudapi.wedata.v20210820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wedata.v20210820.models.*;

public class WedataClient extends AbstractClient{
    private static String endpoint = "wedata.intl.tencentcloudapi.com";
    private static String service = "wedata";
    private static String version = "2021-08-20";
    
    public WedataClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WedataClient(Credential credential, String region, ClientProfile profile) {
        super(WedataClient.endpoint, WedataClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a user role to a project.
     * @param req AddProjectUserRoleRequest
     * @return AddProjectUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public AddProjectUserRoleResponse AddProjectUserRole(AddProjectUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddProjectUserRole", AddProjectUserRoleResponse.class);
    }

    /**
     *Bulk Create Task Alert Rules
     * @param req BatchCreateIntegrationTaskAlarmsRequest
     * @return BatchCreateIntegrationTaskAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateIntegrationTaskAlarmsResponse BatchCreateIntegrationTaskAlarms(BatchCreateIntegrationTaskAlarmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateIntegrationTaskAlarms", BatchCreateIntegrationTaskAlarmsResponse.class);
    }

    /**
     *Batch Delete Integration Tasks.
     * @param req BatchDeleteIntegrationTasksRequest
     * @return BatchDeleteIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteIntegrationTasksResponse BatchDeleteIntegrationTasks(BatchDeleteIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteIntegrationTasks", BatchDeleteIntegrationTasksResponse.class);
    }

    /**
     *Task Operation and Maintenance - Batch Delete Tasks
     * @param req BatchDeleteOpsTasksRequest
     * @return BatchDeleteOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteOpsTasksResponse BatchDeleteOpsTasks(BatchDeleteOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteOpsTasks", BatchDeleteOpsTasksResponse.class);
    }

    /**
     *Batch set successful integration task instances
     * @param req BatchForceSuccessIntegrationTaskInstancesRequest
     * @return BatchForceSuccessIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchForceSuccessIntegrationTaskInstancesResponse BatchForceSuccessIntegrationTaskInstances(BatchForceSuccessIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchForceSuccessIntegrationTaskInstances", BatchForceSuccessIntegrationTaskInstancesResponse.class);
    }

    /**
     *Batch Terminate Integration Task Instances
     * @param req BatchKillIntegrationTaskInstancesRequest
     * @return BatchKillIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchKillIntegrationTaskInstancesResponse BatchKillIntegrationTaskInstances(BatchKillIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchKillIntegrationTaskInstances", BatchKillIntegrationTaskInstancesResponse.class);
    }

    /**
     *Perform Batch Data Supplement Operation on Integrated Offline Tasks
     * @param req BatchMakeUpIntegrationTasksRequest
     * @return BatchMakeUpIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchMakeUpIntegrationTasksResponse BatchMakeUpIntegrationTasks(BatchMakeUpIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchMakeUpIntegrationTasks", BatchMakeUpIntegrationTasksResponse.class);
    }

    /**
     *Batch Modify Task Assignee
     * @param req BatchModifyOpsOwnersRequest
     * @return BatchModifyOpsOwnersResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyOpsOwnersResponse BatchModifyOpsOwners(BatchModifyOpsOwnersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyOpsOwners", BatchModifyOpsOwnersResponse.class);
    }

    /**
     *Batch Rerun Integration Task Instances
     * @param req BatchRerunIntegrationTaskInstancesRequest
     * @return BatchRerunIntegrationTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BatchRerunIntegrationTaskInstancesResponse BatchRerunIntegrationTaskInstances(BatchRerunIntegrationTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRerunIntegrationTaskInstances", BatchRerunIntegrationTaskInstancesResponse.class);
    }

    /**
     *Batch Continue Execution of Integrated Real-time Tasks
     * @param req BatchResumeIntegrationTasksRequest
     * @return BatchResumeIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchResumeIntegrationTasksResponse BatchResumeIntegrationTasks(BatchResumeIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchResumeIntegrationTasks", BatchResumeIntegrationTasksResponse.class);
    }

    /**
     *Task Operation and Maintenance - Task List Batch Startup
     * @param req BatchRunOpsTaskRequest
     * @return BatchRunOpsTaskResponse
     * @throws TencentCloudSDKException
     */
    public BatchRunOpsTaskResponse BatchRunOpsTask(BatchRunOpsTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRunOpsTask", BatchRunOpsTaskResponse.class);
    }

    /**
     *Batch Run Integration Tasks
     * @param req BatchStartIntegrationTasksRequest
     * @return BatchStartIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStartIntegrationTasksResponse BatchStartIntegrationTasks(BatchStartIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStartIntegrationTasks", BatchStartIntegrationTasksResponse.class);
    }

    /**
     *Batch Stop Integration Tasks
     * @param req BatchStopIntegrationTasksRequest
     * @return BatchStopIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopIntegrationTasksResponse BatchStopIntegrationTasks(BatchStopIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopIntegrationTasks", BatchStopIntegrationTasksResponse.class);
    }

    /**
     *Only valid for tasks in "Scheduling In Progress" and "Paused" statuses, terminate the task instances of the selected tasks, and stop scheduling
     * @param req BatchStopOpsTasksRequest
     * @return BatchStopOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopOpsTasksResponse BatchStopOpsTasks(BatchStopOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopOpsTasks", BatchStopOpsTasksResponse.class);
    }

    /**
     *Batch Stop Workflow
     * @param req BatchStopWorkflowsByIdsRequest
     * @return BatchStopWorkflowsByIdsResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopWorkflowsByIdsResponse BatchStopWorkflowsByIds(BatchStopWorkflowsByIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchStopWorkflowsByIds", BatchStopWorkflowsByIdsResponse.class);
    }

    /**
     *Batch pause integration tasks
     * @param req BatchSuspendIntegrationTasksRequest
     * @return BatchSuspendIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchSuspendIntegrationTasksResponse BatchSuspendIntegrationTasks(BatchSuspendIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchSuspendIntegrationTasks", BatchSuspendIntegrationTasksResponse.class);
    }

    /**
     *Bulk Update Integration Tasks (Currently only supports bulk updating of the person in charge)
     * @param req BatchUpdateIntegrationTasksRequest
     * @return BatchUpdateIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateIntegrationTasksResponse BatchUpdateIntegrationTasks(BatchUpdateIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchUpdateIntegrationTasks", BatchUpdateIntegrationTasksResponse.class);
    }

    /**
     *Check for Duplicate Alert Rule Names
     * @param req CheckAlarmRegularNameExistRequest
     * @return CheckAlarmRegularNameExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckAlarmRegularNameExistResponse CheckAlarmRegularNameExist(CheckAlarmRegularNameExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAlarmRegularNameExist", CheckAlarmRegularNameExistResponse.class);
    }

    /**
     *Determining if the name of the integrated node exists
     * @param req CheckIntegrationNodeNameExistsRequest
     * @return CheckIntegrationNodeNameExistsResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntegrationNodeNameExistsResponse CheckIntegrationNodeNameExists(CheckIntegrationNodeNameExistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIntegrationNodeNameExists", CheckIntegrationNodeNameExistsResponse.class);
    }

    /**
     *Check if Integration Task Name Exists
     * @param req CheckIntegrationTaskNameExistsRequest
     * @return CheckIntegrationTaskNameExistsResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntegrationTaskNameExistsResponse CheckIntegrationTaskNameExists(CheckIntegrationTaskNameExistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIntegrationTaskNameExists", CheckIntegrationTaskNameExistsResponse.class);
    }

    /**
     *Offline Task Renaming Verification
     * @param req CheckTaskNameExistRequest
     * @return CheckTaskNameExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckTaskNameExistResponse CheckTaskNameExist(CheckTaskNameExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckTaskNameExist", CheckTaskNameExistResponse.class);
    }

    /**
     *Submit integration task
     * @param req CommitIntegrationTaskRequest
     * @return CommitIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitIntegrationTaskResponse CommitIntegrationTask(CommitIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitIntegrationTask", CommitIntegrationTaskResponse.class);
    }

    /**
     *Submit Rule Group to Run Task Interface
     * @param req CommitRuleGroupTaskRequest
     * @return CommitRuleGroupTaskResponse
     * @throws TencentCloudSDKException
     */
    public CommitRuleGroupTaskResponse CommitRuleGroupTask(CommitRuleGroupTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitRuleGroupTask", CommitRuleGroupTaskResponse.class);
    }

    /**
     *Statistics on task instance status
     * @param req CountOpsInstanceStateRequest
     * @return CountOpsInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public CountOpsInstanceStateResponse CountOpsInstanceState(CountOpsInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CountOpsInstanceState", CountOpsInstanceStateResponse.class);
    }

    /**
     *Create User-Defined Function
     * @param req CreateCustomFunctionRequest
     * @return CreateCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomFunctionResponse CreateCustomFunction(CreateCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomFunction", CreateCustomFunctionResponse.class);
    }

    /**
     *Create Data Source
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataSource", CreateDataSourceResponse.class);
    }

    /**
     *Orchestration Space - Create Folder
     * @param req CreateDsFolderRequest
     * @return CreateDsFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDsFolderResponse CreateDsFolder(CreateDsFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDsFolder", CreateDsFolderResponse.class);
    }

    /**
     *Create Hive Table
     * @param req CreateHiveTableRequest
     * @return CreateHiveTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateHiveTableResponse CreateHiveTable(CreateHiveTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHiveTable", CreateHiveTableResponse.class);
    }

    /**
     *Create Hive table and return table name
     * @param req CreateHiveTableByDDLRequest
     * @return CreateHiveTableByDDLResponse
     * @throws TencentCloudSDKException
     */
    public CreateHiveTableByDDLResponse CreateHiveTableByDDL(CreateHiveTableByDDLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHiveTableByDDL", CreateHiveTableByDDLResponse.class);
    }

    /**
     *Create Integration Node
     * @param req CreateIntegrationNodeRequest
     * @return CreateIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationNodeResponse CreateIntegrationNode(CreateIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntegrationNode", CreateIntegrationNodeResponse.class);
    }

    /**
     *Create Integration Task
     * @param req CreateIntegrationTaskRequest
     * @return CreateIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationTaskResponse CreateIntegrationTask(CreateIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntegrationTask", CreateIntegrationTaskResponse.class);
    }

    /**
     *Create Offline Task
     * @param req CreateOfflineTaskRequest
     * @return CreateOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineTaskResponse CreateOfflineTask(CreateOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOfflineTask", CreateOfflineTaskResponse.class);
    }

    /**
     *Bulk Data Supplement (Create Supplementary Entry Task)
     * @param req CreateOpsMakePlanRequest
     * @return CreateOpsMakePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpsMakePlanResponse CreateOpsMakePlan(CreateOpsMakePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOpsMakePlan", CreateOpsMakePlanResponse.class);
    }

    /**
     *Create quality rule interface
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *Create Rule Template
     * @param req CreateRuleTemplateRequest
     * @return CreateRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleTemplateResponse CreateRuleTemplate(CreateRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRuleTemplate", CreateRuleTemplateResponse.class);
    }

    /**
     *Creating task
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *Create task alert rules
     * @param req CreateTaskAlarmRegularRequest
     * @return CreateTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskAlarmRegularResponse CreateTaskAlarmRegular(CreateTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskAlarmRegular", CreateTaskAlarmRegularResponse.class);
    }

    /**
     *Orchestration Space - Workflow - Create Task Folder
     * @param req CreateTaskFolderRequest
     * @return CreateTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFolderResponse CreateTaskFolder(CreateTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFolder", CreateTaskFolderResponse.class);
    }

    /**
     *Submit Task Version
     * @param req CreateTaskVersionDsRequest
     * @return CreateTaskVersionDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskVersionDsResponse CreateTaskVersionDs(CreateTaskVersionDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskVersionDs", CreateTaskVersionDsResponse.class);
    }

    /**
     *Creating workflow
     * @param req CreateWorkflowDsRequest
     * @return CreateWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowDsResponse CreateWorkflowDs(CreateWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowDs", CreateWorkflowDsResponse.class);
    }

    /**
     *Pull DAG Instance
     * @param req DagInstancesRequest
     * @return DagInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DagInstancesResponse DagInstances(DagInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DagInstances", DagInstancesResponse.class);
    }

    /**
     *Delete user-defined Definition functions
     * @param req DeleteCustomFunctionRequest
     * @return DeleteCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomFunctionResponse DeleteCustomFunction(DeleteCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomFunction", DeleteCustomFunctionResponse.class);
    }

    /**
     *Delete Data Source
     * @param req DeleteDataSourcesRequest
     * @return DeleteDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourcesResponse DeleteDataSources(DeleteDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataSources", DeleteDataSourcesResponse.class);
    }

    /**
     *Orchestration space - delete folders
     * @param req DeleteDsFolderRequest
     * @return DeleteDsFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDsFolderResponse DeleteDsFolder(DeleteDsFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDsFolder", DeleteDsFolderResponse.class);
    }

    /**
     *Delete File
     * @param req DeleteFileRequest
     * @return DeleteFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileResponse DeleteFile(DeleteFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFile", DeleteFileResponse.class);
    }

    /**
     *Development Space - Batch Delete Directories and Files
     * @param req DeleteFilePathRequest
     * @return DeleteFilePathResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilePathResponse DeleteFilePath(DeleteFilePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFilePath", DeleteFilePathResponse.class);
    }

    /**
     *Delete Integration Node
     * @param req DeleteIntegrationNodeRequest
     * @return DeleteIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationNodeResponse DeleteIntegrationNode(DeleteIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIntegrationNode", DeleteIntegrationNodeResponse.class);
    }

    /**
     *Delete integration tasks
     * @param req DeleteIntegrationTaskRequest
     * @return DeleteIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationTaskResponse DeleteIntegrationTask(DeleteIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIntegrationTask", DeleteIntegrationTaskResponse.class);
    }

    /**
     *Deleting task
     * @param req DeleteOfflineTaskRequest
     * @return DeleteOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineTaskResponse DeleteOfflineTask(DeleteOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOfflineTask", DeleteOfflineTaskResponse.class);
    }

    /**
     *Delete Project Parameters
     * @param req DeleteProjectParamDsRequest
     * @return DeleteProjectParamDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectParamDsResponse DeleteProjectParamDs(DeleteProjectParamDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectParamDs", DeleteProjectParamDsResponse.class);
    }

    /**
     *Delete Project Users
     * @param req DeleteProjectUsersRequest
     * @return DeleteProjectUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectUsersResponse DeleteProjectUsers(DeleteProjectUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectUsers", DeleteProjectUsersResponse.class);
    }

    /**
     *Remove resources in Resource Management
     * @param req DeleteResourceRequest
     * @return DeleteResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceResponse DeleteResource(DeleteResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResource", DeleteResourceResponse.class);
    }

    /**
     *Resource Management - Delete Resource File
     * @param req DeleteResourceFileRequest
     * @return DeleteResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFileResponse DeleteResourceFile(DeleteResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFile", DeleteResourceFileResponse.class);
    }

    /**
     *Resource Management-Batch Delete Resource Files
     * @param req DeleteResourceFilesRequest
     * @return DeleteResourceFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFilesResponse DeleteResourceFiles(DeleteResourceFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFiles", DeleteResourceFilesResponse.class);
    }

    /**
     *Delete Quality Rule Interface
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *Deleting Rule Template
     * @param req DeleteRuleTemplateRequest
     * @return DeleteRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleTemplateResponse DeleteRuleTemplate(DeleteRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRuleTemplate", DeleteRuleTemplateResponse.class);
    }

    /**
     *Delete Task Alert Rule
     * @param req DeleteTaskAlarmRegularRequest
     * @return DeleteTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskAlarmRegularResponse DeleteTaskAlarmRegular(DeleteTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskAlarmRegular", DeleteTaskAlarmRegularResponse.class);
    }

    /**
     *Delete Orchestration Space Task
     * @param req DeleteTaskDsRequest
     * @return DeleteTaskDsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskDsResponse DeleteTaskDs(DeleteTaskDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskDs", DeleteTaskDsResponse.class);
    }

    /**
     *Delete Workflow by Workflow Id
     * @param req DeleteWorkflowByIdRequest
     * @return DeleteWorkflowByIdResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowByIdResponse DeleteWorkflowById(DeleteWorkflowByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowById", DeleteWorkflowByIdResponse.class);
    }

    /**
     *Alert event list
     * @param req DescribeAlarmEventsRequest
     * @return DescribeAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmEventsResponse DescribeAlarmEvents(DescribeAlarmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmEvents", DescribeAlarmEventsResponse.class);
    }

    /**
     *Alert Recipient Details
     * @param req DescribeAlarmReceiverRequest
     * @return DescribeAlarmReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmReceiverResponse DescribeAlarmReceiver(DescribeAlarmReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmReceiver", DescribeAlarmReceiverResponse.class);
    }

    /**
     *Query all subfolders + workflows under the parent directory
     * @param req DescribeAllByFolderNewRequest
     * @return DescribeAllByFolderNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllByFolderNewResponse DescribeAllByFolderNew(DescribeAllByFolderNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllByFolderNew", DescribeAllByFolderNewResponse.class);
    }

    /**
     *Getting pending approval list
     * @param req DescribeApproveListRequest
     * @return DescribeApproveListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApproveListResponse DescribeApproveList(DescribeApproveListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApproveList", DescribeApproveListResponse.class);
    }

    /**
     *Get Approval Category List
     * @param req DescribeApproveTypeListRequest
     * @return DescribeApproveTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApproveTypeListResponse DescribeApproveTypeList(DescribeApproveTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApproveTypeList", DescribeApproveTypeListResponse.class);
    }

    /**
     *Batch operation page to retrieve task list
     * @param req DescribeBatchOperateTaskRequest
     * @return DescribeBatchOperateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchOperateTaskResponse DescribeBatchOperateTask(DescribeBatchOperateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchOperateTask", DescribeBatchOperateTaskResponse.class);
    }

    /**
     *List Field Lineage Information
     * @param req DescribeColumnLineageRequest
     * @return DescribeColumnLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeColumnLineageResponse DescribeColumnLineage(DescribeColumnLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeColumnLineage", DescribeColumnLineageResponse.class);
    }

    /**
     *Query all column metadata of the table
     * @param req DescribeColumnsMetaRequest
     * @return DescribeColumnsMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeColumnsMetaResponse DescribeColumnsMeta(DescribeColumnsMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeColumnsMeta", DescribeColumnsMetaResponse.class);
    }

    /**
     *Data Quality Overview Page Data Monitoring Interface
     * @param req DescribeDataCheckStatRequest
     * @return DescribeDataCheckStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataCheckStatResponse DescribeDataCheckStat(DescribeDataCheckStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataCheckStat", DescribeDataCheckStatResponse.class);
    }

    /**
     *Obtain Data Source Information - Data Source Pagination List
     * @param req DescribeDataSourceInfoListRequest
     * @return DescribeDataSourceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceInfoListResponse DescribeDataSourceInfoList(DescribeDataSourceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceInfoList", DescribeDataSourceInfoListResponse.class);
    }

    /**
     *Data Source Details
     * @param req DescribeDataSourceListRequest
     * @return DescribeDataSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceListResponse DescribeDataSourceList(DescribeDataSourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceList", DescribeDataSourceListResponse.class);
    }

    /**
     *Obtain Database Information
     * @param req DescribeDatabaseInfoListRequest
     * @return DescribeDatabaseInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseInfoListResponse DescribeDatabaseInfoList(DescribeDatabaseInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseInfoList", DescribeDatabaseInfoListResponse.class);
    }

    /**
     *Querying database list
     * @param req DescribeDatabaseMetasRequest
     * @return DescribeDatabaseMetasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseMetasResponse DescribeDatabaseMetas(DescribeDatabaseMetasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseMetas", DescribeDatabaseMetasResponse.class);
    }

    /**
     *Data Source Details
     * @param req DescribeDatasourceRequest
     * @return DescribeDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceResponse DescribeDatasource(DescribeDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasource", DescribeDatasourceResponse.class);
    }

    /**
     *Search for upstream/downstream task nodes by hierarchy
     * @param req DescribeDependOpsTasksRequest
     * @return DescribeDependOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependOpsTasksResponse DescribeDependOpsTasks(DescribeDependOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependOpsTasks", DescribeDependOpsTasksResponse.class);
    }

    /**
     *Query Task Detail List by taskIds
     * @param req DescribeDependTaskListsRequest
     * @return DescribeDependTaskListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTaskListsResponse DescribeDependTaskLists(DescribeDependTaskListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDependTaskLists", DescribeDependTaskListsResponse.class);
    }

    /**
     *Quality Report - Query Quality Score
     * @param req DescribeDimensionScoreRequest
     * @return DescribeDimensionScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDimensionScoreResponse DescribeDimensionScore(DescribeDimensionScoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDimensionScore", DescribeDimensionScoreResponse.class);
    }

    /**
     *Paginated Query of Trial Run Instance List
     * @param req DescribeDrInstancePageRequest
     * @return DescribeDrInstancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrInstancePageResponse DescribeDrInstancePage(DescribeDrInstancePageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDrInstancePage", DescribeDrInstancePageResponse.class);
    }

    /**
     *Query Directory Tree
     * @param req DescribeDsFolderTreeRequest
     * @return DescribeDsFolderTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsFolderTreeResponse DescribeDsFolderTree(DescribeDsFolderTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsFolderTree", DescribeDsFolderTreeResponse.class);
    }

    /**
     *Query Parent Directory Tree, for Workflow, Task Localization
     * @param req DescribeDsParentFolderTreeRequest
     * @return DescribeDsParentFolderTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDsParentFolderTreeResponse DescribeDsParentFolderTree(DescribeDsParentFolderTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDsParentFolderTree", DescribeDsParentFolderTreeResponse.class);
    }

    /**
     *View Event Details by Project ID and Event Name
     * @param req DescribeEventRequest
     * @return DescribeEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventResponse DescribeEvent(DescribeEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvent", DescribeEventResponse.class);
    }

    /**
     *Find Event Instances Based on Conditions
     * @param req DescribeEventCasesRequest
     * @return DescribeEventCasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventCasesResponse DescribeEventCases(DescribeEventCasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventCases", DescribeEventCasesResponse.class);
    }

    /**
     *Viewing consumption tasks of event instances
     * @param req DescribeEventConsumeTasksRequest
     * @return DescribeEventConsumeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventConsumeTasksResponse DescribeEventConsumeTasks(DescribeEventConsumeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventConsumeTasks", DescribeEventConsumeTasksResponse.class);
    }

    /**
     *Query Rule Group Execution Policy
     * @param req DescribeExecStrategyRequest
     * @return DescribeExecStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExecStrategyResponse DescribeExecStrategy(DescribeExecStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExecStrategy", DescribeExecStrategyResponse.class);
    }

    /**
     *Metadata Model - Field Basic Information Query Interface
     * @param req DescribeFieldBasicInfoRequest
     * @return DescribeFieldBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFieldBasicInfoResponse DescribeFieldBasicInfo(DescribeFieldBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFieldBasicInfo", DescribeFieldBasicInfoResponse.class);
    }

    /**
     *Get all workflow lists under the project by Project ID
     * @param req DescribeFolderWorkflowListRequest
     * @return DescribeFolderWorkflowListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderWorkflowListResponse DescribeFolderWorkflowList(DescribeFolderWorkflowListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFolderWorkflowList", DescribeFolderWorkflowListResponse.class);
    }

    /**
     *Query Function Classification
     * @param req DescribeFunctionKindsRequest
     * @return DescribeFunctionKindsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionKindsResponse DescribeFunctionKinds(DescribeFunctionKindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionKinds", DescribeFunctionKindsResponse.class);
    }

    /**
     *Query Function Type
     * @param req DescribeFunctionTypesRequest
     * @return DescribeFunctionTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionTypesResponse DescribeFunctionTypes(DescribeFunctionTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionTypes", DescribeFunctionTypesResponse.class);
    }

    /**
     *Query all instances by cycle type
     * @param req DescribeInstanceByCycleRequest
     * @return DescribeInstanceByCycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByCycleResponse DescribeInstanceByCycle(DescribeInstanceByCycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceByCycle", DescribeInstanceByCycleResponse.class);
    }

    /**
     *Log Detail Acquisition Page
     * @param req DescribeInstanceLastLogRequest
     * @return DescribeInstanceLastLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLastLogResponse DescribeInstanceLastLog(DescribeInstanceLastLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLastLog", DescribeInstanceLastLogResponse.class);
    }

    /**
     *Get Instance List
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *Get Instance Running Logs
     * @param req DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogResponse DescribeInstanceLog(DescribeInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLog", DescribeInstanceLogResponse.class);
    }

    /**
     *Obtain Specific Instance-related Log Information
     * @param req DescribeInstanceLogDetailRequest
     * @return DescribeInstanceLogDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogDetailResponse DescribeInstanceLogDetail(DescribeInstanceLogDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogDetail", DescribeInstanceLogDetailResponse.class);
    }

    /**
     *Download Log File, Return Log Download URL
     * @param req DescribeInstanceLogFileRequest
     * @return DescribeInstanceLogFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogFileResponse DescribeInstanceLogFile(DescribeInstanceLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogFile", DescribeInstanceLogFileResponse.class);
    }

    /**
     *Offline Task Instance Run Log List
     * @param req DescribeInstanceLogListRequest
     * @return DescribeInstanceLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogListResponse DescribeInstanceLogList(DescribeInstanceLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogList", DescribeInstanceLogListResponse.class);
    }

    /**
     *Query integrated nodes
     * @param req DescribeIntegrationNodeRequest
     * @return DescribeIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationNodeResponse DescribeIntegrationNode(DescribeIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationNode", DescribeIntegrationNodeResponse.class);
    }

    /**
     *DataInLong Dashboard Overview
     * @param req DescribeIntegrationStatisticsRequest
     * @return DescribeIntegrationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsResponse DescribeIntegrationStatistics(DescribeIntegrationStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatistics", DescribeIntegrationStatisticsResponse.class);
    }

    /**
     *DataInLong dashboard instance status statistical trend
     * @param req DescribeIntegrationStatisticsInstanceTrendRequest
     * @return DescribeIntegrationStatisticsInstanceTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsInstanceTrendResponse DescribeIntegrationStatisticsInstanceTrend(DescribeIntegrationStatisticsInstanceTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsInstanceTrend", DescribeIntegrationStatisticsInstanceTrendResponse.class);
    }

    /**
     *DataInLong Dashboard synchronization count trend
     * @param req DescribeIntegrationStatisticsRecordsTrendRequest
     * @return DescribeIntegrationStatisticsRecordsTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsRecordsTrendResponse DescribeIntegrationStatisticsRecordsTrend(DescribeIntegrationStatisticsRecordsTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsRecordsTrend", DescribeIntegrationStatisticsRecordsTrendResponse.class);
    }

    /**
     *DataInLong Dashboard Task Status Distribution Statistics
     * @param req DescribeIntegrationStatisticsTaskStatusRequest
     * @return DescribeIntegrationStatisticsTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsTaskStatusResponse DescribeIntegrationStatisticsTaskStatus(DescribeIntegrationStatisticsTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsTaskStatus", DescribeIntegrationStatisticsTaskStatusResponse.class);
    }

    /**
     *DataInLong Dashboard Task Status Statistical Trend
     * @param req DescribeIntegrationStatisticsTaskStatusTrendRequest
     * @return DescribeIntegrationStatisticsTaskStatusTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationStatisticsTaskStatusTrendResponse DescribeIntegrationStatisticsTaskStatusTrend(DescribeIntegrationStatisticsTaskStatusTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationStatisticsTaskStatusTrend", DescribeIntegrationStatisticsTaskStatusTrendResponse.class);
    }

    /**
     *Query integration tasks
     * @param req DescribeIntegrationTaskRequest
     * @return DescribeIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationTaskResponse DescribeIntegrationTask(DescribeIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationTask", DescribeIntegrationTaskResponse.class);
    }

    /**
     *Query Integration Task List
     * @param req DescribeIntegrationTasksRequest
     * @return DescribeIntegrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationTasksResponse DescribeIntegrationTasks(DescribeIntegrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationTasks", DescribeIntegrationTasksResponse.class);
    }

    /**
     *Query Integration Task Version Node Information
     * @param req DescribeIntegrationVersionNodesInfoRequest
     * @return DescribeIntegrationVersionNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationVersionNodesInfoResponse DescribeIntegrationVersionNodesInfo(DescribeIntegrationVersionNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntegrationVersionNodesInfo", DescribeIntegrationVersionNodesInfoResponse.class);
    }

    /**
     *Getting long connection Token for offline tasks
     * @param req DescribeOfflineTaskTokenRequest
     * @return DescribeOfflineTaskTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineTaskTokenResponse DescribeOfflineTaskToken(DescribeOfflineTaskTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfflineTaskToken", DescribeOfflineTaskTokenResponse.class);
    }

    /**
     *Task Operation and Maintenance List Combined Condition Query
     * @param req DescribeOperateOpsTasksRequest
     * @return DescribeOperateOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperateOpsTasksResponse DescribeOperateOpsTasks(DescribeOperateOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOperateOpsTasks", DescribeOperateOpsTasksResponse.class);
    }

    /**
     *Instance Operation and Maintenance - Get Instance Log List
     * @param req DescribeOpsInstanceLogListRequest
     * @return DescribeOpsInstanceLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsInstanceLogListResponse DescribeOpsInstanceLogList(DescribeOpsInstanceLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsInstanceLogList", DescribeOpsInstanceLogListResponse.class);
    }

    /**
     *Obtain the Supplementary Instance List based on the Supplementary Plan and Task.
     * @param req DescribeOpsMakePlanInstancesRequest
     * @return DescribeOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlanInstancesResponse DescribeOpsMakePlanInstances(DescribeOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsMakePlanInstances", DescribeOpsMakePlanInstancesResponse.class);
    }

    /**
     *View Supplemental Plan Tasks
     * @param req DescribeOpsMakePlanTasksRequest
     * @return DescribeOpsMakePlanTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlanTasksResponse DescribeOpsMakePlanTasks(DescribeOpsMakePlanTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsMakePlanTasks", DescribeOpsMakePlanTasksResponse.class);
    }

    /**
     *Paginated Query of Supplement Plan Based on Conditions
     * @param req DescribeOpsMakePlansRequest
     * @return DescribeOpsMakePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsMakePlansResponse DescribeOpsMakePlans(DescribeOpsMakePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsMakePlans", DescribeOpsMakePlansResponse.class);
    }

    /**
     *Querying User Production Workflow List
     * @param req DescribeOpsWorkflowsRequest
     * @return DescribeOpsWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpsWorkflowsResponse DescribeOpsWorkflows(DescribeOpsWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpsWorkflows", DescribeOpsWorkflowsResponse.class);
    }

    /**
     *Query Full Functionality
     * @param req DescribeOrganizationalFunctionsRequest
     * @return DescribeOrganizationalFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationalFunctionsResponse DescribeOrganizationalFunctions(DescribeOrganizationalFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationalFunctions", DescribeOrganizationalFunctionsResponse.class);
    }

    /**
     *Retrieving Project Information
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProject", DescribeProjectResponse.class);
    }

    /**
     *Quality Report - Quality Score
     * @param req DescribeQualityScoreRequest
     * @return DescribeQualityScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreResponse DescribeQualityScore(DescribeQualityScoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityScore", DescribeQualityScoreResponse.class);
    }

    /**
     *Quality Report - Quality Score Periodic Trend
     * @param req DescribeQualityScoreTrendRequest
     * @return DescribeQualityScoreTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreTrendResponse DescribeQualityScoreTrend(DescribeQualityScoreTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityScoreTrend", DescribeQualityScoreTrendResponse.class);
    }

    /**
     *Query Real-time Task Instance Node Information
     * @param req DescribeRealTimeTaskInstanceNodeInfoRequest
     * @return DescribeRealTimeTaskInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskInstanceNodeInfoResponse DescribeRealTimeTaskInstanceNodeInfo(DescribeRealTimeTaskInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealTimeTaskInstanceNodeInfo", DescribeRealTimeTaskInstanceNodeInfoResponse.class);
    }

    /**
     *Real-time Task Running Metrics Overview
     * @param req DescribeRealTimeTaskMetricOverviewRequest
     * @return DescribeRealTimeTaskMetricOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskMetricOverviewResponse DescribeRealTimeTaskMetricOverview(DescribeRealTimeTaskMetricOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealTimeTaskMetricOverview", DescribeRealTimeTaskMetricOverviewResponse.class);
    }

    /**
     *Real-time task synchronization speed trend
     * @param req DescribeRealTimeTaskSpeedRequest
     * @return DescribeRealTimeTaskSpeedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealTimeTaskSpeedResponse DescribeRealTimeTaskSpeed(DescribeRealTimeTaskSpeedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealTimeTaskSpeed", DescribeRealTimeTaskSpeedResponse.class);
    }

    /**
     *This API is used to query task details for reports.
     * @param req DescribeReportTaskDetailRequest
     * @return DescribeReportTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTaskDetailResponse DescribeReportTaskDetail(DescribeReportTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportTaskDetail", DescribeReportTaskDetailResponse.class);
    }

    /**
     *This API is used to query the task submission list.
     * @param req DescribeReportTaskListRequest
     * @return DescribeReportTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTaskListResponse DescribeReportTaskList(DescribeReportTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportTaskList", DescribeReportTaskListResponse.class);
    }

    /**
     *Retrieve resource management directory tree
     * @param req DescribeResourceManagePathTreesRequest
     * @return DescribeResourceManagePathTreesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceManagePathTreesResponse DescribeResourceManagePathTrees(DescribeResourceManagePathTreesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceManagePathTrees", DescribeResourceManagePathTreesResponse.class);
    }

    /**
     *This API is used to retrieve role list information.
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *Queries rule details
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRule", DescribeRuleResponse.class);
    }

    /**
     *Data Quality Overview Page Triggers Dimension Distribution Statistics Interface
     * @param req DescribeRuleDimStatRequest
     * @return DescribeRuleDimStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDimStatResponse DescribeRuleDimStat(DescribeRuleDimStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleDimStat", DescribeRuleDimStatResponse.class);
    }

    /**
     *Query Rule Execution Result Details
     * @param req DescribeRuleExecDetailRequest
     * @return DescribeRuleExecDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecDetailResponse DescribeRuleExecDetail(DescribeRuleExecDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecDetail", DescribeRuleExecDetailResponse.class);
    }

    /**
     *Rule Execution Log Query
     * @param req DescribeRuleExecLogRequest
     * @return DescribeRuleExecLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecLogResponse DescribeRuleExecLog(DescribeRuleExecLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecLog", DescribeRuleExecLogResponse.class);
    }

    /**
     *Query Rule Execution Result List
     * @param req DescribeRuleExecResultsRequest
     * @return DescribeRuleExecResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecResultsResponse DescribeRuleExecResults(DescribeRuleExecResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecResults", DescribeRuleExecResultsResponse.class);
    }

    /**
     *Data Quality Overview Page Rule Operation Interface
     * @param req DescribeRuleExecStatRequest
     * @return DescribeRuleExecStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleExecStatResponse DescribeRuleExecStat(DescribeRuleExecStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleExecStat", DescribeRuleExecStatResponse.class);
    }

    /**
     *Query Rule Group Details Interface
     * @param req DescribeRuleGroupRequest
     * @return DescribeRuleGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupResponse DescribeRuleGroup(DescribeRuleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroup", DescribeRuleGroupResponse.class);
    }

    /**
     *Rule Group Execution Result Pagination Query Interface
     * @param req DescribeRuleGroupExecResultsByPageRequest
     * @return DescribeRuleGroupExecResultsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupExecResultsByPageResponse DescribeRuleGroupExecResultsByPage(DescribeRuleGroupExecResultsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupExecResultsByPage", DescribeRuleGroupExecResultsByPageResponse.class);
    }

    /**
     *Query Rule Group Subscription Information
     * @param req DescribeRuleGroupSubscriptionRequest
     * @return DescribeRuleGroupSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupSubscriptionResponse DescribeRuleGroupSubscription(DescribeRuleGroupSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupSubscription", DescribeRuleGroupSubscriptionResponse.class);
    }

    /**
     *Query Table Binding Execution Rule Group Information
     * @param req DescribeRuleGroupTableRequest
     * @return DescribeRuleGroupTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupTableResponse DescribeRuleGroupTable(DescribeRuleGroupTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupTable", DescribeRuleGroupTableResponse.class);
    }

    /**
     *[Filter Criteria]
{Table Name (TableName), supports fuzzy matching}       {Table Owner (TableOwnerName), supports fuzzy matching}      {Monitoring Methods (MonitorTypes), 1. Not Configured 2. Linked to Production Scheduling 3. Offline Periodic Inspection, supports multiple selections}  {Subscriber (ReceiverUin)}
[Required Fields]
{Data Source (DatasourceId)}
     * @param req DescribeRuleGroupsByPageRequest
     * @return DescribeRuleGroupsByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleGroupsByPageResponse DescribeRuleGroupsByPage(DescribeRuleGroupsByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleGroupsByPage", DescribeRuleGroupsByPageResponse.class);
    }

    /**
     *Query Template Details
     * @param req DescribeRuleTemplateRequest
     * @return DescribeRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplateResponse DescribeRuleTemplate(DescribeRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplate", DescribeRuleTemplateResponse.class);
    }

    /**
     *Viewing Rule Template List
     * @param req DescribeRuleTemplatesRequest
     * @return DescribeRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesResponse DescribeRuleTemplates(DescribeRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplates", DescribeRuleTemplatesResponse.class);
    }

    /**
     *[Filter Conditions] {Template Name (Name), supports fuzzy matching} {Template Type (type), 1.System Template 2.Custom Definition Template} {Quality Detection Dimensions (QualityDims), 1.Accuracy 2.Uniqueness 3.Integrity 4.Consistency 5.Timeliness 6.Validity} [Sorting Field] {Citation Sorting Type (CitationOrderType), sort by citation count ASC DESC}
     * @param req DescribeRuleTemplatesByPageRequest
     * @return DescribeRuleTemplatesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleTemplatesByPageResponse DescribeRuleTemplatesByPage(DescribeRuleTemplatesByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleTemplatesByPage", DescribeRuleTemplatesByPageResponse.class);
    }

    /**
     *Query Quality Rule List
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *Paginated Query of Quality Rules
     * @param req DescribeRulesByPageRequest
     * @return DescribeRulesByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByPageResponse DescribeRulesByPage(DescribeRulesByPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesByPage", DescribeRulesByPageResponse.class);
    }

    /**
     *Get Instance List
     * @param req DescribeScheduleInstancesRequest
     * @return DescribeScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduleInstancesResponse DescribeScheduleInstances(DescribeScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduleInstances", DescribeScheduleInstancesResponse.class);
    }

    /**
     *Operation and Maintenance Dashboard-Instance Status Distribution
     * @param req DescribeSchedulerInstanceStatusRequest
     * @return DescribeSchedulerInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerInstanceStatusResponse DescribeSchedulerInstanceStatus(DescribeSchedulerInstanceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerInstanceStatus", DescribeSchedulerInstanceStatusResponse.class);
    }

    /**
     *Operation and Maintenance Dashboard - Instance Running Duration Ranking
     * @param req DescribeSchedulerRunTimeInstanceCntByStatusRequest
     * @return DescribeSchedulerRunTimeInstanceCntByStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerRunTimeInstanceCntByStatusResponse DescribeSchedulerRunTimeInstanceCntByStatus(DescribeSchedulerRunTimeInstanceCntByStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerRunTimeInstanceCntByStatus", DescribeSchedulerRunTimeInstanceCntByStatusResponse.class);
    }

    /**
     *Task Status Statistics
     * @param req DescribeSchedulerTaskCntByStatusRequest
     * @return DescribeSchedulerTaskCntByStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerTaskCntByStatusResponse DescribeSchedulerTaskCntByStatus(DescribeSchedulerTaskCntByStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerTaskCntByStatus", DescribeSchedulerTaskCntByStatusResponse.class);
    }

    /**
     *Operation and Maintenance Dashboard - Task Status Distribution
     * @param req DescribeSchedulerTaskTypeCntRequest
     * @return DescribeSchedulerTaskTypeCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulerTaskTypeCntResponse DescribeSchedulerTaskTypeCnt(DescribeSchedulerTaskTypeCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSchedulerTaskTypeCnt", DescribeSchedulerTaskTypeCntResponse.class);
    }

    /**
     *Task Status Trend
     * @param req DescribeStatisticInstanceStatusTrendOpsRequest
     * @return DescribeStatisticInstanceStatusTrendOpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticInstanceStatusTrendOpsResponse DescribeStatisticInstanceStatusTrendOps(DescribeStatisticInstanceStatusTrendOpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStatisticInstanceStatusTrendOps", DescribeStatisticInstanceStatusTrendOpsResponse.class);
    }

    /**
     *Query real-time task log list
     * @param req DescribeStreamTaskLogListRequest
     * @return DescribeStreamTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamTaskLogListResponse DescribeStreamTaskLogList(DescribeStreamTaskLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamTaskLogList", DescribeStreamTaskLogListResponse.class);
    }

    /**
     *Get Downstream Task Information
     * @param req DescribeSuccessorOpsTaskInfosRequest
     * @return DescribeSuccessorOpsTaskInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuccessorOpsTaskInfosResponse DescribeSuccessorOpsTaskInfos(DescribeSuccessorOpsTaskInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSuccessorOpsTaskInfos", DescribeSuccessorOpsTaskInfosResponse.class);
    }

    /**
     *Metadata Model-Table Basic Information Query Interface
     * @param req DescribeTableBasicInfoRequest
     * @return DescribeTableBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableBasicInfoResponse DescribeTableBasicInfo(DescribeTableBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableBasicInfo", DescribeTableBasicInfoResponse.class);
    }

    /**
     *Retrieve Data Table Information
     * @param req DescribeTableInfoListRequest
     * @return DescribeTableInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableInfoListResponse DescribeTableInfoList(DescribeTableInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableInfoList", DescribeTableInfoListResponse.class);
    }

    /**
     *List Table Lineage Information
     * @param req DescribeTableLineageRequest
     * @return DescribeTableLineageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableLineageResponse DescribeTableLineage(DescribeTableLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableLineage", DescribeTableLineageResponse.class);
    }

    /**
     *List Table Lineage Information
     * @param req DescribeTableLineageInfoRequest
     * @return DescribeTableLineageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableLineageInfoResponse DescribeTableLineageInfo(DescribeTableLineageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableLineageInfo", DescribeTableLineageInfoResponse.class);
    }

    /**
     *Querying Table Metadata Details
     * @param req DescribeTableMetaRequest
     * @return DescribeTableMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableMetaResponse DescribeTableMeta(DescribeTableMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableMeta", DescribeTableMetaResponse.class);
    }

    /**
     *Get Table Metadata List
     * @param req DescribeTableMetasRequest
     * @return DescribeTableMetasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableMetasResponse DescribeTableMetas(DescribeTableMetasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableMetas", DescribeTableMetasResponse.class);
    }

    /**
     *Quality Report - Query Table Quality Details
     * @param req DescribeTableQualityDetailsRequest
     * @return DescribeTableQualityDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableQualityDetailsResponse DescribeTableQualityDetails(DescribeTableQualityDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableQualityDetails", DescribeTableQualityDetailsResponse.class);
    }

    /**
     *Retrieve Table Schema Information
     * @param req DescribeTableSchemaInfoRequest
     * @return DescribeTableSchemaInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableSchemaInfoResponse DescribeTableSchemaInfo(DescribeTableSchemaInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableSchemaInfo", DescribeTableSchemaInfoResponse.class);
    }

    /**
     *Query Table Score Trend
     * @param req DescribeTableScoreTrendRequest
     * @return DescribeTableScoreTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableScoreTrendResponse DescribeTableScoreTrend(DescribeTableScoreTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableScoreTrend", DescribeTableScoreTrendResponse.class);
    }

    /**
     *Query Task Alert Rule List
     * @param req DescribeTaskAlarmRegulationsRequest
     * @return DescribeTaskAlarmRegulationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskAlarmRegulationsResponse DescribeTaskAlarmRegulations(DescribeTaskAlarmRegulationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskAlarmRegulations", DescribeTaskAlarmRegulationsResponse.class);
    }

    /**
     *Query all tasks by cycle type
     * @param req DescribeTaskByCycleRequest
     * @return DescribeTaskByCycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByCycleResponse DescribeTaskByCycle(DescribeTaskByCycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskByCycle", DescribeTaskByCycleResponse.class);
    }

    /**
     *Task Status Cycle Growth Trend
     * @param req DescribeTaskByCycleReportRequest
     * @return DescribeTaskByCycleReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByCycleReportResponse DescribeTaskByCycleReport(DescribeTaskByCycleReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskByCycleReport", DescribeTaskByCycleReportResponse.class);
    }

    /**
     *Task Status Trend
     * @param req DescribeTaskByStatusReportRequest
     * @return DescribeTaskByStatusReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskByStatusReportResponse DescribeTaskByStatusReport(DescribeTaskByStatusReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskByStatusReport", DescribeTaskByStatusReportResponse.class);
    }

    /**
     *View Task Lock Status Information
     * @param req DescribeTaskLockStatusRequest
     * @return DescribeTaskLockStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLockStatusResponse DescribeTaskLockStatus(DescribeTaskLockStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLockStatus", DescribeTaskLockStatusResponse.class);
    }

    /**
     *Paging Query Task Execution History
     * @param req DescribeTaskRunHistoryRequest
     * @return DescribeTaskRunHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskRunHistoryResponse DescribeTaskRunHistory(DescribeTaskRunHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskRunHistory", DescribeTaskRunHistoryResponse.class);
    }

    /**
     *Query Task Script
     * @param req DescribeTaskScriptRequest
     * @return DescribeTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskScriptResponse DescribeTaskScript(DescribeTaskScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskScript", DescribeTaskScriptResponse.class);
    }

    /**
     *Query rule template dimension distribution
     * @param req DescribeTemplateDimCountRequest
     * @return DescribeTemplateDimCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateDimCountResponse DescribeTemplateDimCount(DescribeTemplateDimCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateDimCount", DescribeTemplateDimCountResponse.class);
    }

    /**
     *Get third-party operation logs
     * @param req DescribeThirdTaskRunLogRequest
     * @return DescribeThirdTaskRunLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdTaskRunLogResponse DescribeThirdTaskRunLog(DescribeThirdTaskRunLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeThirdTaskRunLog", DescribeThirdTaskRunLogResponse.class);
    }

    /**
     *Data Quality Overview Page Table Ranking Interface
     * @param req DescribeTopTableStatRequest
     * @return DescribeTopTableStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopTableStatResponse DescribeTopTableStat(DescribeTopTableStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopTableStat", DescribeTopTableStatResponse.class);
    }

    /**
     *Data Quality Overview Page Trend Change Interface
     * @param req DescribeTrendStatRequest
     * @return DescribeTrendStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrendStatResponse DescribeTrendStat(DescribeTrendStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrendStat", DescribeTrendStatResponse.class);
    }

    /**
     *Query Workflow Canvas
     * @param req DescribeWorkflowCanvasInfoRequest
     * @return DescribeWorkflowCanvasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowCanvasInfoResponse DescribeWorkflowCanvasInfo(DescribeWorkflowCanvasInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowCanvasInfo", DescribeWorkflowCanvasInfoResponse.class);
    }

    /**
     *Query Workflow Canvas Run Start and End Time
     * @param req DescribeWorkflowExecuteByIdRequest
     * @return DescribeWorkflowExecuteByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowExecuteByIdResponse DescribeWorkflowExecuteById(DescribeWorkflowExecuteByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowExecuteById", DescribeWorkflowExecuteByIdResponse.class);
    }

    /**
     *Query Workflow Details by Workflow ID
     * @param req DescribeWorkflowInfoByIdRequest
     * @return DescribeWorkflowInfoByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowInfoByIdResponse DescribeWorkflowInfoById(DescribeWorkflowInfoByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowInfoById", DescribeWorkflowInfoByIdResponse.class);
    }

    /**
     *Get all workflow lists under the project by Project ID
     * @param req DescribeWorkflowListByProjectIdRequest
     * @return DescribeWorkflowListByProjectIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowListByProjectIdResponse DescribeWorkflowListByProjectId(DescribeWorkflowListByProjectIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowListByProjectId", DescribeWorkflowListByProjectIdResponse.class);
    }

    /**
     *Query the number of workflow tasks
     * @param req DescribeWorkflowTaskCountRequest
     * @return DescribeWorkflowTaskCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowTaskCountResponse DescribeWorkflowTaskCount(DescribeWorkflowTaskCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkflowTaskCount", DescribeWorkflowTaskCountResponse.class);
    }

    /**
     *Instance diagnosis for diagnosing instances in INITIAL, DEPENDENCE, ALLOCATED, LAUNCHED, EVENT_LISTENING, BEFORE_ASPECT, EXPIRED, FAILED states
     * @param req DiagnoseProRequest
     * @return DiagnoseProResponse
     * @throws TencentCloudSDKException
     */
    public DiagnoseProResponse DiagnosePro(DiagnoseProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DiagnosePro", DiagnoseProResponse.class);
    }

    /**
     *Debug and Run Integration Task
     * @param req DryRunDIOfflineTaskRequest
     * @return DryRunDIOfflineTaskResponse
     * @throws TencentCloudSDKException
     */
    public DryRunDIOfflineTaskResponse DryRunDIOfflineTask(DryRunDIOfflineTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DryRunDIOfflineTask", DryRunDIOfflineTaskResponse.class);
    }

    /**
     *Orchestration Space Bulk Operation Page Find All Folders
     * @param req FindAllFolderRequest
     * @return FindAllFolderResponse
     * @throws TencentCloudSDKException
     */
    public FindAllFolderResponse FindAllFolder(FindAllFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FindAllFolder", FindAllFolderResponse.class);
    }

    /**
     *Task Operation and Maintenance - Bulk Pause Tasks
     * @param req FreezeOpsTasksRequest
     * @return FreezeOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeOpsTasksResponse FreezeOpsTasks(FreezeOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeOpsTasks", FreezeOpsTasksResponse.class);
    }

    /**
     *Pause All Tasks Under Workflow
     * @param req FreezeTasksByWorkflowIdsRequest
     * @return FreezeTasksByWorkflowIdsResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksByWorkflowIdsResponse FreezeTasksByWorkflowIds(FreezeTasksByWorkflowIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeTasksByWorkflowIds", FreezeTasksByWorkflowIdsResponse.class);
    }

    /**
     *Generate SQL for Creating Hive Table
     * @param req GenHiveTableDDLSqlRequest
     * @return GenHiveTableDDLSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenHiveTableDDLSqlResponse GenHiveTableDDLSql(GenHiveTableDDLSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenHiveTableDDLSql", GenHiveTableDDLSqlResponse.class);
    }

    /**
     *Development Space - Obtain data development script information
     * @param req GetFileInfoRequest
     * @return GetFileInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetFileInfoResponse GetFileInfo(GetFileInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFileInfo", GetFileInfoResponse.class);
    }

    /**
     *This API is used to obtain instance lists.
     * @param req GetInstanceLogRequest
     * @return GetInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceLogResponse GetInstanceLog(GetInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInstanceLog", GetInstanceLogResponse.class);
    }

    /**
     *Extracting DataInLong Node Field Schema
     * @param req GetIntegrationNodeColumnSchemaRequest
     * @return GetIntegrationNodeColumnSchemaResponse
     * @throws TencentCloudSDKException
     */
    public GetIntegrationNodeColumnSchemaResponse GetIntegrationNodeColumnSchema(GetIntegrationNodeColumnSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetIntegrationNodeColumnSchema", GetIntegrationNodeColumnSchemaResponse.class);
    }

    /**
     *Get Offline Task Instance List (New)
     * @param req GetOfflineDIInstanceListRequest
     * @return GetOfflineDIInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public GetOfflineDIInstanceListResponse GetOfflineDIInstanceList(GetOfflineDIInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOfflineDIInstanceList", GetOfflineDIInstanceListResponse.class);
    }

    /**
     *Obtain Offline Task Instances
     * @param req GetOfflineInstanceListRequest
     * @return GetOfflineInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public GetOfflineInstanceListResponse GetOfflineInstanceList(GetOfflineInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOfflineInstanceList", GetOfflineInstanceListResponse.class);
    }

    /**
     *This API is used to obtain instance lists.
     * @param req GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskInstanceResponse GetTaskInstance(GetTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskInstance", GetTaskInstanceResponse.class);
    }

    /**
     *Batch Termination of Instances by Supplement Plan.
     * @param req KillOpsMakePlanInstancesRequest
     * @return KillOpsMakePlanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillOpsMakePlanInstancesResponse KillOpsMakePlanInstances(KillOpsMakePlanInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillOpsMakePlanInstances", KillOpsMakePlanInstancesResponse.class);
    }

    /**
     *Batch Termination of Instances
     * @param req KillScheduleInstancesRequest
     * @return KillScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillScheduleInstancesResponse KillScheduleInstances(KillScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillScheduleInstances", KillScheduleInstancesResponse.class);
    }

    /**
     *This API is used to obtain instance lists.
     * @param req ListInstancesRequest
     * @return ListInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListInstancesResponse ListInstances(ListInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListInstances", ListInstancesResponse.class);
    }

    /**
     *Lock Integration Task
     * @param req LockIntegrationTaskRequest
     * @return LockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public LockIntegrationTaskResponse LockIntegrationTask(LockIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LockIntegrationTask", LockIntegrationTaskResponse.class);
    }

    /**
     *Modify Approval Form Status
     * @param req ModifyApproveStatusRequest
     * @return ModifyApproveStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApproveStatusResponse ModifyApproveStatus(ModifyApproveStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApproveStatus", ModifyApproveStatusResponse.class);
    }

    /**
     *Modify Data Source
     * @param req ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataSourceResponse ModifyDataSource(ModifyDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataSource", ModifyDataSourceResponse.class);
    }

    /**
     *Quality Report - Modify Dimension Permissions
     * @param req ModifyDimensionWeightRequest
     * @return ModifyDimensionWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDimensionWeightResponse ModifyDimensionWeight(ModifyDimensionWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDimensionWeight", ModifyDimensionWeightResponse.class);
    }

    /**
     *Data Development Module - Folder Update
     * @param req ModifyDsFolderRequest
     * @return ModifyDsFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDsFolderResponse ModifyDsFolder(ModifyDsFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDsFolder", ModifyDsFolderResponse.class);
    }

    /**
     *Update Rule Group Execution Strategy
     * @param req ModifyExecStrategyRequest
     * @return ModifyExecStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExecStrategyResponse ModifyExecStrategy(ModifyExecStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExecStrategy", ModifyExecStrategyResponse.class);
    }

    /**
     *Updating Integrated Nodes
     * @param req ModifyIntegrationNodeRequest
     * @return ModifyIntegrationNodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationNodeResponse ModifyIntegrationNode(ModifyIntegrationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIntegrationNode", ModifyIntegrationNodeResponse.class);
    }

    /**
     *Update Integration Task
     * @param req ModifyIntegrationTaskRequest
     * @return ModifyIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationTaskResponse ModifyIntegrationTask(ModifyIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIntegrationTask", ModifyIntegrationTaskResponse.class);
    }

    /**
     *Update Monitoring Status
     * @param req ModifyMonitorStatusRequest
     * @return ModifyMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMonitorStatusResponse ModifyMonitorStatus(ModifyMonitorStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMonitorStatus", ModifyMonitorStatusResponse.class);
    }

    /**
     *Update Quality Rule Interface
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *Update Rule Group Subscription Information
     * @param req ModifyRuleGroupSubscriptionRequest
     * @return ModifyRuleGroupSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleGroupSubscriptionResponse ModifyRuleGroupSubscription(ModifyRuleGroupSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleGroupSubscription", ModifyRuleGroupSubscriptionResponse.class);
    }

    /**
     *Edit Rule Template
     * @param req ModifyRuleTemplateRequest
     * @return ModifyRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleTemplateResponse ModifyRuleTemplate(ModifyRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleTemplate", ModifyRuleTemplateResponse.class);
    }

    /**
     *Modify task alert rules
     * @param req ModifyTaskAlarmRegularRequest
     * @return ModifyTaskAlarmRegularResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskAlarmRegularResponse ModifyTaskAlarmRegular(ModifyTaskAlarmRegularRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskAlarmRegular", ModifyTaskAlarmRegularResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Update Task
     * @param req ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskInfoResponse ModifyTaskInfo(ModifyTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskInfo", ModifyTaskInfoResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Add Parent Task Dependency
     * @param req ModifyTaskLinksRequest
     * @return ModifyTaskLinksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskLinksResponse ModifyTaskLinks(ModifyTaskLinksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskLinks", ModifyTaskLinksResponse.class);
    }

    /**
     *Rename Task (Task Editing)
     * @param req ModifyTaskNameRequest
     * @return ModifyTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskNameResponse ModifyTaskName(ModifyTaskNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskName", ModifyTaskNameResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Modify Task Script
     * @param req ModifyTaskScriptRequest
     * @return ModifyTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskScriptResponse ModifyTaskScript(ModifyTaskScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskScript", ModifyTaskScriptResponse.class);
    }

    /**
     *Update Workflow Information
     * @param req ModifyWorkflowInfoRequest
     * @return ModifyWorkflowInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowInfoResponse ModifyWorkflowInfo(ModifyWorkflowInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkflowInfo", ModifyWorkflowInfoResponse.class);
    }

    /**
     *Update Workflow Scheduling
     * @param req ModifyWorkflowScheduleRequest
     * @return ModifyWorkflowScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowScheduleResponse ModifyWorkflowSchedule(ModifyWorkflowScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkflowSchedule", ModifyWorkflowScheduleResponse.class);
    }

    /**
     *Orchestration Space - Workflow - Move Task to Workflow Folder
     * @param req MoveTasksToFolderRequest
     * @return MoveTasksToFolderResponse
     * @throws TencentCloudSDKException
     */
    public MoveTasksToFolderResponse MoveTasksToFolder(MoveTasksToFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveTasksToFolder", MoveTasksToFolderResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Registration Event
     * @param req RegisterEventRequest
     * @return RegisterEventResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventResponse RegisterEvent(RegisterEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterEvent", RegisterEventResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Register Event Listener
     * @param req RegisterEventListenerRequest
     * @return RegisterEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventListenerResponse RegisterEventListener(RegisterEventListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterEventListener", RegisterEventListenerResponse.class);
    }

    /**
     *Delete orchestration space workflow
     * @param req RemoveWorkflowDsRequest
     * @return RemoveWorkflowDsResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWorkflowDsResponse RemoveWorkflowDs(RemoveWorkflowDsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveWorkflowDs", RemoveWorkflowDsResponse.class);
    }

    /**
     *Continue Integration Task
     * @param req ResumeIntegrationTaskRequest
     * @return ResumeIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ResumeIntegrationTaskResponse ResumeIntegrationTask(ResumeIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeIntegrationTask", ResumeIntegrationTaskResponse.class);
    }

    /**
     *Preemptive locking of integration tasks
     * @param req RobAndLockIntegrationTaskRequest
     * @return RobAndLockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public RobAndLockIntegrationTaskResponse RobAndLockIntegrationTask(RobAndLockIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RobAndLockIntegrationTask", RobAndLockIntegrationTaskResponse.class);
    }

    /**
     *Instance Batch Successfully Configured
     * @param req RunForceSucScheduleInstancesRequest
     * @return RunForceSucScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunForceSucScheduleInstancesResponse RunForceSucScheduleInstances(RunForceSucScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunForceSucScheduleInstances", RunForceSucScheduleInstancesResponse.class);
    }

    /**
     *Instance Batch Rerun
     * @param req RunRerunScheduleInstancesRequest
     * @return RunRerunScheduleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunRerunScheduleInstancesResponse RunRerunScheduleInstances(RunRerunScheduleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunRerunScheduleInstances", RunRerunScheduleInstancesResponse.class);
    }

    /**
     *Batch startup of workflows
     * @param req RunTasksByMultiWorkflowRequest
     * @return RunTasksByMultiWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunTasksByMultiWorkflowResponse RunTasksByMultiWorkflow(RunTasksByMultiWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunTasksByMultiWorkflow", RunTasksByMultiWorkflowResponse.class);
    }

    /**
     *Save User-Defined Function
     * @param req SaveCustomFunctionRequest
     * @return SaveCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SaveCustomFunctionResponse SaveCustomFunction(SaveCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveCustomFunction", SaveCustomFunctionResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Set Task Alerts, Create/Update Alert Information (Latest)
     * @param req SetTaskAlarmNewRequest
     * @return SetTaskAlarmNewResponse
     * @throws TencentCloudSDKException
     */
    public SetTaskAlarmNewResponse SetTaskAlarmNew(SetTaskAlarmNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTaskAlarmNew", SetTaskAlarmNewResponse.class);
    }

    /**
     *Initiate Integration Task
     * @param req StartIntegrationTaskRequest
     * @return StartIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartIntegrationTaskResponse StartIntegrationTask(StartIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartIntegrationTask", StartIntegrationTaskResponse.class);
    }

    /**
     *Stop Integration Task
     * @param req StopIntegrationTaskRequest
     * @return StopIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopIntegrationTaskResponse StopIntegrationTask(StopIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopIntegrationTask", StopIntegrationTaskResponse.class);
    }

    /**
     *Submit Custom Definition Function
     * @param req SubmitCustomFunctionRequest
     * @return SubmitCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCustomFunctionResponse SubmitCustomFunction(SubmitCustomFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitCustomFunction", SubmitCustomFunctionResponse.class);
    }

    /**
     *Ad Hoc Analysis - Submit SQL Task
     * @param req SubmitSqlTaskRequest
     * @return SubmitSqlTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitSqlTaskResponse SubmitSqlTask(SubmitSqlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitSqlTask", SubmitSqlTaskResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Submit a Task
     * @param req SubmitTaskRequest
     * @return SubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskResponse SubmitTask(SubmitTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTask", SubmitTaskResponse.class);
    }

    /**
     *No
     * @param req SubmitTaskTestRunRequest
     * @return SubmitTaskTestRunResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskTestRunResponse SubmitTaskTestRun(SubmitTaskTestRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTaskTestRun", SubmitTaskTestRunResponse.class);
    }

    /**
     *Submit Workflow
     * @param req SubmitWorkflowRequest
     * @return SubmitWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public SubmitWorkflowResponse SubmitWorkflow(SubmitWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitWorkflow", SubmitWorkflowResponse.class);
    }

    /**
     *Pause Integration Task
     * @param req SuspendIntegrationTaskRequest
     * @return SuspendIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public SuspendIntegrationTaskResponse SuspendIntegrationTask(SuspendIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SuspendIntegrationTask", SuspendIntegrationTaskResponse.class);
    }

    /**
     *Query Inlong Manager Logs
     * @param req TaskLogRequest
     * @return TaskLogResponse
     * @throws TencentCloudSDKException
     */
    public TaskLogResponse TaskLog(TaskLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TaskLog", TaskLogResponse.class);
    }

    /**
     *Event Management - Triggered Events
     * @param req TriggerDsEventRequest
     * @return TriggerDsEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerDsEventResponse TriggerDsEvent(TriggerDsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerDsEvent", TriggerDsEventResponse.class);
    }

    /**
     *<p style="color:red;">[Note: This version is only available to a portion of allowlist customers in the Guangzhou Region]</p>
Trigger events
     * @param req TriggerEventRequest
     * @return TriggerEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerEventResponse TriggerEvent(TriggerEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerEvent", TriggerEventResponse.class);
    }

    /**
     *Unlock Integration Task
     * @param req UnlockIntegrationTaskRequest
     * @return UnlockIntegrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public UnlockIntegrationTaskResponse UnlockIntegrationTask(UnlockIntegrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnlockIntegrationTask", UnlockIntegrationTaskResponse.class);
    }

    /**
     *This API is used to modify user roles in a project.
     * @param req UpdateProjectUserRoleRequest
     * @return UpdateProjectUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectUserRoleResponse UpdateProjectUserRole(UpdateProjectUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProjectUserRole", UpdateProjectUserRoleResponse.class);
    }

    /**
     *Modifying Workflow Person in Charge
     * @param req UpdateWorkflowOwnerRequest
     * @return UpdateWorkflowOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowOwnerResponse UpdateWorkflowOwner(UpdateWorkflowOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowOwner", UpdateWorkflowOwnerResponse.class);
    }

    /**
     *Save Task Information
     * @param req UploadContentRequest
     * @return UploadContentResponse
     * @throws TencentCloudSDKException
     */
    public UploadContentResponse UploadContent(UploadContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadContent", UploadContentResponse.class);
    }

}
