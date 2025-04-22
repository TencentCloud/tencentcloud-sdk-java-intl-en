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
package com.tencentcloudapi.cdwpg.v20201230;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwpg.v20201230.models.*;

public class CdwpgClient extends AbstractClient{
    private static String endpoint = "cdwpg.intl.tencentcloudapi.com";
    private static String service = "cdwpg";
    private static String version = "2020-12-30";
    
    public CdwpgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwpgClient(Credential credential, String region, ClientProfile profile) {
        super(CdwpgClient.endpoint, CdwpgClient.version, credential, region, profile);
    }

    /**
     *This API is used to create  instance
     * @param req CreateInstanceByApiRequest
     * @return CreateInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceByApiResponse CreateInstanceByApi(CreateInstanceByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceByApi", CreateInstanceByApiResponse.class);
    }

    /**
     *This API is used to obtain the account list corresponding to the instance.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *Describe DBConfig History
     * @param req DescribeDBConfigHistoryRequest
     * @return DescribeDBConfigHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBConfigHistoryResponse DescribeDBConfigHistory(DescribeDBConfigHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBConfigHistory", DescribeDBConfigHistoryResponse.class);
    }

    /**
     *This API is used to describe instance configurations.
     * @param req DescribeDBParamsRequest
     * @return DescribeDBParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBParamsResponse DescribeDBParams(DescribeDBParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBParams", DescribeDBParamsResponse.class);
    }

    /**
     *This API is used to query error logs.
     * @param req DescribeErrorLogRequest
     * @return DescribeErrorLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorLogResponse DescribeErrorLog(DescribeErrorLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeErrorLog", DescribeErrorLogResponse.class);
    }

    /**
     *This API is used to query the instance information by an instance ID.
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *This API is used to get instance information.
     * @param req DescribeInstanceInfoRequest
     * @return DescribeInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceInfoResponse DescribeInstanceInfo(DescribeInstanceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceInfo", DescribeInstanceInfoResponse.class);
    }

    /**
     *This API is used to list nodes.
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *This API is used to get operations of the instance .
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *This API is used to display instance status, process progress, etc., in the instance details page.
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *This API is used to get a list of  instances.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to get a list of instance
     * @param req DescribeSimpleInstancesRequest
     * @return DescribeSimpleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleInstancesResponse DescribeSimpleInstances(DescribeSimpleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleInstances", DescribeSimpleInstancesResponse.class);
    }

    /**
     *This API is used to query slow SQL logs.
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLog", DescribeSlowLogResponse.class);
    }

    /**
     *This API is used to obtain instance upgrade records.
     * @param req DescribeUpgradeListRequest
     * @return DescribeUpgradeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpgradeListResponse DescribeUpgradeList(DescribeUpgradeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpgradeList", DescribeUpgradeListResponse.class);
    }

    /**
     *Describe User HbaConfig.
     * @param req DescribeUserHbaConfigRequest
     * @return DescribeUserHbaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserHbaConfigResponse DescribeUserHbaConfig(DescribeUserHbaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserHbaConfig", DescribeUserHbaConfigResponse.class);
    }

    /**
     *This API is used to destroy instance.
     * @param req DestroyInstanceByApiRequest
     * @return DestroyInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceByApiResponse DestroyInstanceByApi(DestroyInstanceByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstanceByApi", DestroyInstanceByApiResponse.class);
    }

    /**
     *This API is used to modify instance configurations
     * @param req ModifyDBParametersRequest
     * @return ModifyDBParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBParametersResponse ModifyDBParameters(ModifyDBParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBParameters", ModifyDBParametersResponse.class);
    }

    /**
     *This API is used to modify instance information. Only the name of an instance can be modified currently.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to modify user Hba configurations.
     * @param req ModifyUserHbaRequest
     * @return ModifyUserHbaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserHbaResponse ModifyUserHba(ModifyUserHbaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserHba", ModifyUserHbaResponse.class);
    }

    /**
     *This API is used to change account password.
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *This API is used by users to proactively restart instances in the console.
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *This API is used to scale out instance.
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to scale up instance in the console.
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

    /**
     *This API is used to upgrade Instance.
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

}
