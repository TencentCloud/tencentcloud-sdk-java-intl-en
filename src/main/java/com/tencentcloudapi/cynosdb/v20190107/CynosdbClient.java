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
    private static String endpoint = "cynosdb.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateInstance", ActivateInstanceResponse.class);
    }

    /**
     *This API is used to add the replica AZ.
     * @param req AddClusterSlaveZoneRequest
     * @return AddClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterSlaveZoneResponse AddClusterSlaveZone(AddClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddClusterSlaveZone", AddClusterSlaveZoneResponse.class);
    }

    /**
     *This API is used to add an instance in a cluster.
     * @param req AddInstancesRequest
     * @return AddInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddInstancesResponse AddInstances(AddInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddInstances", AddInstancesResponse.class);
    }

    /**
     *This API is used to bind a resource pack to a cluster.
     * @param req BindClusterResourcePackagesRequest
     * @return BindClusterResourcePackagesResponse
     * @throws TencentCloudSDKException
     */
    public BindClusterResourcePackagesResponse BindClusterResourcePackages(BindClusterResourcePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindClusterResourcePackages", BindClusterResourcePackagesResponse.class);
    }

    /**
     *This API is used to disable the audit service for a TDSQL-C for MySQL instance.
     * @param req CloseAuditServiceRequest
     * @return CloseAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public CloseAuditServiceResponse CloseAuditService(CloseAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAuditService", CloseAuditServiceResponse.class);
    }

    /**
     *This API is used to disable the password complexity for a cluster.
     * @param req CloseClusterPasswordComplexityRequest
     * @return CloseClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public CloseClusterPasswordComplexityResponse CloseClusterPasswordComplexity(CloseClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseClusterPasswordComplexity", CloseClusterPasswordComplexityResponse.class);
    }

    /**
     *This API is used to disable the database proxy.
     * @param req CloseProxyRequest
     * @return CloseProxyResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyResponse CloseProxy(CloseProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProxy", CloseProxyResponse.class);
    }

    /**
     *This API is used to disable the public network.
     * @param req CloseWanRequest
     * @return CloseWanResponse
     * @throws TencentCloudSDKException
     */
    public CloseWanResponse CloseWan(CloseWanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseWan", CloseWanResponse.class);
    }

    /**
     *This API is used to replicate the password complexity for a cluster.
     * @param req CopyClusterPasswordComplexityRequest
     * @return CopyClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public CopyClusterPasswordComplexityResponse CopyClusterPasswordComplexity(CopyClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyClusterPasswordComplexity", CopyClusterPasswordComplexityResponse.class);
    }

    /**
     *This API is used to create an account.
     * @param req CreateAccountsRequest
     * @return CreateAccountsResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountsResponse CreateAccounts(CreateAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccounts", CreateAccountsResponse.class);
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
     *This API is used to create manual backup.
     * @param req CreateBackupRequest
     * @return CreateBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupResponse CreateBackup(CreateBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackup", CreateBackupResponse.class);
    }

    /**
     *This API is used to create a database.
     * @param req CreateClusterDatabaseRequest
     * @return CreateClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterDatabaseResponse CreateClusterDatabase(CreateClusterDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterDatabase", CreateClusterDatabaseResponse.class);
    }

    /**
     *This API is used to create a cluster.
     * @param req CreateClustersRequest
     * @return CreateClustersResponse
     * @throws TencentCloudSDKException
     */
    public CreateClustersResponse CreateClusters(CreateClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusters", CreateClustersResponse.class);
    }

    /**
     *This API is used to create a parameter template.
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParamTemplate", CreateParamTemplateResponse.class);
    }

    /**
     *This API is used to create a database proxy.
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxy", CreateProxyResponse.class);
    }

    /**
     *This API is used to create a database proxy connection.
     * @param req CreateProxyEndPointRequest
     * @return CreateProxyEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyEndPointResponse CreateProxyEndPoint(CreateProxyEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxyEndPoint", CreateProxyEndPointResponse.class);
    }

    /**
     *This API is used to purchase a resource pack.
     * @param req CreateResourcePackageRequest
     * @return CreateResourcePackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourcePackageResponse CreateResourcePackage(CreateResourcePackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourcePackage", CreateResourcePackageResponse.class);
    }

    /**
     *This API is used to delete an account.
     * @param req DeleteAccountsRequest
     * @return DeleteAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountsResponse DeleteAccounts(DeleteAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccounts", DeleteAccountsResponse.class);
    }

    /**
     *This API is used to delete an audit rule template.
     * @param req DeleteAuditRuleTemplatesRequest
     * @return DeleteAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditRuleTemplatesResponse DeleteAuditRuleTemplates(DeleteAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditRuleTemplates", DeleteAuditRuleTemplatesResponse.class);
    }

    /**
     *This API is used to delete the manual backup for a cluster. It cannot be used to delete the automatic backup.
     * @param req DeleteBackupRequest
     * @return DeleteBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupResponse DeleteBackup(DeleteBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackup", DeleteBackupResponse.class);
    }

    /**
     *This API is used to delete a database.
     * @param req DeleteClusterDatabaseRequest
     * @return DeleteClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterDatabaseResponse DeleteClusterDatabase(DeleteClusterDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterDatabase", DeleteClusterDatabaseResponse.class);
    }

    /**
     *This API is used to delete a parameter template.
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParamTemplate", DeleteParamTemplateResponse.class);
    }

    /**
     *This API is used to query the existing permissions of an account.
     * @param req DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountPrivilegesResponse DescribeAccountPrivileges(DescribeAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountPrivileges", DescribeAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to query database management accounts.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *This API is used to query audit rule templates.
     * @param req DescribeAuditRuleTemplatesRequest
     * @return DescribeAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleTemplatesResponse DescribeAuditRuleTemplates(DescribeAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleTemplates", DescribeAuditRuleTemplatesResponse.class);
    }

    /**
     *This API is used to get the audit rule templates of an instance.
     * @param req DescribeAuditRuleWithInstanceIdsRequest
     * @return DescribeAuditRuleWithInstanceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditRuleWithInstanceIdsResponse DescribeAuditRuleWithInstanceIds(DescribeAuditRuleWithInstanceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditRuleWithInstanceIds", DescribeAuditRuleWithInstanceIdsResponse.class);
    }

    /**
     *This API is used to get the backup configuration information of the specified cluster, including the full backup time range and backup file retention period.
     * @param req DescribeBackupConfigRequest
     * @return DescribeBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupConfigResponse DescribeBackupConfig(DescribeBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupConfig", DescribeBackupConfigResponse.class);
    }

    /**
     *This API is used to query the download address of a cluster backup file.
     * @param req DescribeBackupDownloadUrlRequest
     * @return DescribeBackupDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadUrlResponse DescribeBackupDownloadUrl(DescribeBackupDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadUrl", DescribeBackupDownloadUrlResponse.class);
    }

    /**
     *This API is used to query the list of backup files.
     * @param req DescribeBackupListRequest
     * @return DescribeBackupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupListResponse DescribeBackupList(DescribeBackupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupList", DescribeBackupListResponse.class);
    }

    /**
     *This API is used to query the download address of a binlog.
     * @param req DescribeBinlogDownloadUrlRequest
     * @return DescribeBinlogDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogDownloadUrlResponse DescribeBinlogDownloadUrl(DescribeBinlogDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogDownloadUrl", DescribeBinlogDownloadUrlResponse.class);
    }

    /**
     *This API is used to query the binlog retention period of a cluster in days.
     * @param req DescribeBinlogSaveDaysRequest
     * @return DescribeBinlogSaveDaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogSaveDaysResponse DescribeBinlogSaveDays(DescribeBinlogSaveDaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogSaveDays", DescribeBinlogSaveDaysResponse.class);
    }

    /**
     *This API is used to query the list of binlogs in a cluster.
     * @param req DescribeBinlogsRequest
     * @return DescribeBinlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBinlogsResponse DescribeBinlogs(DescribeBinlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBinlogs", DescribeBinlogsResponse.class);
    }

    /**
     *This API is used to show the details of an instance.
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *This API is used to query the database list.
     * @param req DescribeClusterDetailDatabasesRequest
     * @return DescribeClusterDetailDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailDatabasesResponse DescribeClusterDetailDatabases(DescribeClusterDetailDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetailDatabases", DescribeClusterDetailDatabasesResponse.class);
    }

    /**
     *This API is used to query instance groups.
     * @param req DescribeClusterInstanceGrpsRequest
     * @return DescribeClusterInstanceGrpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstanceGrpsResponse DescribeClusterInstanceGrps(DescribeClusterInstanceGrpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstanceGrps", DescribeClusterInstanceGrpsResponse.class);
    }

    /**
     *This API is used to query the parameters of a cluster.
     * @param req DescribeClusterParamsRequest
     * @return DescribeClusterParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterParamsResponse DescribeClusterParams(DescribeClusterParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterParams", DescribeClusterParamsResponse.class);
    }

    /**
     *This API is used to query the details of password complexity for a cluster.
     * @param req DescribeClusterPasswordComplexityRequest
     * @return DescribeClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPasswordComplexityResponse DescribeClusterPasswordComplexity(DescribeClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPasswordComplexity", DescribeClusterPasswordComplexityResponse.class);
    }

    /**
     *This API is used to the list of clusters.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *This API is used to query the security group information of an instance.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query task flow information.
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *This API is used to query instance details.
     * @param req DescribeInstanceDetailRequest
     * @return DescribeInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDetailResponse DescribeInstanceDetail(DescribeInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDetail", DescribeInstanceDetailResponse.class);
    }

    /**
     *This API is used to query the list of error logs for an instance.
     * @param req DescribeInstanceErrorLogsRequest
     * @return DescribeInstanceErrorLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceErrorLogsResponse DescribeInstanceErrorLogs(DescribeInstanceErrorLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceErrorLogs", DescribeInstanceErrorLogsResponse.class);
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
     *This API is used to query the slow query logs of an instance.
     * @param req DescribeInstanceSlowQueriesRequest
     * @return DescribeInstanceSlowQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSlowQueriesResponse DescribeInstanceSlowQueries(DescribeInstanceSlowQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSlowQueries", DescribeInstanceSlowQueriesResponse.class);
    }

    /**
     *This API is used to query instance specifications.
     * @param req DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSpecsResponse DescribeInstanceSpecs(DescribeInstanceSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSpecs", DescribeInstanceSpecsResponse.class);
    }

    /**
     *This API is used to query the list of instances.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to query the instance maintenance window.
     * @param req DescribeMaintainPeriodRequest
     * @return DescribeMaintainPeriodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintainPeriodResponse DescribeMaintainPeriod(DescribeMaintainPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintainPeriod", DescribeMaintainPeriodResponse.class);
    }

    /**
     *This API is used to query the details of a parameter template.
     * @param req DescribeParamTemplateDetailRequest
     * @return DescribeParamTemplateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateDetailResponse DescribeParamTemplateDetail(DescribeParamTemplateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplateDetail", DescribeParamTemplateDetailResponse.class);
    }

    /**
     *This API is used to query all parameter templates information of a user-specified product.
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplates", DescribeParamTemplatesResponse.class);
    }

    /**
     *This API is used to query the security group information of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the list of database proxies.
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxies", DescribeProxiesResponse.class);
    }

    /**
     *This API is used to query the list of proxy nodes.
     * @param req DescribeProxyNodesRequest
     * @return DescribeProxyNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyNodesResponse DescribeProxyNodes(DescribeProxyNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyNodes", DescribeProxyNodesResponse.class);
    }

    /**
     *This API is used to query the specifications of a database proxy.
     * @param req DescribeProxySpecsRequest
     * @return DescribeProxySpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySpecsResponse DescribeProxySpecs(DescribeProxySpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySpecs", DescribeProxySpecsResponse.class);
    }

    /**
     *This API is used to query the usage details of a resource pack.
     * @param req DescribeResourcePackageDetailRequest
     * @return DescribeResourcePackageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageDetailResponse DescribeResourcePackageDetail(DescribeResourcePackageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcePackageDetail", DescribeResourcePackageDetailResponse.class);
    }

    /**
     *This API is used to query the list of the resource packs.
     * @param req DescribeResourcePackageListRequest
     * @return DescribeResourcePackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageListResponse DescribeResourcePackageList(DescribeResourcePackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcePackageList", DescribeResourcePackageListResponse.class);
    }

    /**
     *This API is used to query the specifications of a resource pack.
     * @param req DescribeResourcePackageSaleSpecRequest
     * @return DescribeResourcePackageSaleSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcePackageSaleSpecResponse DescribeResourcePackageSaleSpec(DescribeResourcePackageSaleSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcePackageSaleSpec", DescribeResourcePackageSaleSpecResponse.class);
    }

    /**
     *This API is used to query the list of resources by billing order ID.
     * @param req DescribeResourcesByDealNameRequest
     * @return DescribeResourcesByDealNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByDealNameResponse DescribeResourcesByDealName(DescribeResourcesByDealNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByDealName", DescribeResourcesByDealNameResponse.class);
    }

    /**
     *This API is used to query the valid rollback time range for the specified cluster.
     * @param req DescribeRollbackTimeRangeRequest
     * @return DescribeRollbackTimeRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeRangeResponse DescribeRollbackTimeRange(DescribeRollbackTimeRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTimeRange", DescribeRollbackTimeRangeResponse.class);
    }

    /**
     *This API is used to query whether rollback is possible based on the specified time and cluster.
     * @param req DescribeRollbackTimeValidityRequest
     * @return DescribeRollbackTimeValidityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRollbackTimeValidityResponse DescribeRollbackTimeValidity(DescribeRollbackTimeValidityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRollbackTimeValidity", DescribeRollbackTimeValidityResponse.class);
    }

    /**
     *This API is used to query the supported database proxy versions.
     * @param req DescribeSupportProxyVersionRequest
     * @return DescribeSupportProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportProxyVersionResponse DescribeSupportProxyVersion(DescribeSupportProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportProxyVersion", DescribeSupportProxyVersionResponse.class);
    }

    /**
     *This API is used to query the AZ information in a purchasable region.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to export the error logs of an instance.
     * @param req ExportInstanceErrorLogsRequest
     * @return ExportInstanceErrorLogsResponse
     * @throws TencentCloudSDKException
     */
    public ExportInstanceErrorLogsResponse ExportInstanceErrorLogs(ExportInstanceErrorLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportInstanceErrorLogs", ExportInstanceErrorLogsResponse.class);
    }

    /**
     *This API is used to export the slow logs of an instance.
     * @param req ExportInstanceSlowQueriesRequest
     * @return ExportInstanceSlowQueriesResponse
     * @throws TencentCloudSDKException
     */
    public ExportInstanceSlowQueriesResponse ExportInstanceSlowQueries(ExportInstanceSlowQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportInstanceSlowQueries", ExportInstanceSlowQueriesResponse.class);
    }

    /**
     *This API is used to query the purchasable price of a cluster.
     * @param req InquirePriceCreateRequest
     * @return InquirePriceCreateResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateResponse InquirePriceCreate(InquirePriceCreateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreate", InquirePriceCreateResponse.class);
    }

    /**
     *This API is used to query the renewal price of a cluster.
     * @param req InquirePriceRenewRequest
     * @return InquirePriceRenewResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewResponse InquirePriceRenew(InquirePriceRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenew", InquirePriceRenewResponse.class);
    }

    /**
     *This API is used to isolate a cluster.
     * @param req IsolateClusterRequest
     * @return IsolateClusterResponse
     * @throws TencentCloudSDKException
     */
    public IsolateClusterResponse IsolateCluster(IsolateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateCluster", IsolateClusterResponse.class);
    }

    /**
     *This API is used to isolate an instance.
     * @param req IsolateInstanceRequest
     * @return IsolateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstanceResponse IsolateInstance(IsolateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateInstance", IsolateInstanceResponse.class);
    }

    /**
     *This API is used to modify the descriptions of a database account.
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *This API is used to modify the account host.
     * @param req ModifyAccountHostRequest
     * @return ModifyAccountHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountHostResponse ModifyAccountHost(ModifyAccountHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountHost", ModifyAccountHostResponse.class);
    }

    /**
     *This API is used to modify the account permissions.
     * @param req ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountPrivilegesResponse ModifyAccountPrivileges(ModifyAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountPrivileges", ModifyAccountPrivilegesResponse.class);
    }

    /**
     *This API is used to modify an audit rule template.
     * @param req ModifyAuditRuleTemplatesRequest
     * @return ModifyAuditRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditRuleTemplatesResponse ModifyAuditRuleTemplates(ModifyAuditRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditRuleTemplates", ModifyAuditRuleTemplatesResponse.class);
    }

    /**
     *This API is used to modify the audit configurations of an instance, such as audit log retention period and audit rule.
     * @param req ModifyAuditServiceRequest
     * @return ModifyAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditServiceResponse ModifyAuditService(ModifyAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditService", ModifyAuditServiceResponse.class);
    }

    /**
     *This API is used to modify the backup configuration of the specified cluster.
     * @param req ModifyBackupConfigRequest
     * @return ModifyBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupConfigResponse ModifyBackupConfig(ModifyBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupConfig", ModifyBackupConfigResponse.class);
    }

    /**
     *This API is used to rename a backup file.
     * @param req ModifyBackupNameRequest
     * @return ModifyBackupNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupNameResponse ModifyBackupName(ModifyBackupNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupName", ModifyBackupNameResponse.class);
    }

    /**
     *This API is used to modify the binlog retention period in days.
     * @param req ModifyBinlogSaveDaysRequest
     * @return ModifyBinlogSaveDaysResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBinlogSaveDaysResponse ModifyBinlogSaveDays(ModifyBinlogSaveDaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBinlogSaveDays", ModifyBinlogSaveDaysResponse.class);
    }

    /**
     *This API is used to modify the database.
     * @param req ModifyClusterDatabaseRequest
     * @return ModifyClusterDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterDatabaseResponse ModifyClusterDatabase(ModifyClusterDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterDatabase", ModifyClusterDatabaseResponse.class);
    }

    /**
     *This API is used to modify cluster name.
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterName", ModifyClusterNameResponse.class);
    }

    /**
     *This API is used to modify the parameters of a cluster.
     * @param req ModifyClusterParamRequest
     * @return ModifyClusterParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterParamResponse ModifyClusterParam(ModifyClusterParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterParam", ModifyClusterParamResponse.class);
    }

    /**
     *This API is used to modify or enable the password complexity for a cluster.
     * @param req ModifyClusterPasswordComplexityRequest
     * @return ModifyClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterPasswordComplexityResponse ModifyClusterPasswordComplexity(ModifyClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterPasswordComplexity", ModifyClusterPasswordComplexityResponse.class);
    }

    /**
     *This API is used to modify the replica AZ.
     * @param req ModifyClusterSlaveZoneRequest
     * @return ModifyClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterSlaveZoneResponse ModifyClusterSlaveZone(ModifyClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterSlaveZone", ModifyClusterSlaveZoneResponse.class);
    }

    /**
     *This API is used to modify the security groups bound to an instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify instance name.
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *This API is used to modify the instance parameters.
     * @param req ModifyInstanceParamRequest
     * @return ModifyInstanceParamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamResponse ModifyInstanceParam(ModifyInstanceParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParam", ModifyInstanceParamResponse.class);
    }

    /**
     *This API is used to modify the maintenance time configuration.
     * @param req ModifyMaintainPeriodConfigRequest
     * @return ModifyMaintainPeriodConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintainPeriodConfigResponse ModifyMaintainPeriodConfig(ModifyMaintainPeriodConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintainPeriodConfig", ModifyMaintainPeriodConfigResponse.class);
    }

    /**
     *This API is used to modify a parameter template.
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParamTemplate", ModifyParamTemplateResponse.class);
    }

    /**
     *This API is used to modify the description of a database proxy.
     * @param req ModifyProxyDescRequest
     * @return ModifyProxyDescResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyDescResponse ModifyProxyDesc(ModifyProxyDescRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyDesc", ModifyProxyDescResponse.class);
    }

    /**
     *This API is used to configure the read/write separation of a database proxy.
     * @param req ModifyProxyRwSplitRequest
     * @return ModifyProxyRwSplitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyRwSplitResponse ModifyProxyRwSplit(ModifyProxyRwSplitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyRwSplit", ModifyProxyRwSplitResponse.class);
    }

    /**
     *This API is used to bind a resource pack to a cluster.
     * @param req ModifyResourcePackageClustersRequest
     * @return ModifyResourcePackageClustersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackageClustersResponse ModifyResourcePackageClusters(ModifyResourcePackageClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcePackageClusters", ModifyResourcePackageClustersResponse.class);
    }

    /**
     *This API is used to modify the name of a resource pack.
     * @param req ModifyResourcePackageNameRequest
     * @return ModifyResourcePackageNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePackageNameResponse ModifyResourcePackageName(ModifyResourcePackageNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcePackageName", ModifyResourcePackageNameResponse.class);
    }

    /**
     *This API is used to modify the IP and port of an instance group.
     * @param req ModifyVipVportRequest
     * @return ModifyVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVipVportResponse ModifyVipVport(ModifyVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVipVport", ModifyVipVportResponse.class);
    }

    /**
     *This API is used to deactivate a cluster.
     * @param req OfflineClusterRequest
     * @return OfflineClusterResponse
     * @throws TencentCloudSDKException
     */
    public OfflineClusterResponse OfflineCluster(OfflineClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineCluster", OfflineClusterResponse.class);
    }

    /**
     *This API is used to deactivate an instance.
     * @param req OfflineInstanceRequest
     * @return OfflineInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineInstanceResponse OfflineInstance(OfflineInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineInstance", OfflineInstanceResponse.class);
    }

    /**
     *This API is used to enable the audit service for a TDSQL-C for MySQL instance.
     * @param req OpenAuditServiceRequest
     * @return OpenAuditServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenAuditServiceResponse OpenAuditService(OpenAuditServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAuditService", OpenAuditServiceResponse.class);
    }

    /**
     *This API is used to enable the password complexity for a cluster.
     * @param req OpenClusterPasswordComplexityRequest
     * @return OpenClusterPasswordComplexityResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterPasswordComplexityResponse OpenClusterPasswordComplexity(OpenClusterPasswordComplexityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClusterPasswordComplexity", OpenClusterPasswordComplexityResponse.class);
    }

    /**
     *This API is used to enable the access to read-only instance group.
     * @param req OpenClusterReadOnlyInstanceGroupAccessRequest
     * @return OpenClusterReadOnlyInstanceGroupAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenClusterReadOnlyInstanceGroupAccessResponse OpenClusterReadOnlyInstanceGroupAccess(OpenClusterReadOnlyInstanceGroupAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClusterReadOnlyInstanceGroupAccess", OpenClusterReadOnlyInstanceGroupAccessResponse.class);
    }

    /**
     *This API is used to enable the dedicated access group for a read-only instance.
     * @param req OpenReadOnlyInstanceExclusiveAccessRequest
     * @return OpenReadOnlyInstanceExclusiveAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenReadOnlyInstanceExclusiveAccessResponse OpenReadOnlyInstanceExclusiveAccess(OpenReadOnlyInstanceExclusiveAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenReadOnlyInstanceExclusiveAccess", OpenReadOnlyInstanceExclusiveAccessResponse.class);
    }

    /**
     *This API is used to enable the public network.
     * @param req OpenWanRequest
     * @return OpenWanResponse
     * @throws TencentCloudSDKException
     */
    public OpenWanResponse OpenWan(OpenWanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenWan", OpenWanResponse.class);
    }

    /**
     *This API is used to pause a serverless cluster.
     * @param req PauseServerlessRequest
     * @return PauseServerlessResponse
     * @throws TencentCloudSDKException
     */
    public PauseServerlessResponse PauseServerless(PauseServerlessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseServerless", PauseServerlessResponse.class);
    }

    /**
     *This API is used to refund a resource pack.
     * @param req RefundResourcePackageRequest
     * @return RefundResourcePackageResponse
     * @throws TencentCloudSDKException
     */
    public RefundResourcePackageResponse RefundResourcePackage(RefundResourcePackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefundResourcePackage", RefundResourcePackageResponse.class);
    }

    /**
     *This API is used to rebalance the load on the database proxy.
     * @param req ReloadBalanceProxyNodeRequest
     * @return ReloadBalanceProxyNodeResponse
     * @throws TencentCloudSDKException
     */
    public ReloadBalanceProxyNodeResponse ReloadBalanceProxyNode(ReloadBalanceProxyNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReloadBalanceProxyNode", ReloadBalanceProxyNodeResponse.class);
    }

    /**
     *This API is used to delete the replica AZ.
     * @param req RemoveClusterSlaveZoneRequest
     * @return RemoveClusterSlaveZoneResponse
     * @throws TencentCloudSDKException
     */
    public RemoveClusterSlaveZoneResponse RemoveClusterSlaveZone(RemoveClusterSlaveZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveClusterSlaveZone", RemoveClusterSlaveZoneResponse.class);
    }

    /**
     *This API is used to reset the password of a TencentDB instance account.
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *This API is used to restart an instance.
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *This API is used to resume a serverless cluster.
     * @param req ResumeServerlessRequest
     * @return ResumeServerlessResponse
     * @throws TencentCloudSDKException
     */
    public ResumeServerlessResponse ResumeServerless(ResumeServerlessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeServerless", ResumeServerlessResponse.class);
    }

    /**
     *This API is used to search the list of cluster databases.
     * @param req SearchClusterDatabasesRequest
     * @return SearchClusterDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public SearchClusterDatabasesResponse SearchClusterDatabases(SearchClusterDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClusterDatabases", SearchClusterDatabasesResponse.class);
    }

    /**
     *This API is used to search the list of cluster data tables.
     * @param req SearchClusterTablesRequest
     * @return SearchClusterTablesResponse
     * @throws TencentCloudSDKException
     */
    public SearchClusterTablesResponse SearchClusterTables(SearchClusterTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClusterTables", SearchClusterTablesResponse.class);
    }

    /**
     *This API is used to set auto-renewal for an instance.
     * @param req SetRenewFlagRequest
     * @return SetRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetRenewFlagResponse SetRenewFlag(SetRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetRenewFlag", SetRenewFlagResponse.class);
    }

    /**
     *This API is used to modify the cluster VPC.
     * @param req SwitchClusterVpcRequest
     * @return SwitchClusterVpcResponse
     * @throws TencentCloudSDKException
     */
    public SwitchClusterVpcResponse SwitchClusterVpc(SwitchClusterVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchClusterVpc", SwitchClusterVpcResponse.class);
    }

    /**
     *This API is used to switch to the replica AZ.
     * @param req SwitchClusterZoneRequest
     * @return SwitchClusterZoneResponse
     * @throws TencentCloudSDKException
     */
    public SwitchClusterZoneResponse SwitchClusterZone(SwitchClusterZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchClusterZone", SwitchClusterZoneResponse.class);
    }

    /**
     *This API is used to modify the database proxy VPC.
     * @param req SwitchProxyVpcRequest
     * @return SwitchProxyVpcResponse
     * @throws TencentCloudSDKException
     */
    public SwitchProxyVpcResponse SwitchProxyVpc(SwitchProxyVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchProxyVpc", SwitchProxyVpcResponse.class);
    }

    /**
     *This API is used to unbind a TDSQL-C for MySQL resource pack.
     * @param req UnbindClusterResourcePackagesRequest
     * @return UnbindClusterResourcePackagesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindClusterResourcePackagesResponse UnbindClusterResourcePackages(UnbindClusterResourcePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindClusterResourcePackages", UnbindClusterResourcePackagesResponse.class);
    }

    /**
     *This API is used to upgrade the kernel version of a TDSQL-C for MySQL cluster.
     * @param req UpgradeClusterVersionRequest
     * @return UpgradeClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterVersionResponse UpgradeClusterVersion(UpgradeClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeClusterVersion", UpgradeClusterVersionResponse.class);
    }

    /**
     *This API is used to upgrade an instance.
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *This API is used to upgrade the configuration of a database proxy.
     * @param req UpgradeProxyRequest
     * @return UpgradeProxyResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyResponse UpgradeProxy(UpgradeProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeProxy", UpgradeProxyResponse.class);
    }

    /**
     *This API is used to upgrade the version of a database proxy.
     * @param req UpgradeProxyVersionRequest
     * @return UpgradeProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyVersionResponse UpgradeProxyVersion(UpgradeProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeProxyVersion", UpgradeProxyVersionResponse.class);
    }

}
