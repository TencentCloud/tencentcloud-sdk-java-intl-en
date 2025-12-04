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
package com.tencentcloudapi.mongodb.v20190725;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mongodb.v20190725.models.*;

public class MongodbClient extends AbstractClient{
    private static String endpoint = "mongodb.intl.tencentcloudapi.com";
    private static String service = "mongodb";
    private static String version = "2019-07-25";

    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *This API is used to specify the project of a TencentDB for MongoDB instance.
     * @param req AssignProjectRequest
     * @return AssignProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssignProjectResponse AssignProject(AssignProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignProject", AssignProjectResponse.class);
    }

    /**
     *This API is used to customize an account to access the instance.
     * @param req CreateAccountUserRequest
     * @return CreateAccountUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountUserResponse CreateAccountUser(CreateAccountUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccountUser", CreateAccountUserResponse.class);
    }

    /**
     *This API is used to back up an instance.
     * @param req CreateBackupDBInstanceRequest
     * @return CreateBackupDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDBInstanceResponse CreateBackupDBInstance(CreateBackupDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupDBInstance", CreateBackupDBInstanceResponse.class);
    }

    /**
     *This API is used to create a backup download task.
     * @param req CreateBackupDownloadTaskRequest
     * @return CreateBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDownloadTaskResponse CreateBackupDownloadTask(CreateBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupDownloadTask", CreateBackupDownloadTaskResponse.class);
    }

    /**
     *This API is used to create a yearly/monthly subscription TencentDB for MongoDB instance. The [DescribeSpecInfo](https://www.tencentcloud.comom/document/product/240/35767?from_cn_redirect=1) API can be called to query and obtain the supported sales specifications.
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *This API is used to create a pay-as-you-go TencentDB for MongoDB instance.
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceHour", CreateDBInstanceHourResponse.class);
    }

    /**
     *This API is used to create a log download task.
     * @param req CreateLogDownloadTaskRequest
     * @return CreateLogDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogDownloadTaskResponse CreateLogDownloadTask(CreateLogDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogDownloadTask", CreateLogDownloadTaskResponse.class);
    }

    /**
     *This API is used to delete a custom account of an instance.
     * @param req DeleteAccountUserRequest
     * @return DeleteAccountUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountUserResponse DeleteAccountUser(DeleteAccountUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccountUser", DeleteAccountUserResponse.class);
    }

    /**
     *This API is used to delete a log download task.
     * @param req DeleteLogDownloadTaskRequest
     * @return DeleteLogDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogDownloadTaskResponse DeleteLogDownloadTask(DeleteLogDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogDownloadTask", DeleteLogDownloadTaskResponse.class);
    }

    /**
     *This API is used to query the asynchronous task status.
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *This API is used to query information about the backup download task.
     * @param req DescribeBackupDownloadTaskRequest
     * @return DescribeBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadTaskResponse DescribeBackupDownloadTask(DescribeBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadTask", DescribeBackupDownloadTaskResponse.class);
    }

    /**
     *This API is used to obtain the automatic backup configuration information of an instance.
     * @param req DescribeBackupRulesRequest
     * @return DescribeBackupRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupRulesResponse DescribeBackupRules(DescribeBackupRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupRules", DescribeBackupRulesResponse.class);
    }

    /**
     *This API is used to query the client connection information on an instance, including the IP address for connection and the number of connections.
     * @param req DescribeClientConnectionsRequest
     * @return DescribeClientConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientConnectionsResponse DescribeClientConnections(DescribeClientConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientConnections", DescribeClientConnectionsResponse.class);
    }

    /**
     *This API is used to query the operation currently being performed on a TencentDB for MongoDB instance.
     * @param req DescribeCurrentOpRequest
     * @return DescribeCurrentOpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentOpResponse DescribeCurrentOp(DescribeCurrentOpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentOp", DescribeCurrentOpResponse.class);
    }

    /**
     *This API is used to query the list of instance backups. Currently, only backups created in the last seven days can be queried.
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBBackups", DescribeDBBackupsResponse.class);
    }

    /**
     *This API is used to get order details of purchase, renewal, and specification adjustment of a MongoDB instance.
     * @param req DescribeDBInstanceDealRequest
     * @return DescribeDBInstanceDealResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDealResponse DescribeDBInstanceDeal(DescribeDBInstanceDealRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceDeal", DescribeDBInstanceDealResponse.class);
    }

    /**
     *This API is used to query the table information on a database.
     * @param req DescribeDBInstanceNamespaceRequest
     * @return DescribeDBInstanceNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceNamespaceResponse DescribeDBInstanceNamespace(DescribeDBInstanceNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceNamespace", DescribeDBInstanceNamespaceResponse.class);
    }

    /**
     *This API is used to query node attributes, such as the AZ, node name, address, role, status, delay between primary and secondary nodes, priority, voting right, and tags.
     * @param req DescribeDBInstanceNodePropertyRequest
     * @return DescribeDBInstanceNodePropertyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceNodePropertyResponse DescribeDBInstanceNodeProperty(DescribeDBInstanceNodePropertyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceNodeProperty", DescribeDBInstanceNodePropertyResponse.class);
    }

    /**
     *This API is used to query the list of TencentDB for MongoDB instances. It supports filtering primary instances, disaster recovery instances, and read-only instances by project ID, instance ID, instance status, and other conditions.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *This API is used to query slow log details of the instance.
     * @param req DescribeDetailedSlowLogsRequest
     * @return DescribeDetailedSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetailedSlowLogsResponse DescribeDetailedSlowLogs(DescribeDetailedSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDetailedSlowLogs", DescribeDetailedSlowLogsResponse.class);
    }

    /**
     *This API is used to query the list of parameters that can be modified for the current instance.
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *This API is used to view the enabling status of Secure Sockets Layer (SSL) for an instance.
     * @param req DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSSLResponse DescribeInstanceSSL(DescribeInstanceSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSSL", DescribeInstanceSSLResponse.class);
    }

    /**
     *This API is used to query a log download task.
     * @param req DescribeLogDownloadTasksRequest
     * @return DescribeLogDownloadTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDownloadTasksResponse DescribeLogDownloadTasks(DescribeLogDownloadTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogDownloadTasks", DescribeLogDownloadTasksResponse.class);
    }

    /**
     *This API is used to query running logs.
     * @param req DescribeMongodbLogsRequest
     * @return DescribeMongodbLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMongodbLogsResponse DescribeMongodbLogs(DescribeMongodbLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMongodbLogs", DescribeMongodbLogsResponse.class);
    }

    /**
     *This API is used to query security groups bound to an instance.
     * @param req DescribeSecurityGroupRequest
     * @return DescribeSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroup", DescribeSecurityGroupResponse.class);
    }

    /**
     *This API is used to get the slow log statistics of a database instance.
     * @param req DescribeSlowLogPatternsRequest
     * @return DescribeSlowLogPatternsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogPatternsResponse DescribeSlowLogPatterns(DescribeSlowLogPatternsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogPatterns", DescribeSlowLogPatternsResponse.class);
    }

    /**
     *This API is used to get the slow log information of a TencentDB instance. Only slow logs for the last 7 days can be queried.
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *This API is used to query the sales specification of an instance.
     * @param req DescribeSpecInfoRequest
     * @return DescribeSpecInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecInfoResponse DescribeSpecInfo(DescribeSpecInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecInfo", DescribeSpecInfoResponse.class);
    }

    /**
     *This API is used to enable the transparent data encryption (TDE) capability for TencentDB for MongoDB.
     * @param req EnableTransparentDataEncryptionRequest
     * @return EnableTransparentDataEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public EnableTransparentDataEncryptionResponse EnableTransparentDataEncryption(EnableTransparentDataEncryptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTransparentDataEncryption", EnableTransparentDataEncryptionResponse.class);
    }

    /**
     *This API is used to run the `FlushRouterConfig` command on all mongos instances.
     * @param req FlushInstanceRouterConfigRequest
     * @return FlushInstanceRouterConfigResponse
     * @throws TencentCloudSDKException
     */
    public FlushInstanceRouterConfigResponse FlushInstanceRouterConfig(FlushInstanceRouterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlushInstanceRouterConfig", FlushInstanceRouterConfigResponse.class);
    }

