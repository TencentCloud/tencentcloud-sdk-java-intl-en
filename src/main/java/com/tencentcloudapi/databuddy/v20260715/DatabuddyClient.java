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
package com.tencentcloudapi.databuddy.v20260715;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.databuddy.v20260715.models.*;

public class DatabuddyClient extends AbstractClient{
    private static String endpoint = "databuddy.intl.tencentcloudapi.com";
    private static String service = "databuddy";
    private static String version = "2026-07-15";

    public DatabuddyClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DatabuddyClient(Credential credential, String region, ClientProfile profile) {
        super(DatabuddyClient.endpoint, DatabuddyClient.version, credential, region, profile);
    }

    /**
     *Add a console user
     * @param req AddConsoleUsersRequest
     * @return AddConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public AddConsoleUsersResponse AddConsoleUsers(AddConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddConsoleUsers", AddConsoleUsersResponse.class);
    }

    /**
     *This API is used to add a user group to a workspace.
     * @param req AddWorkspaceGroupsRequest
     * @return AddWorkspaceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AddWorkspaceGroupsResponse AddWorkspaceGroups(AddWorkspaceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddWorkspaceGroups", AddWorkspaceGroupsResponse.class);
    }

    /**
     *This API is used to create user groups.
     * @param req AddWorkspaceUsersRequest
     * @return AddWorkspaceUsersResponse
     * @throws TencentCloudSDKException
     */
    public AddWorkspaceUsersResponse AddWorkspaceUsers(AddWorkspaceUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddWorkspaceUsers", AddWorkspaceUsersResponse.class);
    }

    /**
     *This API is used to create a data catalog.
     * @param req CreateCatalogRequest
     * @return CreateCatalogResponse
     * @throws TencentCloudSDKException
     */
    public CreateCatalogResponse CreateCatalog(CreateCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCatalog", CreateCatalogResponse.class);
    }

    /**
     *Create a console user group
     * @param req CreateConsoleGroupRequest
     * @return CreateConsoleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleGroupResponse CreateConsoleGroup(CreateConsoleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsoleGroup", CreateConsoleGroupResponse.class);
    }

    /**
     *Create a new file (Notebook/SQL/Python, etc.) in the workspace file tree of Studio (unified development IDE), and return the complete meta-information of the file upon success.

**Prerequisite**
1. WorkspaceId corresponds to an existent workspace, and the caller is a space member of this workspace;
2. The parent folder corresponding to ParentFolderPath must exist, and the caller must have write permission on it (pass `/` for the root directory);
3. FileName must be unique under the same parent folder, including suffix comparison.
4. The FileName suffix must be consistent with FileType (`.ipynb`↔`NOTEBOOK_FILE`, `.sql`↔`SQL_FILE`);
5. To create with file content, pass it through Storage (large files are transferred via COS, and small files are placed in Storage.Content).
     * @param req CreateFileRequest
     * @return CreateFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileResponse CreateFile(CreateFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFile", CreateFileResponse.class);
    }

    /**
     *Create a folder
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFolder", CreateFolderResponse.class);
    }

    /**
     *Create a schema
     * @param req CreateSchemaRequest
     * @return CreateSchemaResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchemaResponse CreateSchema(CreateSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSchema", CreateSchemaResponse.class);
    }

    /**
     *Create a workflow
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflow", CreateWorkflowResponse.class);
    }

    /**
     *This API is used to create a workspace.
     * @param req CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceResponse CreateWorkspace(CreateWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspace", CreateWorkspaceResponse.class);
    }

    /**
     *Creates a workspace role
     * @param req CreateWorkspaceRoleRequest
     * @return CreateWorkspaceRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceRoleResponse CreateWorkspaceRole(CreateWorkspaceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceRole", CreateWorkspaceRoleResponse.class);
    }

    /**
     *Delete a catalog.
     * @param req DeleteCatalogRequest
     * @return DeleteCatalogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCatalogResponse DeleteCatalog(DeleteCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCatalog", DeleteCatalogResponse.class);
    }

    /**
     *Delete a console user group
     * @param req DeleteConsoleGroupsRequest
     * @return DeleteConsoleGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsoleGroupsResponse DeleteConsoleGroups(DeleteConsoleGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsoleGroups", DeleteConsoleGroupsResponse.class);
    }

    /**
     *Move the file to Recycle Bin (soft deletion) and clear its version history and execution result snapshots.

**Prerequisite**
1. The file corresponding to FileId must exist and be in active status;
2. The caller has permission to delete the file;
3. The file hasn't been referenced by a workflow task.

**Error codes (Module are all `Studio`)**

| Error Code (Code) | InnerCode | Description | Handling Suggestion |
| --- | --- | --- | --- |
| `MissingParameter.WorkspaceId` | 1030001 | lack of WorkspaceId | Please input WorkspaceId |
| `MissingParameter.FileId` | 1030003 | lack of FileId | Please import FileId |
| `InvalidParameterValue.FileType` | 1030102 | FileType value not supported | FileType takes FILE/NOTEBOOK_FILE/SQL_FILE |
| `ResourceNotFound.FileNotFound` | 1030203 | File does not exist or has been deleted | Please confirm the FileId |
| `ResourceInUse.FileReferencedByTask` | 1030204 | The file is referenced by a workflow task and cannot be deleted. | Disassociate the task reference first. |
| `UnauthorizedOperation.FileDeleteDenied` | 1030303 | No deletion permission for this file | Contact the file owner or space admin for authorization |
| `InternalError` | 1030900 | Internal service error | Please carry the RequestId and contact support |
     * @param req DeleteFileRequest
     * @return DeleteFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileResponse DeleteFile(DeleteFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFile", DeleteFileResponse.class);
    }

    /**
     *Delete folder
     * @param req DeleteFolderRequest
     * @return DeleteFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFolderResponse DeleteFolder(DeleteFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFolder", DeleteFolderResponse.class);
    }

    /**
     *Delete schema
     * @param req DeleteSchemaRequest
     * @return DeleteSchemaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSchemaResponse DeleteSchema(DeleteSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSchema", DeleteSchemaResponse.class);
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
     *Delete a workspace.
     * @param req DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkspaceResponse DeleteWorkspace(DeleteWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkspace", DeleteWorkspaceResponse.class);
    }

    /**
     *Delete a workspace role.
     * @param req DeleteWorkspaceRoleRequest
     * @return DeleteWorkspaceRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkspaceRoleResponse DeleteWorkspaceRole(DeleteWorkspaceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkspaceRole", DeleteWorkspaceRoleResponse.class);
    }

    /**
     *Query catalog description
     * @param req GetCatalogRequest
     * @return GetCatalogResponse
     * @throws TencentCloudSDKException
     */
    public GetCatalogResponse GetCatalog(GetCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCatalog", GetCatalogResponse.class);
    }

