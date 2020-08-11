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
package com.tencentcloudapi.cdb.v20170320;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdb.v20170320.models.*;

public class CdbClient extends AbstractClient{
    private static String endpoint = "cdb.tencentcloudapi.com";
    private static String version = "2017-03-20";

    public CdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdbClient(Credential credential, String region, ClientProfile profile) {
        super(CdbClient.endpoint, CdbClient.version, credential, region, profile);
    }

    /**
     *This API (AddTimeWindow) is used to add a maintenance time window for a TencentDB instance, so as to specify when the instance can automatically perform access switch operations.
     * @param req AddTimeWindowRequest
     * @return AddTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public AddTimeWindowResponse AddTimeWindow(AddTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssociateSecurityGroups) is used to bind security groups to instances in batches.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rebalance the loads of instances in an RO group. Please note that the database connections to those instances will be interrupted transiently; therefore, you should ensure that your application can reconnect to the databases. This operation should be performed with caution.
     * @param req BalanceRoGroupLoadRequest
     * @return BalanceRoGroupLoadResponse
     * @throws TencentCloudSDKException
     */
    public BalanceRoGroupLoadResponse BalanceRoGroupLoad(BalanceRoGroupLoadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BalanceRoGroupLoadResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BalanceRoGroupLoadResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BalanceRoGroupLoad"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CloseWanService) is used to disable public network access for TencentDB instance, which will make public IP addresses inaccessible.
     * @param req CloseWanServiceRequest
     * @return CloseWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanServiceResponse CloseWanService(CloseWanServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseWanServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseWanServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseWanService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAccounts) is used to create TencentDB accounts. The new account names, domain names, and passwords need to be specified, and account remarks can also be added.
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAccounts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateBackup) is used to create a TencentDB instance backup.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateBackup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateDBImportJob) is used to create a data import task for a TencentDB instance.

