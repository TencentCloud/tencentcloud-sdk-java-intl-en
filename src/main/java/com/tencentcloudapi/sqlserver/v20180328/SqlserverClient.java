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
package com.tencentcloudapi.sqlserver.v20180328;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sqlserver.v20180328.models.*;

public class SqlserverClient extends AbstractClient{
    private static String endpoint = "sqlserver.intl.tencentcloudapi.com";
    private static String service = "sqlserver";
    private static String version = "2018-03-28";

    public SqlserverClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SqlserverClient(Credential credential, String region, ClientProfile profile) {
        super(SqlserverClient.endpoint, SqlserverClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind security groups to instances in batches.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to balance the routing weight of each read-only instance according to the predefined weights. The DescribeReadOnlyGroupAutoWeight API is used to query the predefined weights.
     * @param req BalanceReadOnlyGroupRequest
     * @return BalanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public BalanceReadOnlyGroupResponse BalanceReadOnlyGroup(BalanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BalanceReadOnlyGroup", BalanceReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to clone and rename databases of an instance. The clones are still in the instance from which they are cloned.
     * @param req CloneDBRequest
     * @return CloneDBResponse
     * @throws TencentCloudSDKException
     */
    public CloneDBResponse CloneDB(CloneDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneDB", CloneDBResponse.class);
    }

    /**
     *This API is used to disable instance interconnection.
     * @param req CloseInterCommunicationRequest
     * @return CloseInterCommunicationResponse
     * @throws TencentCloudSDKException
     */
    public CloseInterCommunicationResponse CloseInterCommunication(CloseInterCommunicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseInterCommunication", CloseInterCommunicationResponse.class);
    }

    /**
     *This API is used to complete the instance upgrade and switch immediately without waiting for the maintenance window when the instance status is "upgrade pending switch" after scale-out is initiated. This API needs to be called during off-peak hours of the instance. Some databases cannot be accessed before the switch is completed.
     * @param req CompleteExpansionRequest
     * @return CompleteExpansionResponse
     * @throws TencentCloudSDKException
     */
    public CompleteExpansionResponse CompleteExpansion(CompleteExpansionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteExpansion", CompleteExpansionResponse.class);
    }

    /**
     *This API is used to complete a migration task.
     * @param req CompleteMigrationRequest
     * @return CompleteMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrationResponse CompleteMigration(CompleteMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteMigration", CompleteMigrationResponse.class);
    }

    /**
     *This API is used to create an instance account.
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccount", CreateAccountResponse.class);
    }

    /**
     *This API is used to create a backup.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *This API is used to create a backup import task.
     * @param req CreateBackupMigrationRequest
     * @return CreateBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupMigrationResponse CreateBackupMigration(CreateBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupMigration", CreateBackupMigrationResponse.class);
    }

    /**
     *This API is used to create basic edition instances (cloud disk).
     * @param req CreateBasicDBInstancesRequest
     * @return CreateBasicDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateBasicDBInstancesResponse CreateBasicDBInstances(CreateBasicDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBasicDBInstances", CreateBasicDBInstancesResponse.class);
    }

    /**
     *This API is used to create business intelligence service instances (cloud disk).
     * @param req CreateBusinessDBInstancesRequest
     * @return CreateBusinessDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateBusinessDBInstancesResponse CreateBusinessDBInstances(CreateBusinessDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBusinessDBInstances", CreateBusinessDBInstancesResponse.class);
    }

    /**
     *This API is used to add a business intelligence service file.
     * @param req CreateBusinessIntelligenceFileRequest
     * @return CreateBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateBusinessIntelligenceFileResponse CreateBusinessIntelligenceFile(CreateBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBusinessIntelligenceFile", CreateBusinessIntelligenceFileResponse.class);
    }

    /**
     *This API is used to create high-availability instances (cloud disk).
     * @param req CreateCloudDBInstancesRequest
     * @return CreateCloudDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudDBInstancesResponse CreateCloudDBInstances(CreateCloudDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudDBInstances", CreateCloudDBInstancesResponse.class);
    }

    /**
     *This API is used to create read-only instances (cloud disk).
     * @param req CreateCloudReadOnlyDBInstancesRequest
     * @return CreateCloudReadOnlyDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudReadOnlyDBInstancesResponse CreateCloudReadOnlyDBInstances(CreateCloudReadOnlyDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudReadOnlyDBInstances", CreateCloudReadOnlyDBInstancesResponse.class);
    }

    /**
     *This API is used to create a database.
     * @param req CreateDBRequest
     * @return CreateDBResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBResponse CreateDB(CreateDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDB", CreateDBResponse.class);
    }

    /**
     *This API is used to create high-availability instances (local disk).
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstances", CreateDBInstancesResponse.class);
    }

    /**
     *This API is used to create an incremental backup import task.
     * @param req CreateIncrementalMigrationRequest
     * @return CreateIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncrementalMigrationResponse CreateIncrementalMigration(CreateIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIncrementalMigration", CreateIncrementalMigrationResponse.class);
    }

    /**
     *This API is used to create a migration task.
     * @param req CreateMigrationRequest
     * @return CreateMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationResponse CreateMigration(CreateMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigration", CreateMigrationResponse.class);
    }

    /**
     *This API is used to create a publish/subscribe relationship between two databases. A subscriber cannot act as a publisher, and a publisher can have multiple subscriber instances.
     * @param req CreatePublishSubscribeRequest
     * @return CreatePublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublishSubscribeResponse CreatePublishSubscribe(CreatePublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublishSubscribe", CreatePublishSubscribeResponse.class);
    }

    /**
     *This API is used to create read-only instances (local disk).
     * @param req CreateReadOnlyDBInstancesRequest
     * @return CreateReadOnlyDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyDBInstancesResponse CreateReadOnlyDBInstances(CreateReadOnlyDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReadOnlyDBInstances", CreateReadOnlyDBInstancesResponse.class);
    }

    /**
     *This API is used to manually cut block logs and deadlock logs.
     * @param req CutXEventsRequest
     * @return CutXEventsResponse
     * @throws TencentCloudSDKException
     */
    public CutXEventsResponse CutXEvents(CutXEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CutXEvents", CutXEventsResponse.class);
    }

    /**
     *This API is used to delete an instance account.
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccount", DeleteAccountResponse.class);
    }

    /**
     *This API is used to delete a backup import task.
     * @param req DeleteBackupMigrationRequest
     * @return DeleteBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupMigrationResponse DeleteBackupMigration(DeleteBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupMigration", DeleteBackupMigrationResponse.class);
    }

    /**
     *This API is used to delete a business intelligence service file.
     * @param req DeleteBusinessIntelligenceFileRequest
     * @return DeleteBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBusinessIntelligenceFileResponse DeleteBusinessIntelligenceFile(DeleteBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBusinessIntelligenceFile", DeleteBusinessIntelligenceFileResponse.class);
    }

    /**
     *This API is used to drop a database.
     * @param req DeleteDBRequest
     * @return DeleteDBResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBResponse DeleteDB(DeleteDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDB", DeleteDBResponse.class);
    }

    /**
     *This API is used to release SQL server instances (eliminated immediately) in the recycle bin. The released instances will be physically terminated after being retained for a period of time. Their publish-subscribe relationships will be automatically disassociated, and their RO replicas will be automatically released.
     * @param req DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBInstanceResponse DeleteDBInstance(DeleteDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBInstance", DeleteDBInstanceResponse.class);
    }

    /**
     *This API is used to delete an incremental backup import task.
     * @param req DeleteIncrementalMigrationRequest
     * @return DeleteIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIncrementalMigrationResponse DeleteIncrementalMigration(DeleteIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIncrementalMigration", DeleteIncrementalMigrationResponse.class);
    }

    /**
     *This API is used to delete a migration task.
     * @param req DeleteMigrationRequest
     * @return DeleteMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrationResponse DeleteMigration(DeleteMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMigration", DeleteMigrationResponse.class);
    }

    /**
     *This API is used to delete the publish/subscribe relationship between two databases.
     * @param req DeletePublishSubscribeRequest
     * @return DeletePublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeletePublishSubscribeResponse DeletePublishSubscribe(DeletePublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePublishSubscribe", DeletePublishSubscribeResponse.class);
    }

    /**
     *This API is used to query information on the account and permissions associated with the database.
     * @param req DescribeAccountPrivilegeByDBRequest
     * @return DescribeAccountPrivilegeByDBResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegeByDBResponse DescribeAccountPrivilegeByDB(DescribeAccountPrivilegeByDBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivilegeByDB", DescribeAccountPrivilegeByDBResponse.class);
    }

    /**
     *This API is used to pull the list of instance accounts.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *This API is used to query the created backup details through the backup creation process ID. The process ID can be obtained through the CreateBackup API.
     * @param req DescribeBackupByFlowIdRequest
     * @return DescribeBackupByFlowIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupByFlowIdResponse DescribeBackupByFlowId(DescribeBackupByFlowIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupByFlowId", DescribeBackupByFlowIdResponse.class);
    }

    /**
     *This API is used to query the commands of creating backups canonically.
     * @param req DescribeBackupCommandRequest
     * @return DescribeBackupCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupCommandResponse DescribeBackupCommand(DescribeBackupCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupCommand", DescribeBackupCommandResponse.class);
    }

    /**
     *This API is used to query the details of an unarchived backup.
     * @param req DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupFilesResponse DescribeBackupFiles(DescribeBackupFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupFiles", DescribeBackupFilesResponse.class);
    }

    /**
     *This API is used to create an incremental backup import task.
     * @param req DescribeBackupMigrationRequest
     * @return DescribeBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupMigrationResponse DescribeBackupMigration(DescribeBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupMigration", DescribeBackupMigrationResponse.class);
    }

    /**
     *This API is used to query backup space usage details.
     * @param req DescribeBackupMonitorRequest
     * @return DescribeBackupMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupMonitorResponse DescribeBackupMonitor(DescribeBackupMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupMonitor", DescribeBackupMonitorResponse.class);
    }

    /**
     *This API is used to query the real-time statistics list of backups.
     * @param req DescribeBackupStatisticalRequest
     * @return DescribeBackupStatisticalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupStatisticalResponse DescribeBackupStatistical(DescribeBackupStatisticalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupStatistical", DescribeBackupStatisticalResponse.class);
    }

    /**
     *This API is used to query the backup overview information of databases.
     * @param req DescribeBackupSummaryRequest
     * @return DescribeBackupSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummaryResponse DescribeBackupSummary(DescribeBackupSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupSummary", DescribeBackupSummaryResponse.class);
    }

    /**
     *This API is used to query the size of uploaded backup files. It is valid if the backup file type is `COS_UPLOAD` (the file is stored in COS).
     * @param req DescribeBackupUploadSizeRequest
     * @return DescribeBackupUploadSizeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupUploadSizeResponse DescribeBackupUploadSize(DescribeBackupUploadSizeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupUploadSize", DescribeBackupUploadSizeResponse.class);
    }

    /**
     *This API is used to query the list of backups.
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackups", DescribeBackupsResponse.class);
    }

    /**
     *This API is used to query the files required by business intelligence service.
     * @param req DescribeBusinessIntelligenceFileRequest
     * @return DescribeBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBusinessIntelligenceFileResponse DescribeBusinessIntelligenceFile(DescribeBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBusinessIntelligenceFile", DescribeBusinessIntelligenceFileResponse.class);
    }

    /**
     *This API is used to query the character set and time zone supported by the instance.
     * @param req DescribeCollationTimeZoneRequest
     * @return DescribeCollationTimeZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCollationTimeZoneResponse DescribeCollationTimeZone(DescribeCollationTimeZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCollationTimeZone", DescribeCollationTimeZoneResponse.class);
    }

    /**
     *This API is used to query the real-time statistics list of cross-region backups.
     * @param req DescribeCrossBackupStatisticalRequest
     * @return DescribeCrossBackupStatisticalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBackupStatisticalResponse DescribeCrossBackupStatistical(DescribeCrossBackupStatisticalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBackupStatistical", DescribeCrossBackupStatisticalResponse.class);
    }

    /**
     *This API is used to query the disaster recovery region and AZ of the secondary node based on the primary instance.
     * @param req DescribeCrossRegionZoneRequest
     * @return DescribeCrossRegionZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossRegionZoneResponse DescribeCrossRegionZone(DescribeCrossRegionZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossRegionZone", DescribeCrossRegionZoneResponse.class);
    }

    /**
     *This API is used to query the target region for cross-region backups.
     * @param req DescribeCrossRegionsRequest
     * @return DescribeCrossRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossRegionsResponse DescribeCrossRegions(DescribeCrossRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossRegions", DescribeCrossRegionsResponse.class);
    }

    /**
     *This API is used to query the database character sets supported by an instance.
     * @param req DescribeDBCharsetsRequest
     * @return DescribeDBCharsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCharsetsResponse DescribeDBCharsets(DescribeDBCharsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCharsets", DescribeDBCharsetsResponse.class);
    }

    /**
     *This API is used to query the information of the interconnected instances.
     * @param req DescribeDBInstanceInterRequest
     * @return DescribeDBInstanceInterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInterResponse DescribeDBInstanceInter(DescribeDBInstanceInterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceInter", DescribeDBInstanceInterResponse.class);
    }

    /**
     *This API is used to query the list of instances.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *This API is used to query the attributes of an instance.
     * @param req DescribeDBInstancesAttributeRequest
     * @return DescribeDBInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesAttributeResponse DescribeDBInstancesAttribute(DescribeDBInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstancesAttribute", DescribeDBInstancesAttributeResponse.class);
    }

    /**
     *This API is used to query information on the databases and permissions associated with the account.
     * @param req DescribeDBPrivilegeByAccountRequest
     * @return DescribeDBPrivilegeByAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPrivilegeByAccountResponse DescribeDBPrivilegeByAccount(DescribeDBPrivilegeByAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBPrivilegeByAccount", DescribeDBPrivilegeByAccountResponse.class);
    }

    /**
     *This API is used to query databases that can be rolled back.
     * @param req DescribeDBRestoreTimeRequest
     * @return DescribeDBRestoreTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBRestoreTimeResponse DescribeDBRestoreTime(DescribeDBRestoreTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBRestoreTime", DescribeDBRestoreTimeResponse.class);
    }

    /**
     *This API is used to query the security group details of instances.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the list of databases
     * @param req DescribeDBsRequest
     * @return DescribeDBsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBsResponse DescribeDBs(DescribeDBsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBs", DescribeDBsResponse.class);
    }

    /**
     *This API is used to query database configurations. It does not return information of the accounts that have permissions to operate the database.
     * @param req DescribeDBsNormalRequest
     * @return DescribeDBsNormalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBsNormalResponse DescribeDBsNormal(DescribeDBsNormalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBsNormal", DescribeDBsNormalResponse.class);
    }

    /**
     *This API is used to query the database name associated with the account.
     * @param req DescribeDatabaseNamesRequest
     * @return DescribeDatabaseNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseNamesResponse DescribeDatabaseNames(DescribeDatabaseNamesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseNames", DescribeDatabaseNamesResponse.class);
    }

    /**
     *This API is used to query the database list.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *This API is used to query database configuration information. This API does not contain accounts associated with databases.
     * @param req DescribeDatabasesNormalRequest
     * @return DescribeDatabasesNormalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesNormalResponse DescribeDatabasesNormal(DescribeDatabasesNormalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabasesNormal", DescribeDatabasesNormalResponse.class);
    }

    /**
     *This API is used to query flow status.
     * @param req DescribeFlowStatusRequest
     * @return DescribeFlowStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowStatusResponse DescribeFlowStatus(DescribeFlowStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowStatus", DescribeFlowStatusResponse.class);
    }

    /**
     *This API is used to perform the manual primary-secondary switch.
     * @param req DescribeHASwitchLogRequest
     * @return DescribeHASwitchLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHASwitchLogResponse DescribeHASwitchLog(DescribeHASwitchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHASwitchLog", DescribeHASwitchLogResponse.class);
    }

    /**
     *This API is used to query an incremental backup import task.
     * @param req DescribeIncrementalMigrationRequest
     * @return DescribeIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementalMigrationResponse DescribeIncrementalMigration(DescribeIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIncrementalMigration", DescribeIncrementalMigrationResponse.class);
    }

    /**
     *This API is used to query the instance ID by the order number.
     * @param req DescribeInstanceByOrdersRequest
     * @return DescribeInstanceByOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByOrdersResponse DescribeInstanceByOrders(DescribeInstanceByOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceByOrders", DescribeInstanceByOrdersResponse.class);
    }

    /**
     *This API is used to query the parameter modification records of an instance.
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParamRecords", DescribeInstanceParamRecordsResponse.class);
    }

    /**
     *This API is used to query the parameter list of an instance.
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *This API is used to query the list of asynchronous tasks related to an instance.
     * @param req DescribeInstanceTasksRequest
     * @return DescribeInstanceTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTasksResponse DescribeInstanceTasks(DescribeInstanceTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTasks", DescribeInstanceTasksResponse.class);
    }

    /**
     *This API is used to query the instance billing parameters.
     * @param req DescribeInstanceTradeParameterRequest
     * @return DescribeInstanceTradeParameterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTradeParameterResponse DescribeInstanceTradeParameter(DescribeInstanceTradeParameterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTradeParameter", DescribeInstanceTradeParameterResponse.class);
    }

    /**
     *This API is used to query the maintenance time window of an instance based on its instance ID.
     * @param req DescribeMaintenanceSpanRequest
     * @return DescribeMaintenanceSpanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceSpanResponse DescribeMaintenanceSpan(DescribeMaintenanceSpanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintenanceSpan", DescribeMaintenanceSpanResponse.class);
    }

    /**
     *This API is used to query the list of databases to be migrated.
     * @param req DescribeMigrationDatabasesRequest
     * @return DescribeMigrationDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDatabasesResponse DescribeMigrationDatabases(DescribeMigrationDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationDatabases", DescribeMigrationDatabasesResponse.class);
    }

    /**
     *This API is used to query migration task details.
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationDetail", DescribeMigrationDetailResponse.class);
    }

    /**
     *This API is used to query the list of eligible migration tasks based on the entered criteria.
     * @param req DescribeMigrationsRequest
     * @return DescribeMigrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationsResponse DescribeMigrations(DescribeMigrationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrations", DescribeMigrationsResponse.class);
    }

    /**
     *This API is used to query order information.
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrders", DescribeOrdersResponse.class);
    }

    /**
     *This API is used to query purchasable specification configuration.
     * @param req DescribeProductConfigRequest
     * @return DescribeProductConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductConfigResponse DescribeProductConfig(DescribeProductConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductConfig", DescribeProductConfigResponse.class);
    }

    /**
     *This API is used to query security group details of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the publish/subscribe relationship list.
     * @param req DescribePublishSubscribeRequest
     * @return DescribePublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublishSubscribeResponse DescribePublishSubscribe(DescribePublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublishSubscribe", DescribePublishSubscribeResponse.class);
    }

    /**
     *This API is used to query the automatic weight assignment result of the read-only group. The BalanceReadOnlyGroup API is used to perform routing weight assignment according to the automatic weight assignment result.
     * @param req DescribeReadOnlyGroupAutoWeightRequest
     * @return DescribeReadOnlyGroupAutoWeightResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupAutoWeightResponse DescribeReadOnlyGroupAutoWeight(DescribeReadOnlyGroupAutoWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupAutoWeight", DescribeReadOnlyGroupAutoWeightResponse.class);
    }

    /**
     *This API is used to query the read-only group where the read-only instance is located by its ID.
     * @param req DescribeReadOnlyGroupByReadOnlyInstanceRequest
     * @return DescribeReadOnlyGroupByReadOnlyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupByReadOnlyInstanceResponse DescribeReadOnlyGroupByReadOnlyInstance(DescribeReadOnlyGroupByReadOnlyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupByReadOnlyInstance", DescribeReadOnlyGroupByReadOnlyInstanceResponse.class);
    }

    /**
     *This API is used to query read-only group details.
     * @param req DescribeReadOnlyGroupDetailsRequest
     * @return DescribeReadOnlyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupDetailsResponse DescribeReadOnlyGroupDetails(DescribeReadOnlyGroupDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupDetails", DescribeReadOnlyGroupDetailsResponse.class);
    }

    /**
     *This API is used to query the read-only group list.
     * @param req DescribeReadOnlyGroupListRequest
     * @return DescribeReadOnlyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupListResponse DescribeReadOnlyGroupList(DescribeReadOnlyGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroupList", DescribeReadOnlyGroupListResponse.class);
    }

    /**
     *This API is used to query purchasable regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query the scheduled backup retention plans of instances.
     * @param req DescribeRegularBackupPlanRequest
     * @return DescribeRegularBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegularBackupPlanResponse DescribeRegularBackupPlan(DescribeRegularBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegularBackupPlan", DescribeRegularBackupPlanResponse.class);
    }

    /**
     *This API is used to query the list of rollback tasks.
     * @param req DescribeRestoreTaskRequest
     * @return DescribeRestoreTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTaskResponse DescribeRestoreTask(DescribeRestoreTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTask", DescribeRestoreTaskResponse.class);
    }

    /**
     *This API is used to query the time range available for rollback by time point.
     * @param req DescribeRestoreTimeRangeRequest
     * @return DescribeRestoreTimeRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTimeRangeResponse DescribeRestoreTimeRange(DescribeRestoreTimeRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTimeRange", DescribeRestoreTimeRangeResponse.class);
    }

    /**
     *This API is used to query the time range available for instance rollback.
     * @param req DescribeRollbackTimeRequest
     * @return DescribeRollbackTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeResponse DescribeRollbackTime(DescribeRollbackTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTime", DescribeRollbackTimeResponse.class);
    }

    /**
     *This API is used to get file information of slow query logs.
     * @param req DescribeSlowlogsRequest
     * @return DescribeSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowlogsResponse DescribeSlowlogs(DescribeSlowlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowlogs", DescribeSlowlogsResponse.class);
    }

    /**
     *This API is used to query the status information on specifications, including the sales status and reference price. (The actual price is subject to the result returned by price querying APIs.)
     * @param req DescribeSpecSellStatusRequest
     * @return DescribeSpecSellStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecSellStatusResponse DescribeSpecSellStatus(DescribeSpecSellStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecSellStatus", DescribeSpecSellStatusResponse.class);
    }

    /**
     *This API is used to pre-check the impact of the instance configuration adjustment before the adjustment.
     * @param req DescribeUpgradeInstanceCheckRequest
     * @return DescribeUpgradeInstanceCheckResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpgradeInstanceCheckResponse DescribeUpgradeInstanceCheck(DescribeUpgradeInstanceCheckRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpgradeInstanceCheck", DescribeUpgradeInstanceCheckResponse.class);
    }

    /**
     *This API is used to query a backup upload permission.
     * @param req DescribeUploadBackupInfoRequest
     * @return DescribeUploadBackupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadBackupInfoResponse DescribeUploadBackupInfo(DescribeUploadBackupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadBackupInfo", DescribeUploadBackupInfoResponse.class);
    }

    /**
     *This API is used to query the list of extended events.
     * @param req DescribeXEventsRequest
     * @return DescribeXEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeXEventsResponse DescribeXEvents(DescribeXEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeXEvents", DescribeXEventsResponse.class);
    }

    /**
     *This API is used to query currently purchasable AZs.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to unbind security groups from instances in batches.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the price of requested instances.
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateDBInstances", InquiryPriceCreateDBInstancesResponse.class);
    }

    /**
     *This API is used to query the upgrade prices of a monthly subscribed instance.
.
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpgradeDBInstance", InquiryPriceUpgradeDBInstanceResponse.class);
    }

    /**
     *This API is used to modify instance account permissions.
     * @param req ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegeResponse ModifyAccountPrivilege(ModifyAccountPrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivilege", ModifyAccountPrivilegeResponse.class);
    }

    /**
     *This API is used to modify account remarks.
     * @param req ModifyAccountRemarkRequest
     * @return ModifyAccountRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountRemarkResponse ModifyAccountRemark(ModifyAccountRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountRemark", ModifyAccountRemarkResponse.class);
    }

    /**
     *This API is used to modify a backup import task.
     * @param req ModifyBackupMigrationRequest
     * @return ModifyBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupMigrationResponse ModifyBackupMigration(ModifyBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupMigration", ModifyBackupMigrationResponse.class);
    }

    /**
     *This API is used to modify the name of a backup task.
     * @param req ModifyBackupNameRequest
     * @return ModifyBackupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupNameResponse ModifyBackupName(ModifyBackupNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupName", ModifyBackupNameResponse.class);
    }

    /**
     *This API is used to modify the backup policy.
     * @param req ModifyBackupStrategyRequest
     * @return ModifyBackupStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupStrategyResponse ModifyBackupStrategy(ModifyBackupStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupStrategy", ModifyBackupStrategyResponse.class);
    }

    /**
     *This API is used to disable the public network for the instance.
     * @param req ModifyCloseWanIpRequest
     * @return ModifyCloseWanIpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloseWanIpResponse ModifyCloseWanIp(ModifyCloseWanIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloseWanIp", ModifyCloseWanIpResponse.class);
    }

    /**
     *This API is used to enable or disable cross-region backup policies.
     * @param req ModifyCrossBackupStrategyRequest
     * @return ModifyCrossBackupStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCrossBackupStrategyResponse ModifyCrossBackupStrategy(ModifyCrossBackupStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCrossBackupStrategy", ModifyCrossBackupStrategyResponse.class);
    }

    /**
     *This API is used to enable or disable TDE of a database.
     * @param req ModifyDBEncryptAttributesRequest
     * @return ModifyDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBEncryptAttributesResponse ModifyDBEncryptAttributes(ModifyDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBEncryptAttributes", ModifyDBEncryptAttributesResponse.class);
    }

    /**
     *This API is used to rename an instance.
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
    }

    /**
     *This API is used to switch a running instance from a VPC to another.
     * @param req ModifyDBInstanceNetworkRequest
     * @return ModifyDBInstanceNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNetworkResponse ModifyDBInstanceNetwork(ModifyDBInstanceNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceNetwork", ModifyDBInstanceNetworkResponse.class);
    }

    /**
     *This API is used to modify the instance remarks.
     * @param req ModifyDBInstanceNoteRequest
     * @return ModifyDBInstanceNoteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNoteResponse ModifyDBInstanceNote(ModifyDBInstanceNoteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceNote", ModifyDBInstanceNoteResponse.class);
    }

    /**
     *This API is used to modify the project to which a database instance belongs.
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceProject", ModifyDBInstanceProjectResponse.class);
    }

    /**
     *This API is used to enable/disable/update SSL encryption.
     * @param req ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSSLResponse ModifyDBInstanceSSL(ModifyDBInstanceSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSSL", ModifyDBInstanceSSLResponse.class);
    }

    /**
     *This API is used to modify security groups bound to an instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to rename a database.
     * @param req ModifyDBNameRequest
     * @return ModifyDBNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBNameResponse ModifyDBName(ModifyDBNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBName", ModifyDBNameResponse.class);
    }

    /**
     *This API is used to modify database remarks.
     * @param req ModifyDBRemarkRequest
     * @return ModifyDBRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBRemarkResponse ModifyDBRemark(ModifyDBRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBRemark", ModifyDBRemarkResponse.class);
    }

    /**
     *This API is used to enable or disable the read-only feature of the replica server.
     * @param req ModifyDReadableRequest
     * @return ModifyDReadableResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDReadableResponse ModifyDReadable(ModifyDReadableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDReadable", ModifyDReadableResponse.class);
    }

    /**
     *This API is used to enable or disable the change data capture (CDC) feature.
     * @param req ModifyDatabaseCDCRequest
     * @return ModifyDatabaseCDCResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseCDCResponse ModifyDatabaseCDC(ModifyDatabaseCDCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseCDC", ModifyDatabaseCDCResponse.class);
    }

    /**
     *This API is used to enable or disable the change tracking (CT) feature.
     * @param req ModifyDatabaseCTRequest
     * @return ModifyDatabaseCTResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseCTResponse ModifyDatabaseCT(ModifyDatabaseCTRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseCT", ModifyDatabaseCTResponse.class);
    }

    /**
     *This API is used to shrink database MDF files.
     * @param req ModifyDatabaseMdfRequest
     * @return ModifyDatabaseMdfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseMdfResponse ModifyDatabaseMdf(ModifyDatabaseMdfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseMdf", ModifyDatabaseMdfResponse.class);
    }

    /**
     *This API is used to modify instance database permissions.
     * @param req ModifyDatabasePrivilegeRequest
     * @return ModifyDatabasePrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabasePrivilegeResponse ModifyDatabasePrivilege(ModifyDatabasePrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabasePrivilege", ModifyDatabasePrivilegeResponse.class);
    }

    /**
     *This API is used to shrink the database mdf (Shrink mdf).
     * @param req ModifyDatabaseShrinkMDFRequest
     * @return ModifyDatabaseShrinkMDFResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseShrinkMDFResponse ModifyDatabaseShrinkMDF(ModifyDatabaseShrinkMDFRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseShrinkMDF", ModifyDatabaseShrinkMDFResponse.class);
    }

    /**
     *This API is used to modify an incremental backup import task.
     * @param req ModifyIncrementalMigrationRequest
     * @return ModifyIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIncrementalMigrationResponse ModifyIncrementalMigration(ModifyIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIncrementalMigration", ModifyIncrementalMigrationResponse.class);
    }

    /**
     *This API is used to enable TDE of an instance.
     * @param req ModifyInstanceEncryptAttributesRequest
     * @return ModifyInstanceEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEncryptAttributesResponse ModifyInstanceEncryptAttributes(ModifyInstanceEncryptAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEncryptAttributes", ModifyInstanceEncryptAttributesResponse.class);
    }

    /**
     *This API is used to modify instance parameters.
<b>Note</b>: if <b>the instance needs to be restarted</b> for the modified parameter to take effect, <b>it will be restarted</b> immediately or during the maintenance time according to the `WaitSwitch` parameter.
Before you modify a parameter, you can use the `DescribeInstanceParams` API to query whether the instance needs to be restarted.
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParam", ModifyInstanceParamResponse.class);
    }

    /**
     *This API is used to modify the maintenance window of the instance.
     * @param req ModifyMaintenanceSpanRequest
     * @return ModifyMaintenanceSpanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintenanceSpanResponse ModifyMaintenanceSpan(ModifyMaintenanceSpanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintenanceSpan", ModifyMaintenanceSpanResponse.class);
    }

    /**
     *This API is used to modify an existing migration task.
     * @param req ModifyMigrationRequest
     * @return ModifyMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationResponse ModifyMigration(ModifyMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigration", ModifyMigrationResponse.class);
    }

    /**
     *This API is used to enable the public network for the instance.
     * @param req ModifyOpenWanIpRequest
     * @return ModifyOpenWanIpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOpenWanIpResponse ModifyOpenWanIp(ModifyOpenWanIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOpenWanIp", ModifyOpenWanIpResponse.class);
    }

    /**
     *This API is used to modify the publish/subscribe relationship of the instance.
     * @param req ModifyPublishSubscribeRequest
     * @return ModifyPublishSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublishSubscribeResponse ModifyPublishSubscribe(ModifyPublishSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublishSubscribe", ModifyPublishSubscribeResponse.class);
    }

    /**
     *This API is used to modify the publish/subscribe names.
     * @param req ModifyPublishSubscribeNameRequest
     * @return ModifyPublishSubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublishSubscribeNameResponse ModifyPublishSubscribeName(ModifyPublishSubscribeNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublishSubscribeName", ModifyPublishSubscribeNameResponse.class);
    }

    /**
     *This API is used to modify read-only group details.
     * @param req ModifyReadOnlyGroupDetailsRequest
     * @return ModifyReadOnlyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReadOnlyGroupDetailsResponse ModifyReadOnlyGroupDetails(ModifyReadOnlyGroupDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReadOnlyGroupDetails", ModifyReadOnlyGroupDetailsResponse.class);
    }

    /**
     *This API is used to enable instance interconnection, which can interconnect business intelligence services.
     * @param req OpenInterCommunicationRequest
     * @return OpenInterCommunicationResponse
     * @throws TencentCloudSDKException
     */
    public OpenInterCommunicationResponse OpenInterCommunication(OpenInterCommunicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenInterCommunication", OpenInterCommunicationResponse.class);
    }

    /**
     *This API is used to return a deactivated SQL Server instance.
     * @param req RecycleDBInstanceRequest
     * @return RecycleDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RecycleDBInstanceResponse RecycleDBInstance(RecycleDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecycleDBInstance", RecycleDBInstanceResponse.class);
    }

    /**
     *This API is used to reclaim resources of read-only groups immediately. The resources, such as VIP, occupied by the read-only group will be released immediately and cannot be recovered.
     * @param req RecycleReadOnlyGroupRequest
     * @return RecycleReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RecycleReadOnlyGroupResponse RecycleReadOnlyGroup(RecycleReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecycleReadOnlyGroup", RecycleReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to delete backup files created by users manually. The backup policy to be deleted can be instance backup or multi-database backup.
     * @param req RemoveBackupsRequest
     * @return RemoveBackupsResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBackupsResponse RemoveBackups(RemoveBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveBackups", RemoveBackupsResponse.class);
    }

    /**
     *This API is used to recover the pay-as-you-go instance that is manually isolated through the API TerminateDBInstance from the recycle bin.
     * @param req RenewPostpaidDBInstanceRequest
     * @return RenewPostpaidDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewPostpaidDBInstanceResponse RenewPostpaidDBInstance(RenewPostpaidDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewPostpaidDBInstance", RenewPostpaidDBInstanceResponse.class);
    }

    /**
     *This API is used to reset the account password of an instance.
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *This API is used to restart a database instance.
     * @param req RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstanceResponse RestartDBInstance(RestartDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstance", RestartDBInstanceResponse.class);
    }

    /**
     *This API is used to roll back the database by backup set.
     * @param req RestoreInstanceRequest
     * @return RestoreInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestoreInstanceResponse RestoreInstance(RestoreInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreInstance", RestoreInstanceResponse.class);
    }

    /**
     *This API is used to roll back the instance by time point.
     * @param req RollbackInstanceRequest
     * @return RollbackInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RollbackInstanceResponse RollbackInstance(RollbackInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackInstance", RollbackInstanceResponse.class);
    }

    /**
     *This API is used to start running a migration task.
     * @param req RunMigrationRequest
     * @return RunMigrationResponse
     * @throws TencentCloudSDKException
     */
    public RunMigrationResponse RunMigration(RunMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunMigration", RunMigrationResponse.class);
    }

    /**
     *This API is used to start a backup import task.
     * @param req StartBackupMigrationRequest
     * @return StartBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StartBackupMigrationResponse StartBackupMigration(StartBackupMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBackupMigration", StartBackupMigrationResponse.class);
    }

    /**
     *This API is used to start an incremental backup import task.
     * @param req StartIncrementalMigrationRequest
     * @return StartIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StartIncrementalMigrationResponse StartIncrementalMigration(StartIncrementalMigrationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartIncrementalMigration", StartIncrementalMigrationResponse.class);
    }

    /**
     *This API is used to start and stop an extended event.
     * @param req StartInstanceXEventRequest
     * @return StartInstanceXEventResponse
     * @throws TencentCloudSDKException
     */
    public StartInstanceXEventResponse StartInstanceXEvent(StartInstanceXEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstanceXEvent", StartInstanceXEventResponse.class);
    }

    /**
     *This API is used to manually switch between primary and secondary.
     * @param req SwitchCloudInstanceHARequest
     * @return SwitchCloudInstanceHAResponse
     * @throws TencentCloudSDKException
     */
    public SwitchCloudInstanceHAResponse SwitchCloudInstanceHA(SwitchCloudInstanceHARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchCloudInstanceHA", SwitchCloudInstanceHAResponse.class);
    }

    /**
     *This API is used to isolate an instance to move it into a recycle bin.
     * @param req TerminateDBInstanceRequest
     * @return TerminateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstanceResponse TerminateDBInstance(TerminateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDBInstance", TerminateDBInstanceResponse.class);
    }

    /**
     *This API is used to upgrade an instance.
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

}
