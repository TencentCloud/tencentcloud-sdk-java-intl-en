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
package com.tencentcloudapi.clb.v20230417;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.clb.v20230417.models.*;

public class ClbClient extends AbstractClient{
    private static String endpoint = "clb.intl.tencentcloudapi.com";
    private static String service = "clb";
    private static String version = "2023-04-17";

    public ClbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClbClient(Credential credential, String region, ClientProfile profile) {
        super(ClbClient.endpoint, ClbClient.version, credential, region, profile);
    }

    /**
     *The BatchModifyTargetWeight API is used to modify the forwarding weight of backend machines bound to a Cloud Load Balancer listener in batch. The resource limit is 500. This is an async API. After it returns a successful result, call DescribeTaskStatus API with the returned RequestID as input parameter to check whether this task is successful.<br/>This API is supported by layer-4 and layer-7 CLB listeners but not by classic CLB.
     * @param req BatchModifyTargetWeightRequest
     * @return BatchModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetWeightResponse BatchModifyTargetWeight(BatchModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetWeight", BatchModifyTargetWeightResponse.class);
    }

    /**
     *This API is used to clone a Cloud Load Balancer instance. Based on the designated CLB instance, it creates a new instance with identical rules and binding relationships. The cloning operation is asynchronous. The cloned data is based on the call to CloneLoadBalancer. If the cloned CLB changes after calling CloneLoadBalancer, the change rules will not be cloned.

Limitation notes:
Does not support basic networks, classic CLB, IPv6, or NAT64.
Unsupported Monthly Subscription CLB
The listener does not support QUIC or port ranges.
No support for backend types: target group, Serverless Cloud Function (SCF).
Personalized configuration, redirection configuration, and security group default allow switch will not be cloned and must be manually configured.

API calling
BGP bandwidth package must include bandwidth package ID
Exclusive cluster cloning must pass corresponding parameters, otherwise shared instance creation is used.
The feature is in beta test. You can submit a [beta test application](https://www.tencentcloud.com/apply/p/1akuvsmyn0g?from_cn_redirect=1).
     * @param req CloneLoadBalancerRequest
     * @return CloneLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CloneLoadBalancerResponse CloneLoadBalancer(CloneLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneLoadBalancer", CloneLoadBalancerResponse.class);
    }

    /**
     *This API is used to create a Cloud Load Balancer instance (this interface supports only pay-as-you-go CLB instances. For annual/monthly subscription, proceed to purchase through the console). To use the CLB service, you must purchase one or more CLB instances. After successfully calling the API, the unique ID of the CLB instance will be returned. CLB instances are divided into public network and private network types. For details, refer to the product type in the product description.
Note: (1) To apply for Cloud Load Balancer (CLB) in a specified availability zone or cross-zone disaster recovery (only supported in Hong Kong (China)), [submit a request](https://console.cloud.tencent.com/workorder/category) if you need to experience the feature. (2) Currently only Beijing, Shanghai, and Guangzhou support IPv6. (3) The default purchase quota for an account in each region is 100 for public network and 100 for private network.
This is an async API. After the API returns successfully, you can use the DescribeLoadBalancers API to query the status of the Cloud Load Balancer instance (such as creating and normal) to confirm whether the creation is successful.
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to obtain listener information of classic CLB.
     * @param req DescribeClassicalLBListenersRequest
     * @return DescribeClassicalLBListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBListenersResponse DescribeClassicalLBListeners(DescribeClassicalLBListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBListeners", DescribeClassicalLBListenersResponse.class);
    }

    /**
     *This API is used to query the locations, servers, or CLB instances bound to a configuration. If there are domains, the result will be filtered by domain.
     * @param req DescribeCustomizedConfigAssociateListRequest
     * @return DescribeCustomizedConfigAssociateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizedConfigAssociateListResponse DescribeCustomizedConfigAssociateList(DescribeCustomizedConfigAssociateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizedConfigAssociateList", DescribeCustomizedConfigAssociateListResponse.class);
    }

    /**
     *Pull the list of custom configurations. The configurations of the specified type under the user's AppId will be returned.
     * @param req DescribeCustomizedConfigListRequest
     * @return DescribeCustomizedConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizedConfigListResponse DescribeCustomizedConfigList(DescribeCustomizedConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizedConfigList", DescribeCustomizedConfigListResponse.class);
    }

    /**
     *This API is used to query the list of CLB instances associated with a certificate in a region by certificate ID.
     * @param req DescribeLoadBalancerListByCertIdRequest
     * @return DescribeLoadBalancerListByCertIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerListByCertIdResponse DescribeLoadBalancerListByCertId(DescribeLoadBalancerListByCertIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerListByCertId", DescribeLoadBalancerListByCertIdResponse.class);
    }

    /**
     *This API is used to query the list of CLB instances in a region.
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *Query the detailed information of Cloud Load Balancer, including listeners, rules, and backend targets.
     * @param req DescribeLoadBalancersDetailRequest
     * @return DescribeLoadBalancersDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersDetailResponse DescribeLoadBalancersDetail(DescribeLoadBalancersDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancersDetail", DescribeLoadBalancersDetailResponse.class);
    }

    /**
     *This API (DescribeTargetHealth) is used to query the health check result of a real server of a CLB instance. It is not supported by Classic CLB.
     * @param req DescribeTargetHealthRequest
     * @return DescribeTargetHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetHealthResponse DescribeTargetHealth(DescribeTargetHealthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetHealth", DescribeTargetHealthResponse.class);
    }

    /**
     *This API is used to create, delete, modify, bind, and unbind custom CLB configurations.
     * @param req SetCustomizedConfigForLoadBalancerRequest
     * @return SetCustomizedConfigForLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public SetCustomizedConfigForLoadBalancerResponse SetCustomizedConfigForLoadBalancer(SetCustomizedConfigForLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCustomizedConfigForLoadBalancer", SetCustomizedConfigForLoadBalancerResponse.class);
    }

}
