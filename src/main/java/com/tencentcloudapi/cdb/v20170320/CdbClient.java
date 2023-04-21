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
    private static String service = "cdb";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddTimeWindowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddTimeWindow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to aggregate the audit logs filtered by different conditions and aggregate the statistics of the specified data rows.
     * @param req AnalyzeAuditLogsRequest
     * @return AnalyzeAuditLogsResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeAuditLogsResponse AnalyzeAuditLogs(AnalyzeAuditLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AnalyzeAuditLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AnalyzeAuditLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AnalyzeAuditLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BalanceRoGroupLoadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BalanceRoGroupLoad");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable database proxy.
     * @param req CloseCDBProxyRequest
     * @return CloseCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public CloseCDBProxyResponse CloseCDBProxy(CloseCDBProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseCDBProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseCDBProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseCDBProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseWanServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseWanService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a TencentDB account. The account name, host address, and password are required. Account remarks and maximum connections can also be configured.
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an audit policy for a TencentDB instance by associating an audit rule with the TencentDB instance.
     * @param req CreateAuditPolicyRequest
     * @return CreateAuditPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditPolicyResponse CreateAuditPolicy(CreateAuditPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAuditPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuditPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAuditPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *This API is used to create a clone of a specific instance, and roll back the clone by using a physical backup file of the instance or roll back the clone to a point in time.
     * @param req CreateCloneInstanceRequest
     * @return CreateCloneInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloneInstanceResponse CreateCloneInstance(CreateCloneInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloneInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloneInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloneInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBImportJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBImportJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a monthly subscribed TencentDB instance (which can be a source, disaster recovery, or read-only instance) by passing in information such as instance specifications, MySQL version number, purchased duration, and quantity.

This is an asynchronous API. You can also use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance details. If the output parameter `Status` is `1` and the output parameter `TaskStatus` is `0`, the instance has been successfully delivered.

1. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the purchasable instance specifications, and then use the [DescribeDBPrice](https://intl.cloud.tencent.com/document/api/236/18566?from_cn_redirect=1) API to query the prices of the purchasable instances.
2. You can create up to 100 instances at a time, with an instance validity period of up to 36 months.
3. MySQL v5.5, v5.6, v5.7, and v8.0 are supported.
4. Source instances, read-only instances, and disaster recovery instances can be created.
5. If `Port`, `ParamList`, or `Password` is specified in the input parameters, the instance (excluding basic instances) will be initialized.
6. If `Port`, `ParamTemplateId`, or `AlarmPolicyList` is specified in the input parameters, you need to update your SDK to the latest version.
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a pay-as-you-go TencentDB instance (which can be a source, disaster recovery, or read-only instance) by passing in information such as instance specifications, MySQL version number, and quantity.

This is an async API. You can also use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the instance details. If the `Status` value of an instance is `1` and `TaskStatus` is `0`, the instance has been successfully delivered.

1. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/api/236/17229?from_cn_redirect=1) API to query the purchasable instance specifications, and then use the [DescribeDBPrice](https://intl.cloud.tencent.com/document/api/236/18566?from_cn_redirect=1) API to query the prices of the purchasable instances.
2. You can create up to 100 instances at a time, with an instance validity period of up to 36 months.
3. MySQL 5.5, 5.6, 5.7, and 8.0 are supported.
4. Source instances, disaster recovery instances, and read-only instances can be created.
5. If `Port`, `ParamList`, or `Password` is specified in the input parameters, the instance will be initialized.
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceHourResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceHourResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstanceHour");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a parameter template. The common request parameter `Region` can only be set to `ap-guangzhou`.
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateParamTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateParamTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateParamTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoInstanceIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoInstanceIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a parameter template. The common request parameter `Region` can only be set to `ap-guangzhou`.
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteParamTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteParamTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteParamTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTimeWindowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTimeWindow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query information of all TencentDB accounts.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncRequestInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncRequestInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the audit policies of a TencentDB instance.
     * @param req DescribeAuditPoliciesRequest
     * @return DescribeAuditPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditPoliciesResponse DescribeAuditPolicies(DescribeAuditPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuditPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the audit rules in the current region.
     * @param req DescribeAuditRulesRequest
     * @return DescribeAuditRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRulesResponse DescribeAuditRules(DescribeAuditRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuditRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the restrictions of downloading backups in a region.
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDownloadRestrictionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDownloadRestrictionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupDownloadRestriction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the default encryption status of an instance backup.
     * @param req DescribeBackupEncryptionStatusRequest
     * @return DescribeBackupEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupEncryptionStatusResponse DescribeBackupEncryptionStatus(DescribeBackupEncryptionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupEncryptionStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupEncryptionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupEncryptionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupSummariesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupSummaries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogBackupOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBinlogBackupOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBinlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口已经废弃，请使用+DescribeCdbProxyInfo+进行替换。

This API is used to query database proxy. It will be deprecated and replaced by the `QueryCDBProxy` API.
     * @param req DescribeCDBProxyRequest
     * @return DescribeCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCDBProxyResponse DescribeCDBProxy(DescribeCDBProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCDBProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCDBProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCDBProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchasable specifications of TencentDB instances in a region.
     * @param req DescribeCdbZoneConfigRequest
     * @return DescribeCdbZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdbZoneConfigResponse DescribeCdbZoneConfig(DescribeCdbZoneConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdbZoneConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdbZoneConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCdbZoneConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the clone task list of an instance.
     * @param req DescribeCloneListRequest
     * @return DescribeCloneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloneListResponse DescribeCloneList(DescribeCloneListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloneListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloneListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloneList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query database version attributes, including supported features such as database encryption and audit.
     * @param req DescribeDBFeaturesRequest
     * @return DescribeDBFeaturesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBFeaturesResponse DescribeDBFeatures(DescribeDBFeaturesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBFeaturesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBFeaturesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBFeatures");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBImportRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBImportRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceCharsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceCharset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceGTIDResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceGTID");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceRebootTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceRebootTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchase or renewal price of a pay-as-you-go or monthly subscribed TencentDB instance by passing in information such as instance type, purchase duration, number of instances to purchase, memory size, disk size, and AZ. For the price of instance renewal, you can pass in instance name to query.

Note: To query prices in a specific region, you need to use the access point of the region. For more information on access points, see <a href="https://www.tencentcloud.com/document/product/236/15832">Service Address</a>. For example, to query prices in Guangzhou, send a request to: cdb.ap-guangzhou.tencentcloudapi.com. Likewise, to query prices in Shanghai, send a request to: cdb.ap-shanghai.tencentcloudapi.com.
     * @param req DescribeDBPriceRequest
     * @return DescribeDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBPriceResponse DescribeDBPrice(DescribeDBPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBPriceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSwitchRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSwitchRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataBackupOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataBackupOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of databases in a TencentDB instance which must be a source or disaster recovery instance.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultParamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultParams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceMonitorInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceMonitorInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the error logs of an instance over the past month by search criteria.
Note: the HTTP response packet will be very large if it contain a single large error log, which causes the API call to time out. If this happens, we recommend you lower the value of the input parameter `Limit` to reduce the packet size so that the API can respond timely.
     * @param req DescribeErrorLogDataRequest
     * @return DescribeErrorLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogDataResponse DescribeErrorLogData(DescribeErrorLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeErrorLogDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeErrorLogDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeErrorLogData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceParamRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceParamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceParams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the retention policy of local binlog of an instance.
     * @param req DescribeLocalBinlogConfigRequest
     * @return DescribeLocalBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalBinlogConfigResponse DescribeLocalBinlogConfig(DescribeLocalBinlogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLocalBinlogConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLocalBinlogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLocalBinlogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query parameter template details. The common request parameter `Region` can only be set to `ap-guangzhou`.
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplateInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplateInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParamTemplateInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the parameter template list. The common request parameter `Region` can only be set to `ap-guangzhou`.
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParamTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当前接口已经废弃，请使用+DescribeCdbProxyInfo+替代。

This API is used to query the connection pool configuration of database proxy.
     * @param req DescribeProxyConnectionPoolConfRequest
     * @return DescribeProxyConnectionPoolConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyConnectionPoolConfResponse DescribeProxyConnectionPoolConf(DescribeProxyConnectionPoolConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyConnectionPoolConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyConnectionPoolConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyConnectionPoolConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the proxy configuration.
     * @param req DescribeProxyCustomConfRequest
     * @return DescribeProxyCustomConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyCustomConfResponse DescribeProxyCustomConf(DescribeProxyCustomConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyCustomConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyCustomConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyCustomConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the configuration information of a remote TencentDB instance backup.
     * @param req DescribeRemoteBackupConfigRequest
     * @return DescribeRemoteBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRemoteBackupConfigResponse DescribeRemoteBackupConfig(DescribeRemoteBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRemoteBackupConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRemoteBackupConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRemoteBackupConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoMinScaleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoMinScale");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackRangeTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRollbackRangeTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRollbackTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the slow logs of an instance over the past month by search criteria.
Note: the HTTP response packet will be very large if it contain a single large slow log, which causes the API call to time out. If this happens, we recommend you lower the value of the input parameter `Limit` to reduce the packet size so that the API can respond timely.
     * @param req DescribeSlowLogDataRequest
     * @return DescribeSlowLogDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogDataResponse DescribeSlowLogData(DescribeSlowLogDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupportedPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSupportedPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of database tables in a TencentDB instance. It only supports source or disaster recovery instances.
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
     *This API (DescribeTagsOfInstanceIds) is used to query the tag information of a TencentDB instance.
     * @param req DescribeTagsOfInstanceIdsRequest
     * @return DescribeTagsOfInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsOfInstanceIdsResponse DescribeTagsOfInstanceIds(DescribeTagsOfInstanceIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsOfInstanceIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsOfInstanceIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagsOfInstanceIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *This API (DescribeTimeWindow) is used to query the maintenance time window of a TencentDB instance.
     * @param req DescribeTimeWindowRequest
     * @return DescribeTimeWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimeWindowResponse DescribeTimeWindow(DescribeTimeWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimeWindowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimeWindowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimeWindow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of SQL files imported by users. The common request parameter `Region` must be `ap-shanghai`.
     * @param req DescribeUploadedFilesRequest
     * @return DescribeUploadedFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadedFilesResponse DescribeUploadedFiles(DescribeUploadedFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUploadedFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUploadedFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUploadedFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再维护，参考CreateDBInstance+API文档，在发货时即可完成初始化。

This API was disused. You can refer to the CreateDBInstance API, and initialize the instance when creating it.

This API is used to initialize a TencentDB instance, including initial password, default character set, and instance port number. But it is disused and not recommended. You can now set the instance information by using the parameter `Password`, `ParamList`, and `Port` respectively in the `CreateDBInstance` and `CreateDBInstanceHour` APIs.
     * @param req InitDBInstancesRequest
     * @return InitDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDBInstancesResponse InitDBInstances(InitDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the maximum connections of one or more TencentDB instance accounts.
     * @param req ModifyAccountMaxUserConnectionsRequest
     * @return ModifyAccountMaxUserConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountMaxUserConnectionsResponse ModifyAccountMaxUserConnections(ModifyAccountMaxUserConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountMaxUserConnectionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountMaxUserConnectionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountMaxUserConnections");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ModifyAccountPrivilegesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPrivilegesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountPrivileges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the restrictions of downloading backups in a region. You can specify which types of networks (private, or both private and public), VPCs, and IPs to download backups.
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupDownloadRestrictionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupDownloadRestrictionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupDownloadRestriction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the default encryption status of an instance backup. 
     * @param req ModifyBackupEncryptionStatusRequest
     * @return ModifyBackupEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupEncryptionStatusResponse ModifyBackupEncryptionStatus(ModifyBackupEncryptionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupEncryptionStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupEncryptionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupEncryptionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当前接口已经废弃，请使用+AdjustCdbProxyAddress+进行替代。

This API is used to configure the connection pool of database proxy. You can use the `DescribeProxyConnectionPoolConf` API to query the supported connection pool configurations.
     * @param req ModifyCDBProxyConnectionPoolRequest
     * @return ModifyCDBProxyConnectionPoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCDBProxyConnectionPoolResponse ModifyCDBProxyConnectionPool(ModifyCDBProxyConnectionPoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCDBProxyConnectionPoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCDBProxyConnectionPoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCDBProxyConnectionPool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当前接口已经废弃，请使用+ModifyCdbProxyAddressDesc+进行替代。

This API is used to modify the description of database proxy.
     * @param req ModifyCDBProxyDescRequest
     * @return ModifyCDBProxyDescResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCDBProxyDescResponse ModifyCDBProxyDesc(ModifyCDBProxyDescRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCDBProxyDescResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCDBProxyDescResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCDBProxyDesc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当前接口已经废弃，请使用+ModifyCdbProxyAddressVipAndVPort+进行替代。

This API is used to modify the VIP or port of database proxy.
     * @param req ModifyCDBProxyVipVPortRequest
     * @return ModifyCDBProxyVipVPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCDBProxyVipVPortResponse ModifyCDBProxyVipVPort(ModifyCDBProxyVipVPortRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCDBProxyVipVPortResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCDBProxyVipVPortResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCDBProxyVipVPort");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the IP and port number of a TencentDB instance, switch from classic network to VPC, or change VPC subnets.
     * @param req ModifyDBInstanceVipVportRequest
     * @return ModifyDBInstanceVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceVipVportResponse ModifyDBInstanceVipVport(ModifyDBInstanceVipVportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceVipVportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceVipVportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceVipVport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceParamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceParam");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the password complexity of a TencentDB instance.
     * @param req ModifyInstancePasswordComplexityRequest
     * @return ModifyInstancePasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePasswordComplexityResponse ModifyInstancePasswordComplexity(ModifyInstancePasswordComplexityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancePasswordComplexityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancePasswordComplexityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancePasswordComplexity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the retention policy of local binlog of an instance.
     * @param req ModifyLocalBinlogConfigRequest
     * @return ModifyLocalBinlogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLocalBinlogConfigResponse ModifyLocalBinlogConfig(ModifyLocalBinlogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLocalBinlogConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLocalBinlogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLocalBinlogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNameOrDescByDpIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNameOrDescByDpId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a parameter template. The common request parameter `Region` can only be set to `ap-guangzhou`.
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyParamTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyParamTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyParamTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the configuration information of a remote TencentDB instance backup.
     * @param req ModifyRemoteBackupConfigRequest
     * @return ModifyRemoteBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRemoteBackupConfigResponse ModifyRemoteBackupConfig(ModifyRemoteBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRemoteBackupConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRemoteBackupConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRemoteBackupConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the information of a TencentDB RO group, such as configuring a read-only instance removal policy in case of excessive delay, setting read weights of read-only instances, and setting the replication delay.
     * @param req ModifyRoGroupInfoRequest
     * @return ModifyRoGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoGroupInfoResponse ModifyRoGroupInfo(ModifyRoGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoGroupInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRoGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTimeWindowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTimeWindow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (OfflineIsolatedInstances) is used to deactivate isolated TencentDB instances immediately. The instances must be in isolated status, i.e., their `Status` value is 5 in the return of the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1).

This is an asynchronous API. There may be a delay in repossessing some resources. You can query the details by using the [instance list querying API](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) and specifying the InstanceId and the `Status` value as [5, 6, 7]. If the returned instance is empty, then all its resources have been released.

Note that once an instance is deactivated, its resources and data will not be recoverable. Please do so with caution.
     * @param req OfflineIsolatedInstancesRequest
     * @return OfflineIsolatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedInstancesResponse OfflineIsolatedInstances(OfflineIsolatedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OfflineIsolatedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the audit service.
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenAuditServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenAuditServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenAuditService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the encryption feature for instance data storage, and custom keys are supported.

Note: Before enabling data storage encryption for an instance, you need to perform the following operations:

1. [Initialize an instance](https://intl.cloud.tencent.com/document/api/236/15873?from_cn_redirect=1).

2. Enable [KMS service](https://console.cloud.tencent.com/kms2)

3. [Grant permission to access KMS](https://console.cloud.tencent.com/cam/role) for TencentDB for MySQL. The role name is `MySQL_QCSRole`, and the preset policy name is `QcloudAccessForMySQLRole`.

This API calling may take up to 10 seconds, causing the client to time out. If it returns `InternalError`, call `DescribeDBInstanceInfo` to confirm whether the backend encryption is enabled successfully.
     * @param req OpenDBInstanceEncryptionRequest
     * @return OpenDBInstanceEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBInstanceEncryptionResponse OpenDBInstanceEncryption(OpenDBInstanceEncryptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenDBInstanceEncryptionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBInstanceEncryptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenDBInstanceEncryption");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBInstanceGTIDResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenDBInstanceGTID");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (OpenWanService) is used to enable public network access for an instance.

Note that before enabling public network access, you need to first [initialize the instance](https://intl.cloud.tencent.com/document/api/236/15873?from_cn_redirect=1).
     * @param req OpenWanServiceRequest
     * @return OpenWanServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanServiceResponse OpenWanService(OpenWanServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenWanServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenWanServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenWanService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当前接口已经废弃，请使用+DescribeCdbProxyInfo+进行替代。

This API is used to query the proxy details.
     * @param req QueryCDBProxyRequest
     * @return QueryCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public QueryCDBProxyResponse QueryCDBProxy(QueryCDBProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCDBProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCDBProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCDBProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseIsolatedDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseIsolatedDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rebalance the load on database proxy.
     * @param req ReloadBalanceProxyNodeRequest
     * @return ReloadBalanceProxyNodeResponse
     * @throws TencentCloudSDKException
     */
    public ReloadBalanceProxyNodeResponse ReloadBalanceProxyNode(ReloadBalanceProxyNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReloadBalanceProxyNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReloadBalanceProxyNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReloadBalanceProxyNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to renew a monthly subscribed TencentDB instance, and a pay-as-you-go instance can be renewed as a monthly subscribed one by this API.
     * @param req RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstanceResponse RenewDBInstance(RenewDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset the root account and initialize the account permissions.
     * @param req ResetRootAccountRequest
     * @return ResetRootAccountResponse
     * @throws TencentCloudSDKException
     */
    public ResetRootAccountResponse ResetRootAccount(ResetRootAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRootAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetRootAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetRootAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartBatchRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartBatchRollback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start the data replication from the source instance to the read-only instance.
     * @param req StartReplicationRequest
     * @return StartReplicationResponse
     * @throws TencentCloudSDKException
     */
    public StartReplicationResponse StartReplication(StartReplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartReplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartReplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartReplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopDBImportJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopDBImportJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop the data replication from the source instance to the read-only instance.
     * @param req StopReplicationRequest
     * @return StopReplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopReplicationResponse StopReplication(StopReplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopReplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopReplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopReplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to cancel a rollback task in progress, and returns an async task ID. You can use the `DescribeAsyncRequestInfo` API to query the result of cancellation.
     * @param req StopRollbackRequest
     * @return StopRollbackResponse
     * @throws TencentCloudSDKException
     */
    public StopRollbackResponse StopRollback(StopRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopRollbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopRollback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to switch database proxy after the proxy configuration is modified or the proxy version is upgraded.
     * @param req SwitchCDBProxyRequest
     * @return SwitchCDBProxyResponse
     * @throws TencentCloudSDKException
     */
    public SwitchCDBProxyResponse SwitchCDBProxy(SwitchCDBProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchCDBProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchCDBProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchCDBProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used for source-to-replica switch.
     * @param req SwitchDBInstanceMasterSlaveRequest
     * @return SwitchDBInstanceMasterSlaveResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstanceMasterSlaveResponse SwitchDBInstanceMasterSlave(SwitchDBInstanceMasterSlaveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDBInstanceMasterSlaveResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDBInstanceMasterSlaveResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDBInstanceMasterSlave");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to promote a disaster recovery instance to source instance. The request parameter `Region` must be the region of the disaster recovery instance.
     * @param req SwitchDrInstanceToMasterRequest
     * @return SwitchDrInstanceToMasterResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDrInstanceToMasterResponse SwitchDrInstanceToMaster(SwitchDrInstanceToMasterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDrInstanceToMasterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDrInstanceToMasterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDrInstanceToMaster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchForUpgradeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchForUpgrade");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade the version of database proxy.
     * @param req UpgradeCDBProxyVersionRequest
     * @return UpgradeCDBProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeCDBProxyVersionResponse UpgradeCDBProxyVersion(UpgradeCDBProxyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeCDBProxyVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeCDBProxyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeCDBProxyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceEngineVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeDBInstanceEngineVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
