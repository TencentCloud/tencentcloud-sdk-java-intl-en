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
package com.tencentcloudapi.cdwdoris.v20211228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwdoris.v20211228.models.*;

public class CdwdorisClient extends AbstractClient{
    private static String endpoint = "cdwdoris.intl.tencentcloudapi.com";
    private static String service = "cdwdoris";
    private static String version = "2021-12-28";

    public CdwdorisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwdorisClient(Credential credential, String region, ClientProfile profile) {
        super(CdwdorisClient.endpoint, CdwdorisClient.version, credential, region, profile);
    }

    /**
     *This API is used to add and modify a user.
     * @param req ActionAlterUserRequest
     * @return ActionAlterUserResponse
     * @throws TencentCloudSDKException
     */
    public ActionAlterUserResponse ActionAlterUser(ActionAlterUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActionAlterUser", ActionAlterUserResponse.class);
    }

    /**
     *This API is used to cancel the corresponding backup instance task.
     * @param req CancelBackupJobRequest
     * @return CancelBackupJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelBackupJobResponse CancelBackupJob(CancelBackupJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelBackupJob", CancelBackupJobResponse.class);
    }

    /**
     *This API is used to check whether variables and configurations for hot/cold data layering are correct.
     * @param req CheckCoolDownWorkingVariableConfigCorrectRequest
     * @return CheckCoolDownWorkingVariableConfigCorrectResponse
     * @throws TencentCloudSDKException
     */
    public CheckCoolDownWorkingVariableConfigCorrectResponse CheckCoolDownWorkingVariableConfigCorrect(CheckCoolDownWorkingVariableConfigCorrectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCoolDownWorkingVariableConfigCorrect", CheckCoolDownWorkingVariableConfigCorrectResponse.class);
    }

    /**
     *This API is used to copy the source table to the target table.
     * @param req CopyTableDatasRequest
     * @return CopyTableDatasResponse
     * @throws TencentCloudSDKException
     */
    public CopyTableDatasResponse CopyTableDatas(CopyTableDatasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyTableDatas", CopyTableDatasResponse.class);
    }

