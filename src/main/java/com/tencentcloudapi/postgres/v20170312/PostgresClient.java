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
package com.tencentcloudapi.postgres.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.postgres.v20170312.models.*;

public class PostgresClient extends AbstractClient{
    private static String endpoint = "postgres.tencentcloudapi.com";
    private static String service = "postgres";
    private static String version = "2017-03-12";

    public PostgresClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PostgresClient(Credential credential, String region, ClientProfile profile) {
        super(PostgresClient.endpoint, PostgresClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a read-only replica to an RO group.
     * @param req AddDBInstanceToReadOnlyGroupRequest
     * @return AddDBInstanceToReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddDBInstanceToReadOnlyGroupResponse AddDBInstanceToReadOnlyGroup(AddDBInstanceToReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDBInstanceToReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddDBInstanceToReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDBInstanceToReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to clone an instance by specifying a backup set or a point in time.
     * @param req CloneDBInstanceRequest
     * @return CloneDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CloneDBInstanceResponse CloneDBInstance(CloneDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloneDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloneDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloneDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable the public network link to an instance.
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable public network access for a PostgreSQL for Serverless instance.
     * @param req CloseServerlessDBExtranetAccessRequest
     * @return CloseServerlessDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseServerlessDBExtranetAccessResponse CloseServerlessDBExtranetAccess(CloseServerlessDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseServerlessDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseServerlessDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseServerlessDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a full backup of an instance.
     * @param req CreateBaseBackupRequest
     * @return CreateBaseBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaseBackupResponse CreateBaseBackup(CreateBaseBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBaseBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBaseBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBaseBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a network for an instance.
     * @param req CreateDBInstanceNetworkAccessRequest
     * @return CreateDBInstanceNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceNetworkAccessResponse CreateDBInstanceNetworkAccess(CreateDBInstanceNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceNetworkAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstanceNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create (but not initialize) one or more TencentDB for PostgreSQL instances.
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create and initialize one or more TencentDB for PostgreSQL instances.
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a parameter template.
     * @param req CreateParameterTemplateRequest
     * @return CreateParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParameterTemplateResponse CreateParameterTemplate(CreateParameterTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateParameterTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateParameterTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateParameterTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create read-only replicas.
     * @param req CreateReadOnlyDBInstanceRequest
     * @return CreateReadOnlyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyDBInstanceResponse CreateReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReadOnlyDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReadOnlyDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReadOnlyDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an RO group.
     * @param req CreateReadOnlyGroupRequest
     * @return CreateReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyGroupResponse CreateReadOnlyGroup(CreateReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a network for an RO group.
     * @param req CreateReadOnlyGroupNetworkAccessRequest
     * @return CreateReadOnlyGroupNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyGroupNetworkAccessResponse CreateReadOnlyGroupNetworkAccess(CreateReadOnlyGroupNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReadOnlyGroupNetworkAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReadOnlyGroupNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReadOnlyGroupNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a PostgreSQL for Serverless instance. If the creation succeeds, the instance ID will be returned.
     * @param req CreateServerlessDBInstanceRequest
     * @return CreateServerlessDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerlessDBInstanceResponse CreateServerlessDBInstance(CreateServerlessDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServerlessDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServerlessDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServerlessDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the specified full backup of an instance.
     * @param req DeleteBaseBackupRequest
     * @return DeleteBaseBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaseBackupResponse DeleteBaseBackup(DeleteBaseBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaseBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaseBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaseBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a network of an instance.
     * @param req DeleteDBInstanceNetworkAccessRequest
     * @return DeleteDBInstanceNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBInstanceNetworkAccessResponse DeleteDBInstanceNetworkAccess(DeleteDBInstanceNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDBInstanceNetworkAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDBInstanceNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDBInstanceNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the specified log backup of an instance.
     * @param req DeleteLogBackupRequest
     * @return DeleteLogBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogBackupResponse DeleteLogBackup(DeleteLogBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a parameter template.
     * @param req DeleteParameterTemplateRequest
     * @return DeleteParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParameterTemplateResponse DeleteParameterTemplate(DeleteParameterTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteParameterTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteParameterTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteParameterTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an RO group.
     * @param req DeleteReadOnlyGroupRequest
     * @return DeleteReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReadOnlyGroupResponse DeleteReadOnlyGroup(DeleteReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a network of an RO group.
     * @param req DeleteReadOnlyGroupNetworkAccessRequest
     * @return DeleteReadOnlyGroupNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReadOnlyGroupNetworkAccessResponse DeleteReadOnlyGroupNetworkAccess(DeleteReadOnlyGroupNetworkAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReadOnlyGroupNetworkAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReadOnlyGroupNetworkAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReadOnlyGroupNetworkAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a PostgreSQL for Serverless instance.
     * @param req DeleteServerlessDBInstanceRequest
     * @return DeleteServerlessDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessDBInstanceResponse DeleteServerlessDBInstance(DeleteServerlessDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServerlessDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServerlessDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServerlessDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the instance user list.
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
     *This API is used to query the available restoration time of an instance.
     * @param req DescribeAvailableRecoveryTimeRequest
     * @return DescribeAvailableRecoveryTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableRecoveryTimeResponse DescribeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableRecoveryTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableRecoveryTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableRecoveryTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the download URL of a backup.
     * @param req DescribeBackupDownloadURLRequest
     * @return DescribeBackupDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadURLResponse DescribeBackupDownloadURL(DescribeBackupDownloadURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDownloadURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDownloadURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupDownloadURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the backup overview. It will return the current number and size of backups, free backup space size, and paid backup space size (all size values are in bytes).
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
     *This API is used to query all backup plans of an instance.
     * @param req DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupPlansResponse DescribeBackupPlans(DescribeBackupPlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupPlansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupPlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupPlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the backup statistics of an instance. It will return the number and size (bytes) of backups of the instance.
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
     *This API is used to query the list of full backups.
     * @param req DescribeBaseBackupsRequest
     * @return DescribeBaseBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseBackupsResponse DescribeBaseBackups(DescribeBaseBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaseBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaseBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaseBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query purchasable instance specifications.
     * @param req DescribeClassesRequest
     * @return DescribeClassesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassesResponse DescribeClasses(DescribeClassesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClasses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the minimum specification required by a cloned instance, including `SpecCode` and disk specification.
     * @param req DescribeCloneDBInstanceSpecRequest
     * @return DescribeCloneDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloneDBInstanceSpecResponse DescribeCloneDBInstanceSpec(DescribeCloneDBInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloneDBInstanceSpecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloneDBInstanceSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloneDBInstanceSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the instance backup list.
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
     *This API is used to get error logs.
     * @param req DescribeDBErrlogsRequest
     * @return DescribeDBErrlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBErrlogsResponse DescribeDBErrlogs(DescribeDBErrlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBErrlogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBErrlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBErrlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of one instance.
     * @param req DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceAttributeResponse DescribeDBInstanceAttribute(DescribeDBInstanceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of modifiable parameters of an instance.
     * @param req DescribeDBInstanceParametersRequest
     * @return DescribeDBInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceParametersResponse DescribeDBInstanceParameters(DescribeDBInstanceParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceParametersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the security group information of an instance.
     * @param req DescribeDBInstanceSecurityGroupsRequest
     * @return DescribeDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceSecurityGroupsResponse DescribeDBInstanceSecurityGroups(DescribeDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of one or more instances.
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
     *This API was used to get slow query logs. Since it was deprecated on September 1, 2021, it has no longer returned data. Please use the [DescribeSlowQueryList](https://intl.cloud.tencent.com/document/product/409/60540?from_cn_redirect=1) API instead to get slow query logs.
     * @param req DescribeDBSlowlogsRequest
     * @return DescribeDBSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowlogsResponse DescribeDBSlowlogs(DescribeDBSlowlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSlowlogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSlowlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSlowlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of supported database versions.
     * @param req DescribeDBVersionsRequest
     * @return DescribeDBVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBVersionsResponse DescribeDBVersions(DescribeDBVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the instance Xlog list.
     * @param req DescribeDBXlogsRequest
     * @return DescribeDBXlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBXlogsResponse DescribeDBXlogs(DescribeDBXlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBXlogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBXlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBXlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pull the list of databases.
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
     *This API is used to query all parameters supported by a database version and engine.
     * @param req DescribeDefaultParametersRequest
     * @return DescribeDefaultParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParametersResponse DescribeDefaultParameters(DescribeDefaultParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultParametersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get instance key list.
     * @param req DescribeEncryptionKeysRequest
     * @return DescribeEncryptionKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEncryptionKeysResponse DescribeEncryptionKeys(DescribeEncryptionKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEncryptionKeysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEncryptionKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEncryptionKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of log backups.
     * @param req DescribeLogBackupsRequest
     * @return DescribeLogBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogBackupsResponse DescribeLogBackups(DescribeLogBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get order information.
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a parameter template, including basic information and parameter information.
     * @param req DescribeParameterTemplateAttributesRequest
     * @return DescribeParameterTemplateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParameterTemplateAttributesResponse DescribeParameterTemplateAttributes(DescribeParameterTemplateAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParameterTemplateAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParameterTemplateAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParameterTemplateAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of parameter templates.
     * @param req DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParameterTemplatesResponse DescribeParameterTemplates(DescribeParameterTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParameterTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParameterTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParameterTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the details of parameter modification events.
     * @param req DescribeParamsEventRequest
     * @return DescribeParamsEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamsEventResponse DescribeParamsEvent(DescribeParamsEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamsEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamsEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParamsEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchasable specification configuration.
     * @param req DescribeProductConfigRequest
     * @return DescribeProductConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductConfigResponse DescribeProductConfig(DescribeProductConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query RO group information by specifying the primary instance IDs.
     * @param req DescribeReadOnlyGroupsRequest
     * @return DescribeReadOnlyGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupsResponse DescribeReadOnlyGroups(DescribeReadOnlyGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReadOnlyGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReadOnlyGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReadOnlyGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchasable regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of one or more PostgreSQL for Serverless instances.
     * @param req DescribeServerlessDBInstancesRequest
     * @return DescribeServerlessDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessDBInstancesResponse DescribeServerlessDBInstances(DescribeServerlessDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServerlessDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerlessDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServerlessDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to count and analyze slow query statements during the specified period of time and return aggregated statistical analysis results which are classified by statement with abstract parameter values.
     * @param req DescribeSlowQueryAnalysisRequest
     * @return DescribeSlowQueryAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryAnalysisResponse DescribeSlowQueryAnalysis(DescribeSlowQueryAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowQueryAnalysisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowQueryAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowQueryAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the slow queries during the specified period of time.
     * @param req DescribeSlowQueryListRequest
     * @return DescribeSlowQueryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryListResponse DescribeSlowQueryList(DescribeSlowQueryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowQueryListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowQueryListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowQueryList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the supported AZs.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate an isolated instance by specifying the `DBInstanceId` parameter. The data of an terminated instance will be deleted and cannot be recovered.
     * @param req DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBInstanceResponse DestroyDBInstance(DestroyDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove one or more instances from isolation.
     * @param req DisIsolateDBInstancesRequest
     * @return DisIsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DisIsolateDBInstancesResponse DisIsolateDBInstances(DisIsolateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisIsolateDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisIsolateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisIsolateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to initialize a TencentDB for PostgreSQL instance.
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
     *This API is used to query the purchase price of one or multiple instances.
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the renewal price of an instance.
     * @param req InquiryPriceRenewDBInstanceRequest
     * @return InquiryPriceRenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewDBInstanceResponse InquiryPriceRenewDBInstance(InquiryPriceRenewDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRenewDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the fees of upgrading a specified database instance. Only pay-as-you-go instance is supported.
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceUpgradeDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate one or more instances.
     * @param req IsolateDBInstancesRequest
     * @return IsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstancesResponse IsolateDBInstances(IsolateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify account remarks.
     * @param req ModifyAccountRemarkRequest
     * @return ModifyAccountRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountRemarkResponse ModifyAccountRemark(ModifyAccountRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the backup plan of an instance, such as modifying the backup start time. By default, a full backup starts at midnight every day and the generated backup files will be retained for seven days.
     * @param req ModifyBackupPlanRequest
     * @return ModifyBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupPlanResponse ModifyBackupPlan(ModifyBackupPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the expiration time of the specified full backup of an instance.
     * @param req ModifyBaseBackupExpireTimeRequest
     * @return ModifyBaseBackupExpireTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaseBackupExpireTimeResponse ModifyBaseBackupExpireTime(ModifyBaseBackupExpireTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaseBackupExpireTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaseBackupExpireTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaseBackupExpireTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the AZs where the nodes of a source instance reside.
     * @param req ModifyDBInstanceDeploymentRequest
     * @return ModifyDBInstanceDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceDeploymentResponse ModifyDBInstanceDeployment(ModifyDBInstanceDeploymentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceDeploymentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceDeploymentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceDeployment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a TencentDB for PostgreSQL instance.
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
     *This API is used to modify parameters in batches.
     * @param req ModifyDBInstanceParametersRequest
     * @return ModifyDBInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceParametersResponse ModifyDBInstanceParameters(ModifyDBInstanceParametersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceParametersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceParametersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceParameters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the RO group of an instance.
     * @param req ModifyDBInstanceReadOnlyGroupRequest
     * @return ModifyDBInstanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceReadOnlyGroupResponse ModifyDBInstanceReadOnlyGroup(ModifyDBInstanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the security group of an instance.
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
     *This API is used to modify instance specifications including memory and disk size.
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
     *This API is used to transfer an instance to another project.
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstancesProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstancesProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstancesProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the parameter template name and description, and add or delete parameter template parameters.
     * @param req ModifyParameterTemplateRequest
     * @return ModifyParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParameterTemplateResponse ModifyParameterTemplate(ModifyParameterTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyParameterTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyParameterTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyParameterTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify RO group configuration.
     * @param req ModifyReadOnlyGroupConfigRequest
     * @return ModifyReadOnlyGroupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReadOnlyGroupConfigResponse ModifyReadOnlyGroupConfig(ModifyReadOnlyGroupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyReadOnlyGroupConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyReadOnlyGroupConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyReadOnlyGroupConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to perform a primary-standby switch for an instance waiting for the switch after it is upgraded.
     * @param req ModifySwitchTimePeriodRequest
     * @return ModifySwitchTimePeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifySwitchTimePeriodResponse ModifySwitchTimePeriod(ModifySwitchTimePeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySwitchTimePeriodResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySwitchTimePeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySwitchTimePeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable public network access.
     * @param req OpenDBExtranetAccessRequest
     * @return OpenDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBExtranetAccessResponse OpenDBExtranetAccess(OpenDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable public network access for a PostgreSQL for Serverless instance.
     * @param req OpenServerlessDBExtranetAccessRequest
     * @return OpenServerlessDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenServerlessDBExtranetAccessResponse OpenServerlessDBExtranetAccess(OpenServerlessDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenServerlessDBExtranetAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenServerlessDBExtranetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenServerlessDBExtranetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rebalance the loads of read-only replicas in an RO group. Please note that connections to those read-only replicas will be interrupted transiently; therefore, you should ensure that your application can reconnect to the databases. This operation should be performed with caution.
     * @param req RebalanceReadOnlyGroupRequest
     * @return RebalanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RebalanceReadOnlyGroupResponse RebalanceReadOnlyGroup(RebalanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebalanceReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RebalanceReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RebalanceReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a read-only replica from an RO group.
     * @param req RemoveDBInstanceFromReadOnlyGroupRequest
     * @return RemoveDBInstanceFromReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveDBInstanceFromReadOnlyGroupResponse RemoveDBInstanceFromReadOnlyGroup(RemoveDBInstanceFromReadOnlyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveDBInstanceFromReadOnlyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveDBInstanceFromReadOnlyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveDBInstanceFromReadOnlyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to renew an instance.
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset the account password of an instance.
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAccountPasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAccountPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetAccountPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to restart an instance.
     * @param req RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstanceResponse RestartDBInstance(RestartDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDBInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set auto-renewal.
     * @param req SetAutoRenewFlagRequest
     * @return SetAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoRenewFlagResponse SetAutoRenewFlag(SetAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAutoRenewFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetAutoRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAutoRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade instance configurations.
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
     *This API is used to upgrade the kernel version of an instance.
     * @param req UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceKernelVersionResponse UpgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceKernelVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceKernelVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeDBInstanceKernelVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
