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
package com.tencentcloudapi.cynosdb.v20190107;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cynosdb.v20190107.models.*;

public class CynosdbClient extends AbstractClient{
    private static String endpoint = "cynosdb.tencentcloudapi.com";
    private static String service = "cynosdb";
    private static String version = "2019-01-07";
    
    public CynosdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CynosdbClient(Credential credential, String region, ClientProfile profile) {
        super(CynosdbClient.endpoint, CynosdbClient.version, credential, region, profile);
    }

    /**
     *This API is used to remove the isolation of an instance to make it accessible again.
     * @param req ActivateInstanceRequest
     * @return ActivateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ActivateInstanceResponse ActivateInstance(ActivateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActivateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ActivateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ActivateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add the replica AZ.
     * @param req AddClusterSlaveZoneRequest
     * @return AddClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterSlaveZoneResponse AddClusterSlaveZone(AddClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddClusterSlaveZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddClusterSlaveZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddClusterSlaveZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add an instance in a cluster.
     * @param req AddInstancesRequest
     * @return AddInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddInstancesResponse AddInstances(AddInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a resource pack to a cluster.
     * @param req BindClusterResourcePackagesRequest
     * @return BindClusterResourcePackagesResponse
     * @throws TencentCloudSDKException
     */
    public BindClusterResourcePackagesResponse BindClusterResourcePackages(BindClusterResourcePackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindClusterResourcePackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindClusterResourcePackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindClusterResourcePackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable the audit service for a TDSQL-C for MySQL instance.
     * @param req CloseAuditServiceRequest
     * @return CloseAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseAuditServiceResponse CloseAuditService(CloseAuditServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseAuditServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseAuditServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseAuditService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable the password complexity for a cluster.
     * @param req CloseClusterPasswordComplexityRequest
     * @return CloseClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public CloseClusterPasswordComplexityResponse CloseClusterPasswordComplexity(CloseClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseClusterPasswordComplexityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseClusterPasswordComplexityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseClusterPasswordComplexity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable u200dthe database proxy.
     * @param req CloseProxyRequest
     * @return CloseProxyResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyResponse CloseProxy(CloseProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProxyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable the public network.
     * @param req CloseWanRequest
     * @return CloseWanResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanResponse CloseWan(CloseWanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseWanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseWanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseWan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to replicate the password complexity for a cluster.
     * @param req CopyClusterPasswordComplexityRequest
     * @return CopyClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public CopyClusterPasswordComplexityResponse CopyClusterPasswordComplexity(CopyClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyClusterPasswordComplexityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CopyClusterPasswordComplexityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyClusterPasswordComplexity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an account.
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to create an audit rule template.
     * @param req CreateAuditRuleTemplateRequest
     * @return CreateAuditRuleTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditRuleTemplateResponse CreateAuditRuleTemplate(CreateAuditRuleTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAuditRuleTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuditRuleTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAuditRuleTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create manual backup.
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
     *This API is used to create a database.
     * @param req CreateClusterDatabaseRequest
     * @return CreateClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterDatabaseResponse CreateClusterDatabase(CreateClusterDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a cluster.
     * @param req CreateClustersRequest
     * @return CreateClustersResponse
     * @throws TencentCloudSDKException
     */
    public CreateClustersResponse CreateClusters(CreateClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a parameter template.
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateParamTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to create a database proxy.
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a database proxy connection.
     * @param req CreateProxyEndPointRequest
     * @return CreateProxyEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyEndPointResponse CreateProxyEndPoint(CreateProxyEndPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyEndPointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyEndPointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxyEndPoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to purchase a resource pack.
     * @param req CreateResourcePackageRequest
     * @return CreateResourcePackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourcePackageResponse CreateResourcePackage(CreateResourcePackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourcePackageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourcePackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResourcePackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an account.
     * @param req DeleteAccountsRequest
     * @return DeleteAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountsResponse DeleteAccounts(DeleteAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to delete an audit rule template.
     * @param req DeleteAuditRuleTemplatesRequest
     * @return DeleteAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditRuleTemplatesResponse DeleteAuditRuleTemplates(DeleteAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAuditRuleTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAuditRuleTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAuditRuleTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the manual backup for a cluster. It cannot be used to delete the automatic backup.
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to delete a database.
     * @param req DeleteClusterDatabaseRequest
     * @return DeleteClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterDatabaseResponse DeleteClusterDatabase(DeleteClusterDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a parameter template.
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteParamTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the existing permissions of an account.
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountPrivilegesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query database management accounts.
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
     *This API is used to query audit rule templates.
     * @param req DescribeAuditRuleTemplatesRequest
     * @return DescribeAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleTemplatesResponse DescribeAuditRuleTemplates(DescribeAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditRuleTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditRuleTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuditRuleTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the audit rule templates of an instance.
     * @param req DescribeAuditRuleWithInstanceIdsRequest
     * @return DescribeAuditRuleWithInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleWithInstanceIdsResponse DescribeAuditRuleWithInstanceIds(DescribeAuditRuleWithInstanceIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuditRuleWithInstanceIdsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuditRuleWithInstanceIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuditRuleWithInstanceIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the backup configuration information of the specified cluster, including the full backup time range and backup file retention period.
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the download address of a cluster backup file.
     * @param req DescribeBackupDownloadUrlRequest
     * @return DescribeBackupDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadUrlResponse DescribeBackupDownloadUrl(DescribeBackupDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of backup files.
     * @param req DescribeBackupListRequest
     * @return DescribeBackupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupListResponse DescribeBackupList(DescribeBackupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBackupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the download address of a binlog.
     * @param req DescribeBinlogDownloadUrlRequest
     * @return DescribeBinlogDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogDownloadUrlResponse DescribeBinlogDownloadUrl(DescribeBinlogDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBinlogDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the binlog retention period of a cluster in days.
     * @param req DescribeBinlogSaveDaysRequest
     * @return DescribeBinlogSaveDaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogSaveDaysResponse DescribeBinlogSaveDays(DescribeBinlogSaveDaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogSaveDaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBinlogSaveDaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBinlogSaveDays");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of binlogs in a cluster.
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBinlogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to show the details of an instance.
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the database list.
     * @param req DescribeClusterDetailDatabasesRequest
     * @return DescribeClusterDetailDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailDatabasesResponse DescribeClusterDetailDatabases(DescribeClusterDetailDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterDetailDatabasesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterDetailDatabasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterDetailDatabases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query instance groups.
     * @param req DescribeClusterInstanceGrpsRequest
     * @return DescribeClusterInstanceGrpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstanceGrpsResponse DescribeClusterInstanceGrps(DescribeClusterInstanceGrpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterInstanceGrpsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterInstanceGrpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterInstanceGrps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the parameters of a cluster.
     * @param req DescribeClusterParamsRequest
     * @return DescribeClusterParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterParamsResponse DescribeClusterParams(DescribeClusterParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterParamsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterParamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterParams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of password complexity for a cluster.
     * @param req DescribeClusterPasswordComplexityRequest
     * @return DescribeClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPasswordComplexityResponse DescribeClusterPasswordComplexity(DescribeClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterPasswordComplexityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterPasswordComplexityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterPasswordComplexity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to the list of clusters.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the security group information of an instance.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query task flow information.
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query instance details.
     * @param req DescribeInstanceDetailRequest
     * @return DescribeInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDetailResponse DescribeInstanceDetail(DescribeInstanceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of error logs for an instance.
     * @param req DescribeInstanceErrorLogsRequest
     * @return DescribeInstanceErrorLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceErrorLogsResponse DescribeInstanceErrorLogs(DescribeInstanceErrorLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceErrorLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceErrorLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceErrorLogs");
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
     *This API is used to query the slow query logs of an instance.
     * @param req DescribeInstanceSlowQueriesRequest
     * @return DescribeInstanceSlowQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSlowQueriesResponse DescribeInstanceSlowQueries(DescribeInstanceSlowQueriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceSlowQueriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceSlowQueriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceSlowQueries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query instance specifications.
     * @param req DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSpecsResponse DescribeInstanceSpecs(DescribeInstanceSpecsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceSpecsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceSpecsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceSpecs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of instances.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the instance maintenance window.
     * @param req DescribeMaintainPeriodRequest
     * @return DescribeMaintainPeriodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintainPeriodResponse DescribeMaintainPeriod(DescribeMaintainPeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaintainPeriodResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMaintainPeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMaintainPeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a parameter template.
     * @param req DescribeParamTemplateDetailRequest
     * @return DescribeParamTemplateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateDetailResponse DescribeParamTemplateDetail(DescribeParamTemplateDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplateDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeParamTemplateDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeParamTemplateDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query all parameter templates information of a user-specified product.
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeParamTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the security group information of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to query the list of database proxies.
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxiesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of proxy nodes.
     * @param req DescribeProxyNodesRequest
     * @return DescribeProxyNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyNodesResponse DescribeProxyNodes(DescribeProxyNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the specifications of a database proxy.
     * @param req DescribeProxySpecsRequest
     * @return DescribeProxySpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySpecsResponse DescribeProxySpecs(DescribeProxySpecsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxySpecsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxySpecsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxySpecs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the usage details of a resource pack.
     * @param req DescribeResourcePackageDetailRequest
     * @return DescribeResourcePackageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageDetailResponse DescribeResourcePackageDetail(DescribeResourcePackageDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcePackageDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcePackageDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcePackageDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of the resource packs.
     * @param req DescribeResourcePackageListRequest
     * @return DescribeResourcePackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageListResponse DescribeResourcePackageList(DescribeResourcePackageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcePackageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcePackageListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcePackageList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the specifications of a resource pack.
     * @param req DescribeResourcePackageSaleSpecRequest
     * @return DescribeResourcePackageSaleSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageSaleSpecResponse DescribeResourcePackageSaleSpec(DescribeResourcePackageSaleSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcePackageSaleSpecResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcePackageSaleSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcePackageSaleSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of resources by billing order ID.
     * @param req DescribeResourcesByDealNameRequest
     * @return DescribeResourcesByDealNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByDealNameResponse DescribeResourcesByDealName(DescribeResourcesByDealNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesByDealNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByDealNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcesByDealName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the valid rollback time range for the specified cluster.
     * @param req DescribeRollbackTimeRangeRequest
     * @return DescribeRollbackTimeRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeRangeResponse DescribeRollbackTimeRange(DescribeRollbackTimeRangeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackTimeRangeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackTimeRangeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRollbackTimeRange");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query whether rollback is possible based on the specified time and cluster.
     * @param req DescribeRollbackTimeValidityRequest
     * @return DescribeRollbackTimeValidityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeValidityResponse DescribeRollbackTimeValidity(DescribeRollbackTimeValidityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRollbackTimeValidityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRollbackTimeValidityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRollbackTimeValidity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the supported database proxy versions.
     * @param req DescribeSupportProxyVersionRequest
     * @return DescribeSupportProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportProxyVersionResponse DescribeSupportProxyVersion(DescribeSupportProxyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupportProxyVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupportProxyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSupportProxyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the AZ information in a purchasable region.
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
     *This API is used to export the error logs of an instance.
     * @param req ExportInstanceErrorLogsRequest
     * @return ExportInstanceErrorLogsResponse
     * @throws TencentCloudSDKException
     */
    public ExportInstanceErrorLogsResponse ExportInstanceErrorLogs(ExportInstanceErrorLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportInstanceErrorLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportInstanceErrorLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportInstanceErrorLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to export the slow logs of an instance.
     * @param req ExportInstanceSlowQueriesRequest
     * @return ExportInstanceSlowQueriesResponse
     * @throws TencentCloudSDKException
     */
    public ExportInstanceSlowQueriesResponse ExportInstanceSlowQueries(ExportInstanceSlowQueriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportInstanceSlowQueriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportInstanceSlowQueriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportInstanceSlowQueries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchasable price of a cluster.
     * @param req InquirePriceCreateRequest
     * @return InquirePriceCreateResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateResponse InquirePriceCreate(InquirePriceCreateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceCreateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceCreateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceCreate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the renewal price of a cluster.
     * @param req InquirePriceRenewRequest
     * @return InquirePriceRenewResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewResponse InquirePriceRenew(InquirePriceRenewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceRenewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceRenewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceRenew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate a cluster.
     * @param req IsolateClusterRequest
     * @return IsolateClusterResponse
     * @throws TencentCloudSDKException
     */
    public IsolateClusterResponse IsolateCluster(IsolateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate an instance.
     * @param req IsolateInstanceRequest
     * @return IsolateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstanceResponse IsolateInstance(IsolateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the descriptions of a database account.
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountDescriptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to modify the account host.
     * @param req ModifyAccountHostRequest
     * @return ModifyAccountHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountHostResponse ModifyAccountHost(ModifyAccountHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the account permissions.
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountPrivilegesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to modify an audit rule template.
     * @param req ModifyAuditRuleTemplatesRequest
     * @return ModifyAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditRuleTemplatesResponse ModifyAuditRuleTemplates(ModifyAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAuditRuleTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAuditRuleTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAuditRuleTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the audit configurations of an instance, such as audit log retention period and audit rule.
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAuditServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAuditServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAuditService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the backup configuration of the specified cluster.
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to rename a backup file.
     * @param req ModifyBackupNameRequest
     * @return ModifyBackupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupNameResponse ModifyBackupName(ModifyBackupNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBackupNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBackupNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBackupName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the binlog retention period in days.
     * @param req ModifyBinlogSaveDaysRequest
     * @return ModifyBinlogSaveDaysResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBinlogSaveDaysResponse ModifyBinlogSaveDays(ModifyBinlogSaveDaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBinlogSaveDaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBinlogSaveDaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBinlogSaveDays");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the database.
     * @param req ModifyClusterDatabaseRequest
     * @return ModifyClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterDatabaseResponse ModifyClusterDatabase(ModifyClusterDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify cluster name.
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the parameters of a cluster.
     * @param req ModifyClusterParamRequest
     * @return ModifyClusterParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterParamResponse ModifyClusterParam(ModifyClusterParamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterParamResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterParamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterParam");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify or enable the password complexity for a cluster.
     * @param req ModifyClusterPasswordComplexityRequest
     * @return ModifyClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordComplexityResponse ModifyClusterPasswordComplexity(ModifyClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterPasswordComplexityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterPasswordComplexityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterPasswordComplexity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the replica AZ.
     * @param req ModifyClusterSlaveZoneRequest
     * @return ModifyClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterSlaveZoneResponse ModifyClusterSlaveZone(ModifyClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterSlaveZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterSlaveZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterSlaveZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the security groups bound to an instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to modify instance name.
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the instance parameters.
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
     *This API is used to modify the maintenance time configuration.
     * @param req ModifyMaintainPeriodConfigRequest
     * @return ModifyMaintainPeriodConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintainPeriodConfigResponse ModifyMaintainPeriodConfig(ModifyMaintainPeriodConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMaintainPeriodConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMaintainPeriodConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMaintainPeriodConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a parameter template.
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyParamTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to modify the description of a database proxy.
     * @param req ModifyProxyDescRequest
     * @return ModifyProxyDescResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyDescResponse ModifyProxyDesc(ModifyProxyDescRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxyDescResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyDescResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxyDesc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure the read/write separation of a database proxy.
     * @param req ModifyProxyRwSplitRequest
     * @return ModifyProxyRwSplitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyRwSplitResponse ModifyProxyRwSplit(ModifyProxyRwSplitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxyRwSplitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyRwSplitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxyRwSplit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a resource pack to a cluster.
     * @param req ModifyResourcePackageClustersRequest
     * @return ModifyResourcePackageClustersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackageClustersResponse ModifyResourcePackageClusters(ModifyResourcePackageClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourcePackageClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourcePackageClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourcePackageClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the name of a resource pack.
     * @param req ModifyResourcePackageNameRequest
     * @return ModifyResourcePackageNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackageNameResponse ModifyResourcePackageName(ModifyResourcePackageNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourcePackageNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourcePackageNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourcePackageName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the IP and port of an instance group.
     * @param req ModifyVipVportRequest
     * @return ModifyVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVipVportResponse ModifyVipVport(ModifyVipVportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVipVportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVipVportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVipVport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deactivate a cluster.
     * @param req OfflineClusterRequest
     * @return OfflineClusterResponse
     * @throws TencentCloudSDKException
     */
    public OfflineClusterResponse OfflineCluster(OfflineClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OfflineCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deactivate an instance.
     * @param req OfflineInstanceRequest
     * @return OfflineInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineInstanceResponse OfflineInstance(OfflineInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OfflineInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the audit service for a TDSQL-C for MySQL instance.
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenAuditServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to enable the password complexity for a cluster.
     * @param req OpenClusterPasswordComplexityRequest
     * @return OpenClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterPasswordComplexityResponse OpenClusterPasswordComplexity(OpenClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenClusterPasswordComplexityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenClusterPasswordComplexityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenClusterPasswordComplexity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the access to read-only instance group.
     * @param req OpenClusterReadOnlyInstanceGroupAccessRequest
     * @return OpenClusterReadOnlyInstanceGroupAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterReadOnlyInstanceGroupAccessResponse OpenClusterReadOnlyInstanceGroupAccess(OpenClusterReadOnlyInstanceGroupAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenClusterReadOnlyInstanceGroupAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenClusterReadOnlyInstanceGroupAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenClusterReadOnlyInstanceGroupAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the dedicated access group for a read-only instance.
     * @param req OpenReadOnlyInstanceExclusiveAccessRequest
     * @return OpenReadOnlyInstanceExclusiveAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenReadOnlyInstanceExclusiveAccessResponse OpenReadOnlyInstanceExclusiveAccess(OpenReadOnlyInstanceExclusiveAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenReadOnlyInstanceExclusiveAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenReadOnlyInstanceExclusiveAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenReadOnlyInstanceExclusiveAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the public network.
     * @param req OpenWanRequest
     * @return OpenWanResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanResponse OpenWan(OpenWanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenWanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<OpenWanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenWan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pause a serverless cluster.
     * @param req PauseServerlessRequest
     * @return PauseServerlessResponse
     * @throws TencentCloudSDKException
     */
    public PauseServerlessResponse PauseServerless(PauseServerlessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseServerlessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PauseServerlessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseServerless");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to refund a resource pack.
     * @param req RefundResourcePackageRequest
     * @return RefundResourcePackageResponse
     * @throws TencentCloudSDKException
     */
    public RefundResourcePackageResponse RefundResourcePackage(RefundResourcePackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefundResourcePackageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RefundResourcePackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefundResourcePackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rebalance the load on the database proxy.
     * @param req ReloadBalanceProxyNodeRequest
     * @return ReloadBalanceProxyNodeResponse
     * @throws TencentCloudSDKException
     */
    public ReloadBalanceProxyNodeResponse ReloadBalanceProxyNode(ReloadBalanceProxyNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReloadBalanceProxyNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *This API is used to delete the replica AZ.
     * @param req RemoveClusterSlaveZoneRequest
     * @return RemoveClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public RemoveClusterSlaveZoneResponse RemoveClusterSlaveZone(RemoveClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveClusterSlaveZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveClusterSlaveZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveClusterSlaveZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset the password of a TencentDB instance account.
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
     *This API is used to restart an instance.
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume a serverless cluster.
     * @param req ResumeServerlessRequest
     * @return ResumeServerlessResponse
     * @throws TencentCloudSDKException
     */
    public ResumeServerlessResponse ResumeServerless(ResumeServerlessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeServerlessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeServerlessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeServerless");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search the list of cluster databases.
     * @param req SearchClusterDatabasesRequest
     * @return SearchClusterDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public SearchClusterDatabasesResponse SearchClusterDatabases(SearchClusterDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchClusterDatabasesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SearchClusterDatabasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchClusterDatabases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search the list of cluster data tables.
     * @param req SearchClusterTablesRequest
     * @return SearchClusterTablesResponse
     * @throws TencentCloudSDKException
     */
    public SearchClusterTablesResponse SearchClusterTables(SearchClusterTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchClusterTablesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SearchClusterTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchClusterTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set auto-renewal for an instance.
     * @param req SetRenewFlagRequest
     * @return SetRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetRenewFlagResponse SetRenewFlag(SetRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the cluster VPC.
     * @param req SwitchClusterVpcRequest
     * @return SwitchClusterVpcResponse
     * @throws TencentCloudSDKException
     */
    public SwitchClusterVpcResponse SwitchClusterVpc(SwitchClusterVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchClusterVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchClusterVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchClusterVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to switch to the replica AZ.
     * @param req SwitchClusterZoneRequest
     * @return SwitchClusterZoneResponse
     * @throws TencentCloudSDKException
     */
    public SwitchClusterZoneResponse SwitchClusterZone(SwitchClusterZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchClusterZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchClusterZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchClusterZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the database proxy VPC.
     * @param req SwitchProxyVpcRequest
     * @return SwitchProxyVpcResponse
     * @throws TencentCloudSDKException
     */
    public SwitchProxyVpcResponse SwitchProxyVpc(SwitchProxyVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchProxyVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchProxyVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchProxyVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a TDSQL-C for MySQL resource pack.
     * @param req UnbindClusterResourcePackagesRequest
     * @return UnbindClusterResourcePackagesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindClusterResourcePackagesResponse UnbindClusterResourcePackages(UnbindClusterResourcePackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindClusterResourcePackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindClusterResourcePackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindClusterResourcePackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade the kernel version of a TDSQL-C for MySQL cluster.
     * @param req UpgradeClusterVersionRequest
     * @return UpgradeClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterVersionResponse UpgradeClusterVersion(UpgradeClusterVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeClusterVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeClusterVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeClusterVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade an instance.
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade the configuration of a database proxy.
     * @param req UpgradeProxyRequest
     * @return UpgradeProxyResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyResponse UpgradeProxy(UpgradeProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeProxyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade the version of a database proxy.
     * @param req UpgradeProxyVersionRequest
     * @return UpgradeProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyVersionResponse UpgradeProxyVersion(UpgradeProxyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeProxyVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeProxyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeProxyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