    /**
     *This API is used to create or modify backup policies.
     * @param req CreateBackUpScheduleRequest
     * @return CreateBackUpScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackUpScheduleResponse CreateBackUpSchedule(CreateBackUpScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackUpSchedule", CreateBackUpScheduleResponse.class);
    }

    /**
     *This API is used to create a hot/cold data layering policy.
     * @param req CreateCoolDownPolicyRequest
     * @return CreateCoolDownPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCoolDownPolicyResponse CreateCoolDownPolicy(CreateCoolDownPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCoolDownPolicy", CreateCoolDownPolicyResponse.class);
    }

    /**
     *This API is used to create a TCHouse-D database.
     * @param req CreateDatabaseRequest
     * @return CreateDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseResponse CreateDatabase(CreateDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatabase", CreateDatabaseResponse.class);
    }

    /**
     *This API is used to create clusters.
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceNew", CreateInstanceNewResponse.class);
    }

    /**
     *This API is used to create a TCHouse-D table under the specified database.
     * @param req CreateTableRequest
     * @return CreateTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableResponse CreateTable(CreateTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTable", CreateTableResponse.class);
    }

    /**
     *This API is used to create resource groups.
     * @param req CreateWorkloadGroupRequest
     * @return CreateWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkloadGroupResponse CreateWorkloadGroup(CreateWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkloadGroup", CreateWorkloadGroupResponse.class);
    }

    /**
     *This API is used to delete backup data.
     * @param req DeleteBackUpDataRequest
     * @return DeleteBackUpDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackUpDataResponse DeleteBackUpData(DeleteBackUpDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackUpData", DeleteBackUpDataResponse.class);
    }

    /**
     *This API is used to delete the specified table in the specified database.
     * @param req DeleteTableRequest
     * @return DeleteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableResponse DeleteTable(DeleteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTable", DeleteTableResponse.class);
    }

    /**
     *This API is used to delete resource groups.
     * @param req DeleteWorkloadGroupRequest
     * @return DeleteWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkloadGroupResponse DeleteWorkloadGroup(DeleteWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkloadGroup", DeleteWorkloadGroupResponse.class);
    }

    /**
     *This API is used to display region information and the total number of clusters in each region on the cluster list page.
     * @param req DescribeAreaRegionRequest
     * @return DescribeAreaRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaRegionResponse DescribeAreaRegion(DescribeAreaRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAreaRegion", DescribeAreaRegionResponse.class);
    }

    /**
     *This API is used to query the list of backup instances.
     * @param req DescribeBackUpJobRequest
     * @return DescribeBackUpJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpJobResponse DescribeBackUpJob(DescribeBackUpJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpJob", DescribeBackUpJobResponse.class);
    }

    /**
     *This API is used to query backup task details.
     * @param req DescribeBackUpJobDetailRequest
     * @return DescribeBackUpJobDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpJobDetailResponse DescribeBackUpJobDetail(DescribeBackUpJobDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpJobDetail", DescribeBackUpJobDetailResponse.class);
    }

    /**
     *This API is used to obtain the scheduled task information for the backup and migration.
     * @param req DescribeBackUpSchedulesRequest
     * @return DescribeBackUpSchedulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpSchedulesResponse DescribeBackUpSchedules(DescribeBackUpSchedulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpSchedules", DescribeBackUpSchedulesResponse.class);
    }

    /**
     *This API is used to obtain the information of the table available for backup.
     * @param req DescribeBackUpTablesRequest
     * @return DescribeBackUpTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpTablesResponse DescribeBackUpTables(DescribeBackUpTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpTables", DescribeBackUpTablesResponse.class);
    }

    /**
     *This API is used to query the progress details of backup tasks.
     * @param req DescribeBackUpTaskDetailRequest
     * @return DescribeBackUpTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpTaskDetailResponse DescribeBackUpTaskDetail(DescribeBackUpTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpTaskDetail", DescribeBackUpTaskDetailResponse.class);
    }

    /**
     *This API is used to get the contents of the latest configuration files (config.xml, metrika.xml, and user.xml) of the cluster and display them to the user.
     * @param req DescribeClusterConfigsRequest
     * @return DescribeClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsResponse DescribeClusterConfigs(DescribeClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigs", DescribeClusterConfigsResponse.class);
    }

    /**
     *This API is used to obtain the modification history of cluster configuration files.
     * @param req DescribeClusterConfigsHistoryRequest
     * @return DescribeClusterConfigsHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsHistoryResponse DescribeClusterConfigsHistory(DescribeClusterConfigsHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigsHistory", DescribeClusterConfigsHistoryResponse.class);
    }

    /**
     *This API is used to query the list of backend nodes supporting hot/cold data layering.
     * @param req DescribeCoolDownBackendsRequest
     * @return DescribeCoolDownBackendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoolDownBackendsResponse DescribeCoolDownBackends(DescribeCoolDownBackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCoolDownBackends", DescribeCoolDownBackendsResponse.class);
    }

    /**
     *This API is used to query the list of hot/cold data layering policies.
     * @param req DescribeCoolDownPoliciesRequest
     * @return DescribeCoolDownPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoolDownPoliciesResponse DescribeCoolDownPolicies(DescribeCoolDownPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCoolDownPolicies", DescribeCoolDownPoliciesResponse.class);
    }

    /**
     *This API is used to query the layered hot and cold data in a table.
     * @param req DescribeCoolDownTableDataRequest
     * @return DescribeCoolDownTableDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCoolDownTableDataResponse DescribeCoolDownTableData(DescribeCoolDownTableDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCoolDownTableData", DescribeCoolDownTableDataResponse.class);
    }

    /**
     *This API is used to batch obtain the table creation DDL.
     * @param req DescribeCreateTablesDDLRequest
     * @return DescribeCreateTablesDDLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCreateTablesDDLResponse DescribeCreateTablesDDL(DescribeCreateTablesDDLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCreateTablesDDL", DescribeCreateTablesDDLResponse.class);
    }

    /**
     *This API is used to obtain the database information under a specific data source.
     * @param req DescribeDatabaseRequest
     * @return DescribeDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseResponse DescribeDatabase(DescribeDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabase", DescribeDatabaseResponse.class);
    }

    /**
     *This API is used to download database audit logs.
     * @param req DescribeDatabaseAuditDownloadRequest
     * @return DescribeDatabaseAuditDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditDownloadResponse DescribeDatabaseAuditDownload(DescribeDatabaseAuditDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditDownload", DescribeDatabaseAuditDownloadResponse.class);
    }

    /**
     *This API is used to get database audit records.
     * @param req DescribeDatabaseAuditRecordsRequest
     * @return DescribeDatabaseAuditRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditRecordsResponse DescribeDatabaseAuditRecords(DescribeDatabaseAuditRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditRecords", DescribeDatabaseAuditRecordsResponse.class);
    }

    /**
     *This API is used to query the specific information of a cluster based on the cluster ID.
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *This API is used to get the list of cluster node information.
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *This API is used to get the BE/FE node roles.
     * @param req DescribeInstanceNodesInfoRequest
     * @return DescribeInstanceNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesInfoResponse DescribeInstanceNodesInfo(DescribeInstanceNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesInfo", DescribeInstanceNodesInfoResponse.class);
    }

    /**
     *This API is used to obtain cluster node roles.
     * @param req DescribeInstanceNodesRoleRequest
     * @return DescribeInstanceNodesRoleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesRoleResponse DescribeInstanceNodesRole(DescribeInstanceNodesRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesRole", DescribeInstanceNodesRoleResponse.class);
    }

    /**
     *This API is used to pull the operation list of the cluster. The API supports pagination query and filtering operation records by time range.
     * @param req DescribeInstanceOperationHistoryRequest
     * @return DescribeInstanceOperationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationHistoryResponse DescribeInstanceOperationHistory(DescribeInstanceOperationHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperationHistory", DescribeInstanceOperationHistoryResponse.class);
    }

    /**
     *This API is used to pull operations of the cluster on the cluster details page.
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *This API is used to display cluster status, process progress, etc. in the cluster details page.
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *This API is used to obtain the information of subnets used by the cluster.
     * @param req DescribeInstanceUsedSubnetsRequest
     * @return DescribeInstanceUsedSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUsedSubnetsResponse DescribeInstanceUsedSubnets(DescribeInstanceUsedSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUsedSubnets", DescribeInstanceUsedSubnetsResponse.class);
    }

    /**
     *This API is used to get the list of clusters.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to check cluster health
     * @param req DescribeInstancesHealthStateRequest
     * @return DescribeInstancesHealthStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesHealthStateResponse DescribeInstancesHealthState(DescribeInstancesHealthStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesHealthState", DescribeInstancesHealthStateResponse.class);
    }

    /**
     *This API is used to obtain the SQL query details of the Doris user.
     * @param req DescribeQueryAnalyseRequest
     * @return DescribeQueryAnalyseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueryAnalyseResponse DescribeQueryAnalyse(DescribeQueryAnalyseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQueryAnalyse", DescribeQueryAnalyseResponse.class);
    }

    /**
     *This API is used to query the progress details of the recovery task.
     * @param req DescribeRestoreTaskDetailRequest
     * @return DescribeRestoreTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTaskDetailResponse DescribeRestoreTaskDetail(DescribeRestoreTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTaskDetail", DescribeRestoreTaskDetailResponse.class);
    }

    /**
     *This API is used to get the slow log list.
     * @param req DescribeSlowQueryRecordsRequest
     * @return DescribeSlowQueryRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsResponse DescribeSlowQueryRecords(DescribeSlowQueryRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecords", DescribeSlowQueryRecordsResponse.class);
    }

    /**
     *This API is used to download slow log files.
     * @param req DescribeSlowQueryRecordsDownloadRequest
     * @return DescribeSlowQueryRecordsDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsDownloadResponse DescribeSlowQueryRecordsDownload(DescribeSlowQueryRecordsDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecordsDownload", DescribeSlowQueryRecordsDownloadResponse.class);
    }

    /**
     *This API is used to pull the specification list of data nodes and zookeeper nodes for the cluster on the purchase page.
     * @param req DescribeSpecRequest
     * @return DescribeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecResponse DescribeSpec(DescribeSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpec", DescribeSpecResponse.class);
    }

    /**
     *This API is used to query the cluster information by executing SQL commands.
     * @param req DescribeSqlApisRequest
     * @return DescribeSqlApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlApisResponse DescribeSqlApis(DescribeSqlApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSqlApis", DescribeSqlApisResponse.class);
    }

    /**
     *This API is used to obtain the table information. It only supports querying table information in the TCHouse-D internal catalog.
     * @param req DescribeTableRequest
     * @return DescribeTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableResponse DescribeTable(DescribeTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTable", DescribeTableResponse.class);
    }

    /**
     *This API is used to obtain the list of tables under the specified data source and database.
     * @param req DescribeTableListRequest
     * @return DescribeTableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableListResponse DescribeTableList(DescribeTableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableList", DescribeTableListResponse.class);
    }

    /**
     *This API is used to obtain the resource information bound to each user in the current cluster.
     * @param req DescribeUserBindWorkloadGroupRequest
     * @return DescribeUserBindWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserBindWorkloadGroupResponse DescribeUserBindWorkloadGroup(DescribeUserBindWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserBindWorkloadGroup", DescribeUserBindWorkloadGroupResponse.class);
    }

    /**
     *This API is used to obtain detailed information of Doris users, including account information, permission host, and permission configuration.
     * @param req DescribeUserPolicyRequest
     * @return DescribeUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserPolicyResponse DescribeUserPolicy(DescribeUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserPolicy", DescribeUserPolicyResponse.class);
    }

    /**
     *This API is used to obtain resource group information.
     * @param req DescribeWorkloadGroupRequest
     * @return DescribeWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkloadGroupResponse DescribeWorkloadGroup(DescribeWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkloadGroup", DescribeWorkloadGroupResponse.class);
    }

    /**
     *This API is used to terminate clusters.
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstance", DestroyInstanceResponse.class);
    }

    /**
     *This API is used to execute an SQL query statement with parameters and return the query results.
     * @param req ExecuteParametrizedQueryRequest
     * @return ExecuteParametrizedQueryResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteParametrizedQueryResponse ExecuteParametrizedQuery(ExecuteParametrizedQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteParametrizedQuery", ExecuteParametrizedQueryResponse.class);
    }

    /**
     *This API is used to query data according to the specified database and table name, and support field selection and pagination.
     * @param req ExecuteSelectQueryRequest
     * @return ExecuteSelectQueryResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteSelectQueryResponse ExecuteSelectQuery(ExecuteSelectQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteSelectQuery", ExecuteSelectQueryResponse.class);
    }

    /**
     *This API is used to insert data into TCHouse-D.
     * @param req InsertDatasToTableRequest
     * @return InsertDatasToTableResponse
     * @throws TencentCloudSDKException
     */
    public InsertDatasToTableResponse InsertDatasToTable(InsertDatasToTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InsertDatasToTable", InsertDatasToTableResponse.class);
    }

