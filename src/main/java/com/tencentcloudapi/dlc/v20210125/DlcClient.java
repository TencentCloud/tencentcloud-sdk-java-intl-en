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
package com.tencentcloudapi.dlc.v20210125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dlc.v20210125.models.*;

public class DlcClient extends AbstractClient{
    private static String endpoint = "dlc.intl.tencentcloudapi.com";
    private static String service = "dlc";
    private static String version = "2021-01-25";

    public DlcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DlcClient(Credential credential, String region, ClientProfile profile) {
        super(DlcClient.endpoint, DlcClient.version, credential, region, profile);
    }

    /**
     *This API is used to add users to working groups.
     * @param req AddUsersToWorkGroupRequest
     * @return AddUsersToWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersToWorkGroupResponse AddUsersToWorkGroup(AddUsersToWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUsersToWorkGroup", AddUsersToWorkGroupResponse.class);
    }

    /**
     *This API is used to update databases in the DMS metadata module.
     * @param req AlterDMSDatabaseRequest
     * @return AlterDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSDatabaseResponse AlterDMSDatabase(AlterDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AlterDMSDatabase", AlterDMSDatabaseResponse.class);
    }

    /**
     *This API is used to bind the authentication policy to the user.
     * @param req AttachUserPolicyRequest
     * @return AttachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachUserPolicyResponse AttachUserPolicy(AttachUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachUserPolicy", AttachUserPolicyResponse.class);
    }

    /**
     *This API is used to bind an authentication policy to a working group.
     * @param req AttachWorkGroupPolicyRequest
     * @return AttachWorkGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachWorkGroupPolicyResponse AttachWorkGroupPolicy(AttachWorkGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachWorkGroupPolicy", AttachWorkGroupPolicyResponse.class);
    }

    /**
     *This API is used to bind working groups to users.
     * @param req BindWorkGroupsToUserRequest
     * @return BindWorkGroupsToUserResponse
     * @throws TencentCloudSDKException
     */
    public BindWorkGroupsToUserResponse BindWorkGroupsToUser(BindWorkGroupsToUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindWorkGroupsToUser", BindWorkGroupsToUserResponse.class);
    }

    /**
     *This API is used to cancel a Spark SQL batch task.
     * @param req CancelSparkSessionBatchSQLRequest
     * @return CancelSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CancelSparkSessionBatchSQLResponse CancelSparkSessionBatchSQL(CancelSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelSparkSessionBatchSQL", CancelSparkSessionBatchSQLResponse.class);
    }

    /**
     *This API is used to cancel a task.
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelTask", CancelTaskResponse.class);
    }

    /**
     *This API is used to check the validity of the engine's user-defined parameters.
     * @param req CheckDataEngineConfigPairsValidityRequest
     * @return CheckDataEngineConfigPairsValidityResponse
     * @throws TencentCloudSDKException
     */
    public CheckDataEngineConfigPairsValidityResponse CheckDataEngineConfigPairsValidity(CheckDataEngineConfigPairsValidityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDataEngineConfigPairsValidity", CheckDataEngineConfigPairsValidityResponse.class);
    }

    /**
     *This API is used to check whether the cluster can be rolled back.
     * @param req CheckDataEngineImageCanBeRollbackRequest
     * @return CheckDataEngineImageCanBeRollbackResponse
     * @throws TencentCloudSDKException
     */
    public CheckDataEngineImageCanBeRollbackResponse CheckDataEngineImageCanBeRollback(CheckDataEngineImageCanBeRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDataEngineImageCanBeRollback", CheckDataEngineImageCanBeRollbackResponse.class);
    }

    /**
     *This API is used to check whether the cluster image can be upgraded.
     * @param req CheckDataEngineImageCanBeUpgradeRequest
     * @return CheckDataEngineImageCanBeUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public CheckDataEngineImageCanBeUpgradeResponse CheckDataEngineImageCanBeUpgrade(CheckDataEngineImageCanBeUpgradeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDataEngineImageCanBeUpgrade", CheckDataEngineImageCanBeUpgradeResponse.class);
    }

    /**
     *This API is used to check the permission status.
     * @param req CheckGrantedPermissionRequest
     * @return CheckGrantedPermissionResponse
     * @throws TencentCloudSDKException
     */
    public CheckGrantedPermissionResponse CheckGrantedPermission(CheckGrantedPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckGrantedPermission", CheckGrantedPermissionResponse.class);
    }

