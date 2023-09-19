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
    private static String endpoint = "sqlserver.tencentcloudapi.com";
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
        JsonResponseModel<CloneDBResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloneDBResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloneDB");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable instance interconnection.
     * @param req CloseInterCommunicationRequest
     * @return CloseInterCommunicationResponse
     * @throws TencentCloudSDKException
     */
    public CloseInterCommunicationResponse CloseInterCommunication(CloseInterCommunicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseInterCommunicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseInterCommunicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseInterCommunication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an instance account.
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a backup.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to create a backup import task.
     * @param req CreateBackupMigrationRequest
     * @return CreateBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupMigrationResponse CreateBackupMigration(CreateBackupMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBackupMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBackupMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBackupMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a business intelligence service instance.
     * @param req CreateBusinessDBInstancesRequest
     * @return CreateBusinessDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateBusinessDBInstancesResponse CreateBusinessDBInstances(CreateBusinessDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBusinessDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBusinessDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBusinessDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a business intelligence service file.
     * @param req CreateBusinessIntelligenceFileRequest
     * @return CreateBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateBusinessIntelligenceFileResponse CreateBusinessIntelligenceFile(CreateBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBusinessIntelligenceFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBusinessIntelligenceFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBusinessIntelligenceFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a high-availability instance of cloud disk edition.
     * @param req CreateCloudDBInstancesRequest
     * @return CreateCloudDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudDBInstancesResponse CreateCloudDBInstances(CreateCloudDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a read-only replica instance of cloud disk edition.
     * @param req CreateCloudReadOnlyDBInstancesRequest
     * @return CreateCloudReadOnlyDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudReadOnlyDBInstancesResponse CreateCloudReadOnlyDBInstances(CreateCloudReadOnlyDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudReadOnlyDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudReadOnlyDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudReadOnlyDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a database.
     * @param req CreateDBRequest
     * @return CreateDBResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBResponse CreateDB(CreateDBRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDB");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an instance.
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to create an incremental backup import task.
     * @param req CreateIncrementalMigrationRequest
     * @return CreateIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncrementalMigrationResponse CreateIncrementalMigration(CreateIncrementalMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIncrementalMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIncrementalMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIncrementalMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a migration task.
     * @param req CreateMigrationRequest
     * @return CreateMigrationResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationResponse CreateMigration(CreateMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an instance account.
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a backup import task.
     * @param req DeleteBackupMigrationRequest
     * @return DeleteBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupMigrationResponse DeleteBackupMigration(DeleteBackupMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBackupMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBackupMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBackupMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a business intelligence service file.
     * @param req DeleteBusinessIntelligenceFileRequest
     * @return DeleteBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBusinessIntelligenceFileResponse DeleteBusinessIntelligenceFile(DeleteBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBusinessIntelligenceFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBusinessIntelligenceFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBusinessIntelligenceFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to drop a database.
     * @param req DeleteDBRequest
     * @return DeleteDBResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBResponse DeleteDB(DeleteDBRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDBResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDBResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDB");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an incremental backup import task.
     * @param req DeleteIncrementalMigrationRequest
     * @return DeleteIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIncrementalMigrationResponse DeleteIncrementalMigration(DeleteIncrementalMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIncrementalMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIncrementalMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIncrementalMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a migration task.
     * @param req DeleteMigrationRequest
     * @return DeleteMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrationResponse DeleteMigration(DeleteMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pull the list of instance accounts.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the commands of creating backups canonically.
     * @param req DescribeBackupCommandRequest
     * @return DescribeBackupCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupCommandResponse DescribeBackupCommand(DescribeBackupCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of an unarchived backup.
     * @param req DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupFilesResponse DescribeBackupFiles(DescribeBackupFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an incremental backup import task.
     * @param req DescribeBackupMigrationRequest
     * @return DescribeBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupMigrationResponse DescribeBackupMigration(DescribeBackupMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the size of uploaded backup files. It is valid if the backup file type is `COS_UPLOAD` (the file is stored in COS).
     * @param req DescribeBackupUploadSizeRequest
     * @return DescribeBackupUploadSizeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupUploadSizeResponse DescribeBackupUploadSize(DescribeBackupUploadSizeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupUploadSizeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupUploadSizeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupUploadSize");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of backups.
     * @param req DescribeBackupsRequest
     * @return DescribeBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupsResponse DescribeBackups(DescribeBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the files required by business intelligence service.
     * @param req DescribeBusinessIntelligenceFileRequest
     * @return DescribeBusinessIntelligenceFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBusinessIntelligenceFileResponse DescribeBusinessIntelligenceFile(DescribeBusinessIntelligenceFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBusinessIntelligenceFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBusinessIntelligenceFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBusinessIntelligenceFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the database character sets supported by an instance.
     * @param req DescribeDBCharsetsRequest
     * @return DescribeDBCharsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCharsetsResponse DescribeDBCharsets(DescribeDBCharsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBCharsetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBCharsetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBCharsets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of the interconnected instances.
     * @param req DescribeDBInstanceInterRequest
     * @return DescribeDBInstanceInterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceInterResponse DescribeDBInstanceInter(DescribeDBInstanceInterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstanceInterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceInterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstanceInter");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of instances.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the attributes of an instance.
     * @param req DescribeDBInstancesAttributeRequest
     * @return DescribeDBInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesAttributeResponse DescribeDBInstancesAttribute(DescribeDBInstancesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstancesAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstancesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBInstancesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of databases
     * @param req DescribeDBsRequest
     * @return DescribeDBsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBsResponse DescribeDBs(DescribeDBsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query database configurations. It does not return information of the accounts that have permissions to operate the database.
     * @param req DescribeDBsNormalRequest
     * @return DescribeDBsNormalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBsNormalResponse DescribeDBsNormal(DescribeDBsNormalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBsNormalResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBsNormalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBsNormal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query flow status.
     * @param req DescribeFlowStatusRequest
     * @return DescribeFlowStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowStatusResponse DescribeFlowStatus(DescribeFlowStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query an incremental backup import task.
     * @param req DescribeIncrementalMigrationRequest
     * @return DescribeIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementalMigrationResponse DescribeIncrementalMigration(DescribeIncrementalMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIncrementalMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIncrementalMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIncrementalMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the instance ID by the order number.
     * @param req DescribeInstanceByOrdersRequest
     * @return DescribeInstanceByOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceByOrdersResponse DescribeInstanceByOrders(DescribeInstanceByOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceByOrdersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceByOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceByOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the parameter modification records of an instance.
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamRecordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the parameter list of an instance.
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceParamsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query migration task details.
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of eligible migration tasks based on the entered criteria.
     * @param req DescribeMigrationsRequest
     * @return DescribeMigrationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationsResponse DescribeMigrations(DescribeMigrationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query order information.
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query purchasable specification configuration.
     * @param req DescribeProductConfigRequest
     * @return DescribeProductConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductConfigResponse DescribeProductConfig(DescribeProductConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query purchasable regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the time range available for instance rollback.
     * @param req DescribeRollbackTimeRequest
     * @return DescribeRollbackTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeResponse DescribeRollbackTime(DescribeRollbackTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRollbackTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get file information of slow query logs.
     * @param req DescribeSlowlogsRequest
     * @return DescribeSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowlogsResponse DescribeSlowlogs(DescribeSlowlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowlogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowlogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowlogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a backup upload permission.
     * @param req DescribeUploadBackupInfoRequest
     * @return DescribeUploadBackupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadBackupInfoResponse DescribeUploadBackupInfo(DescribeUploadBackupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUploadBackupInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUploadBackupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUploadBackupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of extended events.
     * @param req DescribeXEventsRequest
     * @return DescribeXEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeXEventsResponse DescribeXEvents(DescribeXEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeXEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeXEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeXEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query currently purchasable AZs.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the price of requested instances.
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the upgrade prices of a monthly subscribed instance
.
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to modify instance account permissions.
     * @param req ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegeResponse ModifyAccountPrivilege(ModifyAccountPrivilegeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountPrivilegeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountPrivilegeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountPrivilege");
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
        req.setSkipSign(false);
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
     *This API is used to modify a backup import task.
     * @param req ModifyBackupMigrationRequest
     * @return ModifyBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupMigrationResponse ModifyBackupMigration(ModifyBackupMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the backup policy.
     * @param req ModifyBackupStrategyRequest
     * @return ModifyBackupStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupStrategyResponse ModifyBackupStrategy(ModifyBackupStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to u200denable or disable TDE of a database.
     * @param req ModifyDBEncryptAttributesRequest
     * @return ModifyDBEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBEncryptAttributesResponse ModifyDBEncryptAttributes(ModifyDBEncryptAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBEncryptAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBEncryptAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBEncryptAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename an instance.
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to switch a running instance from a VPC to another.
     * @param req ModifyDBInstanceNetworkRequest
     * @return ModifyDBInstanceNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNetworkResponse ModifyDBInstanceNetwork(ModifyDBInstanceNetworkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceNetworkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceNetworkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBInstanceNetwork");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the project to which a database instance belongs.
     * @param req ModifyDBInstanceProjectRequest
     * @return ModifyDBInstanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceProjectResponse ModifyDBInstanceProject(ModifyDBInstanceProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to rename a database.
     * @param req ModifyDBNameRequest
     * @return ModifyDBNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBNameResponse ModifyDBName(ModifyDBNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify database remarks.
     * @param req ModifyDBRemarkRequest
     * @return ModifyDBRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBRemarkResponse ModifyDBRemark(ModifyDBRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBRemarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDBRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable the change data capture (CDC) feature.
     * @param req ModifyDatabaseCDCRequest
     * @return ModifyDatabaseCDCResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseCDCResponse ModifyDatabaseCDC(ModifyDatabaseCDCRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatabaseCDCResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatabaseCDCResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatabaseCDC");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable the change tracking (CT) feature.
     * @param req ModifyDatabaseCTRequest
     * @return ModifyDatabaseCTResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseCTResponse ModifyDatabaseCT(ModifyDatabaseCTRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatabaseCTResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatabaseCTResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatabaseCT");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to shrink database MDF files.
     * @param req ModifyDatabaseMdfRequest
     * @return ModifyDatabaseMdfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseMdfResponse ModifyDatabaseMdf(ModifyDatabaseMdfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatabaseMdfResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatabaseMdfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatabaseMdf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an incremental backup import task.
     * @param req ModifyIncrementalMigrationRequest
     * @return ModifyIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIncrementalMigrationResponse ModifyIncrementalMigration(ModifyIncrementalMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIncrementalMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIncrementalMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIncrementalMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable TDE of an instance.
     * @param req ModifyInstanceEncryptAttributesRequest
     * @return ModifyInstanceEncryptAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEncryptAttributesResponse ModifyInstanceEncryptAttributes(ModifyInstanceEncryptAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceEncryptAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceEncryptAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceEncryptAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ModifyInstanceParamResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to modify an existing migration task.
     * @param req ModifyMigrationRequest
     * @return ModifyMigrationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationResponse ModifyMigration(ModifyMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable instance interconnection, which can interconnect business intelligence services.
     * @param req OpenInterCommunicationRequest
     * @return OpenInterCommunicationResponse
     * @throws TencentCloudSDKException
     */
    public OpenInterCommunicationResponse OpenInterCommunication(OpenInterCommunicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenInterCommunicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenInterCommunicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenInterCommunication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return a deactivated SQL Server instance.
     * @param req RecycleDBInstanceRequest
     * @return RecycleDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RecycleDBInstanceResponse RecycleDBInstance(RecycleDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecycleDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RecycleDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecycleDBInstance");
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
        req.setSkipSign(false);
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
     *This API is used to restart a database instance.
     * @param req RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstanceResponse RestartDBInstance(RestartDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to roll back the database by backup set.
     * @param req RestoreInstanceRequest
     * @return RestoreInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestoreInstanceResponse RestoreInstance(RestoreInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestoreInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestoreInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestoreInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to roll back the instance by time point.
     * @param req RollbackInstanceRequest
     * @return RollbackInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RollbackInstanceResponse RollbackInstance(RollbackInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollbackInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollbackInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start running a migration task.
     * @param req RunMigrationRequest
     * @return RunMigrationResponse
     * @throws TencentCloudSDKException
     */
    public RunMigrationResponse RunMigration(RunMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a backup import task.
     * @param req StartBackupMigrationRequest
     * @return StartBackupMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StartBackupMigrationResponse StartBackupMigration(StartBackupMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartBackupMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartBackupMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartBackupMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start an incremental backup import task.
     * @param req StartIncrementalMigrationRequest
     * @return StartIncrementalMigrationResponse
     * @throws TencentCloudSDKException
     */
    public StartIncrementalMigrationResponse StartIncrementalMigration(StartIncrementalMigrationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartIncrementalMigrationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartIncrementalMigrationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartIncrementalMigration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start and stop an extended event.
     * @param req StartInstanceXEventRequest
     * @return StartInstanceXEventResponse
     * @throws TencentCloudSDKException
     */
    public StartInstanceXEventResponse StartInstanceXEvent(StartInstanceXEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartInstanceXEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartInstanceXEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartInstanceXEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate an instance to move it into a recycle bin.
     * @param req TerminateDBInstanceRequest
     * @return TerminateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstanceResponse TerminateDBInstance(TerminateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDBInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateDBInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade an instance.
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDBInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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

}