    /**
     *This API is used to modify the XML cluster configuration file on the cluster configuration page.
     * @param req ModifyClusterConfigsRequest
     * @return ModifyClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterConfigsResponse ModifyClusterConfigs(ModifyClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterConfigs", ModifyClusterConfigsResponse.class);
    }

    /**
     *This API is used to modify the hot/cold data layering policy.
     * @param req ModifyCoolDownPolicyRequest
     * @return ModifyCoolDownPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCoolDownPolicyResponse ModifyCoolDownPolicy(ModifyCoolDownPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCoolDownPolicy", ModifyCoolDownPolicyResponse.class);
    }

    /**
     *This API is used to GRANT and REVOKE the database and table in the Doris database.
     * @param req ModifyDatabaseTableAccessRequest
     * @return ModifyDatabaseTableAccessResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseTableAccessResponse ModifyDatabaseTableAccess(ModifyDatabaseTableAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseTableAccess", ModifyDatabaseTableAccessResponse.class);
    }

    /**
     *This API is used to modify the cluster's name.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to modify configurations in the KV mode.
     * @param req ModifyInstanceKeyValConfigsRequest
     * @return ModifyInstanceKeyValConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceKeyValConfigsResponse ModifyInstanceKeyValConfigs(ModifyInstanceKeyValConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceKeyValConfigs", ModifyInstanceKeyValConfigsResponse.class);
    }

    /**
     *This API is used to change the node status.
     * @param req ModifyNodeStatusRequest
     * @return ModifyNodeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodeStatusResponse ModifyNodeStatus(ModifyNodeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodeStatus", ModifyNodeStatusResponse.class);
    }

    /**
     *This API is used to edit security groups.
     * @param req ModifySecurityGroupsRequest
     * @return ModifySecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupsResponse ModifySecurityGroups(ModifySecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroups", ModifySecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify the resource group bound to the user.
     * @param req ModifyUserBindWorkloadGroupRequest
     * @return ModifyUserBindWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserBindWorkloadGroupResponse ModifyUserBindWorkloadGroup(ModifyUserBindWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserBindWorkloadGroup", ModifyUserBindWorkloadGroupResponse.class);
    }

    /**
     *This API is used to modify user permissions and support three permission setting categories: catalog, all db, and some db tables.
     * @param req ModifyUserPrivilegesV3Request
     * @return ModifyUserPrivilegesV3Response
     * @throws TencentCloudSDKException
     */
    public ModifyUserPrivilegesV3Response ModifyUserPrivilegesV3(ModifyUserPrivilegesV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPrivilegesV3", ModifyUserPrivilegesV3Response.class);
    }

