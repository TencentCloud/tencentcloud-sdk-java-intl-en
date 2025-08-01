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
     *This API is used to query the upgrade prices of a monthly subscribed instance
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
