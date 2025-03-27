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
    private static String endpoint = "tcaplusdb.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearTables", ClearTablesResponse.class);
    }

    /**
     *This API is used to select a target table, upload and verify the table modification file, and return the result of whether the table structure is allowed to be modified.
     * @param req CompareIdlFilesRequest
     * @return CompareIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public CompareIdlFilesResponse CompareIdlFiles(CompareIdlFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompareIdlFiles", CompareIdlFilesResponse.class);
    }

    /**
     *This API is used to create a backup task.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *This API is used to create a TcaplusDB cluster.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *This API is used to create one or more table snapshots at a specified past time point.
     * @param req CreateSnapshotsRequest
     * @return CreateSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotsResponse CreateSnapshots(CreateSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshots", CreateSnapshotsResponse.class);
    }

    /**
     *This API is used to create a table group in a TcaplusDB cluster.
     * @param req CreateTableGroupRequest
     * @return CreateTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableGroupResponse CreateTableGroup(CreateTableGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTableGroup", CreateTableGroupResponse.class);
    }

    /**
     *This API is used to create tables in batches based on the selected IDL file list.
     * @param req CreateTablesRequest
     * @return CreateTablesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTablesResponse CreateTables(CreateTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTables", CreateTablesResponse.class);
    }

    /**
     *This API is used to delete a manual backup.
     * @param req DeleteBackupRecordsRequest
     * @return DeleteBackupRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupRecordsResponse DeleteBackupRecords(DeleteBackupRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupRecords", DeleteBackupRecordsResponse.class);
    }

    /**
     *This API is used to delete a TcaplusDB cluster, which will succeed only after all resources (including table groups and tables) in the cluster are released.
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *This API is used to delete a target IDL file by specifying the cluster ID and information of the file to be deleted. If the file is associated with a table, deletion will fail.
     * @param req DeleteIdlFilesRequest
     * @return DeleteIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIdlFilesResponse DeleteIdlFiles(DeleteIdlFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIdlFiles", DeleteIdlFilesResponse.class);
    }

    /**
     *This API is used to delete one or more table snapshots.
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshots", DeleteSnapshotsResponse.class);
    }

    /**
     *This API is used to disable data subscription for tables.
     * @param req DeleteTableDataFlowRequest
     * @return DeleteTableDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableDataFlowResponse DeleteTableDataFlow(DeleteTableDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableDataFlow", DeleteTableDataFlowResponse.class);
    }

    /**
     *This API is used to delete a table group.
     * @param req DeleteTableGroupRequest
     * @return DeleteTableGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableGroupResponse DeleteTableGroup(DeleteTableGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableGroup", DeleteTableGroupResponse.class);
    }

    /**
     *This API is used to delete the global index from a table.
     * @param req DeleteTableIndexRequest
     * @return DeleteTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableIndexResponse DeleteTableIndex(DeleteTableIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTableIndex", DeleteTableIndexResponse.class);
    }

    /**
     *This API is used to drop a specified table. Calling this API for the first time means to move the table to the recycle bin, while calling it again means to drop the table completely from the recycle bin.
     * @param req DeleteTablesRequest
     * @return DeleteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTablesResponse DeleteTables(DeleteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTables", DeleteTablesResponse.class);
    }

    /**
     *This API is used to query backup records.

When querying the cluster level, set `TableGroupId` to `-1` and `TableName` to `-1`.
When querying the cluster and table group levels, set `TableName` to `-1`.
When querying the cluster, table group, and table levels, both `TableGroupId` and `TableName` cannot be set to `-1`.
     * @param req DescribeBackupRecordsRequest
     * @return DescribeBackupRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupRecordsResponse DescribeBackupRecords(DescribeBackupRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupRecords", DescribeBackupRecordsResponse.class);
    }

    /**
     *This API is used to get the associated tag list of a cluster.
     * @param req DescribeClusterTagsRequest
     * @return DescribeClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterTagsResponse DescribeClusterTags(DescribeClusterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterTags", DescribeClusterTagsResponse.class);
    }

    /**
     *This API is used to query the TcaplusDB cluster list, including cluster details.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *This API is used to query table description file details.
     * @param req DescribeIdlFileInfosRequest
     * @return DescribeIdlFileInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdlFileInfosResponse DescribeIdlFileInfos(DescribeIdlFileInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdlFileInfos", DescribeIdlFileInfosResponse.class);
    }

    /**
     *This API is used to query the available machines in a dedicated cluster.
     * @param req DescribeMachineRequest
     * @return DescribeMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineResponse DescribeMachine(DescribeMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachine", DescribeMachineResponse.class);
    }

    /**
     *This API is used to query the list of regions supported by the TcaplusDB service.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query the list of table snapshots.
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *This API is used to get the associated tag list of a table group.
     * @param req DescribeTableGroupTagsRequest
     * @return DescribeTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupTagsResponse DescribeTableGroupTags(DescribeTableGroupTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableGroupTags", DescribeTableGroupTagsResponse.class);
    }

    /**
     *This API is used to query the table group list.
     * @param req DescribeTableGroupsRequest
     * @return DescribeTableGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableGroupsResponse DescribeTableGroups(DescribeTableGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableGroups", DescribeTableGroupsResponse.class);
    }

    /**
     *This API is used to get table tags.
     * @param req DescribeTableTagsRequest
     * @return DescribeTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableTagsResponse DescribeTableTags(DescribeTableTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableTags", DescribeTableTagsResponse.class);
    }

    /**
     *This API is used to query table details.
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *This API is used to query the details of a table in recycle bin.
     * @param req DescribeTablesInRecycleRequest
     * @return DescribeTablesInRecycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesInRecycleResponse DescribeTablesInRecycle(DescribeTablesInRecycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablesInRecycle", DescribeTablesInRecycleResponse.class);
    }

    /**
     *This API is used to query the task list.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *This API is used to query whether the current user is in the allowlist and control whether the user can create TDR-type apps or tables.
     * @param req DescribeUinInWhitelistRequest
     * @return DescribeUinInWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUinInWhitelistResponse DescribeUinInWhitelist(DescribeUinInWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUinInWhitelist", DescribeUinInWhitelistResponse.class);
    }

    /**
     *This API is used to disable the RESTful API.
     * @param req DisableRestProxyRequest
     * @return DisableRestProxyResponse
     * @throws TencentCloudSDKException
     */
    public DisableRestProxyResponse DisableRestProxy(DisableRestProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRestProxy", DisableRestProxyResponse.class);
    }

    /**
     *This API is used to enable the RESTful API.
     * @param req EnableRestProxyRequest
     * @return EnableRestProxyResponse
     * @throws TencentCloudSDKException
     */
    public EnableRestProxyResponse EnableRestProxy(EnableRestProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableRestProxy", EnableRestProxyResponse.class);
    }

    /**
     *This API is used to import a snapshot into a new table or the original table from which the snapshot was created.
     * @param req ImportSnapshotsRequest
     * @return ImportSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSnapshotsResponse ImportSnapshots(ImportSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportSnapshots", ImportSnapshotsResponse.class);
    }

    /**
     *This API is used to merge tables.
     * @param req MergeTablesDataRequest
     * @return MergeTablesDataResponse
     * @throws TencentCloudSDKException
     */
    public MergeTablesDataResponse MergeTablesData(MergeTablesDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MergeTablesData", MergeTablesDataResponse.class);
    }

    /**
     *This API is used to enable or disable the cluster operation approval feature.
     * @param req ModifyCensorshipRequest
     * @return ModifyCensorshipResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCensorshipResponse ModifyCensorship(ModifyCensorshipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCensorship", ModifyCensorshipResponse.class);
    }

    /**
     *This API is used to modify the machines of a dedicated cluster.
     * @param req ModifyClusterMachineRequest
     * @return ModifyClusterMachineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterMachineResponse ModifyClusterMachine(ModifyClusterMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterMachine", ModifyClusterMachineResponse.class);
    }

    /**
     *This API is used to rename a specified cluster.
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterName", ModifyClusterNameResponse.class);
    }

    /**
     *This API is used to change the password of a specified cluster. The backend will allow the TcaplusDB SDK to access databases with both old and new passwords before the old password expires. You cannot submit a new password change request before the old password expires or submit a request to modify the expiration time of the old password after the old password expires.
     * @param req ModifyClusterPasswordRequest
     * @return ModifyClusterPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordResponse ModifyClusterPassword(ModifyClusterPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterPassword", ModifyClusterPasswordResponse.class);
    }

    /**
     *This API is used to modify cluster tags.
     * @param req ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterTagsResponse ModifyClusterTags(ModifyClusterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterTags", ModifyClusterTagsResponse.class);
    }

    /**
     *This API is used to modify the expiration time of one or more table snapshots.
     * @param req ModifySnapshotsRequest
     * @return ModifySnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotsResponse ModifySnapshots(ModifySnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshots", ModifySnapshotsResponse.class);
    }

    /**
     *This API is used to rename a TcaplusDB table group.
     * @param req ModifyTableGroupNameRequest
     * @return ModifyTableGroupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupNameResponse ModifyTableGroupName(ModifyTableGroupNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableGroupName", ModifyTableGroupNameResponse.class);
    }

    /**
     *This API is used to modify table group tags.
     * @param req ModifyTableGroupTagsRequest
     * @return ModifyTableGroupTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableGroupTagsResponse ModifyTableGroupTags(ModifyTableGroupTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableGroupTags", ModifyTableGroupTagsResponse.class);
    }

    /**
     *This API is used to modify table remarks.
     * @param req ModifyTableMemosRequest
     * @return ModifyTableMemosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableMemosResponse ModifyTableMemos(ModifyTableMemosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableMemos", ModifyTableMemosResponse.class);
    }

    /**
     *This API is used to scale a table.
     * @param req ModifyTableQuotasRequest
     * @return ModifyTableQuotasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableQuotasResponse ModifyTableQuotas(ModifyTableQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableQuotas", ModifyTableQuotasResponse.class);
    }

    /**
     *This API is used to modify table tags.
     * @param req ModifyTableTagsRequest
     * @return ModifyTableTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableTagsResponse ModifyTableTags(ModifyTableTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableTags", ModifyTableTagsResponse.class);
    }

    /**
     *This API is used to modify specified tables in batches based on the selected table definition IDL file.
     * @param req ModifyTablesRequest
     * @return ModifyTablesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTablesResponse ModifyTables(ModifyTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTables", ModifyTablesResponse.class);
    }

    /**
     *This API is used to recover a dropped table from the recycle bin. It will not work for tables to be released due to arrears.
     * @param req RecoverRecycleTablesRequest
     * @return RecoverRecycleTablesResponse
     * @throws TencentCloudSDKException
     */
    public RecoverRecycleTablesResponse RecoverRecycleTables(RecoverRecycleTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverRecycleTables", RecoverRecycleTablesResponse.class);
    }

    /**
     *This API is used to roll back table data.
     * @param req RollbackTablesRequest
     * @return RollbackTablesResponse
     * @throws TencentCloudSDKException
     */
    public RollbackTablesResponse RollbackTables(RollbackTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackTables", RollbackTablesResponse.class);
    }

    /**
     *This API is used to add/delete/modify backup expiration policy. `ClusterId` must be a specific cluster ID (appid).
     * @param req SetBackupExpireRuleRequest
     * @return SetBackupExpireRuleResponse
     * @throws TencentCloudSDKException
     */
    public SetBackupExpireRuleResponse SetBackupExpireRule(SetBackupExpireRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetBackupExpireRule", SetBackupExpireRuleResponse.class);
    }

    /**
     *This API is used to enable data subscription for tables or modify the feature's configurations.
     * @param req SetTableDataFlowRequest
     * @return SetTableDataFlowResponse
     * @throws TencentCloudSDKException
     */
    public SetTableDataFlowResponse SetTableDataFlow(SetTableDataFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTableDataFlow", SetTableDataFlowResponse.class);
    }

    /**
     *This API is used to create a global index for a table.
     * @param req SetTableIndexRequest
     * @return SetTableIndexResponse
     * @throws TencentCloudSDKException
     */
    public SetTableIndexResponse SetTableIndex(SetTableIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTableIndex", SetTableIndexResponse.class);
    }

    /**
     *This API is used to update the application status.
     * @param req UpdateApplyRequest
     * @return UpdateApplyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApplyResponse UpdateApply(UpdateApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApply", UpdateApplyResponse.class);
    }

    /**
     *This API is used to upload and verify a table creation file and return the definition of tables that are verified to be valid.
     * @param req VerifyIdlFilesRequest
     * @return VerifyIdlFilesResponse
     * @throws TencentCloudSDKException
     */
    public VerifyIdlFilesResponse VerifyIdlFiles(VerifyIdlFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyIdlFiles", VerifyIdlFilesResponse.class);
    }

}