    /**
     *Get the file's metadata, optionally including file content, and read historical snapshots by version.

**Prerequisite**
1. Pass at least one of FileId and FilePath. If both are passed, FileId takes precedence.
2. The corresponding file must exist, and the caller must have read permission for the file;
3. If VersionId is passed, the version must exist.

**Error codes (Module: `Studio`)**

| Error Code | Inner Code | Description | Handling Suggestion |
| --- | --- | --- | --- |
| `MissingParameter.WorkspaceId` | 1030001 | Lack of WorkspaceId | Please input WorkspaceId |
| `MissingParameter.FileId` | 1030003 | FileId and FilePath cannot be empty at the same time | Pass at least one of FileId and FilePath |
| `InvalidParameterValue.FileType` | 1030102 | FileType value unsupported | FileType takes FILE/NOTEBOOK_FILE/SQL_FILE |
| `ResourceNotFound.FileNotFound` | 1030203 | File does not exist or has been deleted | Confirm the FileId or FilePath |
| `ResourceNotFound.FileVersionNotFound` | 1030205 | The specified file version does not exist | Confirm the VersionId or call ListFileVersions to retrieve |
| `UnauthorizedOperation.FileReadDenied` | 1030304 | No read permission for this file | Contact the file owner or space admin for authorization |
| `InternalError` | 1030900 | Internal service error | Please carry the RequestId and contact support |
     * @param req GetFileRequest
     * @return GetFileResponse
     * @throws TencentCloudSDKException
     */
    public GetFileResponse GetFile(GetFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFile", GetFileResponse.class);
    }

    /**
     *Get folder details.
     * @param req GetFolderRequest
     * @return GetFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetFolderResponse GetFolder(GetFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFolder", GetFolderResponse.class);
    }

    /**
     *This API is used to query workflow details.
     * @param req GetWorkflowRequest
     * @return GetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowResponse GetWorkflow(GetWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflow", GetWorkflowResponse.class);
    }

    /**
     *Queries workflow running details.
     * @param req GetWorkflowRunRequest
     * @return GetWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowRunResponse GetWorkflowRun(GetWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflowRun", GetWorkflowRunResponse.class);
    }

    /**
     *Query task execution details
     * @param req GetWorkflowTaskRunRequest
     * @return GetWorkflowTaskRunResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowTaskRunResponse GetWorkflowTaskRun(GetWorkflowTaskRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflowTaskRun", GetWorkflowTaskRunResponse.class);
    }

    /**
     *Queries the details of a workspace.
     * @param req GetWorkspaceRequest
     * @return GetWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkspaceResponse GetWorkspace(GetWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkspace", GetWorkspaceResponse.class);
    }

    /**
     *Terminate the operation of a workflow.
     * @param req KillWorkflowRunRequest
     * @return KillWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public KillWorkflowRunResponse KillWorkflowRun(KillWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillWorkflowRun", KillWorkflowRunResponse.class);
    }

    /**
     *Pagination fetch data catalog list
     * @param req ListCatalogsRequest
     * @return ListCatalogsResponse
     * @throws TencentCloudSDKException
     */
    public ListCatalogsResponse ListCatalogs(ListCatalogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCatalogs", ListCatalogsResponse.class);
    }

