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
    private static String version = "2017-03-12";

    public PostgresClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PostgresClient(Credential credential, String region, ClientProfile profile) {
        super(PostgresClient.endpoint, PostgresClient.version, credential, region, profile);
    }

    /**
     *This API is used to disable the public network link to an instance.
     * @param req CloseDBExtranetAccessRequest
     * @return CloseDBExtranetAccessResponse
     * @throws TencentCloudSDKException
     */
    public CloseDBExtranetAccessResponse CloseDBExtranetAccess(CloseDBExtranetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseDBExtranetAccessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseDBExtranetAccessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseDBExtranetAccess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more TencentDB for PostgreSQL instances.
     * @param req CreateDBInstancesRequest
     * @return CreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstancesResponse CreateDBInstances(CreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
     *This API is used to query the instance backup list.
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBBackupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBBackupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBBackups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBErrlogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBErrlogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstanceAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstanceAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
     *This API is used to get slow query logs.
     * @param req DescribeDBSlowlogsRequest
     * @return DescribeDBSlowlogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSlowlogsResponse DescribeDBSlowlogs(DescribeDBSlowlogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSlowlogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSlowlogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSlowlogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBXlogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBXlogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
     *This API is used to get order information.
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrdersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOrders"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProductConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZones"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate the instance corresponding to a specified `DBInstanceId`.
     * @param req DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBInstanceResponse DestroyDBInstance(DestroyDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
     *This API is used to query the purchase price of one or multiple instances.
     * @param req InquiryPriceCreateDBInstancesRequest
     * @return InquiryPriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDBInstancesResponse InquiryPriceCreateDBInstances(InquiryPriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceRenewDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the upgrade price of an instance.
     * @param req InquiryPriceUpgradeDBInstanceRequest
     * @return InquiryPriceUpgradeDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeDBInstanceResponse InquiryPriceUpgradeDBInstance(InquiryPriceUpgradeDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpgradeDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceUpgradeDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountRemarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAccountRemark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
     *This API is used to transfer an instance to another project.
     * @param req ModifyDBInstancesProjectRequest
     * @return ModifyDBInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstancesProjectResponse ModifyDBInstancesProject(ModifyDBInstancesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstancesProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstancesProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstancesProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<OpenDBExtranetAccessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenDBExtranetAccess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAccountPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetAccountPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RestartDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<SetAutoRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetAutoRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