    /**
     *This API is used to copy a table.
     * @param req CopyDLCTableRequest
     * @return CopyDLCTableResponse
     * @throws TencentCloudSDKException
     */
    public CopyDLCTableResponse CopyDLCTable(CopyDLCTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyDLCTable", CopyDLCTableResponse.class);
    }

    /**
     *This API is used to create metadata acceleration buckets and the binding relationship between products.
     * @param req CreateCHDFSBindingProductRequest
     * @return CreateCHDFSBindingProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateCHDFSBindingProductResponse CreateCHDFSBindingProduct(CreateCHDFSBindingProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCHDFSBindingProduct", CreateCHDFSBindingProductResponse.class);
    }

    /**
     *This API is used to create a table.
     * @param req CreateDLCTableRequest
     * @return CreateDLCTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateDLCTableResponse CreateDLCTable(CreateDLCTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDLCTable", CreateDLCTableResponse.class);
    }

    /**
     *This API is used to create databases in the DMS metadata module.
     * @param req CreateDMSDatabaseRequest
     * @return CreateDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDMSDatabaseResponse CreateDMSDatabase(CreateDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDMSDatabase", CreateDMSDatabaseResponse.class);
    }

    /**
     *This API is used to create a data engine.
     * @param req CreateDataEngineRequest
     * @return CreateDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataEngineResponse CreateDataEngine(CreateDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataEngine", CreateDataEngineResponse.class);
    }

    /**
     *This API is used to create a managed internal table. It has been disused.
     * @param req CreateInternalTableRequest
     * @return CreateInternalTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateInternalTableResponse CreateInternalTable(CreateInternalTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInternalTable", CreateInternalTableResponse.class);
    }

    /**
     *This API is used to create a query result download task.
     * @param req CreateResultDownloadRequest
     * @return CreateResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public CreateResultDownloadResponse CreateResultDownload(CreateResultDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResultDownload", CreateResultDownloadResponse.class);
    }

    /**
     *This API is used to create a Spark job.
     * @param req CreateSparkAppRequest
     * @return CreateSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppResponse CreateSparkApp(CreateSparkAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkApp", CreateSparkAppResponse.class);
    }

    /**
     *This API is used to start a Spark job.
     * @param req CreateSparkAppTaskRequest
     * @return CreateSparkAppTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppTaskResponse CreateSparkAppTask(CreateSparkAppTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkAppTask", CreateSparkAppTaskResponse.class);
    }

    /**
     *This API is used to submit a Spark SQL batch task to the job engine.
     * @param req CreateSparkSessionBatchSQLRequest
     * @return CreateSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkSessionBatchSQLResponse CreateSparkSessionBatchSQL(CreateSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkSessionBatchSQL", CreateSparkSessionBatchSQLResponse.class);
    }

    /**
     *This API is used to add or overwrite the storage location of results.
     * @param req CreateStoreLocationRequest
     * @return CreateStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public CreateStoreLocationResponse CreateStoreLocation(CreateStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStoreLocation", CreateStoreLocationResponse.class);
    }

    /**
     *This API is used to create and execute a SQL task. (`CreateTasks` is recommended.)
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *This API is used to create and execute SQL tasks in batches.
     * @param req CreateTasksRequest
     * @return CreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksResponse CreateTasks(CreateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTasks", CreateTasksResponse.class);
    }

    /**
     *This API is used to create users.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *This API is used to create working groups.
     * @param req CreateWorkGroupRequest
     * @return CreateWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkGroupResponse CreateWorkGroup(CreateWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkGroup", CreateWorkGroupResponse.class);
    }

    /**
     *This API is used to delete the binding relationship between metadata acceleration buckets and products.
     * @param req DeleteCHDFSBindingProductRequest
     * @return DeleteCHDFSBindingProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCHDFSBindingProductResponse DeleteCHDFSBindingProduct(DeleteCHDFSBindingProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCHDFSBindingProduct", DeleteCHDFSBindingProductResponse.class);
    }

    /**
     *This API is used to delete the data engine.
     * @param req DeleteDataEngineRequest
     * @return DeleteDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataEngineResponse DeleteDataEngine(DeleteDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataEngine", DeleteDataEngineResponse.class);
    }

    /**
     *This API is used to delete a Spark job.
     * @param req DeleteSparkAppRequest
     * @return DeleteSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSparkAppResponse DeleteSparkApp(DeleteSparkAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSparkApp", DeleteSparkAppResponse.class);
    }

    /**
     *This API is used to remove visits through the third-party platform.
     * @param req DeleteThirdPartyAccessUserRequest
     * @return DeleteThirdPartyAccessUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteThirdPartyAccessUserResponse DeleteThirdPartyAccessUser(DeleteThirdPartyAccessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteThirdPartyAccessUser", DeleteThirdPartyAccessUserResponse.class);
    }

    /**
     *This API is used to delete users.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *This API is used to delete users from working groups.
     * @param req DeleteUsersFromWorkGroupRequest
     * @return DeleteUsersFromWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersFromWorkGroupResponse DeleteUsersFromWorkGroup(DeleteUsersFromWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsersFromWorkGroup", DeleteUsersFromWorkGroupResponse.class);
    }

    /**
     *This API is used to delete working groups.
     * @param req DeleteWorkGroupRequest
     * @return DeleteWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkGroupResponse DeleteWorkGroup(DeleteWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkGroup", DeleteWorkGroupResponse.class);
    }

    /**
     *This API is used to query the advanced settings of the SQL query interface.
     * @param req DescribeAdvancedStoreLocationRequest
     * @return DescribeAdvancedStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdvancedStoreLocationResponse DescribeAdvancedStoreLocation(DescribeAdvancedStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdvancedStoreLocation", DescribeAdvancedStoreLocationResponse.class);
    }

    /**
     *This API is used to query the DLC Catalog authorization list.
     * @param req DescribeDLCCatalogAccessRequest
     * @return DescribeDLCCatalogAccessResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDLCCatalogAccessResponse DescribeDLCCatalogAccess(DescribeDLCCatalogAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDLCCatalogAccess", DescribeDLCCatalogAccessResponse.class);
    }

    /**
     *This API is used to obtain the table.
     * @param req DescribeDLCTableRequest
     * @return DescribeDLCTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDLCTableResponse DescribeDLCTable(DescribeDLCTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDLCTable", DescribeDLCTableResponse.class);
    }

    /**
     *This API is used to obtain the list of tables.
     * @param req DescribeDLCTableListRequest
     * @return DescribeDLCTableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDLCTableListResponse DescribeDLCTableList(DescribeDLCTableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDLCTableList", DescribeDLCTableListResponse.class);
    }

    /**
     *This API is used to obtain databases in the DMS metadata module.
     * @param req DescribeDMSDatabaseRequest
     * @return DescribeDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSDatabaseResponse DescribeDMSDatabase(DescribeDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDMSDatabase", DescribeDMSDatabaseResponse.class);
    }

    /**
     *This API is used to obtain the list of databases.
     * @param req DescribeDMSDatabaseListRequest
     * @return DescribeDMSDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSDatabaseListResponse DescribeDMSDatabaseList(DescribeDMSDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDMSDatabaseList", DescribeDMSDatabaseListResponse.class);
    }

    /**
     *This API is used to obtain detailed data engine information based on names.
     * @param req DescribeDataEngineRequest
     * @return DescribeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEngineResponse DescribeDataEngine(DescribeDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngine", DescribeDataEngineResponse.class);
    }

    /**
     *This API is used to obtain the major version image list of exclusive clusters.
     * @param req DescribeDataEngineImageVersionsRequest
     * @return DescribeDataEngineImageVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEngineImageVersionsResponse DescribeDataEngineImageVersions(DescribeDataEngineImageVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngineImageVersions", DescribeDataEngineImageVersionsResponse.class);
    }

    /**
     *This API is used to obtain the PYSPARK image list.
     * @param req DescribeDataEnginePythonSparkImagesRequest
     * @return DescribeDataEnginePythonSparkImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginePythonSparkImagesResponse DescribeDataEnginePythonSparkImages(DescribeDataEnginePythonSparkImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEnginePythonSparkImages", DescribeDataEnginePythonSparkImagesResponse.class);
    }

    /**
     *This API is used to query engine specification details.
     * @param req DescribeDataEnginesScaleDetailRequest
     * @return DescribeDataEnginesScaleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginesScaleDetailResponse DescribeDataEnginesScaleDetail(DescribeDataEnginesScaleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEnginesScaleDetail", DescribeDataEnginesScaleDetailResponse.class);
    }

    /**
     *This API is used to query the resource usage of a data engine based on its ID.
     * @param req DescribeEngineUsageInfoRequest
     * @return DescribeEngineUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEngineUsageInfoResponse DescribeEngineUsageInfo(DescribeEngineUsageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEngineUsageInfo", DescribeEngineUsageInfoResponse.class);
    }

    /**
     *This API is used to get the list of disabled table attributes (new).
     * @param req DescribeForbiddenTableProRequest
     * @return DescribeForbiddenTableProResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForbiddenTableProResponse DescribeForbiddenTablePro(DescribeForbiddenTableProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForbiddenTablePro", DescribeForbiddenTableProResponse.class);
    }

    /**
     *This API is used to obtain the job information.
     * @param req DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJob", DescribeJobResponse.class);
    }

    /**
     *This API is used to obtain the list of job information.
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *This API is used to query the summary of a specified directory in a managed storage.
     * @param req DescribeLakeFsDirSummaryRequest
     * @return DescribeLakeFsDirSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsDirSummaryResponse DescribeLakeFsDirSummary(DescribeLakeFsDirSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLakeFsDirSummary", DescribeLakeFsDirSummaryResponse.class);
    }

    /**
     *This API is used to query managed storage information.
     * @param req DescribeLakeFsInfoRequest
     * @return DescribeLakeFsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsInfoResponse DescribeLakeFsInfo(DescribeLakeFsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLakeFsInfo", DescribeLakeFsInfoResponse.class);
    }

    /**
     *This API is used to query the list of metadata acceleration buckets bound to other products.
     * @param req DescribeOtherCHDFSBindingListRequest
     * @return DescribeOtherCHDFSBindingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtherCHDFSBindingListResponse DescribeOtherCHDFSBindingList(DescribeOtherCHDFSBindingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtherCHDFSBindingList", DescribeOtherCHDFSBindingListResponse.class);
    }

    /**
     *This API is used to obtain the query results.
     * @param req DescribeQueryRequest
     * @return DescribeQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueryResponse DescribeQuery(DescribeQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuery", DescribeQueryResponse.class);
    }

    /**
     *This API is used to get a query result download task.
     * @param req DescribeResultDownloadRequest
     * @return DescribeResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResultDownloadResponse DescribeResultDownload(DescribeResultDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResultDownload", DescribeResultDownloadResponse.class);
    }

    /**
     *This API is used to retrieve all built-in images of all minor versions under a specified major version.
     * @param req DescribeSessionImageVersionRequest
     * @return DescribeSessionImageVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionImageVersionResponse DescribeSessionImageVersion(DescribeSessionImageVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionImageVersion", DescribeSessionImageVersionResponse.class);
    }

    /**
     *u200cThis API is used to query the information of a Spark job.
     * @param req DescribeSparkAppJobRequest
     * @return DescribeSparkAppJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobResponse DescribeSparkAppJob(DescribeSparkAppJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkAppJob", DescribeSparkAppJobResponse.class);
    }

    /**
     *This API is used to query the list of Spark jobs.
     * @param req DescribeSparkAppJobsRequest
     * @return DescribeSparkAppJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobsResponse DescribeSparkAppJobs(DescribeSparkAppJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkAppJobs", DescribeSparkAppJobsResponse.class);
    }

    /**
     *This API is used to query the list of running task instances of a Spark job.
     * @param req DescribeSparkAppTasksRequest
     * @return DescribeSparkAppTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppTasksResponse DescribeSparkAppTasks(DescribeSparkAppTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkAppTasks", DescribeSparkAppTasksResponse.class);
    }

    /**
     *This API is used to query Spark SQL batch task logs.
     * @param req DescribeSparkSessionBatchSqlLogRequest
     * @return DescribeSparkSessionBatchSqlLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkSessionBatchSqlLogResponse DescribeSparkSessionBatchSqlLog(DescribeSparkSessionBatchSqlLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkSessionBatchSqlLog", DescribeSparkSessionBatchSqlLogResponse.class);
    }

    /**
     *This API is used to query the storage location of calculation results.
     * @param req DescribeStoreLocationRequest
     * @return DescribeStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStoreLocationResponse DescribeStoreLocation(DescribeStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStoreLocation", DescribeStoreLocationResponse.class);
    }

    /**
     *This API is used to query the sub-user's visiting policy for users accessing through the third-party platform.
     * @param req DescribeSubUserAccessPolicyRequest
     * @return DescribeSubUserAccessPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubUserAccessPolicyResponse DescribeSubUserAccessPolicy(DescribeSubUserAccessPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubUserAccessPolicy", DescribeSubUserAccessPolicyResponse.class);
    }

    /**
     *This API is used to query the data table name list.
     * @param req DescribeTablesNameRequest
     * @return DescribeTablesNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesNameResponse DescribeTablesName(DescribeTablesNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablesName", DescribeTablesNameResponse.class);
    }

    /**
     *This API is used to query the result of a task.
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
    }

    /**
     *This API is used to describe the information on task statistics.
     * @param req DescribeTaskStatisticsRequest
     * @return DescribeTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatisticsResponse DescribeTaskStatistics(DescribeTaskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatistics", DescribeTaskStatisticsResponse.class);
    }

    /**
     *This API is used to query the list of tasks.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *This API is used to query the information of users visiting through the third-party platform.
     * @param req DescribeThirdPartyAccessUserRequest
     * @return DescribeThirdPartyAccessUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdPartyAccessUserResponse DescribeThirdPartyAccessUser(DescribeThirdPartyAccessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeThirdPartyAccessUser", DescribeThirdPartyAccessUserResponse.class);
    }

    /**
     *This API is used to query the list of engines that are able to upgrade their configuration.
     * @param req DescribeUpdatableDataEnginesRequest
     * @return DescribeUpdatableDataEnginesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpdatableDataEnginesResponse DescribeUpdatableDataEngines(DescribeUpdatableDataEnginesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpdatableDataEngines", DescribeUpdatableDataEnginesResponse.class);
    }

    /**
     *This API is used to query user-defined engine parameters.
     * @param req DescribeUserDataEngineConfigRequest
     * @return DescribeUserDataEngineConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDataEngineConfigResponse DescribeUserDataEngineConfig(DescribeUserDataEngineConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDataEngineConfig", DescribeUserDataEngineConfigResponse.class);
    }

    /**
     *This API is used to get detailed user information.
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserInfo", DescribeUserInfoResponse.class);
    }

    /**
     *This API is used to enumerate user roles.
     * @param req DescribeUserRolesRequest
     * @return DescribeUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRolesResponse DescribeUserRoles(DescribeUserRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserRoles", DescribeUserRolesResponse.class);
    }

    /**
     *This API is used to get the types of users.
     * @param req DescribeUserTypeRequest
     * @return DescribeUserTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserTypeResponse DescribeUserType(DescribeUserTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserType", DescribeUserTypeResponse.class);
    }

    /**
     *This API is used to obtain the user list.
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsers", DescribeUsersResponse.class);
    }

    /**
     *This API is used to get detailed information about working groups.
     * @param req DescribeWorkGroupInfoRequest
     * @return DescribeWorkGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkGroupInfoResponse DescribeWorkGroupInfo(DescribeWorkGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkGroupInfo", DescribeWorkGroupInfoResponse.class);
    }

    /**
     *This API is used to get a list of working groups.
     * @param req DescribeWorkGroupsRequest
     * @return DescribeWorkGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkGroupsResponse DescribeWorkGroups(DescribeWorkGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkGroups", DescribeWorkGroupsResponse.class);
    }

    /**
     *This API is used to unbind the authentication policy from the user.
     * @param req DetachUserPolicyRequest
     * @return DetachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachUserPolicyResponse DetachUserPolicy(DetachUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachUserPolicy", DetachUserPolicyResponse.class);
    }

    /**
     *This API is used to unbind the authentication policy from the working group.
     * @param req DetachWorkGroupPolicyRequest
     * @return DetachWorkGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachWorkGroupPolicyResponse DetachWorkGroupPolicy(DetachWorkGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachWorkGroupPolicy", DetachWorkGroupPolicyResponse.class);
    }

    /**
     *This API is used to delete the table.
     * @param req DropDLCTableRequest
     * @return DropDLCTableResponse
     * @throws TencentCloudSDKException
     */
    public DropDLCTableResponse DropDLCTable(DropDLCTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDLCTable", DropDLCTableResponse.class);
    }