    /**
     *This API is used to query price of instance creation. The `region` parameter must be passed in this API, otherwise verification will fail. This API allows queries only for purchasable instance specifications.
     * @param req InquirePriceCreateDBInstancesRequest
     * @return InquirePriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDBInstancesResponse InquirePriceCreateDBInstances(InquirePriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateDBInstances", InquirePriceCreateDBInstancesResponse.class);
    }

    /**
     *This API is used to query the price of instance specification adjustment.
     * @param req InquirePriceModifyDBInstanceSpecRequest
     * @return InquirePriceModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDBInstanceSpecResponse InquirePriceModifyDBInstanceSpec(InquirePriceModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceModifyDBInstanceSpec", InquirePriceModifyDBInstanceSpecResponse.class);
    }

    /**
     *This API is used to query the renewal price of a monthly subscription instance.
     * @param req InquirePriceRenewDBInstancesRequest
     * @return InquirePriceRenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDBInstancesResponse InquirePriceRenewDBInstances(InquirePriceRenewDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewDBInstances", InquirePriceRenewDBInstancesResponse.class);
    }

    /**
     *This API is used to set the SSL status for an instance.
     * @param req InstanceEnableSSLRequest
     * @return InstanceEnableSSLResponse
     * @throws TencentCloudSDKException
     */
    public InstanceEnableSSLResponse InstanceEnableSSL(InstanceEnableSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstanceEnableSSL", InstanceEnableSSLResponse.class);
    }

