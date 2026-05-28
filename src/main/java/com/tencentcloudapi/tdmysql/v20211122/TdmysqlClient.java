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
package com.tencentcloudapi.tdmysql.v20211122;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdmysql.v20211122.models.*;

public class TdmysqlClient extends AbstractClient{
    private static String endpoint = "tdmysql.intl.tencentcloudapi.com";
    private static String service = "tdmysql";
    private static String version = "2021-11-22";

    public TdmysqlClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdmysqlClient(Credential credential, String region, ClientProfile profile) {
        super(TdmysqlClient.endpoint, TdmysqlClient.version, credential, region, profile);
    }

    /**
     *This API is used to lift isolation for instances in batch.
     * @param req CancelIsolateDBInstancesRequest
     * @return CancelIsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CancelIsolateDBInstancesResponse CancelIsolateDBInstances(CancelIsolateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelIsolateDBInstances", CancelIsolateDBInstancesResponse.class);
    }

    /**
     *This API is used to create clone instances.
     * @param req CreateCloneInstanceRequest
     * @return CreateCloneInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloneInstanceResponse CreateCloneInstance(CreateCloneInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloneInstance", CreateCloneInstanceResponse.class);
    }

    /**
     *This API is used to batch create instances.
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstances", CreateDBInstancesResponse.class);
    }

    /**
     *This API is used to create a manual backup of an instance.
     * @param req CreateDBSBackupRequest
     * @return CreateDBSBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBSBackupResponse CreateDBSBackup(CreateDBSBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBSBackup", CreateDBSBackupResponse.class);
    }

    /**
     *This API is used to delete manual backups of instances.
     * @param req DeleteDBSBackupSetsRequest
     * @return DeleteDBSBackupSetsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBSBackupSetsResponse DeleteDBSBackupSets(DeleteDBSBackupSetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBSBackupSets", DeleteDBSBackupSetsResponse.class);
    }

    /**
     *This API is used to query instance details.
     * @param req DescribeDBInstanceDetailRequest
     * @return DescribeDBInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDetailResponse DescribeDBInstanceDetail(DescribeDBInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceDetail", DescribeDBInstanceDetailResponse.class);
    }

    /**
     *This API is used to query instance list.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *This API is used to obtain the current parameter settings of the instance.
     * @param req DescribeDBParametersRequest
     * @return DescribeDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParametersResponse DescribeDBParameters(DescribeDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParameters", DescribeDBParametersResponse.class);
    }

    /**
     *This API is used to query instance archived WAL log list.
     * @param req DescribeDBSArchiveLogsRequest
     * @return DescribeDBSArchiveLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSArchiveLogsResponse DescribeDBSArchiveLogs(DescribeDBSArchiveLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSArchiveLogs", DescribeDBSArchiveLogsResponse.class);
    }

    /**
     *This API is used to obtain the recoverable time.
     * @param req DescribeDBSAvailableRecoveryTimeRequest
     * @return DescribeDBSAvailableRecoveryTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSAvailableRecoveryTimeResponse DescribeDBSAvailableRecoveryTime(DescribeDBSAvailableRecoveryTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSAvailableRecoveryTime", DescribeDBSAvailableRecoveryTimeResponse.class);
    }

    /**
     *Query an instance backup strategy
     * @param req DescribeDBSBackupPolicyRequest
     * @return DescribeDBSBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupPolicyResponse DescribeDBSBackupPolicy(DescribeDBSBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupPolicy", DescribeDBSBackupPolicyResponse.class);
    }

    /**
     *This API is used to query instance backup set information.
     * @param req DescribeDBSBackupSetsRequest
     * @return DescribeDBSBackupSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupSetsResponse DescribeDBSBackupSets(DescribeDBSBackupSetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupSets", DescribeDBSBackupSetsResponse.class);
    }

    /**
     *This API is used to query instance backup space overview.
     * @param req DescribeDBSBackupStatisticsRequest
     * @return DescribeDBSBackupStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupStatisticsResponse DescribeDBSBackupStatistics(DescribeDBSBackupStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupStatistics", DescribeDBSBackupStatisticsResponse.class);
    }

    /**
     *This API is used to query backup set statistical detail.
     * @param req DescribeDBSBackupStatisticsDetailRequest
     * @return DescribeDBSBackupStatisticsDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSBackupStatisticsDetailResponse DescribeDBSBackupStatisticsDetail(DescribeDBSBackupStatisticsDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSBackupStatisticsDetail", DescribeDBSBackupStatisticsDetailResponse.class);
    }

    /**
     *Query clone list
     * @param req DescribeDBSCloneInstancesRequest
     * @return DescribeDBSCloneInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSCloneInstancesResponse DescribeDBSCloneInstances(DescribeDBSCloneInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSCloneInstances", DescribeDBSCloneInstancesResponse.class);
    }

    /**
     *This API is used to query instance security group information.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the object list in the database of a cloud database instance, including table, stored procedure, view and function.
     * @param req DescribeDatabaseObjectsRequest
     * @return DescribeDatabaseObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseObjectsResponse DescribeDatabaseObjects(DescribeDatabaseObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseObjects", DescribeDatabaseObjectsResponse.class);
    }

    /**
     *This API is used to query the database list of a cloud database instance.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *This API is used to query the process status of an asynchronous task.
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *This API is used to query available regions.
     * @param req DescribeSaleInfoRequest
     * @return DescribeSaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSaleInfoResponse DescribeSaleInfo(DescribeSaleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSaleInfo", DescribeSaleInfoResponse.class);
    }

    /**
     *This API is used to list available component specifications.
     * @param req DescribeSpecsRequest
     * @return DescribeSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecsResponse DescribeSpecs(DescribeSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecs", DescribeSpecsResponse.class);
    }

    /**
     *This API is used to query user permissions.
     * @param req DescribeUserPrivilegesRequest
     * @return DescribeUserPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserPrivilegesResponse DescribeUserPrivileges(DescribeUserPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserPrivileges", DescribeUserPrivilegesResponse.class);
    }

    /**
     *This API is used to query user list.
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsers", DescribeUsersResponse.class);
    }

    /**
     *This API is used to destroy instances in batch.
     * @param req DestroyInstancesRequest
     * @return DestroyInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstancesResponse DestroyInstances(DestroyInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstances", DestroyInstancesResponse.class);
    }

    /**
     *This API is used to horizontally scale out instances.
     * @param req ExpandInstanceRequest
     * @return ExpandInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ExpandInstanceResponse ExpandInstance(ExpandInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExpandInstance", ExpandInstanceResponse.class);
    }

    /**
     *This API is used to batch isolate instances.
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *This API is used to modify the auto-renewal flag.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to modify cloud database security groups.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify instance parameters.
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *This API is used to modify the instance backup strategy.
     * @param req ModifyDBSBackupPolicyRequest
     * @return ModifyDBSBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSBackupPolicyResponse ModifyDBSBackupPolicy(ModifyDBSBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSBackupPolicy", ModifyDBSBackupPolicyResponse.class);
    }

    /**
     *This API is used to modify backup notes of an instance.
     * @param req ModifyDBSBackupSetCommentRequest
     * @return ModifyDBSBackupSetCommentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSBackupSetCommentResponse ModifyDBSBackupSetComment(ModifyDBSBackupSetCommentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSBackupSetComment", ModifyDBSBackupSetCommentResponse.class);
    }

    /**
     *This API is used to modify instance name.
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *This API is used to modify user permissions.
     * @param req ModifyUserPrivilegesRequest
     * @return ModifyUserPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserPrivilegesResponse ModifyUserPrivileges(ModifyUserPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPrivileges", ModifyUserPrivilegesResponse.class);
    }

    /**
     *This API is used to restart database instances.
     * @param req RestartDBInstancesRequest
     * @return RestartDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstancesResponse RestartDBInstances(RestartDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstances", RestartDBInstancesResponse.class);
    }

    /**
     *This API is used to scale up a TDSQL Boundless instance, which can be a primary instance or a disaster recovery instance.
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

}
