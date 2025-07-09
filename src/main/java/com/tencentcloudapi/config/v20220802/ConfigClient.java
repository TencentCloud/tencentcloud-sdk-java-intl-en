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
package com.tencentcloudapi.config.v20220802;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.config.v20220802.models.*;

public class ConfigClient extends AbstractClient{
    private static String endpoint = "config.intl.tencentcloudapi.com";
    private static String service = "config";
    private static String version = "2022-08-02";

    public ConfigClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ConfigClient(Credential credential, String region, ClientProfile profile) {
        super(ConfigClient.endpoint, ConfigClient.version, credential, region, profile);
    }

    /**
     *Resource details.
     * @param req DescribeDiscoveredResourceRequest
     * @return DescribeDiscoveredResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiscoveredResourceResponse DescribeDiscoveredResource(DescribeDiscoveredResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiscoveredResource", DescribeDiscoveredResourceResponse.class);
    }

    /**
     *This API is used to get the account group rule list.
     * @param req ListAggregateConfigRulesRequest
     * @return ListAggregateConfigRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateConfigRulesResponse ListAggregateConfigRules(ListAggregateConfigRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateConfigRules", ListAggregateConfigRulesResponse.class);
    }

    /**
     *Account Group access the list of resources.
     * @param req ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateDiscoveredResourcesResponse ListAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateDiscoveredResources", ListAggregateDiscoveredResourcesResponse.class);
    }

    /**
     *This API is used to get the rule list.
     * @param req ListConfigRulesRequest
     * @return ListConfigRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListConfigRulesResponse ListConfigRules(ListConfigRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConfigRules", ListConfigRulesResponse.class);
    }

    /**
     *This API is used to get the resource list.
     * @param req ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDiscoveredResourcesResponse ListDiscoveredResources(ListDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDiscoveredResources", ListDiscoveredResourcesResponse.class);
    }

    /**
     *This API is used to report custom rule evaluation results.
     * @param req PutEvaluationsRequest
     * @return PutEvaluationsResponse
     * @throws TencentCloudSDKException
     */
    public PutEvaluationsResponse PutEvaluations(PutEvaluationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutEvaluations", PutEvaluationsResponse.class);
    }

}