    /**
     *This API is used to delete databases in the DMS metadata module.
     * @param req DropDMSDatabaseRequest
     * @return DropDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSDatabaseResponse DropDMSDatabase(DropDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDMSDatabase", DropDMSDatabaseResponse.class);
    }

    /**
     *This API is used to delete tables in the DMS metadata module.
     * @param req DropDMSTableRequest
     * @return DropDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSTableResponse DropDMSTable(DropDMSTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDMSTable", DropDMSTableResponse.class);
    }

    /**
     *This API is used to generate SQL statements for creating a managed table.
     * @param req GenerateCreateMangedTableSqlRequest
     * @return GenerateCreateMangedTableSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateCreateMangedTableSqlResponse GenerateCreateMangedTableSql(GenerateCreateMangedTableSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateCreateMangedTableSql", GenerateCreateMangedTableSqlResponse.class);
    }

    /**
     *GetOptimizerPolicy
     * @param req GetOptimizerPolicyRequest
     * @return GetOptimizerPolicyResponse
     * @throws TencentCloudSDKException
     */
    public GetOptimizerPolicyResponse GetOptimizerPolicy(GetOptimizerPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOptimizerPolicy", GetOptimizerPolicyResponse.class);
    }

    /**
     *This API is used to grant permissions for visiting DLC Catalog.
     * @param req GrantDLCCatalogAccessRequest
     * @return GrantDLCCatalogAccessResponse
     * @throws TencentCloudSDKException
     */
    public GrantDLCCatalogAccessResponse GrantDLCCatalogAccess(GrantDLCCatalogAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantDLCCatalogAccess", GrantDLCCatalogAccessResponse.class);
    }

