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
package com.tencentcloudapi.tdmysql.v20211122;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdmysql.v20211122.models.*;

public class TdmysqlClient extends AbstractClient{
    private static String endpoint = "tdmysql.intl.tencentcloudapi.com";
    private static String service = "tdmysql";
    private static String version = "2021-11-22";

    public TdmysqlClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdmysqlClient(Credential credential, String region, ClientProfile profile) {
        super(TdmysqlClient.endpoint, TdmysqlClient.version, credential, region, profile);
    }

    /**
     *This API is used to lift isolation for instances in batch.
     * @param req CancelIsolateDBInstancesRequest
     * @return CancelIsolateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CancelIsolateDBInstancesResponse CancelIsolateDBInstances(CancelIsolateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelIsolateDBInstances", CancelIsolateDBInstancesResponse.class);
    }

    /**
     *Create an instance backup set.
     * @param req CreateDBSBackupRequest
     * @return CreateDBSBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBSBackupResponse CreateDBSBackup(CreateDBSBackupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBSBackup", CreateDBSBackupResponse.class);
    }

    /**
     *Delete instance backup sets.
     * @param req DeleteDBSBackupSetsRequest
     * @return DeleteDBSBackupSetsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDBSBackupSetsResponse DeleteDBSBackupSets(DeleteDBSBackupSetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDBSBackupSets", DeleteDBSBackupSetsResponse.class);
    }

    /**
     *No place to call.

This API is used to query whether billing is enabled.
     * @param req DescribeBillingEnableRequest
     * @return DescribeBillingEnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingEnableResponse DescribeBillingEnable(DescribeBillingEnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingEnable", DescribeBillingEnableResponse.class);
    }

    /**
     *This API is used to obtain the current parameter settings of the instance.
     * @param req DescribeDBParametersRequest
     * @return DescribeDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParametersResponse DescribeDBParameters(DescribeDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParameters", DescribeDBParametersResponse.class);
    }

    /**
     *Query recoverable time.
     * @param req DescribeDBSAvailableRecoveryTimeRequest
     * @return DescribeDBSAvailableRecoveryTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSAvailableRecoveryTimeResponse DescribeDBSAvailableRecoveryTime(DescribeDBSAvailableRecoveryTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSAvailableRecoveryTime", DescribeDBSAvailableRecoveryTimeResponse.class);
    }

    /**
     *Query clone list of instances.
     * @param req DescribeDBSCloneInstancesRequest
     * @return DescribeDBSCloneInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSCloneInstancesResponse DescribeDBSCloneInstances(DescribeDBSCloneInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSCloneInstances", DescribeDBSCloneInstancesResponse.class);
    }

    /**
     *This API is used to query instance security group information.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the object list in the database of a cloud database instance, including table, stored procedure, view and function.
     * @param req DescribeDatabaseObjectsRequest
     * @return DescribeDatabaseObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseObjectsResponse DescribeDatabaseObjects(DescribeDatabaseObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseObjects", DescribeDatabaseObjectsResponse.class);
    }

    /**
     *Redundant API, no API calls.

This API is used to query table information of a cloud database instance.
     * @param req DescribeDatabaseTableRequest
     * @return DescribeDatabaseTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseTableResponse DescribeDatabaseTable(DescribeDatabaseTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseTable", DescribeDatabaseTableResponse.class);
    }

    /**
     *This API is used to query the process status of an asynchronous task.
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlow", DescribeFlowResponse.class);
    }

    /**
     *This API is used to destroy instances in batch.
     * @param req DestroyInstancesRequest
     * @return DestroyInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstancesResponse DestroyInstances(DestroyInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstances", DestroyInstancesResponse.class);
    }

    /**
     *This API is used to batch isolate instances.
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *This API is used to modify the auto-renewal flag.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to entirely overwrite the API feature of ModifyInstanceCdc.

Modify the binlog status.
     * @param req ModifyBinlogStatusRequest
     * @return ModifyBinlogStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBinlogStatusResponse ModifyBinlogStatus(ModifyBinlogStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBinlogStatus", ModifyBinlogStatusResponse.class);
    }

    /**
     *This API is used to modify cloud database security groups.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify instance parameters.
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *Modify the instance backup strategy.
     * @param req ModifyDBSBackupPolicyRequest
     * @return ModifyDBSBackupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSBackupPolicyResponse ModifyDBSBackupPolicy(ModifyDBSBackupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSBackupPolicy", ModifyDBSBackupPolicyResponse.class);
    }

    /**
     *Modify the backup set remark.
     * @param req ModifyDBSBackupSetCommentRequest
     * @return ModifyDBSBackupSetCommentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBSBackupSetCommentResponse ModifyDBSBackupSetComment(ModifyDBSBackupSetCommentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBSBackupSetComment", ModifyDBSBackupSetCommentResponse.class);
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

}
