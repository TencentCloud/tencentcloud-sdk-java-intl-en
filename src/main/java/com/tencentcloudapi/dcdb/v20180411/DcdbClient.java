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
package com.tencentcloudapi.dcdb.v20180411;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dcdb.v20180411.models.*;

public class DcdbClient extends AbstractClient{
    private static String endpoint = "dcdb.tencentcloudapi.com";
    private static String service = "dcdb";
    private static String version = "2018-04-11";
    
    public DcdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DcdbClient(Credential credential, String region, ClientProfile profile) {
        super(DcdbClient.endpoint, DcdbClient.version, credential, region, profile);
    }

    /**
     *This API is used to remove a pay-as-you-go TDSQL instance from isolation.
     * @param req ActiveHourDCDBInstanceRequest
     * @return ActiveHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ActiveHourDCDBInstanceResponse ActiveHourDCDBInstance(ActiveHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActiveHourDCDBInstance", ActiveHourDCDBInstanceResponse.class);
    }

    /**
     *This API is used to associate security groups with Tencent Cloud resources in batches.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to cancel DCN synchronization.
     * @param req CancelDcnJobRequest
     * @return CancelDcnJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelDcnJobResponse CancelDcnJob(CancelDcnJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelDcnJob", CancelDcnJobResponse.class);
    }

    /**
     *This API is used to clone an instance account.
     * @param req CloneAccountRequest
     * @return CloneAccountResponse
     * @throws TencentCloudSDKException
     */
    public CloneAccountResponse CloneAccount(CloneAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneAccount", CloneAccountResponse.class);
    }

