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
package com.tencentcloudapi.tcaplusdb.v20190823;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcaplusdb.v20190823.models.*;

public class TcaplusdbClient extends AbstractClient{
    private static String endpoint = "tcaplusdb.tencentcloudapi.com";
    private static String service = "tcaplusdb";
    private static String version = "2019-08-23";

    public TcaplusdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcaplusdbClient(Credential credential, String region, ClientProfile profile) {
        super(TcaplusdbClient.endpoint, TcaplusdbClient.version, credential, region, profile);
    }

    /**
     *This API is used to clear table data based on the specified table information.
     * @param req ClearTablesRequest
     * @return ClearTablesResponse
     * @throws TencentCloudSDKException
     */
    public ClearTablesResponse ClearTables(ClearTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ClearTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClearTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to select a target table, upload and verify the table modification file, and return the result of whether the table structure is allowed to be modified.
     * @param req CompareIdlFilesRequest
     * @return CompareIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public CompareIdlFilesResponse CompareIdlFiles(CompareIdlFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompareIdlFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CompareIdlFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompareIdlFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a backup task.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a TcaplusDB cluster.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more table snapshots at a specified past time point.
     * @param req CreateSnapshotsRequest
     * @return CreateSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotsResponse CreateSnapshots(CreateSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a table group in a TcaplusDB cluster.
     * @param req CreateTableGroupRequest
     * @return CreateTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableGroupResponse CreateTableGroup(CreateTableGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTableGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTableGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTableGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create tables in batches based on the selected IDL file list.
     * @param req CreateTablesRequest
     * @return CreateTablesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTablesResponse CreateTables(CreateTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a TcaplusDB cluster, which will succeed only after all resources (including table groups and tables) in the cluster are released.
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a target IDL file by specifying the cluster ID and information of the file to be deleted. If the file is associated with a table, deletion will fail.
     * @param req DeleteIdlFilesRequest
     * @return DeleteIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIdlFilesResponse DeleteIdlFiles(DeleteIdlFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIdlFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIdlFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIdlFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more table snapshots.
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable data subscription for tables.
     * @param req DeleteTableDataFlowRequest
     * @return DeleteTableDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableDataFlowResponse DeleteTableDataFlow(DeleteTableDataFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTableDataFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTableDataFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTableDataFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a table group.
     * @param req DeleteTableGroupRequest
     * @return DeleteTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableGroupResponse DeleteTableGroup(DeleteTableGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTableGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTableGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTableGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the global index from a table.
     * @param req DeleteTableIndexRequest
     * @return DeleteTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableIndexResponse DeleteTableIndex(DeleteTableIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTableIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTableIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTableIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to drop a specified table. Calling this API for the first time means to move the table to the recycle bin, while calling it again means to drop the table completely from the recycle bin.
     * @param req DeleteTablesRequest
     * @return DeleteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTablesResponse DeleteTables(DeleteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of cluster operation applications.
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the associated tag list of a cluster.
     * @param req DescribeClusterTagsRequest
     * @return DescribeClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterTagsResponse DescribeClusterTags(DescribeClusterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the TcaplusDB cluster list, including cluster details.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query table description file details.
     * @param req DescribeIdlFileInfosRequest
     * @return DescribeIdlFileInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdlFileInfosResponse DescribeIdlFileInfos(DescribeIdlFileInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIdlFileInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIdlFileInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIdlFileInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the available machines in a dedicated cluster.
     * @param req DescribeMachineRequest
     * @return DescribeMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineResponse DescribeMachine(DescribeMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of regions supported by the TcaplusDB service.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of table snapshots.
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the associated tag list of a table group.
     * @param req DescribeTableGroupTagsRequest
     * @return DescribeTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupTagsResponse DescribeTableGroupTags(DescribeTableGroupTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableGroupTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableGroupTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableGroupTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the table group list.
     * @param req DescribeTableGroupsRequest
     * @return DescribeTableGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupsResponse DescribeTableGroups(DescribeTableGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get table tags.
     * @param req DescribeTableTagsRequest
     * @return DescribeTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableTagsResponse DescribeTableTags(DescribeTableTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query table details.
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a table in recycle bin.
     * @param req DescribeTablesInRecycleRequest
     * @return DescribeTablesInRecycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesInRecycleResponse DescribeTablesInRecycle(DescribeTablesInRecycleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesInRecycleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesInRecycleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTablesInRecycle");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the task list.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query whether the current user is in the allowlist and control whether the user can create TDR-type apps or tables.
     * @param req DescribeUinInWhitelistRequest
     * @return DescribeUinInWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUinInWhitelistResponse DescribeUinInWhitelist(DescribeUinInWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUinInWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUinInWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUinInWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable the RESTful API.
     * @param req DisableRestProxyRequest
     * @return DisableRestProxyResponse
     * @throws TencentCloudSDKException
     */
    public DisableRestProxyResponse DisableRestProxy(DisableRestProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableRestProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableRestProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableRestProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the RESTful API.
     * @param req EnableRestProxyRequest
     * @return EnableRestProxyResponse
     * @throws TencentCloudSDKException
     */
    public EnableRestProxyResponse EnableRestProxy(EnableRestProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableRestProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableRestProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableRestProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to import a snapshot into a new table or the original table from which the snapshot was created.
     * @param req ImportSnapshotsRequest
     * @return ImportSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSnapshotsResponse ImportSnapshots(ImportSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to merge tables.
     * @param req MergeTablesDataRequest
     * @return MergeTablesDataResponse
     * @throws TencentCloudSDKException
     */
    public MergeTablesDataResponse MergeTablesData(MergeTablesDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MergeTablesDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MergeTablesDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MergeTablesData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable the cluster operation approval feature.
     * @param req ModifyCensorshipRequest
     * @return ModifyCensorshipResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCensorshipResponse ModifyCensorship(ModifyCensorshipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCensorshipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCensorshipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCensorship");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the machines of a dedicated cluster.
     * @param req ModifyClusterMachineRequest
     * @return ModifyClusterMachineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterMachineResponse ModifyClusterMachine(ModifyClusterMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterMachineResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterMachineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterMachine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a specified cluster.
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the password of a specified cluster. The backend will allow the TcaplusDB SDK to access databases with both old and new passwords before the old password expires. You cannot submit a new password change request before the old password expires or submit a request to modify the expiration time of the old password after the old password expires.
     * @param req ModifyClusterPasswordRequest
     * @return ModifyClusterPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordResponse ModifyClusterPassword(ModifyClusterPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterPasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify cluster tags.
     * @param req ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterTagsResponse ModifyClusterTags(ModifyClusterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the expiration time of one or more table snapshots.
     * @param req ModifySnapshotsRequest
     * @return ModifySnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotsResponse ModifySnapshots(ModifySnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a TcaplusDB table group.
     * @param req ModifyTableGroupNameRequest
     * @return ModifyTableGroupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupNameResponse ModifyTableGroupName(ModifyTableGroupNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableGroupNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableGroupNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableGroupName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify table group tags.
     * @param req ModifyTableGroupTagsRequest
     * @return ModifyTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupTagsResponse ModifyTableGroupTags(ModifyTableGroupTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableGroupTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableGroupTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableGroupTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify table remarks.
     * @param req ModifyTableMemosRequest
     * @return ModifyTableMemosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableMemosResponse ModifyTableMemos(ModifyTableMemosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableMemosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableMemosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableMemos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to scale a table.
     * @param req ModifyTableQuotasRequest
     * @return ModifyTableQuotasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableQuotasResponse ModifyTableQuotas(ModifyTableQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableQuotasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify table tags.
     * @param req ModifyTableTagsRequest
     * @return ModifyTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableTagsResponse ModifyTableTags(ModifyTableTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify specified tables in batches based on the selected table definition IDL file.
     * @param req ModifyTablesRequest
     * @return ModifyTablesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTablesResponse ModifyTables(ModifyTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recover a dropped table from the recycle bin. It will not work for tables to be released due to arrears.
     * @param req RecoverRecycleTablesRequest
     * @return RecoverRecycleTablesResponse
     * @throws TencentCloudSDKException
     */
    public RecoverRecycleTablesResponse RecoverRecycleTables(RecoverRecycleTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverRecycleTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverRecycleTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverRecycleTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to roll back table data.
     * @param req RollbackTablesRequest
     * @return RollbackTablesResponse
     * @throws TencentCloudSDKException
     */
    public RollbackTablesResponse RollbackTables(RollbackTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollbackTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollbackTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable data subscription for tables or modify the feature's configurations.
     * @param req SetTableDataFlowRequest
     * @return SetTableDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public SetTableDataFlowResponse SetTableDataFlow(SetTableDataFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTableDataFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetTableDataFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTableDataFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a global index for a table.
     * @param req SetTableIndexRequest
     * @return SetTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public SetTableIndexResponse SetTableIndex(SetTableIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTableIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetTableIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTableIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the application status.
     * @param req UpdateApplyRequest
     * @return UpdateApplyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApplyResponse UpdateApply(UpdateApplyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApplyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApplyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApply");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upload and verify a table creation file and return the definition of tables that are verified to be valid.
     * @param req VerifyIdlFilesRequest
     * @return VerifyIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public VerifyIdlFilesResponse VerifyIdlFiles(VerifyIdlFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyIdlFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyIdlFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyIdlFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