    /**
     *This API is used to modify the advanced settings of the SQL query interface.
     * @param req ModifyAdvancedStoreLocationRequest
     * @return ModifyAdvancedStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdvancedStoreLocationResponse ModifyAdvancedStoreLocation(ModifyAdvancedStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAdvancedStoreLocation", ModifyAdvancedStoreLocationResponse.class);
    }

    /**
     *This API is used to modify the engine's description.
     * @param req ModifyDataEngineDescriptionRequest
     * @return ModifyDataEngineDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataEngineDescriptionResponse ModifyDataEngineDescription(ModifyDataEngineDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataEngineDescription", ModifyDataEngineDescriptionResponse.class);
    }

    /**
     *This API is used to change data governance event thresholds.
     * @param req ModifyGovernEventRuleRequest
     * @return ModifyGovernEventRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernEventRuleResponse ModifyGovernEventRule(ModifyGovernEventRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernEventRule", ModifyGovernEventRuleResponse.class);
    }

    /**
     *This API is used to update a Spark job.
     * @param req ModifySparkAppRequest
     * @return ModifySparkAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppResponse ModifySparkApp(ModifySparkAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySparkApp", ModifySparkAppResponse.class);
    }

    /**
     *This API is used to modify Spark job parameters in batches.
     * @param req ModifySparkAppBatchRequest
     * @return ModifySparkAppBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppBatchResponse ModifySparkAppBatch(ModifySparkAppBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySparkAppBatch", ModifySparkAppBatchResponse.class);
    }

    /**
     *This API is used to modify user information.
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *This API is used to modify the types of users. Only users who are also administrators can call this API to conduct the operation.
     * @param req ModifyUserTypeRequest
     * @return ModifyUserTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserTypeResponse ModifyUserType(ModifyUserTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserType", ModifyUserTypeResponse.class);
    }

    /**
     *This API is used to modify working group information.
     * @param req ModifyWorkGroupRequest
     * @return ModifyWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkGroupResponse ModifyWorkGroup(ModifyWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkGroup", ModifyWorkGroupResponse.class);
    }

    /**
     *This API is used to query the result of obtaining tasks.
     * @param req QueryResultRequest
     * @return QueryResultResponse
     * @throws TencentCloudSDKException
     */
    public QueryResultResponse QueryResult(QueryResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryResult", QueryResultResponse.class);
    }