    /**
     *This API is used to modify the resource group information.
     * @param req ModifyWorkloadGroupRequest
     * @return ModifyWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkloadGroupResponse ModifyWorkloadGroup(ModifyWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkloadGroup", ModifyWorkloadGroupResponse.class);
    }

    /**
     *This API is used to enable or disable resource groups.
     * @param req ModifyWorkloadGroupStatusRequest
     * @return ModifyWorkloadGroupStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkloadGroupStatusResponse ModifyWorkloadGroupStatus(ModifyWorkloadGroupStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkloadGroupStatus", ModifyWorkloadGroupStatusResponse.class);
    }

    /**
     *This API is used to enable hot/cold data layering.
     * @param req OpenCoolDownRequest
     * @return OpenCoolDownResponse
     * @throws TencentCloudSDKException
     */
    public OpenCoolDownResponse OpenCoolDown(OpenCoolDownRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenCoolDown", OpenCoolDownResponse.class);
    }

    /**
     *This API is used to enable and describe the cold storage policy.
     * @param req OpenCoolDownPolicyRequest
     * @return OpenCoolDownPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenCoolDownPolicyResponse OpenCoolDownPolicy(OpenCoolDownPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenCoolDownPolicy", OpenCoolDownPolicyResponse.class);
    }

    /**
     *This API is used to query data according to the specified database and table names, and support field selection and pagination.
     * @param req QueryTableDataRequest
     * @return QueryTableDataResponse
     * @throws TencentCloudSDKException
     */
    public QueryTableDataResponse QueryTableData(QueryTableDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryTableData", QueryTableDataResponse.class);
    }