Note that the files for a data import task must be uploaded to Tencent Cloud in advance. You need to do so in the console.
     * @param req CreateDBImportJobRequest
     * @return CreateDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBImportJobResponse CreateDBImportJob(CreateDBImportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBImportJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBImportJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBImportJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a pay-as-you-go TencentDB instance (which can be a primary, disaster recovery, or read-only instance) by passing in information such as instance specifications, MySQL version number, and quantity.

This is an async API. You can also use the [DescribeDBInstances](https://cloud.tencent.com/document/api/236/15872) API to query the instance details. If the `Status` value of an instance is 1 and `TaskStatus` is 0, the instance has been successfully delivered.

1. Please use the [DescribeDBZoneConfig](https://cloud.tencent.com/document/api/236/17229) API to query the supported instance specifications first and then use the [DescribeDBPrice](https://cloud.tencent.com/document/api/236/18566) API to query the prices of the supported instances;
2. You can create up to 100 instances at a time, with an instance validity period of up to 36 months;
3. MySQL v5.5, v5.6, and v5.7 are supported;
4. primary instances, read-only instances, and disaster recovery instances can be created;
5. If `Port`, `ParamList`, or `Password` is set in the input parameters, the instance will be initialized.
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceHourResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceHourResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstanceHour"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a placement group for placing instances.
     * @param req CreateDeployGroupRequest
     * @return CreateDeployGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeployGroupResponse CreateDeployGroup(CreateDeployGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeployGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeployGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDeployGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateParamTemplate) is used to create a parameter template.
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateParamTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateParamTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateParamTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a VIP exclusive to a TencentDB read-only instance.
     * @param req CreateRoInstanceIpRequest
     * @return CreateRoInstanceIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoInstanceIpResponse CreateRoInstanceIp(CreateRoInstanceIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoInstanceIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoInstanceIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRoInstanceIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAccounts) is used to delete TencentDB accounts.
     * @param req DeleteAccountsRequest
     * @return DeleteAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountsResponse DeleteAccounts(DeleteAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAccounts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a database backup. It can only delete manually initiated backups.
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBackupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBackupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteBackup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete placement groups by placement group ID (a placement group cannot be deleted if it contains resources).
     * @param req DeleteDeployGroupsRequest
     * @return DeleteDeployGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeployGroupsResponse DeleteDeployGroups(DeleteDeployGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeployGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeployGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDeployGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteParamTemplate) is used to delete a parameter template.
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteParamTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteParamTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteParamTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteTimeWindow) is used to delete a maintenance time window for a TencentDB instance. After it is deleted, the default maintenance time window will be 03:00-04:00, i.e., switch to a new instance will be performed during 03:00-04:00 by default.
     * @param req DeleteTimeWindowRequest
     * @return DeleteTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimeWindowResponse DeleteTimeWindow(DeleteTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccountPrivileges) is used to query the information of TencentDB account permissions.
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccounts) is used to query information of all TencentDB accounts.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccounts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAsyncRequestInfo) is used to query the async task execution result of a TencentDB instance.
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncRequestInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncRequestInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAsyncRequestInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeBackupConfig) is used to query the configuration information of a TencentDB instance backup.
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the databases contained in a backup file. It has been disused.
After the legacy version becomes capable of full backup, if you want to download logical backup files by table, you need to use this API.
The new API (CreateBackup) can specify the table to be backed up when a logical backup file is created, which can be downloaded directly.
     * @param req DescribeBackupDatabasesRequest
     * @return DescribeBackupDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDatabasesResponse DescribeBackupDatabases(DescribeBackupDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDatabasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDatabasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupDatabases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the backup overview of a user. It will return the user's current total number of backups, total capacity used by backups, capacity in the free tier, and paid capacity (all capacity values are in bytes).
     * @param req DescribeBackupOverviewRequest
     * @return DescribeBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewResponse DescribeBackupOverview(DescribeBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the statistics of backups. It will return the capacity used by backups at the instance level and the number and used capacity of data backups and log backups of each instance (all capacity values are in bytes).
     * @param req DescribeBackupSummariesRequest
     * @return DescribeBackupSummariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummariesResponse DescribeBackupSummaries(DescribeBackupSummariesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupSummariesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupSummariesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupSummaries"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the backup tables of the specified database. It has been disused.
After the legacy version becomes capable of full backup, if you want to download logical backup files by table, you need to use this API.
The new API (CreateBackup) can specify the table to be backed up when a logical backup file is created, which can be downloaded directly.
     * @param req DescribeBackupTablesRequest
     * @return DescribeBackupTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupTablesResponse DescribeBackupTables(DescribeBackupTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupTablesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupTablesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupTables"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeBackups) is used to query the backups of a TencentDB instance.
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the log backup overview of a user in the current region.
     * @param req DescribeBinlogBackupOverviewRequest
     * @return DescribeBinlogBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogBackupOverviewResponse DescribeBinlogBackupOverview(DescribeBinlogBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogBackupOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogBackupOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBinlogBackupOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of binlog files of a TencentDB instance.
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBinlogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBImportRecords) is used to query the records of import tasks in a TencentDB instance.
     * @param req DescribeDBImportRecordsRequest
     * @return DescribeDBImportRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBImportRecordsResponse DescribeDBImportRecords(DescribeDBImportRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBImportRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBImportRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBImportRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBInstanceCharset) is used to query the character set and its name of a TencentDB instance.
     * @param req DescribeDBInstanceCharsetRequest
     * @return DescribeDBInstanceCharsetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceCharsetResponse DescribeDBInstanceCharset(DescribeDBInstanceCharsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceCharsetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceCharsetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceCharset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBInstanceConfig) is used to query the configuration information of a TencentDB instance, such as its synchronization mode and deployment mode.
     * @param req DescribeDBInstanceConfigRequest
     * @return DescribeDBInstanceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceConfigResponse DescribeDBInstanceConfig(DescribeDBInstanceConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBInstanceGTID) is used to query whether GTID is activated for a TencentDB instance. Instances on or below version 5.5 are not supported.
     * @param req DescribeDBInstanceGTIDRequest
     * @return DescribeDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceGTIDResponse DescribeDBInstanceGTID(DescribeDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceGTIDResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceGTIDResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceGTID"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the basic information of an instance (instance ID, instance name, and whether encryption is enabled).
     * @param req DescribeDBInstanceInfoRequest
     * @return DescribeDBInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInfoResponse DescribeDBInstanceInfo(DescribeDBInstanceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBInstanceRebootTime) is used to query the estimated time needed for a TencentDB instance to restart.
     * @param req DescribeDBInstanceRebootTimeRequest
     * @return DescribeDBInstanceRebootTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceRebootTimeResponse DescribeDBInstanceRebootTime(DescribeDBInstanceRebootTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceRebootTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceRebootTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceRebootTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBInstances) is used to query the list of TencentDB instances (which can be primary, disaster recovery, or read-only instances). It supports filtering instances by project ID, instance ID, access address, and instance status.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBSecurityGroups) is used to query the security group details of an instance.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBSwitchRecords) is used to query the instance switch records.
     * @param req DescribeDBSwitchRecordsRequest
     * @return DescribeDBSwitchRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSwitchRecordsResponse DescribeDBSwitchRecords(DescribeDBSwitchRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSwitchRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSwitchRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSwitchRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDBZoneConfig) is used to query the specifications of TencentDB instances purchasable in a region.
     * @param req DescribeDBZoneConfigRequest
     * @return DescribeDBZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBZoneConfigResponse DescribeDBZoneConfig(DescribeDBZoneConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBZoneConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBZoneConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBZoneConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the data backup overview of a user in the current region.
     * @param req DescribeDataBackupOverviewRequest
     * @return DescribeDataBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataBackupOverviewResponse DescribeDataBackupOverview(DescribeDataBackupOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataBackupOverviewResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataBackupOverviewResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDataBackupOverview"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDatabases) is used to query the information of databases of a TencentDB instance.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDatabases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDefaultParams) is used to query the list of default configurable parameters.
     * @param req DescribeDefaultParamsRequest
     * @return DescribeDefaultParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParamsResponse DescribeDefaultParams(DescribeDefaultParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultParamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultParamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDefaultParams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of placement groups of a user. You can specify the placement group ID or name.
     * @param req DescribeDeployGroupListRequest
     * @return DescribeDeployGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployGroupListResponse DescribeDeployGroupList(DescribeDeployGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeployGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeployGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeployGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDeviceMonitorInfo) is used to query the monitoring information of a TencentDB physical machine on the day. Currently, it only supports instances with 488 GB memory and 6 TB disk.
     * @param req DescribeDeviceMonitorInfoRequest
     * @return DescribeDeviceMonitorInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceMonitorInfoResponse DescribeDeviceMonitorInfo(DescribeDeviceMonitorInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceMonitorInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceMonitorInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceMonitorInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of instance error logs by search criteria. You can only query error logs within a month.
     * @param req DescribeErrorLogDataRequest
     * @return DescribeErrorLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogDataResponse DescribeErrorLogData(DescribeErrorLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeErrorLogDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeErrorLogDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeErrorLogData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstanceParamRecords) is used to query the parameter modification records of an instance.
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceParamRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstanceParams) is used to query the list of parameters for an instance.
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceParams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeParamTemplateInfo) is used to query parameter template details.
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplateInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplateInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeParamTemplateInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeParamTemplates) is used to query the list of parameter templates
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeParamTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeProjectSecurityGroups) is used to query the security group details of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjectSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of all RO groups of a TencentDB instance.
     * @param req DescribeRoGroupsRequest
     * @return DescribeRoGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoGroupsResponse DescribeRoGroups(DescribeRoGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRoGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the minimum specification of a read-only instance that can be purchased or upgraded to.
     * @param req DescribeRoMinScaleRequest
     * @return DescribeRoMinScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoMinScaleResponse DescribeRoMinScale(DescribeRoMinScaleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoMinScaleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoMinScaleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRoMinScale"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRollbackRangeTime) is used to query the time range available for instance rollback.
     * @param req DescribeRollbackRangeTimeRequest
     * @return DescribeRollbackRangeTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackRangeTimeResponse DescribeRollbackRangeTime(DescribeRollbackRangeTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackRangeTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackRangeTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRollbackRangeTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a TencentDB instance rollback task.
     * @param req DescribeRollbackTaskDetailRequest
     * @return DescribeRollbackTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTaskDetailResponse DescribeRollbackTaskDetail(DescribeRollbackTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRollbackTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search for slow logs of an instance by criteria. You can only view slow logs within a month.
     * @param req DescribeSlowLogDataRequest
     * @return DescribeSlowLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogDataResponse DescribeSlowLogData(DescribeSlowLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLogData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSlowLogs) is used to query the slow logs of a TencentDB instance.
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSupportedPrivileges) is used to query the information of TencentDB account permissions, including global permissions, database permissions, table permissions, and column permissions.
     * @param req DescribeSupportedPrivilegesRequest
     * @return DescribeSupportedPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedPrivilegesResponse DescribeSupportedPrivileges(DescribeSupportedPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupportedPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupportedPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSupportedPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTables) is used to query the database tables of a TencentDB instance.
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTables"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTagsOfInstanceIds) is used to query the tag information of a TencentDB instance.
     * @param req DescribeTagsOfInstanceIdsRequest
     * @return DescribeTagsOfInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsOfInstanceIdsResponse DescribeTagsOfInstanceIds(DescribeTagsOfInstanceIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsOfInstanceIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsOfInstanceIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTagsOfInstanceIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTasks) is used to query the list of tasks for a TencentDB instance.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTimeWindow) is used to query the maintenance time window of a TencentDB instance.
     * @param req DescribeTimeWindowRequest
     * @return DescribeTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeWindowResponse DescribeTimeWindow(DescribeTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of user-imported SQL files.
     * @param req DescribeUploadedFilesRequest
     * @return DescribeUploadedFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadedFilesResponse DescribeUploadedFiles(DescribeUploadedFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUploadedFilesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUploadedFilesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUploadedFiles"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateSecurityGroups) is used to unbind security groups from instances in batches.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InitDBInstances) is used to initialize instances, including their password, default character set, and instance port number.
     * @param req InitDBInstancesRequest
     * @return InitDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDBInstancesResponse InitDBInstances(InitDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InitDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InitDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate a TencentDB instance, which will no longer be accessible via IP and port. The isolated instance can be started up in the recycle bin. If it is isolated due to arrears, please top up your account as soon as possible.
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IsolateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAccountDescription) is used to modify the remarks of a TencentDB instance account.
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountDescriptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountDescriptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountDescription"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAccountPassword) is used to modify the password of a TencentDB instance account.
     * @param req ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPasswordResponse ModifyAccountPassword(ModifyAccountPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the permissions of a TencentDB instance account.

Note that when modifying account permissions, you need to pass in the full permission information of the account. You can [query the account permission information
](https://cloud.tencent.com/document/api/236/17500) first before modifying permissions.
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountPrivilegesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPrivilegesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountPrivileges"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the auto-renewal flag of a TencentDB instance.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyBackupConfig) is used to modify the database backup configuration.
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyBackupConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDBInstanceName) is used to rename a TencentDB instance.
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDBInstanceProject) is used to modify the project to which a TencentDB instance belongs.
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDBInstanceSecurityGroups) is used to modify the security groups bound to a TencentDB instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDBInstanceVipVport) is used to modify the IP and port number of a TencentDB instance, switch from the basic network to VPC, or change VPC subnets.
     * @param req ModifyDBInstanceVipVportRequest
     * @return ModifyDBInstanceVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceVipVportResponse ModifyDBInstanceVipVport(ModifyDBInstanceVipVportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceVipVportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceVipVportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceVipVport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstanceParam) is used to modify instance parameters.
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceParamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceParamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceParam"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstanceTag) is used to add, modify, or delete an instance tag.
     * @param req ModifyInstanceTagRequest
     * @return ModifyInstanceTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTagResponse ModifyInstanceTag(ModifyInstanceTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the name or description of a placement group.
     * @param req ModifyNameOrDescByDpIdRequest
     * @return ModifyNameOrDescByDpIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNameOrDescByDpIdResponse ModifyNameOrDescByDpId(ModifyNameOrDescByDpIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNameOrDescByDpIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNameOrDescByDpIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNameOrDescByDpId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyParamTemplate) is used to modify a parameter template.
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyParamTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyParamTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyParamTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the information of a TencentDB RO group, such as configuring an instance removal policy in case of excessive delay and setting read weights of RO instances.
     * @param req ModifyRoGroupInfoRequest
     * @return ModifyRoGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupInfoResponse ModifyRoGroupInfo(ModifyRoGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRoGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyTimeWindow) is used to update the maintenance time window of a TencentDB instance.
     * @param req ModifyTimeWindowRequest
     * @return ModifyTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTimeWindowResponse ModifyTimeWindow(ModifyTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTimeWindowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTimeWindowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTimeWindow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (OfflineIsolatedInstances) is used to deactivate isolated TencentDB instances immediately. The instances must be in isolated status, i.e., their `Status` value is 5 in the return of the [instance list querying API](https://cloud.tencent.com/document/api/236/15872).

This is an asynchronous API. There may be a delay in repossessing some resources. You can query the details by using the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) and specifying the InstanceId and the `Status` value as [5, 6, 7]. If the returned instance is empty, then all its resources have been released.

Note that once an instance is deactivated, its resources and data will not be recoverable. Please do so with caution.
     * @param req OfflineIsolatedInstancesRequest
     * @return OfflineIsolatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedInstancesResponse OfflineIsolatedInstances(OfflineIsolatedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OfflineIsolatedInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (OpenDBInstanceGTID) is used to enable GTID for a TencentDB instance. Only instances on or above version 5.6 are supported.
     * @param req OpenDBInstanceGTIDRequest
     * @return OpenDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceGTIDResponse OpenDBInstanceGTID(OpenDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenDBInstanceGTIDResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBInstanceGTIDResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenDBInstanceGTID"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (OpenWanService) is used to enable public network access for an instance.

Note that before enabling public network access, you need to first [initialize the instance](https://cloud.tencent.com/document/api/236/15873).
     * @param req OpenWanServiceRequest
     * @return OpenWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanServiceResponse OpenWanService(OpenWanServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenWanServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenWanServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenWanService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deisolate an isolated TencentDB instance.
     * @param req ReleaseIsolatedDBInstancesRequest
     * @return ReleaseIsolatedDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIsolatedDBInstancesResponse ReleaseIsolatedDBInstances(ReleaseIsolatedDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseIsolatedDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseIsolatedDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseIsolatedDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RestartDBInstances) is used to restart TencentDB instances.

Note:
1. This API only supports restarting primary instances.
2. The instance status must be normal, and no other async tasks are in progress.
     * @param req RestartDBInstancesRequest
     * @return RestartDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstancesResponse RestartDBInstances(RestartDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RestartDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (StartBatchRollback) is used to roll back the tables of a TencentDB instance in batches.
     * @param req StartBatchRollbackRequest
     * @return StartBatchRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StartBatchRollbackResponse StartBatchRollback(StartBatchRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartBatchRollbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartBatchRollbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartBatchRollback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (StopDBImportJob) is used to stop a data import task.
     * @param req StopDBImportJobRequest
     * @return StopDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public StopDBImportJobResponse StopDBImportJob(StopDBImportJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopDBImportJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopDBImportJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopDBImportJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (SwitchForUpgrade) is used to switch to a new instance. You can initiate this process when the primary instance being upgraded is pending switch.
     * @param req SwitchForUpgradeRequest
     * @return SwitchForUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchForUpgradeResponse SwitchForUpgrade(SwitchForUpgradeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchForUpgradeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchForUpgradeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SwitchForUpgrade"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade or downgrade a TencentDB instance, which can be a primary instance, disaster recovery instance, or read-only instance.
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpgradeDBInstanceEngineVersion) is used to upgrade the version of a TencentDB instance, which can be a primary instance, disaster recovery instance, or read-only instance.
     * @param req UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceEngineVersionResponse UpgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceEngineVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceEngineVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstanceEngineVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