    /**
     *This API is used to query task consumption details.
     * @param req QueryTaskCostDetailRequest
     * @return QueryTaskCostDetailResponse
     * @throws TencentCloudSDKException
     */
    public QueryTaskCostDetailResponse QueryTaskCostDetail(QueryTaskCostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryTaskCostDetail", QueryTaskCostDetailResponse.class);
    }

    /**
     *This API is used to enable visits to the third-party platform.
     * @param req RegisterThirdPartyAccessUserRequest
     * @return RegisterThirdPartyAccessUserResponse
     * @throws TencentCloudSDKException
     */
    public RegisterThirdPartyAccessUserResponse RegisterThirdPartyAccessUser(RegisterThirdPartyAccessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterThirdPartyAccessUser", RegisterThirdPartyAccessUserResponse.class);
    }

    /**
     *This API is used to renew the data engine.
     * @param req RenewDataEngineRequest
     * @return RenewDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public RenewDataEngineResponse RenewDataEngine(RenewDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDataEngine", RenewDataEngineResponse.class);
    }

    /**
     *This API is used to restart engines.
     * @param req RestartDataEngineRequest
     * @return RestartDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public RestartDataEngineResponse RestartDataEngine(RestartDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDataEngine", RestartDataEngineResponse.class);
    }

    /**
     *This API is used to revoke permissions for visiting DLC Catalog.
     * @param req RevokeDLCCatalogAccessRequest
     * @return RevokeDLCCatalogAccessResponse
     * @throws TencentCloudSDKException
     */
    public RevokeDLCCatalogAccessResponse RevokeDLCCatalogAccess(RevokeDLCCatalogAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeDLCCatalogAccess", RevokeDLCCatalogAccessResponse.class);
    }