    /**
     *Queries the console user group member list. This API is a console-level API and is only supported in the central region: use ap-guangzhou for the Chinese site and ap-singapore for the international site. Calls from other regions will return UnsupportedRegion.
     * @param req ListConsoleGroupUsersRequest
     * @return ListConsoleGroupUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleGroupUsersResponse ListConsoleGroupUsers(ListConsoleGroupUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleGroupUsers", ListConsoleGroupUsersResponse.class);
    }

    /**
     *Queries the console user group list. This API is a console-level API and is only supported in the central region: use ap-guangzhou for the Chinese site and ap-singapore for the international site. Calls from other regions will return UnsupportedRegion.
     * @param req ListConsoleGroupsRequest
     * @return ListConsoleGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleGroupsResponse ListConsoleGroups(ListConsoleGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleGroups", ListConsoleGroupsResponse.class);
    }

    /**
     *Queries the console role list. This API is a console-level API and is only supported in the central region: use ap-guangzhou for the Chinese site and ap-singapore for the international site. Calls from other regions will return UnsupportedRegion.
     * @param req ListConsoleRolesRequest
     * @return ListConsoleRolesResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleRolesResponse ListConsoleRoles(ListConsoleRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleRoles", ListConsoleRolesResponse.class);
    }

    /**
     *Queries the console user list. This API is a console-level API and is only supported in the central region: use ap-guangzhou for the Chinese site and ap-singapore for the international site. Calls from other regions will return UnsupportedRegion.
     * @param req ListConsoleUsersRequest
     * @return ListConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleUsersResponse ListConsoleUsers(ListConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleUsers", ListConsoleUsersResponse.class);
    }

    /**
     *Get the folder and file list
     * @param req ListFilesRequest
     * @return ListFilesResponse
     * @throws TencentCloudSDKException
     */
    public ListFilesResponse ListFiles(ListFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFiles", ListFilesResponse.class);
    }

    /**
     *Get schema list
     * @param req ListSchemasRequest
     * @return ListSchemasResponse
     * @throws TencentCloudSDKException
     */
    public ListSchemasResponse ListSchemas(ListSchemasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSchemas", ListSchemasResponse.class);
    }

    /**
     *Workflow run list
     * @param req ListWorkflowRunsRequest
     * @return ListWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowRunsResponse ListWorkflowRuns(ListWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowRuns", ListWorkflowRunsResponse.class);
    }

    /**
     *Query the historical operation list of workflow tasks
     * @param req ListWorkflowTaskRunsRequest
     * @return ListWorkflowTaskRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowTaskRunsResponse ListWorkflowTaskRuns(ListWorkflowTaskRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowTaskRuns", ListWorkflowTaskRunsResponse.class);
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
     *This API is used to query the list of user groups in a workspace.
     * @param req ListWorkspaceGroupsRequest
     * @return ListWorkspaceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkspaceGroupsResponse ListWorkspaceGroups(ListWorkspaceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkspaceGroups", ListWorkspaceGroupsResponse.class);
    }

    /**
     *Queries the list of users in a workspace.
     * @param req ListWorkspaceUsersRequest
     * @return ListWorkspaceUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkspaceUsersResponse ListWorkspaceUsers(ListWorkspaceUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkspaceUsers", ListWorkspaceUsersResponse.class);
    }

    /**
     *Queries the workspace list.
     * @param req ListWorkspacesRequest
     * @return ListWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkspacesResponse ListWorkspaces(ListWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkspaces", ListWorkspacesResponse.class);
    }

    /**
     *<p>Batch remove console users (up to 10 at a time; pre-verification rejects the entire request if any fails; during the Execution Phase, a single failure does not interrupt subsequent deletion, and success or failure is determined by SuccessUins/FailItems)</p>
     * @param req RemoveConsoleUsersRequest
     * @return RemoveConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveConsoleUsersResponse RemoveConsoleUsers(RemoveConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveConsoleUsers", RemoveConsoleUsersResponse.class);
    }

    /**
     *Remove a user group from a workspace.
     * @param req RemoveWorkspaceGroupsRequest
     * @return RemoveWorkspaceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWorkspaceGroupsResponse RemoveWorkspaceGroups(RemoveWorkspaceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveWorkspaceGroups", RemoveWorkspaceGroupsResponse.class);
    }

    /**
     *Rerun a workflow
     * @param req RerunWorkflowRunRequest
     * @return RerunWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public RerunWorkflowRunResponse RerunWorkflowRun(RerunWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunWorkflowRun", RerunWorkflowRunResponse.class);
    }

    /**
     *Runs the workflow
     * @param req RunWorkflowRequest
     * @return RunWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunWorkflowResponse RunWorkflow(RunWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunWorkflow", RunWorkflowResponse.class);
    }

    /**
     *Start up the computational resource.
     * @param req StartComputeRequest
     * @return StartComputeResponse
     * @throws TencentCloudSDKException
     */
    public StartComputeResponse StartCompute(StartComputeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCompute", StartComputeResponse.class);
    }

