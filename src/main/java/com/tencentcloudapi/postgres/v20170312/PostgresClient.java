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
    private static String endpoint = "postgres.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDBInstanceToReadOnlyGroup", AddDBInstanceToReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to clone an instance by specifying a backup set or a point in time.
     * @param req CloneDBInstanceRequest
     * @return CloneDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CloneDBInstanceResponse CloneDBInstance(CloneDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneDBInstance", CloneDBInstanceResponse.class);
    }

    /**
     *This API is used to disable the public network address of an instance.
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseDBExtranetAccess", CloseDBExtranetAccessResponse.class);
    }

    /**
     *This API is used to disable the public network address of a PostgreSQL for Serverless instance.
     * @param req CloseServerlessDBExtranetAccessRequest
     * @return CloseServerlessDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseServerlessDBExtranetAccessResponse CloseServerlessDBExtranetAccess(CloseServerlessDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseServerlessDBExtranetAccess", CloseServerlessDBExtranetAccessResponse.class);
    }

    /**
     *This API is used to create a data backup of an instance.
     * @param req CreateBaseBackupRequest
     * @return CreateBaseBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaseBackupResponse CreateBaseBackup(CreateBaseBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaseBackup", CreateBaseBackupResponse.class);
    }

    /**
     *This API is used to create a network for an instance.
     * @param req CreateDBInstanceNetworkAccessRequest
     * @return CreateDBInstanceNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceNetworkAccessResponse CreateDBInstanceNetworkAccess(CreateDBInstanceNetworkAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceNetworkAccess", CreateDBInstanceNetworkAccessResponse.class);
    }

    /**
     *This API is used to create (but not initialize) one or more TencentDB for PostgreSQL instances. This API is disused and replaced by the [CreateInstances](https://intl.cloud.tencent.com/document/api/409/56107?from_cn_redirect=1) API.
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstances", CreateDBInstancesResponse.class);
    }

    /**
     *This API is used to create one or more PostgreSQL instances. Instances created through this interface do not need to be initialized and can be used directly.
<li>After an instance is successfully created, it will automatically start up, and its status changes to "Running".</li>
<li>For prepaid instances, the required amount for the instance purchase will be deducted in advance. For post-paid hourly instances, the amount required for the purchase within the first hour will be temporarily frozen. Please ensure that your account balance is sufficient before calling this interface.</li>
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *This API is used to create a parameter template.
     * @param req CreateParameterTemplateRequest
     * @return CreateParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParameterTemplateResponse CreateParameterTemplate(CreateParameterTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParameterTemplate", CreateParameterTemplateResponse.class);
    }

    /**
     *This API is used to create read-only replicas.
     * @param req CreateReadOnlyDBInstanceRequest
     * @return CreateReadOnlyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyDBInstanceResponse CreateReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReadOnlyDBInstance", CreateReadOnlyDBInstanceResponse.class);
    }

    /**
     *This API is used to create an RO group.
     * @param req CreateReadOnlyGroupRequest
     * @return CreateReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyGroupResponse CreateReadOnlyGroup(CreateReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReadOnlyGroup", CreateReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to create a network for an RO group.
     * @param req CreateReadOnlyGroupNetworkAccessRequest
     * @return CreateReadOnlyGroupNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public CreateReadOnlyGroupNetworkAccessResponse CreateReadOnlyGroupNetworkAccess(CreateReadOnlyGroupNetworkAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReadOnlyGroupNetworkAccess", CreateReadOnlyGroupNetworkAccessResponse.class);
    }

    /**
     *This API is used to create a PostgreSQL for Serverless instance. If the creation succeeds, the instance ID will be returned.
     * @param req CreateServerlessDBInstanceRequest
     * @return CreateServerlessDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerlessDBInstanceResponse CreateServerlessDBInstance(CreateServerlessDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServerlessDBInstance", CreateServerlessDBInstanceResponse.class);
    }

    /**
     *This API is used to delete a specified data backup for an instance.
     * @param req DeleteBaseBackupRequest
     * @return DeleteBaseBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaseBackupResponse DeleteBaseBackup(DeleteBaseBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaseBackup", DeleteBaseBackupResponse.class);
    }

    /**
     *This API is used to delete a network of an instance.
     * @param req DeleteDBInstanceNetworkAccessRequest
     * @return DeleteDBInstanceNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBInstanceNetworkAccessResponse DeleteDBInstanceNetworkAccess(DeleteDBInstanceNetworkAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBInstanceNetworkAccess", DeleteDBInstanceNetworkAccessResponse.class);
    }

    /**
     *This API is used to delete the specified log backup of an instance.
     * @param req DeleteLogBackupRequest
     * @return DeleteLogBackupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogBackupResponse DeleteLogBackup(DeleteLogBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogBackup", DeleteLogBackupResponse.class);
    }

    /**
     *This API is used to delete a parameter template.
     * @param req DeleteParameterTemplateRequest
     * @return DeleteParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParameterTemplateResponse DeleteParameterTemplate(DeleteParameterTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParameterTemplate", DeleteParameterTemplateResponse.class);
    }

    /**
     *This API is used to delete an RO group.
     * @param req DeleteReadOnlyGroupRequest
     * @return DeleteReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReadOnlyGroupResponse DeleteReadOnlyGroup(DeleteReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReadOnlyGroup", DeleteReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to delete a network of an RO group.
     * @param req DeleteReadOnlyGroupNetworkAccessRequest
     * @return DeleteReadOnlyGroupNetworkAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReadOnlyGroupNetworkAccessResponse DeleteReadOnlyGroupNetworkAccess(DeleteReadOnlyGroupNetworkAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReadOnlyGroupNetworkAccess", DeleteReadOnlyGroupNetworkAccessResponse.class);
    }

    /**
     *This API is used to delete a PostgreSQL for Serverless instance.
     * @param req DeleteServerlessDBInstanceRequest
     * @return DeleteServerlessDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessDBInstanceResponse DeleteServerlessDBInstance(DeleteServerlessDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServerlessDBInstance", DeleteServerlessDBInstanceResponse.class);
    }

    /**
     *This API is used to query the list of the database accounts for an instance.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *This API is used to query the available restoration time of an instance.
     * @param req DescribeAvailableRecoveryTimeRequest
     * @return DescribeAvailableRecoveryTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableRecoveryTimeResponse DescribeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableRecoveryTime", DescribeAvailableRecoveryTimeResponse.class);
    }

    /**
     *This API is used to query the backup download restrictions.
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadRestriction", DescribeBackupDownloadRestrictionResponse.class);
    }

    /**
     *u200cThis API is used to query the download address of a specified backup set, including full backup sets and incremental log backup sets.
     * @param req DescribeBackupDownloadURLRequest
     * @return DescribeBackupDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadURLResponse DescribeBackupDownloadURL(DescribeBackupDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadURL", DescribeBackupDownloadURLResponse.class);
    }

    /**
     *This API is used to query the backup overview. It will return the current number and size of backups, free backup space size, and paid backup space size (all size values are in bytes).
     * @param req DescribeBackupOverviewRequest
     * @return DescribeBackupOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupOverviewResponse DescribeBackupOverview(DescribeBackupOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupOverview", DescribeBackupOverviewResponse.class);
    }

    /**
     *This API is used to query all backup plans of an instance.
     * @param req DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupPlansResponse DescribeBackupPlans(DescribeBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupPlans", DescribeBackupPlansResponse.class);
    }

    /**
     *This API is used to query the backup statistics of an instance. It will return the number and size (bytes) of backups of the instance.
     * @param req DescribeBackupSummariesRequest
     * @return DescribeBackupSummariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupSummariesResponse DescribeBackupSummaries(DescribeBackupSummariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupSummaries", DescribeBackupSummariesResponse.class);
    }

    /**
     *This API is used to query the list of data backups.
     * @param req DescribeBaseBackupsRequest
     * @return DescribeBaseBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseBackupsResponse DescribeBaseBackups(DescribeBaseBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaseBackups", DescribeBaseBackupsResponse.class);
    }

    /**
     *This API is used to query purchasable instance specifications.
     * @param req DescribeClassesRequest
     * @return DescribeClassesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassesResponse DescribeClasses(DescribeClassesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClasses", DescribeClassesResponse.class);
    }

    /**
     *This API is used to query the minimum specification required by a cloned instance, including `SpecCode` and disk specification.
     * @param req DescribeCloneDBInstanceSpecRequest
     * @return DescribeCloneDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloneDBInstanceSpecResponse DescribeCloneDBInstanceSpec(DescribeCloneDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloneDBInstanceSpec", DescribeCloneDBInstanceSpecResponse.class);
    }

    /**
     *This API is used to query the backup list of an instance. This API is disused and replaced by the [DescribeBaseBackups](https://intl.cloud.tencent.com/document/api/409/89022?from_cn_redirect=1) API.
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBBackups", DescribeDBBackupsResponse.class);
    }

    /**
     *This API is used to query an error log.
     * @param req DescribeDBErrlogsRequest
     * @return DescribeDBErrlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBErrlogsResponse DescribeDBErrlogs(DescribeDBErrlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBErrlogs", DescribeDBErrlogsResponse.class);
    }

    /**
     *This API is used to query the details of one instance.
     * @param req DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceAttributeResponse DescribeDBInstanceAttribute(DescribeDBInstanceAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceAttribute", DescribeDBInstanceAttributeResponse.class);
    }

    /**
     *This API is used to query the HA configuration of an instance, which includes:
<li>Allow a standby node to promote to a primary node.
<li>Allow a semi-sync instance to adopt sync or async replication.
     * @param req DescribeDBInstanceHAConfigRequest
     * @return DescribeDBInstanceHAConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceHAConfigResponse DescribeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceHAConfig", DescribeDBInstanceHAConfigResponse.class);
    }

    /**
     *This API is used to query the parameters of an instance.
     * @param req DescribeDBInstanceParametersRequest
     * @return DescribeDBInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceParametersResponse DescribeDBInstanceParameters(DescribeDBInstanceParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceParameters", DescribeDBInstanceParametersResponse.class);
    }

    /**
     *This API is used to query the security group of an instance.
     * @param req DescribeDBInstanceSecurityGroupsRequest
     * @return DescribeDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceSecurityGroupsResponse DescribeDBInstanceSecurityGroups(DescribeDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceSecurityGroups", DescribeDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the details of one or more instances.
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *This API is used to get a slow query log. Since it was deprecated on September 1, 2021, it has no longer returned data. You need to use the [DescribeSlowQueryList](https://intl.cloud.tencent.com/document/product/409/60540?from_cn_redirect=1) API instead to get slow query logs.
     * @param req DescribeDBSlowlogsRequest
     * @return DescribeDBSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowlogsResponse DescribeDBSlowlogs(DescribeDBSlowlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSlowlogs", DescribeDBSlowlogsResponse.class);
    }

    /**
     *This API is used to query the list of supported database versions.
     * @param req DescribeDBVersionsRequest
     * @return DescribeDBVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBVersionsResponse DescribeDBVersions(DescribeDBVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBVersions", DescribeDBVersionsResponse.class);
    }

    /**
     *This API is used to get the instance Xlog list. This API is disused and replaced by the [DescribeBaseBackups](https://www.tencentcloud.com/zh/document/product/409/54343) API.
     * @param req DescribeDBXlogsRequest
     * @return DescribeDBXlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBXlogsResponse DescribeDBXlogs(DescribeDBXlogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBXlogs", DescribeDBXlogsResponse.class);
    }

    /**
     *This API is used to query the database list of an instance.
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *This API is used to query all parameters supported by a database version and engine.
     * @param req DescribeDefaultParametersRequest
     * @return DescribeDefaultParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultParametersResponse DescribeDefaultParameters(DescribeDefaultParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultParameters", DescribeDefaultParametersResponse.class);
    }

    /**
     *This API is used to query the instance key list.
     * @param req DescribeEncryptionKeysRequest
     * @return DescribeEncryptionKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEncryptionKeysResponse DescribeEncryptionKeys(DescribeEncryptionKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEncryptionKeys", DescribeEncryptionKeysResponse.class);
    }

    /**
     *This API is used to query the list of log backups.
     * @param req DescribeLogBackupsRequest
     * @return DescribeLogBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogBackupsResponse DescribeLogBackups(DescribeLogBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogBackups", DescribeLogBackupsResponse.class);
    }

    /**
     *This API is used to query the order information.
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrders", DescribeOrdersResponse.class);
    }

    /**
     *This API is used to query the details of a parameter template, including basic information and parameter information.
     * @param req DescribeParameterTemplateAttributesRequest
     * @return DescribeParameterTemplateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParameterTemplateAttributesResponse DescribeParameterTemplateAttributes(DescribeParameterTemplateAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParameterTemplateAttributes", DescribeParameterTemplateAttributesResponse.class);
    }

    /**
     *This API is used to query the list of parameter templates.
     * @param req DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParameterTemplatesResponse DescribeParameterTemplates(DescribeParameterTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParameterTemplates", DescribeParameterTemplatesResponse.class);
    }

    /**
     *This API is used to query the parameter modification event.
     * @param req DescribeParamsEventRequest
     * @return DescribeParamsEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamsEventResponse DescribeParamsEvent(DescribeParamsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamsEvent", DescribeParamsEventResponse.class);
    }

    /**
     *This API is used to query the purchasable specification configuration. u200cThis API is disused and replaced by the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     * @param req DescribeProductConfigRequest
     * @return DescribeProductConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductConfigResponse DescribeProductConfig(DescribeProductConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductConfig", DescribeProductConfigResponse.class);
    }

    /**
     *This API is used to query the list of RO groups.
     * @param req DescribeReadOnlyGroupsRequest
     * @return DescribeReadOnlyGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReadOnlyGroupsResponse DescribeReadOnlyGroups(DescribeReadOnlyGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReadOnlyGroups", DescribeReadOnlyGroupsResponse.class);
    }

    /**
     *This API is used to query the purchasable regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query the details of one or more PostgreSQL for Serverless instances.
     * @param req DescribeServerlessDBInstancesRequest
     * @return DescribeServerlessDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessDBInstancesResponse DescribeServerlessDBInstances(DescribeServerlessDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerlessDBInstances", DescribeServerlessDBInstancesResponse.class);
    }

    /**
     *This API is used to count and analyze slow query statements during the specified period of time and return aggregated statistical analysis results which are classified by statement with abstract parameter values.
     * @param req DescribeSlowQueryAnalysisRequest
     * @return DescribeSlowQueryAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryAnalysisResponse DescribeSlowQueryAnalysis(DescribeSlowQueryAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryAnalysis", DescribeSlowQueryAnalysisResponse.class);
    }

    /**
     *This API is used to get the slow queries during the specified period of time.
     * @param req DescribeSlowQueryListRequest
     * @return DescribeSlowQueryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryListResponse DescribeSlowQueryList(DescribeSlowQueryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryList", DescribeSlowQueryListResponse.class);
    }

    /**
     *This API is used to query the supported AZs.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to terminate an isolated instance by specifying the `DBInstanceId` parameter. The data of a terminated instance will be deleted and cannot be recovered. Be cautious with this API calling. Only the instance in isolation can be terminated.
     * @param req DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBInstanceResponse DestroyDBInstance(DestroyDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyDBInstance", DestroyDBInstanceResponse.class);
    }

    /**
     *This API is used to remove one or more instances from isolation.
     * @param req DisIsolateDBInstancesRequest
     * @return DisIsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DisIsolateDBInstancesResponse DisIsolateDBInstances(DisIsolateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisIsolateDBInstances", DisIsolateDBInstancesResponse.class);
    }

    /**
     *This API is used to initialize a TencentDB for PostgreSQL instance. This API is disused and replaced by the [CreateInstances](https://intl.cloud.tencent.com/document/api/409/56107?from_cn_redirect=1) API.
     * @param req InitDBInstancesRequest
     * @return InitDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InitDBInstancesResponse InitDBInstances(InitDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InitDBInstances", InitDBInstancesResponse.class);
    }

    /**
     *This API is used to query the purchase price of an instance.
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateDBInstances", InquiryPriceCreateDBInstancesResponse.class);
    }

    /**
     *This API is used to query the renewal price of an instance.
     * @param req InquiryPriceRenewDBInstanceRequest
     * @return InquiryPriceRenewDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewDBInstanceResponse InquiryPriceRenewDBInstance(InquiryPriceRenewDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewDBInstance", InquiryPriceRenewDBInstanceResponse.class);
    }

    /**
     *This API is used to query the fees of upgrading a specified database instance. Only pay-as-you-go instance is supported.
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpgradeDBInstance", InquiryPriceUpgradeDBInstanceResponse.class);
    }

    /**
     *This API is used to isolate an instance.
     * @param req IsolateDBInstancesRequest
     * @return IsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstancesResponse IsolateDBInstances(IsolateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstances", IsolateDBInstancesResponse.class);
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
     *This API is used to modify the backup download restrictions.
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupDownloadRestriction", ModifyBackupDownloadRestrictionResponse.class);
    }

    /**
     *This API is used to modify the backup plan of an instance, such as modifying the backup start time. By default, a full backup starts at midnight every day and the generated backup files will be retained for seven days.
     * @param req ModifyBackupPlanRequest
     * @return ModifyBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupPlanResponse ModifyBackupPlan(ModifyBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupPlan", ModifyBackupPlanResponse.class);
    }

    /**
     *This API is used to modify the expiration time of a specified data backup for an instance.
     * @param req ModifyBaseBackupExpireTimeRequest
     * @return ModifyBaseBackupExpireTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaseBackupExpireTimeResponse ModifyBaseBackupExpireTime(ModifyBaseBackupExpireTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaseBackupExpireTime", ModifyBaseBackupExpireTimeResponse.class);
    }

    /**
     *This API is used to switch the instance billing mode from pay-as-you-go to monthly subscription.
     * @param req ModifyDBInstanceChargeTypeRequest
     * @return ModifyDBInstanceChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceChargeTypeResponse ModifyDBInstanceChargeType(ModifyDBInstanceChargeTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceChargeType", ModifyDBInstanceChargeTypeResponse.class);
    }

    /**
     *This API is used to modify the AZs where the nodes of a source instance reside.
     * @param req ModifyDBInstanceDeploymentRequest
     * @return ModifyDBInstanceDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceDeploymentResponse ModifyDBInstanceDeployment(ModifyDBInstanceDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceDeployment", ModifyDBInstanceDeploymentResponse.class);
    }

    /**
     *This API is used to modify the HA configuration of an instance. which includes:
<li>Allow the standby node to promote to the primary node.
<li>Allow a semi-sync instance to adopt sync or async replication.
     * @param req ModifyDBInstanceHAConfigRequest
     * @return ModifyDBInstanceHAConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceHAConfigResponse ModifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceHAConfig", ModifyDBInstanceHAConfigResponse.class);
    }

    /**
     *This API is used to rename a TencentDB for PostgreSQL instance.
     * @param req ModifyDBInstanceNameRequest
     * @return ModifyDBInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNameResponse ModifyDBInstanceName(ModifyDBInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceName", ModifyDBInstanceNameResponse.class);
    }

    /**
     *This API is used to modify instance parameters.
     * @param req ModifyDBInstanceParametersRequest
     * @return ModifyDBInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceParametersResponse ModifyDBInstanceParameters(ModifyDBInstanceParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceParameters", ModifyDBInstanceParametersResponse.class);
    }

    /**
     *This API is used to modify the RO group of an instance.
     * @param req ModifyDBInstanceReadOnlyGroupRequest
     * @return ModifyDBInstanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceReadOnlyGroupResponse ModifyDBInstanceReadOnlyGroup(ModifyDBInstanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceReadOnlyGroup", ModifyDBInstanceReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to modify the security group of an instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify instance specifications, including memory and disk size.
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSpec", ModifyDBInstanceSpecResponse.class);
    }

    /**
     *This API is used to modify the project of an instance.
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstancesProject", ModifyDBInstancesProjectResponse.class);
    }

    /**
     *This API is used to modify the configurations, such as parameter template name and description. It can also be used to manage the parameter list in the parameter template.
     * @param req ModifyParameterTemplateRequest
     * @return ModifyParameterTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParameterTemplateResponse ModifyParameterTemplate(ModifyParameterTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParameterTemplate", ModifyParameterTemplateResponse.class);
    }

    /**
     *This API is used to modify RO group configuration.
     * @param req ModifyReadOnlyGroupConfigRequest
     * @return ModifyReadOnlyGroupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReadOnlyGroupConfigResponse ModifyReadOnlyGroupConfig(ModifyReadOnlyGroupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReadOnlyGroupConfig", ModifyReadOnlyGroupConfigResponse.class);
    }

    /**
     *This API is used to perform a primary-standby switch for an instance waiting for the switch after it is upgraded.
     * @param req ModifySwitchTimePeriodRequest
     * @return ModifySwitchTimePeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifySwitchTimePeriodResponse ModifySwitchTimePeriod(ModifySwitchTimePeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySwitchTimePeriod", ModifySwitchTimePeriodResponse.class);
    }

    /**
     *This API is used to enable the public network access of an instance.
     * @param req OpenDBExtranetAccessRequest
     * @return OpenDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenDBExtranetAccessResponse OpenDBExtranetAccess(OpenDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenDBExtranetAccess", OpenDBExtranetAccessResponse.class);
    }

    /**
     *This API is used to enable the public network address of a PostgreSQL for Serverless instance.
     * @param req OpenServerlessDBExtranetAccessRequest
     * @return OpenServerlessDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public OpenServerlessDBExtranetAccessResponse OpenServerlessDBExtranetAccess(OpenServerlessDBExtranetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenServerlessDBExtranetAccess", OpenServerlessDBExtranetAccessResponse.class);
    }

    /**
     *This API is used to rebalance the loads of read-only replicas in an RO group. Please note that connections to those read-only replicas will be interrupted transiently; therefore, you should ensure that your application can reconnect to the databases. This operation should be performed with caution.
     * @param req RebalanceReadOnlyGroupRequest
     * @return RebalanceReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RebalanceReadOnlyGroupResponse RebalanceReadOnlyGroup(RebalanceReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebalanceReadOnlyGroup", RebalanceReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to remove a read-only replica from an RO group.
     * @param req RemoveDBInstanceFromReadOnlyGroupRequest
     * @return RemoveDBInstanceFromReadOnlyGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveDBInstanceFromReadOnlyGroupResponse RemoveDBInstanceFromReadOnlyGroup(RemoveDBInstanceFromReadOnlyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveDBInstanceFromReadOnlyGroup", RemoveDBInstanceFromReadOnlyGroupResponse.class);
    }

    /**
     *This API is used to renew an instance.
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
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
     *This API is used to restart an instance.
     * @param req RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartDBInstanceResponse RestartDBInstance(RestartDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDBInstance", RestartDBInstanceResponse.class);
    }

    /**
     *This API is used to recover database-related objects such as databases and tables on the original instance based on the backup set or recovery target time.
     * @param req RestoreDBInstanceObjectsRequest
     * @return RestoreDBInstanceObjectsResponse
     * @throws TencentCloudSDKException
     */
    public RestoreDBInstanceObjectsResponse RestoreDBInstanceObjects(RestoreDBInstanceObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreDBInstanceObjects", RestoreDBInstanceObjectsResponse.class);
    }

    /**
     *This API is used to set auto-renewal.
     * @param req SetAutoRenewFlagRequest
     * @return SetAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoRenewFlagResponse SetAutoRenewFlag(SetAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAutoRenewFlag", SetAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to enable the primary-standby switch of an instance.
<li>By initiating a switch, you can verify whether the primary-standby switch is performed correctly.
<li>By using forced switch, you can forcibly initiate the primary-standby switch when the delay of replica node failed to meet the switch requirement.
<li>This operation can only be performed for the primary instance.
     * @param req SwitchDBInstancePrimaryRequest
     * @return SwitchDBInstancePrimaryResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDBInstancePrimaryResponse SwitchDBInstancePrimary(SwitchDBInstancePrimaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDBInstancePrimary", SwitchDBInstancePrimaryResponse.class);
    }

    /**
     *This API is used to upgrade instance configurations. u200cThis API is disused and replaced by the [ModifyDBInstanceSpec](https://intl.cloud.tencent.com/document/api/409/63689?from_cn_redirect=1) API.
     * @param req UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceResponse UpgradeDBInstance(UpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstance", UpgradeDBInstanceResponse.class);
    }

    /**
     *This API is used to upgrade the kernel version of an instance.
     * @param req UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceKernelVersionResponse UpgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceKernelVersion", UpgradeDBInstanceKernelVersionResponse.class);
    }

    /**
     *This API is used to upgrade the major kernel version of an instance, for example, from PostgreSQL 12 to PostgreSQL 15.
     * @param req UpgradeDBInstanceMajorVersionRequest
     * @return UpgradeDBInstanceMajorVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDBInstanceMajorVersionResponse UpgradeDBInstanceMajorVersion(UpgradeDBInstanceMajorVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDBInstanceMajorVersion", UpgradeDBInstanceMajorVersionResponse.class);
    }

}