    /**
     *This API is used to disable public network access for a TencentDB instance, which will make the public IP address inaccessible. The `DescribeDCDBInstances` API will not return the public domain name and port information of the corresponding instance.
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseDBExtranetAccess", CloseDBExtranetAccessResponse.class);
    }

    /**
     *This API is used to copy the permissions of a TencentDB account.
Note: Accounts with the same username but different hosts are different accounts. Permissions can only be copied between accounts with the same `Readonly` attribute.
     * @param req CopyAccountPrivilegesRequest
     * @return CopyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public CopyAccountPrivilegesResponse CopyAccountPrivileges(CopyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyAccountPrivileges", CopyAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to create a TencentDB account. Multiple accounts can be created for one instance. Accounts with the same username but different hosts are different accounts.
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccount", CreateAccountResponse.class);
    }

    /**
     *This API is used to create a monthly subscribed TDSQL instance by passing in information such as instance specifications, database version number, and purchased duration.
     * @param req CreateDCDBInstanceRequest
     * @return CreateDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDCDBInstanceResponse CreateDCDBInstance(CreateDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDCDBInstance", CreateDCDBInstanceResponse.class);
    }

    /**
     *This API is used to create a dedicated TDSQL cluster instance.
     * @param req CreateDedicatedClusterDCDBInstanceRequest
     * @return CreateDedicatedClusterDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterDCDBInstanceResponse CreateDedicatedClusterDCDBInstance(CreateDedicatedClusterDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDedicatedClusterDCDBInstance", CreateDedicatedClusterDCDBInstanceResponse.class);
    }

    /**
     *This API is used to create a pay-as-you-go TDSQL instance.
     * @param req CreateHourDCDBInstanceRequest
     * @return CreateHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateHourDCDBInstanceResponse CreateHourDCDBInstance(CreateHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHourDCDBInstance", CreateHourDCDBInstanceResponse.class);
    }

    /**
     *This API is used to delete a TencentDB account, which is uniquely identified by username and host.
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccount", DeleteAccountResponse.class);
    }

    /**
     *This API is used to query the permissions of a TencentDB account.
Note: Accounts with the same username but different hosts are considered as different accounts.
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivileges", DescribeAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to query the list of accounts of a specified TencentDB instance.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *This API is used to query the list of backup files.
     * @param req DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupFilesResponse DescribeBackupFiles(DescribeBackupFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupFiles", DescribeBackupFilesResponse.class);
    }

    /**
     *This API is used to query the encryption status of the instance data.
     * @param req DescribeDBEncryptAttributesRequest
     * @return DescribeDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBEncryptAttributesResponse DescribeDBEncryptAttributes(DescribeDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBEncryptAttributes", DescribeDBEncryptAttributesResponse.class);
    }

    /**
     *This API is used to get the list of various logs of a database, including cold backups, binlogs, errlogs, and slowlogs.
     * @param req DescribeDBLogFilesRequest
     * @return DescribeDBLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBLogFilesResponse DescribeDBLogFiles(DescribeDBLogFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBLogFiles", DescribeDBLogFilesResponse.class);
    }

    /**
     *This API is used to get the current parameter settings of a database.
     * @param req DescribeDBParametersRequest
     * @return DescribeDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParametersResponse DescribeDBParameters(DescribeDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParameters", DescribeDBParametersResponse.class);
    }

    /**
     *This API is used to query the security group information of an instance.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the list of slow query logs.
     * @param req DescribeDBSlowLogsRequest
     * @return DescribeDBSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowLogsResponse DescribeDBSlowLogs(DescribeDBSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSlowLogs", DescribeDBSlowLogsResponse.class);
    }

    /**
     *This API is used to query the sync mode of a TencentDB instance.
     * @param req DescribeDBSyncModeRequest
     * @return DescribeDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSyncModeResponse DescribeDBSyncMode(DescribeDBSyncModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSyncMode", DescribeDBSyncModeResponse.class);
    }

    /**
     *This API is used to obtain a temp rollback instance.
     * @param req DescribeDBTmpInstancesRequest
     * @return DescribeDBTmpInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBTmpInstancesResponse DescribeDBTmpInstances(DescribeDBTmpInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBTmpInstances", DescribeDBTmpInstancesResponse.class);
    }

    /**
     *This API is used to get the details of a TDSQL instance.
     * @param req DescribeDCDBInstanceDetailRequest
     * @return DescribeDCDBInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBInstanceDetailResponse DescribeDCDBInstanceDetail(DescribeDCDBInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDCDBInstanceDetail", DescribeDCDBInstanceDetailResponse.class);
    }

    /**
     *This API is used to query the information of instance nodes.
     * @param req DescribeDCDBInstanceNodeInfoRequest
     * @return DescribeDCDBInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBInstanceNodeInfoResponse DescribeDCDBInstanceNodeInfo(DescribeDCDBInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDCDBInstanceNodeInfo", DescribeDCDBInstanceNodeInfoResponse.class);
    }

    /**
     *This API is used to query the list of TencentDB instances. It supports filtering instances by project ID, instance ID, private network address, and instance name.
If no filter is specified, 10 instances will be returned by default. Up to 100 instances can be returned for a single request.
     * @param req DescribeDCDBInstancesRequest
     * @return DescribeDCDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBInstancesResponse DescribeDCDBInstances(DescribeDCDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDCDBInstances", DescribeDCDBInstancesResponse.class);
    }

    /**
     *This API is used to query the price of an instance before you purchase it.
     * @param req DescribeDCDBPriceRequest
     * @return DescribeDCDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBPriceResponse DescribeDCDBPrice(DescribeDCDBPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDCDBPrice", DescribeDCDBPriceResponse.class);
    }

    /**
     *This API is used to query the information of shards of a TencentDB instance.
     * @param req DescribeDCDBShardsRequest
     * @return DescribeDCDBShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBShardsResponse DescribeDCDBShards(DescribeDCDBShardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDCDBShards", DescribeDCDBShardsResponse.class);
    }

    /**
     *This API is used to query the list of database objects in a TencentDB instance, including tables, stored procedures, views, and functions.
     * @param req DescribeDatabaseObjectsRequest
     * @return DescribeDatabaseObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseObjectsResponse DescribeDatabaseObjects(DescribeDatabaseObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseObjects", DescribeDatabaseObjectsResponse.class);
    }

    /**
     *This API is used to query the table information of a TencentDB instance.
     * @param req DescribeDatabaseTableRequest
     * @return DescribeDatabaseTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseTableResponse DescribeDatabaseTable(DescribeDatabaseTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseTable", DescribeDatabaseTableResponse.class);
    }

    /**
     *This API is used to query the database list of a TencentDB instance.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *This API is used to query the disaster recovery details of an instance.
     * @param req DescribeDcnDetailRequest
     * @return DescribeDcnDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDcnDetailResponse DescribeDcnDetail(DescribeDcnDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDcnDetail", DescribeDcnDetailResponse.class);
    }

    /**
     *This API is used to get the download URL of a specific backup or log file of a database.
     * @param req DescribeFileDownloadUrlRequest
     * @return DescribeFileDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileDownloadUrlResponse DescribeFileDownloadUrl(DescribeFileDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileDownloadUrl", DescribeFileDownloadUrlResponse.class);
    }

    /**
     *This API is used to query task status.
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *This API is used to view the backup log retention days.
     * @param req DescribeLogFileRetentionPeriodRequest
     * @return DescribeLogFileRetentionPeriodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogFileRetentionPeriodResponse DescribeLogFileRetentionPeriod(DescribeLogFileRetentionPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogFileRetentionPeriod", DescribeLogFileRetentionPeriodResponse.class);
    }

    /**
     *This API is used to query TDSQL order information. You can pass in an order ID to query the TDSQL instance associated with the order and the corresponding task process ID.
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrders", DescribeOrdersResponse.class);
    }

    /**
     *This API is used to query the security group details of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *This API is used to terminate an isolated monthly subscribed TDSQL instance.
     * @param req DestroyDCDBInstanceRequest
     * @return DestroyDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDCDBInstanceResponse DestroyDCDBInstance(DestroyDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyDCDBInstance", DestroyDCDBInstanceResponse.class);
    }

    /**
     *This API is used to terminate a pay-as-you-go TDSQL instance.
     * @param req DestroyHourDCDBInstanceRequest
     * @return DestroyHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyHourDCDBInstanceResponse DestroyHourDCDBInstance(DestroyHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyHourDCDBInstance", DestroyHourDCDBInstanceResponse.class);
    }

    /**
     *This API is used to unassociate security groups from instances in batches.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to grant permissions to a TencentDB account.
Note: accounts with the same username but different hosts are different accounts.
     * @param req GrantAccountPrivilegesRequest
     * @return GrantAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public GrantAccountPrivilegesResponse GrantAccountPrivileges(GrantAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantAccountPrivileges", GrantAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to initialize instances, including setting the default character set and table name case sensitivity.
     * @param req InitDCDBInstancesRequest
     * @return InitDCDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDCDBInstancesResponse InitDCDBInstances(InitDCDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InitDCDBInstances", InitDCDBInstancesResponse.class);
    }

    /**
     *This API is used to isolate a monthly subscribed TDSQL instance, which will no longer be accessible via IP and port.  The isolated instance can be started up in the recycle bin.  If it is isolated due to overdue payments, top up your account as soon as possible.
     * @param req IsolateDCDBInstanceRequest
     * @return IsolateDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDCDBInstanceResponse IsolateDCDBInstance(IsolateDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDCDBInstance", IsolateDCDBInstanceResponse.class);
    }

    /**
     *This API is used to isolate a dedicated TencentDB instance.
     * @param req IsolateDedicatedDBInstanceRequest
     * @return IsolateDedicatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDedicatedDBInstanceResponse IsolateDedicatedDBInstance(IsolateDedicatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDedicatedDBInstance", IsolateDedicatedDBInstanceResponse.class);
    }

    /**
     *This API is used to isolate a pay-as-you-go TDSQL instance.
     * @param req IsolateHourDCDBInstanceRequest
     * @return IsolateHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateHourDCDBInstanceResponse IsolateHourDCDBInstance(IsolateHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateHourDCDBInstance", IsolateHourDCDBInstanceResponse.class);
    }

    /**
     *This API is used to kill the specified session.
     * @param req KillSessionRequest
     * @return KillSessionResponse
     * @throws TencentCloudSDKException
     */
    public KillSessionResponse KillSession(KillSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillSession", KillSessionResponse.class);
    }

