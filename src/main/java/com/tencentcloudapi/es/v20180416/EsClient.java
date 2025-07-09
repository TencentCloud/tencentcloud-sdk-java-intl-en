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
     *This API is used to create indices.
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIndex", CreateIndexResponse.class);
    }

    /**
     *This API is used to create an ES cluster instance with the specified specification.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *This API is used to delete indices.
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIndex", DeleteIndexResponse.class);
    }

    /**
     *This API is used to terminate a cluster instance. 
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
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
     *This API is used to obtain index metadata.
     * @param req DescribeIndexMetaRequest
     * @return DescribeIndexMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexMetaResponse DescribeIndexMeta(DescribeIndexMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexMeta", DescribeIndexMetaResponse.class);
    }

    /**
     *This API is used to query the eligible ES cluster logs in the current region.
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogs", DescribeInstanceLogsResponse.class);
    }

    /**
     *This API is used to query the operation history of an instance by specified criteria.
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *This API is used to query all eligible instances in the current region under the current account.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to query view data from three dimensions: cluster, node, and Kibana.
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeViews", DescribeViewsResponse.class);
    }

    /**
     *This API is used to get the node types used to receive client requests.
     * @param req GetRequestTargetNodeTypesRequest
     * @return GetRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public GetRequestTargetNodeTypesResponse GetRequestTargetNodeTypes(GetRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRequestTargetNodeTypes", GetRequestTargetNodeTypesResponse.class);
    }

    /**
     *This API is used to restart an ES cluster instance (for operations such as system update). 
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *This API is used to restart Kibana. 
     * @param req RestartKibanaRequest
     * @return RestartKibanaResponse
     * @throws TencentCloudSDKException
     */
    public RestartKibanaResponse RestartKibana(RestartKibanaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartKibana", RestartKibanaResponse.class);
    }

    /**
     *This API is used to restart cluster nodes.
     * @param req RestartNodesRequest
     * @return RestartNodesResponse
     * @throws TencentCloudSDKException
     */
    public RestartNodesResponse RestartNodes(RestartNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartNodes", RestartNodesResponse.class);
    }

    /**
     *This API is used to update ES cluster dictionaries.
     * @param req UpdateDictionariesRequest
     * @return UpdateDictionariesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDictionariesResponse UpdateDictionaries(UpdateDictionariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDictionaries", UpdateDictionariesResponse.class);
    }

    /**
     *This API is used to update indices.
     * @param req UpdateIndexRequest
     * @return UpdateIndexResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIndexResponse UpdateIndex(UpdateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateIndex", UpdateIndexResponse.class);
    }

    /**
     *This API is used for operations such as modifying node specification, renaming an instance, modifying configuration, resetting password, and setting Kibana blocklist/allowlist. `InstanceId` is required, while `ForceRestart` is optional. Other parameters or parameter combinations and their meanings are as follows:
- InstanceName: renames an instance (only for instance identification)
- NodeInfoList: modifies node configuration (horizontally scaling nodes, vertically scaling nodes, adding primary nodes, adding cold nodes, etc.)
- EsConfig: modifies cluster configuration
- Password: changes the password of the default user "elastic"
- EsAcl: modifies the ACL
- CosBackUp: sets auto-backup to COS for a cluster
Only one of the parameters or parameter combinations above can be passed in at a time, while passing fewer or more ones will cause the request to fail.
     * @param req UpdateInstanceRequest
     * @return UpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateInstanceResponse UpdateInstance(UpdateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateInstance", UpdateInstanceResponse.class);
    }

    /**
     *This API is used to change the list of plugins.
     * @param req UpdatePluginsRequest
     * @return UpdatePluginsResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePluginsResponse UpdatePlugins(UpdatePluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePlugins", UpdatePluginsResponse.class);
    }

    /**
     *This API is used to update the node types used to receive client requests.
     * @param req UpdateRequestTargetNodeTypesRequest
     * @return UpdateRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRequestTargetNodeTypesResponse UpdateRequestTargetNodeTypes(UpdateRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRequestTargetNodeTypes", UpdateRequestTargetNodeTypesResponse.class);
    }

    /**
     *This API is used to upgrade ES cluster version
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *This API is used to upgrade ES X-Pack.
     * @param req UpgradeLicenseRequest
     * @return UpgradeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLicenseResponse UpgradeLicense(UpgradeLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLicense", UpgradeLicenseResponse.class);
    }

}