    /**
     *This API is used to roll back the versions of the engine image.
     * @param req RollbackDataEngineImageRequest
     * @return RollbackDataEngineImageResponse
     * @throws TencentCloudSDKException
     */
    public RollbackDataEngineImageResponse RollbackDataEngineImage(RollbackDataEngineImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackDataEngineImage", RollbackDataEngineImageResponse.class);
    }

    /**
     *This API is used to suspend or start a data engine.
     * @param req SuspendResumeDataEngineRequest
     * @return SuspendResumeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SuspendResumeDataEngineResponse SuspendResumeDataEngine(SuspendResumeDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SuspendResumeDataEngine", SuspendResumeDataEngineResponse.class);
    }

    /**
     *This API is used to switch between the primary and standby clusters.
     * @param req SwitchDataEngineRequest
     * @return SwitchDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDataEngineResponse SwitchDataEngine(SwitchDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDataEngine", SwitchDataEngineResponse.class);
    }

    /**
     *This API is used to switch the versions of the engine image.
     * @param req SwitchDataEngineImageRequest
     * @return SwitchDataEngineImageResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDataEngineImageResponse SwitchDataEngineImage(SwitchDataEngineImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDataEngineImage", SwitchDataEngineImageResponse.class);
    }

    /**
     *This API is used to unbind a user group from a user.
     * @param req UnbindWorkGroupsFromUserRequest
     * @return UnbindWorkGroupsFromUserResponse
     * @throws TencentCloudSDKException
     */
    public UnbindWorkGroupsFromUserResponse UnbindWorkGroupsFromUser(UnbindWorkGroupsFromUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindWorkGroupsFromUser", UnbindWorkGroupsFromUserResponse.class);
    }

