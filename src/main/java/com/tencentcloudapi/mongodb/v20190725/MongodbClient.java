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
    private static String endpoint = "mongodb.tencentcloudapi.com";
    private static String service = "mongodb";
    private static String version = "2019-07-25";

    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *This API is used to specify the project to which a TencentDB instance belongs.

     * @param req AssignProjectRequest
     * @return AssignProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssignProjectResponse AssignProject(AssignProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create instance backups.
     * @param req CreateBackupDBInstanceRequest
     * @return CreateBackupDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDBInstanceResponse CreateBackupDBInstance(CreateBackupDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBackupDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a backup download task.
     * @param req CreateBackupDownloadTaskRequest
     * @return CreateBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDownloadTaskResponse CreateBackupDownloadTask(CreateBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupDownloadTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupDownloadTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBackupDownloadTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a monthly subscription TencentDB for MongoDB instance. The purchasable specifications supported by this API can be obtained through the `DescribeSpecInfo` API.
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
     *This API is used to create a pay-as-you-go TencentDB for MongoDB instance.
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
     *This API is used to query async task status.
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
     *备份下载功能已调整，此接口即将下线

TencentDB will soon stop supporting this API, as the backup download feature has been modified.

This API is used to get the permission to download a backup file. The detailed backup file information can be obtained through the `DescribeDBBackups` API.
     * @param req DescribeBackupAccessRequest
     * @return DescribeBackupAccessResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupAccessResponse DescribeBackupAccess(DescribeBackupAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query backup download task information.
     * @param req DescribeBackupDownloadTaskRequest
     * @return DescribeBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadTaskResponse DescribeBackupDownloadTask(DescribeBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDownloadTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDownloadTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupDownloadTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the client connection information of an instance, including the IP and number of connections. Currently, only instances of MongoDB 3.2 are supported.
     * @param req DescribeClientConnectionsRequest
     * @return DescribeClientConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientConnectionsResponse DescribeClientConnections(DescribeClientConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientConnectionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientConnectionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClientConnections");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of instance backups. Currently, only backups created in the last seven days can be queried.
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get details of purchase, renewal, and specification adjustment orders of a MongoDB instance.
     * @param req DescribeDBInstanceDealRequest
     * @return DescribeDBInstanceDealResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDealResponse DescribeDBInstanceDeal(DescribeDBInstanceDealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceDealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceDealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceDeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of TencentDB instances (which can be primary, disaster recovery, or read-only instances). It supports filtering instances by project ID, instance ID, and instance status.
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
     *This API is used to query the security groups associated with an instance.
     * @param req DescribeSecurityGroupRequest
     * @return DescribeSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the slow log statistics of a database instance.
     * @param req DescribeSlowLogPatternsRequest
     * @return DescribeSlowLogPatternsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogPatternsResponse DescribeSlowLogPatterns(DescribeSlowLogPatternsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogPatternsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogPatternsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogPatterns");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the slow log information of a TencentDB instance. Only slow logs for the last 7 days can be queried.
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
     *This API is used to query the purchasable instance specifications.
     * @param req DescribeSpecInfoRequest
     * @return DescribeSpecInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecInfoResponse DescribeSpecInfo(DescribeSpecInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpecInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpecInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpecInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to run the `FlushRouterConfig` command on all mongos instances.
     * @param req FlushInstanceRouterConfigRequest
     * @return FlushInstanceRouterConfigResponse
     * @throws TencentCloudSDKException
     */
    public FlushInstanceRouterConfigResponse FlushInstanceRouterConfig(FlushInstanceRouterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FlushInstanceRouterConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FlushInstanceRouterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FlushInstanceRouterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query price of instance creation. The `region` parameter must be passed in this API, otherwise verification will fail. This API allows queries only for purchasable instance specifications.
     * @param req InquirePriceCreateDBInstancesRequest
     * @return InquirePriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDBInstancesResponse InquirePriceCreateDBInstances(InquirePriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceCreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceCreateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceCreateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query price of instance specification adjustment.
     * @param req InquirePriceModifyDBInstanceSpecRequest
     * @return InquirePriceModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDBInstanceSpecResponse InquirePriceModifyDBInstanceSpec(InquirePriceModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceModifyDBInstanceSpecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceModifyDBInstanceSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceModifyDBInstanceSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the renewal price of a monthly subscription instance.
     * @param req InquirePriceRenewDBInstancesRequest
     * @return InquirePriceRenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDBInstancesResponse InquirePriceRenewDBInstances(InquirePriceRenewDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceRenewDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceRenewDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceRenewDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate a pay-as-you-go TencentDB for MongoDB instance. An isolated instance is retained in the recycle bin and data can no longer be written to it. After it is isolated for a certain period of time, it will be completely deleted. For the retention period in the recycle bin, please see the terms of service for pay-as-you-go billing. Isolated pay-as-you-go instances cannot be recovered, so please proceed with caution.
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
     *This API is used to adjust the specification configuration of a TencentDB for MongoDB. The purchasable specifications supported by the API can be obtained through the DescribeSpecInfo API.
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSpecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deactivate isolated TencentDB instances immediately. The instances must be in isolated status.
     * @param req OfflineIsolatedDBInstanceRequest
     * @return OfflineIsolatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedDBInstanceResponse OfflineIsolatedDBInstance(OfflineIsolatedDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OfflineIsolatedDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a TencentDB instance.
     * @param req RenameInstanceRequest
     * @return RenameInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenameInstanceResponse RenameInstance(RenameInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenameInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenameInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenameInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to renew a monthly subscription TencentDB instance. Only monthly subscription instances are supported, while pay-as-you-go instances do not need to be renewed.
     * @param req RenewDBInstancesRequest
     * @return RenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstancesResponse RenewDBInstances(RenewDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify instance password.
     * @param req ResetDBInstancePasswordRequest
     * @return ResetDBInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDBInstancePasswordResponse ResetDBInstancePassword(ResetDBInstancePasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetDBInstancePasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetDBInstancePasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetDBInstancePassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