    /**
     *Terminate computational resources
     * @param req StopComputeRequest
     * @return StopComputeResponse
     * @throws TencentCloudSDKException
     */
    public StopComputeResponse StopCompute(StopComputeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCompute", StopComputeResponse.class);
    }

    /**
     *Unbind workflow Bundle info
Description: This interface is semantically equivalent to Detach in the standard verb list. The name Unbind is retained for compatibility with existing product forms.
     * @param req UnbindWorkflowBundleRequest
     * @return UnbindWorkflowBundleResponse
     * @throws TencentCloudSDKException
     */
    public UnbindWorkflowBundleResponse UnbindWorkflowBundle(UnbindWorkflowBundleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindWorkflowBundle", UnbindWorkflowBundleResponse.class);
    }

    /**
     *Modify a console user group
     * @param req UpdateConsoleGroupRequest
     * @return UpdateConsoleGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConsoleGroupResponse UpdateConsoleGroup(UpdateConsoleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConsoleGroup", UpdateConsoleGroupResponse.class);
    }

    /**
     *Modify a console user role
     * @param req UpdateConsoleUsersRequest
     * @return UpdateConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConsoleUsersResponse UpdateConsoleUsers(UpdateConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConsoleUsers", UpdateConsoleUsersResponse.class);
    }

    /**
     *Update file contents and running configuration (computational resource, default catalog/schema, parameters), and return the file metadata after the update.

**Prerequisite**
1. The file corresponding to FileId must exist and be in active status;
2. The caller has write permission on the file;
3. To update only the configuration, do not pass in Storage. To update only the content, do not pass in FileConfig.
4. If FileConfig.ResourceId is not empty, the match between the resource type and file type will be validated.

**Error codes (Module: `Studio`)**

| Error Code (Code) | InnerCode | Description | Handling Suggestions |
| --- | --- | --- | --- |
| `MissingParameter.WorkspaceId` | 1030001 | lack of WorkspaceId | Please input WorkspaceId |
| `MissingParameter.FileId` | 1030003 | lack of FileId | Please import FileId |
| `InvalidParameterValue.FileType` | 1030102 | FileType value not supported | FileType takes FILE/NOTEBOOK_FILE/SQL_FILE |
| `InvalidParameterValue.ResourceId` | 1030104 | Compute resource type and file type mismatch | Select a computational resource for Python/Notebook and a data analysis resource for SQL |
| `ResourceNotFound.FileNotFound` | 1030203 | File does not exist or has been deleted | confirm the FileId or call GetFile to check the file status |
| `UnauthorizedOperation.FileWriteDenied` | 1030302 | No write permission for this file | Contact the file owner or space admin for authorization |
| `FailedOperation.FileStorageUpdateFailed` | 1030401 | Failed to write file content to storage | Try again later. If the failure persists, contact support with the RequestId. |
| `InternalError` | 1030900 | Internal service error | Please carry the RequestId and contact support |
     * @param req UpdateFileRequest
     * @return UpdateFileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFileResponse UpdateFile(UpdateFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFile", UpdateFileResponse.class);
    }

    /**
     *Update folder (supports rename and move)
     * @param req UpdateFolderRequest
     * @return UpdateFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFolderResponse UpdateFolder(UpdateFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFolder", UpdateFolderResponse.class);
    }

    /**
     *Updating a Workflow
     * @param req UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowResponse UpdateWorkflow(UpdateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflow", UpdateWorkflowResponse.class);
    }

    /**
     *Modifies a workspace
     * @param req UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkspaceResponse UpdateWorkspace(UpdateWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkspace", UpdateWorkspaceResponse.class);
    }

    /**
     *Updates a workspace role
     * @param req UpdateWorkspaceRoleRequest
     * @return UpdateWorkspaceRoleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkspaceRoleResponse UpdateWorkspaceRole(UpdateWorkspaceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkspaceRole", UpdateWorkspaceRoleResponse.class);
    }

}