    /**
     *This API is used to upgrade data engine configuration.
     * @param req UpdateDataEngineRequest
     * @return UpdateDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataEngineResponse UpdateDataEngine(UpdateDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataEngine", UpdateDataEngineResponse.class);
    }

    /**
     *This API is used to trigger the modification of the engine configuration by the user through a certain operation.
     * @param req UpdateDataEngineConfigRequest
     * @return UpdateDataEngineConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataEngineConfigResponse UpdateDataEngineConfig(UpdateDataEngineConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataEngineConfig", UpdateDataEngineConfigResponse.class);
    }

    /**
     *This API is used to update row filters. Please note that it updates filters only but not catalogs, databases, or tables.
     * @param req UpdateRowFilterRequest
     * @return UpdateRowFilterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRowFilterResponse UpdateRowFilter(UpdateRowFilterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRowFilter", UpdateRowFilterResponse.class);
    }

    /**
     *This API is used to modify the custom configuration of the user's engine.
     * @param req UpdateUserDataEngineConfigRequest
     * @return UpdateUserDataEngineConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserDataEngineConfigResponse UpdateUserDataEngineConfig(UpdateUserDataEngineConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserDataEngineConfig", UpdateUserDataEngineConfigResponse.class);
    }

    /**
     *This API is used to upgrade the engine image.
     * @param req UpgradeDataEngineImageRequest
     * @return UpgradeDataEngineImageResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDataEngineImageResponse UpgradeDataEngineImage(UpgradeDataEngineImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDataEngineImage", UpgradeDataEngineImageResponse.class);
    }

}