    /**
     *This API is used to back up and recover.
     * @param req RecoverBackUpJobRequest
     * @return RecoverBackUpJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverBackUpJobResponse RecoverBackUpJob(RecoverBackUpJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverBackUpJob", RecoverBackUpJobResponse.class);
    }

    /**
     *This API is used to scale in clusters.
     * @param req ReduceInstanceRequest
     * @return ReduceInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ReduceInstanceResponse ReduceInstance(ReduceInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReduceInstance", ReduceInstanceResponse.class);
    }

    /**
     *This API is used to expand cloud disks.
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisk", ResizeDiskResponse.class);
    }

    /**
     *This API is used to restart the cluster to make the configuration file take effect.
     * @param req RestartClusterForConfigsRequest
     * @return RestartClusterForConfigsResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForConfigsResponse RestartClusterForConfigs(RestartClusterForConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForConfigs", RestartClusterForConfigsResponse.class);
    }

    /**
     *This API is used to indicate the rolling restart of the clusters.
     * @param req RestartClusterForNodeRequest
     * @return RestartClusterForNodeResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForNodeResponse RestartClusterForNode(RestartClusterForNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForNode", RestartClusterForNodeResponse.class);
    }

    /**
     *This API is used to horizontally scale out nodes.
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to scale up/down computing resources.
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

    /**
     *This API is used to update the hot/cold data layering information on a cluster.
     * @param req UpdateCoolDownRequest
     * @return UpdateCoolDownResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCoolDownResponse UpdateCoolDown(UpdateCoolDownRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCoolDown", UpdateCoolDownResponse.class);
    }

    /**
     *This API is used to modify the attributes of a specified database, including setting the data volume quota, renaming the database, setting the replica quantity quota, and modifying other attributes of the database.
     * @param req UpdateDatabaseRequest
     * @return UpdateDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDatabaseResponse UpdateDatabase(UpdateDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDatabase", UpdateDatabaseResponse.class);
    }

    /**
     *This API is used to modify the attributes of a specified table. The API parameters are consistent with those for creating a table.
     * @param req UpdateTableSchemaRequest
     * @return UpdateTableSchemaResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTableSchemaResponse UpdateTableSchema(UpdateTableSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTableSchema", UpdateTableSchemaResponse.class);
    }

}