    /**
     *This API is used to isolate a pay-as-you-go TencentDB for MongoDB instance. After isolation, the instance is retained in the recycle bin, and data cannot be written into it. After a certain period of isolation, the instance is deleted permanently. For the retention time in the recycle bin, see the pay-as-you-go service terms. The deleted pay-as-you-go instance cannot be recovered. Proceed with caution.
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *This API is used to terminate a specific operation performed on a TencentDB for MongoDB instance.
     * @param req KillOpsRequest
     * @return KillOpsResponse
     * @throws TencentCloudSDKException
     */
    public KillOpsResponse KillOps(KillOpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillOps", KillOpsResponse.class);
    }

    /**
     *This API is used to modify the network information on a TencentDB for MongoDB instance. It supports switching from a basic network to a VPC network or from one VPC network to another VPC network.
     * @param req ModifyDBInstanceNetworkAddressRequest
     * @return ModifyDBInstanceNetworkAddressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNetworkAddressResponse ModifyDBInstanceNetworkAddress(ModifyDBInstanceNetworkAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceNetworkAddress", ModifyDBInstanceNetworkAddressResponse.class);
    }

    /**
     *This API is used to modify security groups bound to an instance.
     * @param req ModifyDBInstanceSecurityGroupRequest
     * @return ModifyDBInstanceSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupResponse ModifyDBInstanceSecurityGroup(ModifyDBInstanceSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroup", ModifyDBInstanceSecurityGroupResponse.class);
    }

    /**
     *This API is used to adjust the TencentDB for MongoDB instance configuration. The [DescribeSpecInfo](https://www.tencentcloud.comom/document/product/240/38567?from_cn_redirect=1) API can be called to query and obtain the supported sales specifications.
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSpec", ModifyDBInstanceSpecResponse.class);
    }

    /**
     *This API is used to modify the parameter configuration of a TencentDB for MongoDB instance.
     * @param req ModifyInstanceParamsRequest
     * @return ModifyInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamsResponse ModifyInstanceParams(ModifyInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParams", ModifyInstanceParamsResponse.class);
    }

    /**
     *This API is used to deactivate isolated TencentDB instances immediately. The instances must be in isolated status.
     * @param req OfflineIsolatedDBInstanceRequest
     * @return OfflineIsolatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedDBInstanceResponse OfflineIsolatedDBInstance(OfflineIsolatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineIsolatedDBInstance", OfflineIsolatedDBInstanceResponse.class);
    }

    /**
     *This API is used to rename a TencentDB instance.
     * @param req RenameInstanceRequest
     * @return RenameInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenameInstanceResponse RenameInstance(RenameInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameInstance", RenameInstanceResponse.class);
    }

    /**
     *This API is used to renew a monthly subscription TencentDB instance. Only monthly subscription instances are supported, while pay-as-you-go instances do not need to be renewed.
     * @param req RenewDBInstancesRequest
     * @return RenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstancesResponse RenewDBInstances(RenewDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstances", RenewDBInstancesResponse.class);
    }

    /**
     *This API is used to reset the instance access password.
     * @param req ResetDBInstancePasswordRequest
     * @return ResetDBInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDBInstancePasswordResponse ResetDBInstancePassword(ResetDBInstancePasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDBInstancePassword", ResetDBInstancePasswordResponse.class);
    }

    /**
     *This API is used to set the account permissions of an instance.
     * @param req SetAccountUserPrivilegeRequest
     * @return SetAccountUserPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public SetAccountUserPrivilegeResponse SetAccountUserPrivilege(SetAccountUserPrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAccountUserPrivilege", SetAccountUserPrivilegeResponse.class);
    }

    /**
     *This API is used to set instance termination protection.
     * @param req SetDBInstanceDeletionProtectionRequest
     * @return SetDBInstanceDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetDBInstanceDeletionProtectionResponse SetDBInstanceDeletionProtection(SetDBInstanceDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetDBInstanceDeletionProtection", SetDBInstanceDeletionProtectionResponse.class);
    }

    /**
     *This API is used to set the instance maintenance window.
     * @param req SetInstanceMaintenanceRequest
     * @return SetInstanceMaintenanceResponse
     * @throws TencentCloudSDKException
     */
    public SetInstanceMaintenanceResponse SetInstanceMaintenance(SetInstanceMaintenanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetInstanceMaintenance", SetInstanceMaintenanceResponse.class);
    }

    /**
     *This API is used to terminate monthly subscription billing instances.
     * @param req TerminateDBInstancesRequest
     * @return TerminateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstancesResponse TerminateDBInstances(TerminateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDBInstances", TerminateDBInstancesResponse.class);
    }

    /**
     *This API is used to upgrade the kernel version of the database instance.
     * @param req UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceKernelVersionResponse UpgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceKernelVersion", UpgradeDBInstanceKernelVersionResponse.class);
    }

    /**
     *This API is used to upgrade the database kernel across versions. Currently, it is only supported to upgrade from version 3.6 to 4.0, 4.0 to 4.2, 4.2 to 4.4, and 4.4 to 5.0.
     * @param req UpgradeDbInstanceVersionRequest
     * @return UpgradeDbInstanceVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDbInstanceVersionResponse UpgradeDbInstanceVersion(UpgradeDbInstanceVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDbInstanceVersion", UpgradeDbInstanceVersionResponse.class);
    }

}
