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
    private static String endpoint = "cdb.intl.tencentcloudapi.com";
    private static String service = "cdb";
    private static String version = "2017-03-20";

    public CdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdbClient(Credential credential, String region, ClientProfile profile) {
        super(CdbClient.endpoint, CdbClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a maintenance time window for cloud database instances to specify which time periods allow automatic execution of access operations.
     * @param req AddTimeWindowRequest
     * @return AddTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public AddTimeWindowResponse AddTimeWindow(AddTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTimeWindow", AddTimeWindowResponse.class);
    }

    /**
     *This API is used to adjust database proxy configuration.
     * @param req AdjustCdbProxyRequest
     * @return AdjustCdbProxyResponse
     * @throws TencentCloudSDKException
     */
    public AdjustCdbProxyResponse AdjustCdbProxy(AdjustCdbProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustCdbProxy", AdjustCdbProxyResponse.class);
    }

    /**
     *This API is used to adjust the database proxy address configuration.
     * @param req AdjustCdbProxyAddressRequest
     * @return AdjustCdbProxyAddressResponse
     * @throws TencentCloudSDKException
     */
    public AdjustCdbProxyAddressResponse AdjustCdbProxyAddress(AdjustCdbProxyAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustCdbProxyAddress", AdjustCdbProxyAddressResponse.class);
    }

    /**
     *This API is used to perform aggregation statistics on specified data columns in audit log result sets with different filter criteria.
     * @param req AnalyzeAuditLogsRequest
     * @return AnalyzeAuditLogsResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeAuditLogsResponse AnalyzeAuditLogs(AnalyzeAuditLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AnalyzeAuditLogs", AnalyzeAuditLogsResponse.class);
    }

    /**
     *This API (AssociateSecurityGroups) is used to bind security groups to instances in batches.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to rebalance the loads of instances in an RO group. Please note that the database connections to those instances will be interrupted transiently; therefore, you should ensure that your application can reconnect to the databases. This operation should be performed with caution.
     * @param req BalanceRoGroupLoadRequest
     * @return BalanceRoGroupLoadResponse
     * @throws TencentCloudSDKException
     */
    public BalanceRoGroupLoadResponse BalanceRoGroupLoad(BalanceRoGroupLoadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BalanceRoGroupLoad", BalanceRoGroupLoadResponse.class);
    }

    /**
     *This API is used to disable the audit service for an instance.
     * @param req CloseAuditServiceRequest
     * @return CloseAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseAuditServiceResponse CloseAuditService(CloseAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAuditService", CloseAuditServiceResponse.class);
    }

    /**
     *This API is used to disable the database proxy.
     * @param req CloseCDBProxyRequest
     * @return CloseCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public CloseCDBProxyResponse CloseCDBProxy(CloseCDBProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseCDBProxy", CloseCDBProxyResponse.class);
    }

    /**
     *This API is used to disable database proxy.
     * @param req CloseCdbProxyAddressRequest
     * @return CloseCdbProxyAddressResponse
     * @throws TencentCloudSDKException
     */
    public CloseCdbProxyAddressResponse CloseCdbProxyAddress(CloseCdbProxyAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseCdbProxyAddress", CloseCdbProxyAddressResponse.class);
    }

    /**
     *This API is used to close the SSL connectivity function.
     * @param req CloseSSLRequest
     * @return CloseSSLResponse
     * @throws TencentCloudSDKException
     */
    public CloseSSLResponse CloseSSL(CloseSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseSSL", CloseSSLResponse.class);
    }

    /**
     *This API (CloseWanService) is used to disable public network access for TencentDB instance, which will make public IP addresses inaccessible.
     * @param req CloseWanServiceRequest
     * @return CloseWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanServiceResponse CloseWanService(CloseWanServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseWanService", CloseWanServiceResponse.class);
    }

    /**
     *This API is used to create cloud database accounts. It requires specifying a new account name and domain name as well as the corresponding password. You can also set the account's remark information and maximum number of available connections.
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccounts", CreateAccountsResponse.class);
    }

    /**
     *This API is used to create an audit log file for a TencentDB instance.
     * @param req CreateAuditLogFileRequest
     * @return CreateAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditLogFileResponse CreateAuditLogFile(CreateAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditLogFile", CreateAuditLogFileResponse.class);
    }

    /**
     *This API is used to create an audit policy for a TencentDB instance by associating an audit rule with the TencentDB instance.
     * @param req CreateAuditPolicyRequest
     * @return CreateAuditPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditPolicyResponse CreateAuditPolicy(CreateAuditPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditPolicy", CreateAuditPolicyResponse.class);
    }

    /**
     *This API is used to create an audit rule template.
     * @param req CreateAuditRuleTemplateRequest
     * @return CreateAuditRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditRuleTemplateResponse CreateAuditRuleTemplate(CreateAuditRuleTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditRuleTemplate", CreateAuditRuleTemplateResponse.class);
    }

    /**
     *This API is used to create a database backup.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *This API is used to create a database proxy for the primary instance.
     * @param req CreateCdbProxyRequest
     * @return CreateCdbProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdbProxyResponse CreateCdbProxy(CreateCdbProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCdbProxy", CreateCdbProxyResponse.class);
    }

    /**
     *This API is used to add a proxy address for database proxy.
     * @param req CreateCdbProxyAddressRequest
     * @return CreateCdbProxyAddressResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdbProxyAddressResponse CreateCdbProxyAddress(CreateCdbProxyAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCdbProxyAddress", CreateCdbProxyAddressResponse.class);
    }

    /**
     *This API is used to create a clone instance from the source instance. You can specify a physical backup file or a rollback time point for the clone instance.
     * @param req CreateCloneInstanceRequest
     * @return CreateCloneInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloneInstanceResponse CreateCloneInstance(CreateCloneInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloneInstance", CreateCloneInstanceResponse.class);
    }

    /**
     *This API is used to create a cloud database data import task.
Note that the file for the data import task must be uploaded to Tencent Cloud in advance. The user must perform file import on the console.
     * @param req CreateDBImportJobRequest
     * @return CreateDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBImportJobResponse CreateDBImportJob(CreateDBImportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBImportJob", CreateDBImportJobResponse.class);
    }

    /**
     *This API is used to create a cloud database instance with an annual/monthly subscription, including primary instance, disaster recovery instance, and read-only instance. You can create a cloud database instance by importing instance specification, MySQL version number, purchase period, and quantity information.

This API is an asynchronous API. You can also use the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to query the instance details. When the Status of the instance is 1 and TaskStatus is 0, it means the instance has been delivered successfully.

1. First, please use the API for the query (https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) to obtain the purchasable specifications of cloud databases, then please use the API for the query (https://www.tencentcloud.com/document/api/236/18566?from_cn_redirect=1) to query database price.
2. You can create up to 100 instances at a time, with a maximum instance duration of 36 months.
3. Support creating MySQL 5.5, MySQL 5.6, MySQL 5.7, and MySQL 8.0 versions.
4. Support creating primary instance, read-only instance, disaster recovery instance.
5. When ParamTemplateId or AlarmPolicyList is specified in the input parameters, you need to upgrade the SDK to the latest version to support it.
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *This API is used to create pay-as-you-go instances. You can create a cloud database instance by inputting the instance specification, MySQL version number, quantity, etc. It supports the creation of primary instances, disaster recovery instances, and read-only instances.

This API is an async API. You can also use the API for the query (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to check the instance details. When the instance Status is 1 and TaskStatus is 0, it means the instance has been delivered successfully.

1. First, please use the API for the query (https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1) to obtain the purchasable specifications of cloud databases, then please use the API for the query (https://www.tencentcloud.com/document/api/236/18566?from_cn_redirect=1) to query the instance selling price.
2. Supports a maximum of 100 instances created at a time, with a maximum duration of 36 months;
3. Support creating MySQL 5.5, MySQL 5.6, MySQL 5.7, and MySQL 8.0 versions.
4. Support creating primary instances, disaster recovery instances, and read-only instances.
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceHour", CreateDBInstanceHourResponse.class);
    }

    /**
     *This API is used to create a database in a TencentDB instance.
     * @param req CreateDatabaseRequest
     * @return CreateDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseResponse CreateDatabase(CreateDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatabase", CreateDatabaseResponse.class);
    }

    /**
     *This API is used to create a parameter template.
Description: The parameter template is a common component, effective across all regions once configured. For api calls, Guangzhou or Singapore is available to configure region.
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParamTemplate", CreateParamTemplateResponse.class);
    }

    /**
     *This API is used to create a VIP exclusive to a TencentDB read-only instance.
     * @param req CreateRoInstanceIpRequest
     * @return CreateRoInstanceIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoInstanceIpResponse CreateRoInstanceIp(CreateRoInstanceIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoInstanceIp", CreateRoInstanceIpResponse.class);
    }

    /**
     *This API is used to enable password rotation.
     * @param req CreateRotationPasswordRequest
     * @return CreateRotationPasswordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRotationPasswordResponse CreateRotationPassword(CreateRotationPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRotationPassword", CreateRotationPasswordResponse.class);
    }

    /**
     *This API is used to delete CDB accounts.
     * @param req DeleteAccountsRequest
     * @return DeleteAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountsResponse DeleteAccounts(DeleteAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccounts", DeleteAccountsResponse.class);
    }

    /**
     *This API is used to delete an audit log file of a TencentDB instance.
     * @param req DeleteAuditLogFileRequest
     * @return DeleteAuditLogFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditLogFileResponse DeleteAuditLogFile(DeleteAuditLogFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditLogFile", DeleteAuditLogFileResponse.class);
    }

    /**
     *This API is used to delete an audit policy.
     * @param req DeleteAuditPolicyRequest
     * @return DeleteAuditPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditPolicyResponse DeleteAuditPolicy(DeleteAuditPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditPolicy", DeleteAuditPolicyResponse.class);
    }

    /**
     *This API is used to delete audit rule templates.
     * @param req DeleteAuditRuleTemplatesRequest
     * @return DeleteAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditRuleTemplatesResponse DeleteAuditRuleTemplates(DeleteAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditRuleTemplates", DeleteAuditRuleTemplatesResponse.class);
    }

    /**
     *This API is used to delete database backups. It only supports deleting manually initiated backups.
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackup", DeleteBackupResponse.class);
    }

    /**
     *This API is used to delete a database in a cloud database instance.
     * @param req DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatabaseResponse DeleteDatabase(DeleteDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDatabase", DeleteDatabaseResponse.class);
    }

    /**
     *This API is used to delete parameter template.
Description: The parameter template is a common component, effective across all regions once configured. For api calls, Guangzhou or Singapore is available to configure region.
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParamTemplate", DeleteParamTemplateResponse.class);
    }

    /**
     *This API is used to close instance account password rotation.
     * @param req DeleteRotationPasswordRequest
     * @return DeleteRotationPasswordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRotationPasswordResponse DeleteRotationPassword(DeleteRotationPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRotationPassword", DeleteRotationPasswordResponse.class);
    }

    /**
     *This API is used to delete the maintenance time window of a cloud database instance. After deleting the instance maintenance window, the default maintenance period is 03:00-04:00 daily with a data validation delay threshold of 10 seconds. When switching to a new instance during the maintenance time window, the switch is performed by default at 03:00-04:00.
     * @param req DeleteTimeWindowRequest
     * @return DeleteTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimeWindowResponse DeleteTimeWindow(DeleteTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTimeWindow", DeleteTimeWindowResponse.class);
    }

    /**
     *This API is used to query the permission information supported by a cloud database account.
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivileges", DescribeAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to query ALL account information of the cloud database.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *This API (DescribeAsyncRequestInfo) is used to query the async task execution result of a TencentDB instance.
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *This API is used to query the service configurations for a TencentDB audit policy, including the audit log retention period.
     * @param req DescribeAuditConfigRequest
     * @return DescribeAuditConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditConfigResponse DescribeAuditConfig(DescribeAuditConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditConfig", DescribeAuditConfigResponse.class);
    }

    /**
     *This API is used to obtain the list of audit instances.
     * @param req DescribeAuditInstanceListRequest
     * @return DescribeAuditInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditInstanceListResponse DescribeAuditInstanceList(DescribeAuditInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditInstanceList", DescribeAuditInstanceListResponse.class);
    }

    /**
     *This API is used to query the audit log files of a TencentDB instance.
     * @param req DescribeAuditLogFilesRequest
     * @return DescribeAuditLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogFilesResponse DescribeAuditLogFiles(DescribeAuditLogFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogFiles", DescribeAuditLogFilesResponse.class);
    }

    /**
     *This API is used to query database audit logs.
     * @param req DescribeAuditLogsRequest
     * @return DescribeAuditLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogsResponse DescribeAuditLogs(DescribeAuditLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogs", DescribeAuditLogsResponse.class);
    }

    /**
     *This API is used to query audit policies of cloud database instances.
     * @param req DescribeAuditPoliciesRequest
     * @return DescribeAuditPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditPoliciesResponse DescribeAuditPolicies(DescribeAuditPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditPolicies", DescribeAuditPoliciesResponse.class);
    }

    /**
     *This API is used to query the change history of rule templates.
     * @param req DescribeAuditRuleTemplateModifyHistoryRequest
     * @return DescribeAuditRuleTemplateModifyHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleTemplateModifyHistoryResponse DescribeAuditRuleTemplateModifyHistory(DescribeAuditRuleTemplateModifyHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleTemplateModifyHistory", DescribeAuditRuleTemplateModifyHistoryResponse.class);
    }

    /**
     *This API is used to query the information of audit rule templates.
     * @param req DescribeAuditRuleTemplatesRequest
     * @return DescribeAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleTemplatesResponse DescribeAuditRuleTemplates(DescribeAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleTemplates", DescribeAuditRuleTemplatesResponse.class);
    }

    /**
     *This API is used to create audit rules no longer supported.

This API is used to query audit rules in current region.
     * @param req DescribeAuditRulesRequest
     * @return DescribeAuditRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRulesResponse DescribeAuditRules(DescribeAuditRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRules", DescribeAuditRulesResponse.class);
    }

    /**
     *This API is used to query database backup configuration info.
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupConfig", DescribeBackupConfigResponse.class);
    }

    /**
     *This API is used to query the decryption key of a backup file.
     * @param req DescribeBackupDecryptionKeyRequest
     * @return DescribeBackupDecryptionKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDecryptionKeyResponse DescribeBackupDecryptionKey(DescribeBackupDecryptionKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDecryptionKey", DescribeBackupDecryptionKeyResponse.class);
    }

    /**
     *This API is used to query the restrictions of downloading backups in a region.
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadRestriction", DescribeBackupDownloadRestrictionResponse.class);
    }

    /**
     *This API is used to query the default encryption status of an instance backup.
     * @param req DescribeBackupEncryptionStatusRequest
     * @return DescribeBackupEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupEncryptionStatusResponse DescribeBackupEncryptionStatus(DescribeBackupEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupEncryptionStatus", DescribeBackupEncryptionStatusResponse.class);
    }

    /**
     *This API is used to query the backup overview of a user. It will return the user's current total number of backups, total capacity used by backups, capacity in the free tier, and paid capacity (all capacity values are in bytes).
     * @param req DescribeBackupOverviewRequest
     * @return DescribeBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewResponse DescribeBackupOverview(DescribeBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupOverview", DescribeBackupOverviewResponse.class);
    }

    /**
     *This API is used to query backup statistics, return the occupied capacity of backups by instance as well as the count and capacity of data backup and log backup for each instance (in bytes).
     * @param req DescribeBackupSummariesRequest
     * @return DescribeBackupSummariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummariesResponse DescribeBackupSummaries(DescribeBackupSummariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupSummaries", DescribeBackupSummariesResponse.class);
    }

    /**
     *This API (DescribeBackups) is used to query the backups of a TencentDB instance.
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackups", DescribeBackupsResponse.class);
    }

    /**
     *This API is used to query the log backup overview of a user in the current region.
     * @param req DescribeBinlogBackupOverviewRequest
     * @return DescribeBinlogBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogBackupOverviewResponse DescribeBinlogBackupOverview(DescribeBinlogBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogBackupOverview", DescribeBinlogBackupOverviewResponse.class);
    }

    /**
     *This API is used to query the list of binlog files of a TencentDB instance.
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogs", DescribeBinlogsResponse.class);
    }

    /**
     *This API is used to query the CPU Elastic Scaling information of an instance.
     * @param req DescribeCPUExpandStrategyInfoRequest
     * @return DescribeCPUExpandStrategyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCPUExpandStrategyInfoResponse DescribeCPUExpandStrategyInfo(DescribeCPUExpandStrategyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCPUExpandStrategyInfo", DescribeCPUExpandStrategyInfoResponse.class);
    }

    /**
     *This API is used to query database proxy detailed information.
     * @param req DescribeCdbProxyInfoRequest
     * @return DescribeCdbProxyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdbProxyInfoResponse DescribeCdbProxyInfo(DescribeCdbProxyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdbProxyInfo", DescribeCdbProxyInfoResponse.class);
    }

    /**
     *This API is used to query the purchasable specifications of TencentDB instances in a region.
     * @param req DescribeCdbZoneConfigRequest
     * @return DescribeCdbZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdbZoneConfigResponse DescribeCdbZoneConfig(DescribeCdbZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdbZoneConfig", DescribeCdbZoneConfigResponse.class);
    }

    /**
     *This API is used to query the clone task list of a user instance.
     * @param req DescribeCloneListRequest
     * @return DescribeCloneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloneListResponse DescribeCloneList(DescribeCloneListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloneList", DescribeCloneListResponse.class);
    }

    /**
     *This API is used to query cloud database version attributes, including whether database encryption and database audit are supported, and other features.
     * @param req DescribeDBFeaturesRequest
     * @return DescribeDBFeaturesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBFeaturesResponse DescribeDBFeatures(DescribeDBFeaturesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBFeatures", DescribeDBFeaturesResponse.class);
    }

    /**
     *This API (DescribeDBImportRecords) is used to query the records of import tasks in a TencentDB instance.
     * @param req DescribeDBImportRecordsRequest
     * @return DescribeDBImportRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBImportRecordsResponse DescribeDBImportRecords(DescribeDBImportRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBImportRecords", DescribeDBImportRecordsResponse.class);
    }

    /**
     *This API (DescribeDBInstanceCharset) is used to query the character set and its name of a TencentDB instance.
     * @param req DescribeDBInstanceCharsetRequest
     * @return DescribeDBInstanceCharsetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceCharsetResponse DescribeDBInstanceCharset(DescribeDBInstanceCharsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceCharset", DescribeDBInstanceCharsetResponse.class);
    }

    /**
     *This API is used to query the configuration message of a cloud database instance, including sync mode and deployment mode.
     * @param req DescribeDBInstanceConfigRequest
     * @return DescribeDBInstanceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceConfigResponse DescribeDBInstanceConfig(DescribeDBInstanceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceConfig", DescribeDBInstanceConfigResponse.class);
    }

    /**
     *This API (DescribeDBInstanceGTID) is used to query whether GTID is activated for a TencentDB instance. Instances on or below version 5.5 are not supported.
     * @param req DescribeDBInstanceGTIDRequest
     * @return DescribeDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceGTIDResponse DescribeDBInstanceGTID(DescribeDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceGTID", DescribeDBInstanceGTIDResponse.class);
    }

    /**
     *This API is used to query the basic information of an instance, including instance ID, instance name, and whether encryption is enabled. Querying read-only instances is not supported.
     * @param req DescribeDBInstanceInfoRequest
     * @return DescribeDBInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInfoResponse DescribeDBInstanceInfo(DescribeDBInstanceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceInfo", DescribeDBInstanceInfoResponse.class);
    }

    /**
     *This API is used to query the configuration of slow log and error log delivery to CLS for an instance. It filters out the present instance log delivery configuration to CLS by AppId, Region, and instance ID.
     * @param req DescribeDBInstanceLogToCLSRequest
     * @return DescribeDBInstanceLogToCLSResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceLogToCLSResponse DescribeDBInstanceLogToCLS(DescribeDBInstanceLogToCLSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceLogToCLS", DescribeDBInstanceLogToCLSResponse.class);
    }

    /**
     *This API is used to query the expected time required to restart a cloud database instance.
     * @param req DescribeDBInstanceRebootTimeRequest
     * @return DescribeDBInstanceRebootTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceRebootTimeResponse DescribeDBInstanceRebootTime(DescribeDBInstanceRebootTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceRebootTime", DescribeDBInstanceRebootTimeResponse.class);
    }

    /**
     *This API is used to query the list of TencentDB for MySQL instances. It supports filtering instances by conditions such as project ID, instance ID, access address, and instance status. It also supports querying the list of information about primary instances, disaster recovery instances, and read-only instances.
This API is used to return the availability zone (AZ) status during purchase, which does not change along with the proactive HA switch. If you want to know the AZ status in real time, query through the [DescribeDBInstanceConfig](https://www.tencentcloud.com/document/product/236/17491?from_cn_redirect=1) API.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *This API is used to query the price of purchasing or renewing a cloud database instance. It supports querying the price of pay-as-you-go or yearly/monthly subscription. You can input instance type, purchase period, purchase quantity, memory size, disk capacity and availability zone information to query instance price. You can input instance name to query instance renewal price.

Note: To request a price for a certain region, please use the access point of the corresponding region. For access point information, please refer to the <a href="https://www.tencentcloud.com/document/api/236/15832?from_cn_redirect=1">service address</a> document. For example, to request a price for the Guangzhou region, send the request to: cdb.ap-guangzhou.tencentcloudapi.com. Likewise, for the Shanghai region, send the request to: cdb.ap-shanghai.tencentcloudapi.com.
     * @param req DescribeDBPriceRequest
     * @return DescribeDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPriceResponse DescribeDBPrice(DescribeDBPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBPrice", DescribeDBPriceResponse.class);
    }

    /**
     *This API (DescribeDBSecurityGroups) is used to query the security group details of an instance.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API (DescribeDBSwitchRecords) is used to query the instance switch records.
     * @param req DescribeDBSwitchRecordsRequest
     * @return DescribeDBSwitchRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSwitchRecordsResponse DescribeDBSwitchRecords(DescribeDBSwitchRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSwitchRecords", DescribeDBSwitchRecordsResponse.class);
    }

    /**
     *This API is used to query the data backup overview of a user in the current region.
     * @param req DescribeDataBackupOverviewRequest
     * @return DescribeDataBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataBackupOverviewResponse DescribeDataBackupOverview(DescribeDataBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataBackupOverview", DescribeDataBackupOverviewResponse.class);
    }

    /**
     *This API is used to query the information of databases in a TencentDB instance which must be a source or disaster recovery instance.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *This API (DescribeDefaultParams) is used to query the list of default configurable parameters.
     * @param req DescribeDefaultParamsRequest
     * @return DescribeDefaultParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParamsResponse DescribeDefaultParams(DescribeDefaultParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultParams", DescribeDefaultParamsResponse.class);
    }

    /**
     *This API (DescribeDeviceMonitorInfo) is used to query the monitoring information of a TencentDB physical machine on the day. Currently, it only supports instances with 488 GB memory and 6 TB disk.
     * @param req DescribeDeviceMonitorInfoRequest
     * @return DescribeDeviceMonitorInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceMonitorInfoResponse DescribeDeviceMonitorInfo(DescribeDeviceMonitorInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceMonitorInfo", DescribeDeviceMonitorInfoResponse.class);
    }

    /**
     *This API is used to query the error logs of an instance over the past month by search criteria.
Note: the HTTP response packet will be very large if it contain a single large error log, which causes the API call to time out. If this happens, we recommend you lower the value of the input parameter `Limit` to reduce the packet size so that the API can respond timely.
     * @param req DescribeErrorLogDataRequest
     * @return DescribeErrorLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogDataResponse DescribeErrorLogData(DescribeErrorLogDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeErrorLogData", DescribeErrorLogDataResponse.class);
    }

    /**
     *This API is used to query event information of instance occurrence.
     * @param req DescribeInstanceAlarmEventsRequest
     * @return DescribeInstanceAlarmEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAlarmEventsResponse DescribeInstanceAlarmEvents(DescribeInstanceAlarmEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAlarmEvents", DescribeInstanceAlarmEventsResponse.class);
    }

    /**
     *This API (DescribeInstanceParamRecords) is used to query the parameter modification records of an instance.
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParamRecords", DescribeInstanceParamRecordsResponse.class);
    }

    /**
     *This API (DescribeInstanceParams) is used to query the list of parameters for an instance.
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *This API is used to query the password complexity parameter list of the instance.
     * @param req DescribeInstancePasswordComplexityRequest
     * @return DescribeInstancePasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancePasswordComplexityResponse DescribeInstancePasswordComplexity(DescribeInstancePasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancePasswordComplexity", DescribeInstancePasswordComplexityResponse.class);
    }

    /**
     *This API is used to query the instance version upgrade validation task.
     * @param req DescribeInstanceUpgradeCheckJobRequest
     * @return DescribeInstanceUpgradeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUpgradeCheckJobResponse DescribeInstanceUpgradeCheckJob(DescribeInstanceUpgradeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUpgradeCheckJob", DescribeInstanceUpgradeCheckJobResponse.class);
    }

    /**
     *This API is used to query the upgrade type of a database instance.
     * @param req DescribeInstanceUpgradeTypeRequest
     * @return DescribeInstanceUpgradeTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUpgradeTypeResponse DescribeInstanceUpgradeType(DescribeInstanceUpgradeTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUpgradeType", DescribeInstanceUpgradeTypeResponse.class);
    }

    /**
     *This API is used to query the retention policy of local binlog of an instance.
     * @param req DescribeLocalBinlogConfigRequest
     * @return DescribeLocalBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalBinlogConfigResponse DescribeLocalBinlogConfig(DescribeLocalBinlogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLocalBinlogConfig", DescribeLocalBinlogConfigResponse.class);
    }

    /**
     *This API is used to query parameter template details.
Description: The parameter template is a common component, effective across all regions once configured. For api calls, Guangzhou or Singapore is available to configure region.
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplateInfo", DescribeParamTemplateInfoResponse.class);
    }

    /**
     *This API is used to query the parameter template list.
Description: The parameter template is a common component, effective across all regions once configured. For api calls, Guangzhou or Singapore is available to configure region.
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplates", DescribeParamTemplatesResponse.class);
    }

    /**
     *This API (DescribeProjectSecurityGroups) is used to query the security group details of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the proxy configuration.
     * @param req DescribeProxyCustomConfRequest
     * @return DescribeProxyCustomConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyCustomConfResponse DescribeProxyCustomConf(DescribeProxyCustomConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyCustomConf", DescribeProxyCustomConfResponse.class);
    }

    /**
     *This API is used to query instance support proxy version and parameters.
     * @param req DescribeProxySupportParamRequest
     * @return DescribeProxySupportParamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySupportParamResponse DescribeProxySupportParam(DescribeProxySupportParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySupportParam", DescribeProxySupportParamResponse.class);
    }

    /**
     *This API is used to query the configuration information of a remote TencentDB instance backup.
     * @param req DescribeRemoteBackupConfigRequest
     * @return DescribeRemoteBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRemoteBackupConfigResponse DescribeRemoteBackupConfig(DescribeRemoteBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRemoteBackupConfig", DescribeRemoteBackupConfigResponse.class);
    }

    /**
     *This API is used to query all RO groups of a cloud database instance.
     * @param req DescribeRoGroupsRequest
     * @return DescribeRoGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoGroupsResponse DescribeRoGroups(DescribeRoGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoGroups", DescribeRoGroupsResponse.class);
    }

    /**
     *This API is used to query the minimum specification of a read-only instance that can be purchased or upgraded to.
     * @param req DescribeRoMinScaleRequest
     * @return DescribeRoMinScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoMinScaleResponse DescribeRoMinScale(DescribeRoMinScaleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoMinScale", DescribeRoMinScaleResponse.class);
    }

    /**
     *This API (DescribeRollbackRangeTime) is used to query the time range available for instance rollback.
     * @param req DescribeRollbackRangeTimeRequest
     * @return DescribeRollbackRangeTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackRangeTimeResponse DescribeRollbackRangeTime(DescribeRollbackRangeTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackRangeTime", DescribeRollbackRangeTimeResponse.class);
    }

    /**
     *This API is used to query the rollback task detail of a cloud database instance.
     * @param req DescribeRollbackTaskDetailRequest
     * @return DescribeRollbackTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTaskDetailResponse DescribeRollbackTaskDetail(DescribeRollbackTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTaskDetail", DescribeRollbackTaskDetailResponse.class);
    }

    /**
     *This API is used to query SSL activation status. If SSL has been enabled, it will synchronously return the certificate download URL.
     * @param req DescribeSSLStatusRequest
     * @return DescribeSSLStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSLStatusResponse DescribeSSLStatus(DescribeSSLStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSSLStatus", DescribeSSLStatusResponse.class);
    }

    /**
     *This API is used to search for instance slow logs under usage conditions. Only allow viewing slow logs within one month.
During use, pay attention: a single slow log may be too large, causing the entire http request return content to be too large, furthermore leading to API timeout. Once timed out, narrow down the Limit parameter value when querying, thereby reducing the size and enabling the API to return content promptly.
     * @param req DescribeSlowLogDataRequest
     * @return DescribeSlowLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogDataResponse DescribeSlowLogData(DescribeSlowLogDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogData", DescribeSlowLogDataResponse.class);
    }

    /**
     *This API is used to obtain the slow query log of a cloud database instance.
Description: If the data volume is too large in a single query, it may lead to response timeout. We recommend shortening the query time range per request, such as one hour, to avoid timeout.
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *This API (DescribeSupportedPrivileges) is used to query the information of TencentDB account permissions, including global permissions, database permissions, table permissions, and column permissions.
     * @param req DescribeSupportedPrivilegesRequest
     * @return DescribeSupportedPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedPrivilegesResponse DescribeSupportedPrivileges(DescribeSupportedPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportedPrivileges", DescribeSupportedPrivilegesResponse.class);
    }

    /**
     *This API is used to query table column information of a designated database in a cloud database instance. It only supports primary instance and disaster recovery instance.
     * @param req DescribeTableColumnsRequest
     * @return DescribeTableColumnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableColumnsResponse DescribeTableColumns(DescribeTableColumnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableColumns", DescribeTableColumnsResponse.class);
    }

    /**
     *This API is used to query the information of database tables in a TencentDB instance. It only supports source or disaster recovery instances.
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *This API is used to access tag information of the instance for cloud databases.
     * @param req DescribeTagsOfInstanceIdsRequest
     * @return DescribeTagsOfInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsOfInstanceIdsResponse DescribeTagsOfInstanceIds(DescribeTagsOfInstanceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagsOfInstanceIds", DescribeTagsOfInstanceIdsResponse.class);
    }

    /**
     *This API (DescribeTasks) is used to query the list of tasks for a TencentDB instance.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *This API (DescribeTimeWindow) is used to query the maintenance time window of a TencentDB instance.
     * @param req DescribeTimeWindowRequest
     * @return DescribeTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeWindowResponse DescribeTimeWindow(DescribeTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimeWindow", DescribeTimeWindowResponse.class);
    }

    /**
     *This API is used to query the list of SQL files imported by users. The common request parameter `Region` must be `ap-shanghai`.
     * @param req DescribeUploadedFilesRequest
     * @return DescribeUploadedFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadedFilesResponse DescribeUploadedFiles(DescribeUploadedFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadedFiles", DescribeUploadedFilesResponse.class);
    }

    /**
     *This API (DisassociateSecurityGroups) is used to unbind security groups from instances in batches.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to isolate a cloud database instance. After an instance is isolated, you cannot access the database via IP and port. The isolated instance can be started in the recycle bin. If the instance is isolated due to arrears, please recharge as soon as possible.
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *This API (ModifyAccountDescription) is used to modify the remarks of a TencentDB instance account.
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *This API is used to modify the maximum number of available connections for a cloud database account.
     * @param req ModifyAccountMaxUserConnectionsRequest
     * @return ModifyAccountMaxUserConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountMaxUserConnectionsResponse ModifyAccountMaxUserConnections(ModifyAccountMaxUserConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountMaxUserConnections", ModifyAccountMaxUserConnectionsResponse.class);
    }

    /**
     *This API (ModifyAccountPassword) is used to modify the password of a TencentDB instance account.
     * @param req ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPasswordResponse ModifyAccountPassword(ModifyAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPassword", ModifyAccountPasswordResponse.class);
    }

    /**
     *This API is used to modify the permissions of a TencentDB instance account.

Note that when modifying account permissions, you need to pass in the full permission information of the account. You can [query the account permission information
](https://intl.cloud.tencent.com/document/api/236/17500?from_cn_redirect=1) first before modifying permissions.
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivileges", ModifyAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to modify the service configurations for a TencentDB audit policy, including the audit log retention period.
     * @param req ModifyAuditConfigRequest
     * @return ModifyAuditConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditConfigResponse ModifyAuditConfig(ModifyAuditConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditConfig", ModifyAuditConfigResponse.class);
    }

    /**
     *This API is used to modify audit rule templates.
     * @param req ModifyAuditRuleTemplatesRequest
     * @return ModifyAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditRuleTemplatesResponse ModifyAuditRuleTemplates(ModifyAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditRuleTemplates", ModifyAuditRuleTemplatesResponse.class);
    }

    /**
     *This API is used to modify the service configurations for a TencentDB instance, including the audit log retention period and the audit rules.
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditService", ModifyAuditServiceResponse.class);
    }

    /**
     *This API is used to modify the auto-renewal flag of a TencentDB instance.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to modify database backup configuration.
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupConfig", ModifyBackupConfigResponse.class);
    }

    /**
     *This API is used to modify the restrictions of downloading backups in a region. You can specify which types of networks (private, or both private and public), VPCs, and IPs to download backups.
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupDownloadRestriction", ModifyBackupDownloadRestrictionResponse.class);
    }

    /**
     *This API is used to set the encryption status of an instance backup.
     * @param req ModifyBackupEncryptionStatusRequest
     * @return ModifyBackupEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupEncryptionStatusResponse ModifyBackupEncryptionStatus(ModifyBackupEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupEncryptionStatus", ModifyBackupEncryptionStatusResponse.class);
    }

    /**
     *This API is used to modify the proxy address description.
     * @param req ModifyCdbProxyAddressDescRequest
     * @return ModifyCdbProxyAddressDescResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCdbProxyAddressDescResponse ModifyCdbProxyAddressDesc(ModifyCdbProxyAddressDescRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCdbProxyAddressDesc", ModifyCdbProxyAddressDescResponse.class);
    }

    /**
     *This API is used to modify the database proxy address VPC information.
     * @param req ModifyCdbProxyAddressVipAndVPortRequest
     * @return ModifyCdbProxyAddressVipAndVPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCdbProxyAddressVipAndVPortResponse ModifyCdbProxyAddressVipAndVPort(ModifyCdbProxyAddressVipAndVPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCdbProxyAddressVipAndVPort", ModifyCdbProxyAddressVipAndVPortResponse.class);
    }

    /**
     *This API is used to configure database proxy parameters.
     * @param req ModifyCdbProxyParamRequest
     * @return ModifyCdbProxyParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCdbProxyParamResponse ModifyCdbProxyParam(ModifyCdbProxyParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCdbProxyParam", ModifyCdbProxyParamResponse.class);
    }

    /**
     *This API is used to enable or disable the feature of sending CDB slow and error logs to CLS.
     * @param req ModifyDBInstanceLogToCLSRequest
     * @return ModifyDBInstanceLogToCLSResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceLogToCLSResponse ModifyDBInstanceLogToCLS(ModifyDBInstanceLogToCLSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceLogToCLS", ModifyDBInstanceLogToCLSResponse.class);
    }

    /**
     *This API is used to change the mode of a cloud database.
     * @param req ModifyDBInstanceModesRequest
     * @return ModifyDBInstanceModesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceModesResponse ModifyDBInstanceModes(ModifyDBInstanceModesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceModes", ModifyDBInstanceModesResponse.class);
    }

    /**
     *This API (ModifyDBInstanceName) is used to rename a TencentDB instance.
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
    }

    /**
     *This API (ModifyDBInstanceProject) is used to modify the project to which a TencentDB instance belongs.
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceProject", ModifyDBInstanceProjectResponse.class);
    }

    /**
     *This API (ModifyDBInstanceSecurityGroups) is used to modify the security groups bound to a TencentDB instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify the IP and port number of a cloud database instance. It can also perform basic network to VPC network and subnet change under VPC network.
     * @param req ModifyDBInstanceVipVportRequest
     * @return ModifyDBInstanceVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceVipVportResponse ModifyDBInstanceVipVport(ModifyDBInstanceVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceVipVport", ModifyDBInstanceVipVportResponse.class);
    }

    /**
     *This API (ModifyInstanceParam) is used to modify instance parameters.
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParam", ModifyInstanceParamResponse.class);
    }

    /**
     *This API is used to modify the password complexity of a cloud database instance.
     * @param req ModifyInstancePasswordComplexityRequest
     * @return ModifyInstancePasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePasswordComplexityResponse ModifyInstancePasswordComplexity(ModifyInstancePasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancePasswordComplexity", ModifyInstancePasswordComplexityResponse.class);
    }

    /**
     *This API (ModifyInstanceTag) is used to add, modify, or delete an instance tag.
     * @param req ModifyInstanceTagRequest
     * @return ModifyInstanceTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTagResponse ModifyInstanceTag(ModifyInstanceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceTag", ModifyInstanceTagResponse.class);
    }

    /**
     *This API is used to modify the local binlog retention policy of an instance.
     * @param req ModifyLocalBinlogConfigRequest
     * @return ModifyLocalBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLocalBinlogConfigResponse ModifyLocalBinlogConfig(ModifyLocalBinlogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLocalBinlogConfig", ModifyLocalBinlogConfigResponse.class);
    }

    /**
     *This API is used to modify the name or description of a placement group.
     * @param req ModifyNameOrDescByDpIdRequest
     * @return ModifyNameOrDescByDpIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNameOrDescByDpIdResponse ModifyNameOrDescByDpId(ModifyNameOrDescByDpIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNameOrDescByDpId", ModifyNameOrDescByDpIdResponse.class);
    }

    /**
     *This API is used to modify parameter templates.
Description: The parameter template is a common component, effective across all regions once configured. For api calls, Guangzhou or Singapore is available to configure region.
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParamTemplate", ModifyParamTemplateResponse.class);
    }

    /**
     *This API is used to modify the sync method of an instance.
Description: This API can be called only by an exclusive cluster. This API is about to go offline.
     * @param req ModifyProtectModeRequest
     * @return ModifyProtectModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectModeResponse ModifyProtectMode(ModifyProtectModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectMode", ModifyProtectModeResponse.class);
    }

    /**
     *This API is used to modify the configuration information of a remote TencentDB instance backup.
     * @param req ModifyRemoteBackupConfigRequest
     * @return ModifyRemoteBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRemoteBackupConfigResponse ModifyRemoteBackupConfig(ModifyRemoteBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRemoteBackupConfig", ModifyRemoteBackupConfigResponse.class);
    }

    /**
     *This API is used to update the information of a TencentDB RO group, such as configuring a read-only instance removal policy in case of excessive delay, setting read weights of read-only instances, and setting the replication delay.
     * @param req ModifyRoGroupInfoRequest
     * @return ModifyRoGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupInfoResponse ModifyRoGroupInfo(ModifyRoGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoGroupInfo", ModifyRoGroupInfoResponse.class);
    }

    /**
     *This API is used to modify the vip and vport of a Ro group.
     * @param req ModifyRoGroupVipVportRequest
     * @return ModifyRoGroupVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupVipVportResponse ModifyRoGroupVipVport(ModifyRoGroupVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoGroupVipVport", ModifyRoGroupVipVportResponse.class);
    }

    /**
     *This API (ModifyTimeWindow) is used to update the maintenance time window of a TencentDB instance.
     * @param req ModifyTimeWindowRequest
     * @return ModifyTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTimeWindowResponse ModifyTimeWindow(ModifyTimeWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTimeWindow", ModifyTimeWindowResponse.class);
    }

    /**
     *This api is used to deactivate cloud database instances in quarantined state now. The instance Status for row operations must be quarantined state, such as instances with Status value 5 queried through the query instance list api.

This API is used to perform asynchronous operation, and delays may occur when reclaiming partial resources. You can query by using the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) with specified instance InstanceId and status Status as [5,6,7]. Among them, 5 represents isolated, 6 represents offline, and 7 represents Offline. If the return instance is empty, all instance resources have been released.

Note that after the instance goes offline, relevant resources and data cannot be recovered. Proceed with caution.
     * @param req OfflineIsolatedInstancesRequest
     * @return OfflineIsolatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedInstancesResponse OfflineIsolatedInstances(OfflineIsolatedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineIsolatedInstances", OfflineIsolatedInstancesResponse.class);
    }

    /**
     *This API is used to activate audit service for CDB instance.
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAuditService", OpenAuditServiceResponse.class);
    }

    /**
     *This API is used to enable data storage encryption for instance and support users to specify custom keys.

Note that before enabling data storage encryption for instance, perform the following operations:

1. Perform instance initialization (https://www.tencentcloud.com/document/api/236/15873?from_cn_redirect=1).

2. Enable the KMS service (https://console.cloud.tencent.com/kms2).

3. Grant the cloud database (MySQL) permission to access the KMS key (https://console.cloud.tencent.com/cam/role). The role name is MySQL_QCSRole and the preset policy name is QcloudAccessForMySQLRole.
4. Closing is not allowed after encryption being enabled.

This API may take up to 10s, and the client may timeout. If the API call returns InternalError, please call [DescribeDBInstanceInfo](https://www.tencentcloud.com/document/product/236/44160?from_cn_redirect=1) to confirm whether backend encryption is successfully enabled. After calling, if the parameter Encryption is YES, it means activation is successful.
     * @param req OpenDBInstanceEncryptionRequest
     * @return OpenDBInstanceEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceEncryptionResponse OpenDBInstanceEncryption(OpenDBInstanceEncryptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenDBInstanceEncryption", OpenDBInstanceEncryptionResponse.class);
    }

    /**
     *This API (OpenDBInstanceGTID) is used to enable GTID for a TencentDB instance. Only instances on or above version 5.6 are supported.
     * @param req OpenDBInstanceGTIDRequest
     * @return OpenDBInstanceGTIDResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceGTIDResponse OpenDBInstanceGTID(OpenDBInstanceGTIDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenDBInstanceGTID", OpenDBInstanceGTIDResponse.class);
    }

    /**
     *This API is used to enable SSL connectivity function.
     * @param req OpenSSLRequest
     * @return OpenSSLResponse
     * @throws TencentCloudSDKException
     */
    public OpenSSLResponse OpenSSL(OpenSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenSSL", OpenSSLResponse.class);
    }

    /**
     *This API (OpenWanService) is used to enable public network access for an instance.

Note that before enabling public network access, you need to first [initialize the instance](https://intl.cloud.tencent.com/document/api/236/15873?from_cn_redirect=1).
     * @param req OpenWanServiceRequest
     * @return OpenWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanServiceResponse OpenWanService(OpenWanServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenWanService", OpenWanServiceResponse.class);
    }

    /**
     *This API is used to restore isolated cloud database instances. It is only used for de-isolating pay-as-you-go instances. For monthly subscription instances, please use RenewDBInstance.
     * @param req ReleaseIsolatedDBInstancesRequest
     * @return ReleaseIsolatedDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIsolatedDBInstancesResponse ReleaseIsolatedDBInstances(ReleaseIsolatedDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseIsolatedDBInstances", ReleaseIsolatedDBInstancesResponse.class);
    }

    /**
     *This API is used to rebalance the load on database proxy.
     * @param req ReloadBalanceProxyNodeRequest
     * @return ReloadBalanceProxyNodeResponse
     * @throws TencentCloudSDKException
     */
    public ReloadBalanceProxyNodeResponse ReloadBalanceProxyNode(ReloadBalanceProxyNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReloadBalanceProxyNode", ReloadBalanceProxyNodeResponse.class);
    }

    /**
     *This API is used to renew cloud database instances. It supports yearly/monthly subscription instances. Pay-as-you-go instances can be renewed as yearly/monthly subscription instances through this API.
     * @param req RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstanceResponse RenewDBInstance(RenewDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstance", RenewDBInstanceResponse.class);
    }

    /**
     *Manually refresh rotation passwords
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetPassword", ResetPasswordResponse.class);
    }

    /**
     *This API is used to reset the root account and initialize the account permissions.
     * @param req ResetRootAccountRequest
     * @return ResetRootAccountResponse
     * @throws TencentCloudSDKException
     */
    public ResetRootAccountResponse ResetRootAccount(ResetRootAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRootAccount", ResetRootAccountResponse.class);
    }

    /**
     *This API is used to restart cloud database instances.

Note:
This API supports performing a restart operation on primary instances, read-only instances, and disaster recovery instances.
2. The instance status must be normal and no other async tasks are in progress.
     * @param req RestartDBInstancesRequest
     * @return RestartDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstancesResponse RestartDBInstances(RestartDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstances", RestartDBInstancesResponse.class);
    }

    /**
     *This API (StartBatchRollback) is used to roll back the tables of a TencentDB instance in batches.
     * @param req StartBatchRollbackRequest
     * @return StartBatchRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StartBatchRollbackResponse StartBatchRollback(StartBatchRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBatchRollback", StartBatchRollbackResponse.class);
    }

    /**
     *This API is used to enable CPU Elastic Scaling, including one-time manual scale-out and automatic elastic scaling.
     * @param req StartCpuExpandRequest
     * @return StartCpuExpandResponse
     * @throws TencentCloudSDKException
     */
    public StartCpuExpandResponse StartCpuExpand(StartCpuExpandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCpuExpand", StartCpuExpandResponse.class);
    }

    /**
     *This API is used to enable RO replication and sync data from the primary instance.
     * @param req StartReplicationRequest
     * @return StartReplicationResponse
     * @throws TencentCloudSDKException
     */
    public StartReplicationResponse StartReplication(StartReplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartReplication", StartReplicationResponse.class);
    }

    /**
     *This API is used to disable elastic CPU expansion.
     * @param req StopCpuExpandRequest
     * @return StopCpuExpandResponse
     * @throws TencentCloudSDKException
     */
    public StopCpuExpandResponse StopCpuExpand(StopCpuExpandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCpuExpand", StopCpuExpandResponse.class);
    }

    /**
     *This API is used to terminate a data import task.
Description: Only incomplete import jobs support termination, and the executed SQL part is retained after termination.
     * @param req StopDBImportJobRequest
     * @return StopDBImportJobResponse
     * @throws TencentCloudSDKException
     */
    public StopDBImportJobResponse StopDBImportJob(StopDBImportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopDBImportJob", StopDBImportJobResponse.class);
    }

    /**
     *This API is used to stop RO replication and interrupt data sync from the primary instance.
     * @param req StopReplicationRequest
     * @return StopReplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopReplicationResponse StopReplication(StopReplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopReplication", StopReplicationResponse.class);
    }

    /**
     *This api is used to revoke an ongoing rollback task of an instance. The api response returns an Asynchronous Task ID. The revocation result can be queried through [DescribeAsyncRequestInfo](https://www.tencentcloud.com/document/api/236/20410?from_cn_redirect=1) for task execution.
     * @param req StopRollbackRequest
     * @return StopRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StopRollbackResponse StopRollback(StopRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRollback", StopRollbackResponse.class);
    }

    /**
     *This API is used to submit an instance version upgrade validation task.
     * @param req SubmitInstanceUpgradeCheckJobRequest
     * @return SubmitInstanceUpgradeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitInstanceUpgradeCheckJobResponse SubmitInstanceUpgradeCheckJob(SubmitInstanceUpgradeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitInstanceUpgradeCheckJob", SubmitInstanceUpgradeCheckJobResponse.class);
    }

    /**
     *This API is used to manually initiate an immediate switch after database proxy configuration modification or edition upgrade.
     * @param req SwitchCDBProxyRequest
     * @return SwitchCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public SwitchCDBProxyResponse SwitchCDBProxy(SwitchCDBProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchCDBProxy", SwitchCDBProxyResponse.class);
    }

    /**
     *This API is used for source-to-replica switch.
     * @param req SwitchDBInstanceMasterSlaveRequest
     * @return SwitchDBInstanceMasterSlaveResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstanceMasterSlaveResponse SwitchDBInstanceMasterSlave(SwitchDBInstanceMasterSlaveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDBInstanceMasterSlave", SwitchDBInstanceMasterSlaveResponse.class);
    }

    /**
     *This API is used to switch a cloud database disaster recovery instance to primary instance. Note that the request must be sent to the region where the disaster recovery instance is located.
     * @param req SwitchDrInstanceToMasterRequest
     * @return SwitchDrInstanceToMasterResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDrInstanceToMasterResponse SwitchDrInstanceToMaster(SwitchDrInstanceToMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDrInstanceToMaster", SwitchDrInstanceToMasterResponse.class);
    }

    /**
     *This API (SwitchForUpgrade) is used to switch to a new instance. You can initiate this process when the primary instance being upgraded is pending switch.
     * @param req SwitchForUpgradeRequest
     * @return SwitchForUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchForUpgradeResponse SwitchForUpgrade(SwitchForUpgradeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchForUpgrade", SwitchForUpgradeResponse.class);
    }

    /**
     *This API is used to upgrade the database proxy version.
     * @param req UpgradeCDBProxyVersionRequest
     * @return UpgradeCDBProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeCDBProxyVersionResponse UpgradeCDBProxyVersion(UpgradeCDBProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeCDBProxyVersion", UpgradeCDBProxyVersionResponse.class);
    }

    /**
     *This API is used to upgrade or downgrade the configuration of a cloud database instance. Supported instance types include primary instance, disaster recovery instance and read-only instance. If you need to migrate business, fill in the instance specification (CPU, memory), otherwise the system will use the minimum allowed specification by default.
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

    /**
     *This API is used to upgrade the version of a cloud database instance. Supported instance types include primary instance, disaster recovery instance, and read-only instance. Before upgrade, submit an upgrade check task via SubmitInstanceUpgradeCheckJob (https://www.tencentcloud.com/document/product/236/110468?from_cn_redirect=1).
     * @param req UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceEngineVersionResponse UpgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceEngineVersion", UpgradeDBInstanceEngineVersionResponse.class);
    }

}
