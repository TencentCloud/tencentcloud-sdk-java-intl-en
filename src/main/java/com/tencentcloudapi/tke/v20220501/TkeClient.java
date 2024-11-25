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
package com.tencentcloudapi.tke.v20220501;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tke.v20220501.models.*;

public class TkeClient extends AbstractClient{
    private static String endpoint = "tke.tencentcloudapi.com";
    private static String service = "tke";
    private static String version = "2022-05-01";
    
    public TkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkeClient(Credential credential, String region, ClientProfile profile) {
        super(TkeClient.endpoint, TkeClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a health check policy.
     * @param req CreateHealthCheckPolicyRequest
     * @return CreateHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateHealthCheckPolicyResponse CreateHealthCheckPolicy(CreateHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHealthCheckPolicy", CreateHealthCheckPolicyResponse.class);
    }

    /**
     *This API is used to create a TKE node pool
     * @param req CreateNodePoolRequest
     * @return CreateNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateNodePoolResponse CreateNodePool(CreateNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNodePool", CreateNodePoolResponse.class);
    }

    /**
     *This API is used to delete a health check policy.
     * @param req DeleteHealthCheckPolicyRequest
     * @return DeleteHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHealthCheckPolicyResponse DeleteHealthCheckPolicy(DeleteHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHealthCheckPolicy", DeleteHealthCheckPolicyResponse.class);
    }

    /**
     *This API is used to delete a TKE node pool.
     * @param req DeleteNodePoolRequest
     * @return DeleteNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodePoolResponse DeleteNodePool(DeleteNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodePool", DeleteNodePoolResponse.class);
    }

    /**
     *This API is used to query the information of node instances in a cluster.
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *This API is used to query a health check policy.
     * @param req DescribeHealthCheckPoliciesRequest
     * @return DescribeHealthCheckPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckPoliciesResponse DescribeHealthCheckPolicies(DescribeHealthCheckPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckPolicies", DescribeHealthCheckPoliciesResponse.class);
    }

    /**
     *This API is used to query a health check policy binding relationship.
     * @param req DescribeHealthCheckPolicyBindingsRequest
     * @return DescribeHealthCheckPolicyBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckPolicyBindingsResponse DescribeHealthCheckPolicyBindings(DescribeHealthCheckPolicyBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckPolicyBindings", DescribeHealthCheckPolicyBindingsResponse.class);
    }

    /**
     *This API is used to query a health check policy template.
     * @param req DescribeHealthCheckTemplateRequest
     * @return DescribeHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckTemplateResponse DescribeHealthCheckTemplate(DescribeHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckTemplate", DescribeHealthCheckTemplateResponse.class);
    }

    /**
     *This API is used to query a TKE node pool list.
     * @param req DescribeNodePoolsRequest
     * @return DescribeNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodePoolsResponse DescribeNodePools(DescribeNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodePools", DescribeNodePoolsResponse.class);
    }

    /**
     *This API is used to modify a health check policy.
     * @param req ModifyHealthCheckPolicyRequest
     * @return ModifyHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHealthCheckPolicyResponse ModifyHealthCheckPolicy(ModifyHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHealthCheckPolicy", ModifyHealthCheckPolicyResponse.class);
    }

    /**
     *This API is used to update a TKE node pool.
     * @param req ModifyNodePoolRequest
     * @return ModifyNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolResponse ModifyNodePool(ModifyNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodePool", ModifyNodePoolResponse.class);
    }

}