    /**
     *This API is used to modify the configurations of an account, such as `max_user_connections`.
     * @param req ModifyAccountConfigRequest
     * @return ModifyAccountConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountConfigResponse ModifyAccountConfig(ModifyAccountConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountConfig", ModifyAccountConfigResponse.class);
    }

    /**
     *This API is used to modify the remarks of a TencentDB account.
Note: accounts with the same username but different hosts are different accounts.
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *This API is used to modify the permissions of a TencentDB instance account. \n\n**Note**\n-Only the SELECT permission (that is, set the permission parameter to `["SELECT"]`) of the system database `mysql` can be granted. An error will be reported if read-write permissions are granted to a read-only account. If the parameter is not passed in, no change will be made to the granted table permissions. To clear the granted view permissions, set `Privileges` to an empty array.
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivileges", ModifyAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to modify the instance data encryption.
     * @param req ModifyDBEncryptAttributesRequest
     * @return ModifyDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBEncryptAttributesResponse ModifyDBEncryptAttributes(ModifyDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBEncryptAttributes", ModifyDBEncryptAttributesResponse.class);
    }

    /**
     *This API is used to modify instance name.
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
    }

    /**
     *This API is used to modify the security groups associated with TencentDB.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify the project to which TencentDB instances belong.
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstancesProject", ModifyDBInstancesProjectResponse.class);
    }

    /**
     *This API is used to modify database parameters.
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *This API is used to modify the sync mode of a TencentDB instance.
     * @param req ModifyDBSyncModeRequest
     * @return ModifyDBSyncModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSyncModeResponse ModifyDBSyncMode(ModifyDBSyncModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSyncMode", ModifyDBSyncModeResponse.class);
    }

    /**
     *This API is used to modify instance network.
     * @param req ModifyInstanceNetworkRequest
     * @return ModifyInstanceNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNetworkResponse ModifyInstanceNetwork(ModifyInstanceNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceNetwork", ModifyInstanceNetworkResponse.class);
    }

    /**
     *This API is used to modify instance VIP.
     * @param req ModifyInstanceVipRequest
     * @return ModifyInstanceVipResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceVipResponse ModifyInstanceVip(ModifyInstanceVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceVip", ModifyInstanceVipResponse.class);
    }

    /**
     *This API is used to modify instance Vport.
     * @param req ModifyInstanceVportRequest
     * @return ModifyInstanceVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceVportResponse ModifyInstanceVport(ModifyInstanceVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceVport", ModifyInstanceVportResponse.class);
    }

    /**
     *This API is used to reset the password of a TencentDB account.
Note: accounts with the same username but different hosts are different accounts.
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *This API is used to start a source-replica switch of instances.
     * @param req SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstanceHAResponse SwitchDBInstanceHA(SwitchDBInstanceHARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDBInstanceHA", SwitchDBInstanceHAResponse.class);
    }

    /**
     *This API is used to terminate the isolated dedicated TDSQL instance.
     * @param req TerminateDedicatedDBInstanceRequest
     * @return TerminateDedicatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDedicatedDBInstanceResponse TerminateDedicatedDBInstance(TerminateDedicatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDedicatedDBInstance", TerminateDedicatedDBInstanceResponse.class);
    }

    /**
     *This API is used to upgrade a dedicated TDSQL cluster instance.
     * @param req UpgradeDedicatedDCDBInstanceRequest
     * @return UpgradeDedicatedDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDedicatedDCDBInstanceResponse UpgradeDedicatedDCDBInstance(UpgradeDedicatedDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDedicatedDCDBInstance", UpgradeDedicatedDCDBInstanceResponse.class);
    }

    /**
     *This API is used to upgrade a pay-as-you-go TDSQL instance.
     * @param req UpgradeHourDCDBInstanceRequest
     * @return UpgradeHourDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeHourDCDBInstanceResponse UpgradeHourDCDBInstance(UpgradeHourDCDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeHourDCDBInstance", UpgradeHourDCDBInstanceResponse.class);
    }

}
