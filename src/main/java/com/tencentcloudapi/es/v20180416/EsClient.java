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
package com.tencentcloudapi.es.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.es.v20180416.models.*;

public class EsClient extends AbstractClient{
    private static String endpoint = "es.intl.tencentcloudapi.com";
    private static String service = "es";
    private static String version = "2018-04-16";

    public EsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EsClient(Credential credential, String region, ClientProfile profile) {
        super(EsClient.endpoint, EsClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an auto backup snapshot policy.
     * @param req CreateAutoBackUpStrategyRequest
     * @return CreateAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoBackUpStrategyResponse CreateAutoBackUpStrategy(CreateAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoBackUpStrategy", CreateAutoBackUpStrategyResponse.class);
    }

    /**
     *Create an index
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIndex", CreateIndexResponse.class);
    }

    /**
     *Create an ES cluster instance with the specified specification.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *This API is used to delete an auto backup snapshot policy.
     * @param req DeleteAutoBackUpStrategyRequest
     * @return DeleteAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoBackUpStrategyResponse DeleteAutoBackUpStrategy(DeleteAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoBackUpStrategy", DeleteAutoBackUpStrategyResponse.class);
    }

    /**
     *Delete an index
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIndex", DeleteIndexResponse.class);
    }

    /**
     *Terminate cluster instances
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *This API is used to obtain an auto backup snapshot policy.
     * @param req DescribeAutoBackUpStrategyRequest
     * @return DescribeAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackUpStrategyResponse DescribeAutoBackUpStrategy(DescribeAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoBackUpStrategy", DescribeAutoBackUpStrategyResponse.class);
    }

    /**
     *This API is used to obtain the index list.
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexList", DescribeIndexListResponse.class);
    }

    /**
     *This API is used to retrieve index metadata.
     * @param req DescribeIndexMetaRequest
     * @return DescribeIndexMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexMetaResponse DescribeIndexMeta(DescribeIndexMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexMeta", DescribeIndexMetaResponse.class);
    }

    /**
     *Query the logs of eligible ES clusters in that region for the user.
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogs", DescribeInstanceLogsResponse.class);
    }

    /**
     *Query the operation records of an instance under specified conditions.
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *Query all instances meeting conditions for the user in that region
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *Query view data of a cluster, including cluster-level, node, and Kibana dimensions.
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeViews", DescribeViewsResponse.class);
    }

    /**
     *Get the node type that receives client requests.
     * @param req GetRequestTargetNodeTypesRequest
     * @return GetRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public GetRequestTargetNodeTypesResponse GetRequestTargetNodeTypes(GetRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRequestTargetNodeTypes", GetRequestTargetNodeTypesResponse.class);
    }

    /**
     *This API is used to modify the common information of an auto backup snapshot policy.
     * @param req ModifyAutoBackUpCommonInfoRequest
     * @return ModifyAutoBackUpCommonInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackUpCommonInfoResponse ModifyAutoBackUpCommonInfo(ModifyAutoBackUpCommonInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackUpCommonInfo", ModifyAutoBackUpCommonInfoResponse.class);
    }

    /**
     *This API is used to modify an auto backup snapshot policy.
     * @param req ModifyAutoBackUpStrategyRequest
     * @return ModifyAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackUpStrategyResponse ModifyAutoBackUpStrategy(ModifyAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackUpStrategy", ModifyAutoBackUpStrategyResponse.class);
    }

    /**
     *Restart ES cluster instances for system version update.
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *Restart Kibana
     * @param req RestartKibanaRequest
     * @return RestartKibanaResponse
     * @throws TencentCloudSDKException
     */
    public RestartKibanaResponse RestartKibana(RestartKibanaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartKibana", RestartKibanaResponse.class);
    }

    /**
     *Used to restart cluster nodes.
     * @param req RestartNodesRequest
     * @return RestartNodesResponse
     * @throws TencentCloudSDKException
     */
    public RestartNodesResponse RestartNodes(RestartNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartNodes", RestartNodesResponse.class);
    }

    /**
     *Update the ES cluster dictionary
     * @param req UpdateDictionariesRequest
     * @return UpdateDictionariesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDictionariesResponse UpdateDictionaries(UpdateDictionariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDictionaries", UpdateDictionariesResponse.class);
    }

    /**
     *Updates an index
     * @param req UpdateIndexRequest
     * @return UpdateIndexResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIndexResponse UpdateIndex(UpdateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateIndex", UpdateIndexResponse.class);
    }

    /**
     *Perform operations on the cluster, such as node specification change, instance name modification, configuration modification, password resetting, and Kibana blocklist/allowlist addition. InstanceId is a required parameter, while ForceRestart is optional. The remaining parameter combinations and their meanings are as follows:
- InstanceName: Modify the instance name (only used to identify the instance)
-NodeInfoList: Modify node configuration (horizontally scale nodes, vertically scale nodes, add primary nodes, add cold nodes, etc.)
-EsConfig: modify cluster configuration
-Password: Modify the password of the default user elastic
-EsAcl: Modify an ACL
-CosBackUp: Set cluster COS auto backup information
Only one of the above parameters can be passed. Passing more or fewer will cause request failure.
     * @param req UpdateInstanceRequest
     * @return UpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateInstanceResponse UpdateInstance(UpdateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateInstance", UpdateInstanceResponse.class);
    }

    /**
     *Update the plug-in list
     * @param req UpdatePluginsRequest
     * @return UpdatePluginsResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePluginsResponse UpdatePlugins(UpdatePluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePlugins", UpdatePluginsResponse.class);
    }

    /**
     *This API is used to update the node type that receives client requests.
     * @param req UpdateRequestTargetNodeTypesRequest
     * @return UpdateRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRequestTargetNodeTypesResponse UpdateRequestTargetNodeTypes(UpdateRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRequestTargetNodeTypes", UpdateRequestTargetNodeTypesResponse.class);
    }

    /**
     *Upgrades the edition of an ES cluster
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *Upgrade ES commercial features
     * @param req UpgradeLicenseRequest
     * @return UpgradeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLicenseResponse UpgradeLicense(UpgradeLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLicense", UpgradeLicenseResponse.class);
    }

}
