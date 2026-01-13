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
package com.tencentcloudapi.clb.v20180317;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.clb.v20180317.models.*;

public class ClbClient extends AbstractClient{
    private static String endpoint = "clb.intl.tencentcloudapi.com";
    private static String service = "clb";
    private static String version = "2018-03-17";

    public ClbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClbClient(Credential credential, String region, ClientProfile profile) {
        super(ClbClient.endpoint, ClbClient.version, credential, region, profile);
    }

    /**
     *This API is used to add new personalized configurations and prepare for decommissioning. Please use SetCustomizedConfigForLoadBalancer.
     * @param req AddCustomizedConfigRequest
     * @return AddCustomizedConfigResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomizedConfigResponse AddCustomizedConfig(AddCustomizedConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCustomizedConfig", AddCustomizedConfigResponse.class);
    }

    /**
     *This API is used to associate configurations with a server or location based on the configuration type. It is preparing for decommissioning, please use SetCustomizedConfigForLoadBalancer.
     * @param req AssociateCustomizedConfigRequest
     * @return AssociateCustomizedConfigResponse
     * @throws TencentCloudSDKException
     */
    public AssociateCustomizedConfigResponse AssociateCustomizedConfig(AssociateCustomizedConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateCustomizedConfig", AssociateCustomizedConfigResponse.class);
    }

    /**
     *This API is used to bind target groups to Cloud Load Balancer listeners (Layer-4 protocol) or forwarding rules (L7 protocol).
This API is asynchronous. After it returns a successful result, you need to call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as input parameter to check whether this task is successful.
This API is used to describe restrictions.
-Binding a legacy version target group to a Layer-4 listener requires the listener to have backend target groups enabled.
-Layer-7 bind target group. LocationId is a required item in the data structure TargetGroupAssociation.
-The VPC of the Cloud Load Balancer must match the VPC of the target group.
     * @param req AssociateTargetGroupsRequest
     * @return AssociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateTargetGroupsResponse AssociateTargetGroups(AssociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateTargetGroups", AssociateTargetGroupsResponse.class);
    }

    /**
     *An HTTPS:443 listener needs to be created first, along with a forwarding rule. When this API is called, an HTTP:80 listener will be created automatically if it did not exist and a forwarding rule corresponding to `Domains` (specified in the input parameter) under the HTTPS:443 listener will also be created. After successful creation, access requests to an HTTP:80 address will be redirected to an HTTPS:443 address automatically.
     * @param req AutoRewriteRequest
     * @return AutoRewriteResponse
     * @throws TencentCloudSDKException
     */
    public AutoRewriteResponse AutoRewrite(AutoRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AutoRewrite", AutoRewriteResponse.class);
    }

    /**
     *This API is used to batch unbind real servers of the layer-4 and layer-7 VPC-based CLBs. Up to 500 real servers can be unbound in a batch.
     * @param req BatchDeregisterTargetsRequest
     * @return BatchDeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeregisterTargetsResponse BatchDeregisterTargets(BatchDeregisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeregisterTargets", BatchDeregisterTargetsResponse.class);
    }

    /**
     *This API is used to modify the tags of real servers bound to CLB listeners in batches. The maximum number of resources that can be modified in a batch is 500. This is a synchronous API. <br/> It is supported for Layer-4 and Layer-7 listeners of CLB instances, but not for classic CLB instances.
     * @param req BatchModifyTargetTagRequest
     * @return BatchModifyTargetTagResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetTagResponse BatchModifyTargetTag(BatchModifyTargetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetTag", BatchModifyTargetTagResponse.class);
    }

    /**
     *The BatchModifyTargetWeight API is used to batch modify the forwarding weight of backend machines bound to a CLB listener. The maximum resource quantity for batch modification is 500. This is an asynchronous API. After it returns a successful result, you need to call the DescribeTaskStatus API with the returned RequestID as input parameter to check whether this task is successful. This API supports both layer-4 and layer-7 CLB listeners but is unsupported for classic CLB.
     * @param req BatchModifyTargetWeightRequest
     * @return BatchModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetWeightResponse BatchModifyTargetWeight(BatchModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetWeight", BatchModifyTargetWeightResponse.class);
    }

    /**
     *This API is used to batch bind CVM instances or ENIs. Up to 500 servers can be bound in a batch. It supports cross-region binding, layer-4 and layer-7 (TCP/UDP/HTTP/HTTPS) protocols, and VPC-based CLBs only.
     * @param req BatchRegisterTargetsRequest
     * @return BatchRegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterTargetsResponse BatchRegisterTargets(BatchRegisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRegisterTargets", BatchRegisterTargetsResponse.class);
    }

    /**
     *This API is used to clone a load balancing instance with identical rules and binding relationships based on the designated Cloud Load Balancer. The cloning process is an asynchronous operation. The cloned data is based on the status when calling CloneLoadBalancer. If the source CLB changes after calling CloneLoadBalancer, the change rules will not be cloned.

Note: The instance creation status can be queried based on the returned requestId by accessing the DescribeTaskStatus API (https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1).

This API is used to describe restriction descriptions.
This API is used to set instance attribute restrictions.
-The cloning feature supports both pay-as-you-go and monthly subscription instances. For cloned monthly subscription instances, the new instance's network billing mode switches to billing by hourly bandwidth, with its bandwidth and specifications remaining consistent with the settings of the original instance.
-CLB instances not associated with billable items cannot be cloned (historic free activity creation).
-Classic CLB instances and Anti-DDoS CLBs cannot be cloned.
-Cloning of classic network-based instances is not supported.
-Anycast instances cannot be cloned.
-IPv6 NAT64 edition instances cannot be cloned.
-Blocked or frozen instances cannot be cloned.
-Before performing the cloning operation, make sure that all certificates used on the instance have not expired, otherwise cloning will fail.
This API is used to set quota dimension restrictions.
-Cloning is not supported when the number of instance listeners exceeds 50.
-Cloning is not supported when the public network bandwidth cap of a shared instance exceeds 2G.

This API is used to call APIs.
This API is used to specify the BGP bandwidth package ID.
This API is used to perform exclusive cluster cloning with corresponding parameters, otherwise shared instance creation will be used.
     * @param req CloneLoadBalancerRequest
     * @return CloneLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CloneLoadBalancerResponse CloneLoadBalancer(CloneLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneLoadBalancer", CloneLoadBalancerResponse.class);
    }

    /**
     *This API is used to create a CLB exclusive logset for storing CLB logs.
     * @param req CreateClsLogSetRequest
     * @return CreateClsLogSetResponse
     * @throws TencentCloudSDKException
     */
    public CreateClsLogSetResponse CreateClsLogSet(CreateClsLogSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClsLogSet", CreateClsLogSetResponse.class);
    }

    /**
     *This API is used to create a listener for a CLB instance.
This is an asynchronous API. After it returns the result successfully, you can call the [DescribeTaskStatus](https://intl.cloud.tencent.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     *This API (CreateLoadBalancer) is used to create a CLB instance. To use the CLB service, you first need to purchase one or more instances. After this API is called successfully, a unique instance ID will be returned. There are two types of instances: public network and private network. For more information, see the product types in the product documentation.
Note: (1) To apply for a CLB instance in the specified AZ and cross-AZ disaster recovery, please [submit a ticket](https://console.cloud.tencent.com/workorder/category); (2) Currently, IPv6 is supported only in Beijing, Shanghai, and Guangzhou regions.
This is an async API. After it is returned successfully, you can call the DescribeLoadBalancers API to query the status of the instance (such as creating and normal) to check whether it is successfully created.
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to add SnatIp for SnatPro Cloud Load Balancer. If SnatPro is not enabled, it will be auto on after adding SnatIp.
This API is used to perform asynchronous operations. After returning a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req CreateLoadBalancerSnatIpsRequest
     * @return CreateLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerSnatIpsResponse CreateLoadBalancerSnatIps(CreateLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancerSnatIps", CreateLoadBalancerSnatIpsResponse.class);
    }

    /**
     *This API is used to create forwarding rules under an existing layer-7 CLB listener. In layer-7 CLB listeners, backend services must be bound to rules instead of the listener.
This is an asynchronous API. After it returns the result successfully, you can call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *This API is used to create a target group. This feature is in beta test, if you want to try it out, please [submit a ticket](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1).
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTargetGroup", CreateTargetGroupResponse.class);
    }

    /**
     *This API is used to create a topic with the full-text index and key-value index enabled by default. The creation will fail if there is no CLB exclusive logset.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *This API is used to delete personalized configurations and prepare for decommissioning. Please use SetCustomizedConfigForLoadBalancer.
     * @param req DeleteCustomizedConfigRequest
     * @return DeleteCustomizedConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomizedConfigResponse DeleteCustomizedConfig(DeleteCustomizedConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomizedConfig", DeleteCustomizedConfigResponse.class);
    }

    /**
     *This API is used to delete listeners (layer-4 and layer-7) under a Cloud Load Balancer instance.
This API is used to perform asynchronous operations. After returning a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *This API is used to delete one or more specified CLB instances. After successful deletion, the listeners and forwarding rules under the CLB instance will be deleted together, and the backend service will be unbound.
This API is asynchronous. After it returns the result successfully, you can call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *This API is used to delete multiple listeners of Cloud Load Balancer.
This API is used to perform asynchronous operations. After it returns a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteLoadBalancerListenersRequest
     * @return DeleteLoadBalancerListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerListenersResponse DeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerListeners", DeleteLoadBalancerListenersResponse.class);
    }

    /**
     *This API is used to delete the SnatIp of the SnatPro load balancing.
This API is used to perform asynchronous operations. After returning a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteLoadBalancerSnatIpsRequest
     * @return DeleteLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerSnatIpsResponse DeleteLoadBalancerSnatIps(DeleteLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerSnatIps", DeleteLoadBalancerSnatIpsResponse.class);
    }

    /**
     *This API (DeleteRewrite) is used to delete the redirection relationship between the specified forwarding rules.
     * @param req DeleteRewriteRequest
     * @return DeleteRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRewriteResponse DeleteRewrite(DeleteRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRewrite", DeleteRewriteResponse.class);
    }

    /**
     *This API is used to delete forwarding rules under a layer-7 listener of a load balancing instance.
This API is used to perform asynchronous operations. After it returns a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *This API is used to delete target groups in batches, with a maximum of 20 target groups at a time.
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTargetGroups", DeleteTargetGroupsResponse.class);
    }

    /**
     *This API is used to unbind a cloud function from the forwarding rule of a Cloud Load Balancer. For a layer-7 (HTTP/HTTPS) listener, the forwarding rule must be specified by LocationId or Domain+Url.
This API is used to perform asynchronous operations. After it returns a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
This API is used to describe restrictions.

-SCF binding is supported only in Guangzhou, Shenzhen Finance, Shanghai, Shanghai Finance, Beijing, Chengdu, Hong Kong (China), Singapore, Tokyo, and Silicon Valley.
-Only the standard account type supports binding SCF. The classic account type is unsupported. We recommend upgrading to the standard account type. For more information, see [account type upgrade instructions](https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1).
-Classic CLB does not support binding SCF.
-Basic Network Type does not support binding SCF.
-CLB supports binding ALL SCFs in the same region by default, supports cross-VPC binding, but cross-region selection is not supported.
-Currently, only IPv4 and IPv6 NAT64 versions of Cloud Load Balancer support binding SCF. IPv6 version is not currently supported.
-Only layer-7 (HTTP, HTTPS) listeners support binding SCF. Layer-4 (TCP, UDP, TCP SSL) listeners and layer-7 QUIC listeners are unsupported.
-CLB binding SCF only supports binding cloud functions of the "Event function" type.
     * @param req DeregisterFunctionTargetsRequest
     * @return DeregisterFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterFunctionTargetsResponse DeregisterFunctionTargets(DeregisterFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterFunctionTargets", DeregisterFunctionTargetsResponse.class);
    }

    /**
     *This API is used to unbind a server from a target group.
This API is used to perform asynchronous operations. After it returns a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetGroupInstancesRequest
     * @return DeregisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetGroupInstancesResponse DeregisterTargetGroupInstances(DeregisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargetGroupInstances", DeregisterTargetGroupInstancesResponse.class);
    }

    /**
     *This API (DeregisterTargets) is used to unbind one or more real servers from a CLB listener or forwarding rule. For layer-4 listeners, only the listener ID needs to be specified. For layer-7 listeners, the forwarding rule also needs to be specified through LocationId or Domain+Url.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetsRequest
     * @return DeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetsResponse DeregisterTargets(DeregisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargets", DeregisterTargetsResponse.class);
    }

    /**
     *This API is used to unbind a CLB real server. This is an async API. After it is returned successfully, you can call the API `DescribeTaskStatus` with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetsFromClassicalLBRequest
     * @return DeregisterTargetsFromClassicalLBResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetsFromClassicalLBResponse DeregisterTargetsFromClassicalLB(DeregisterTargetsFromClassicalLBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargetsFromClassicalLB", DeregisterTargetsFromClassicalLBResponse.class);
    }

    /**
     *This API is used to query the list of blocked IPs (blocklist) of a CLB instance. (This API is in beta test. To use it, please submit a ticket.)
     * @param req DescribeBlockIPListRequest
     * @return DescribeBlockIPListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIPListResponse DescribeBlockIPList(DescribeBlockIPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockIPList", DescribeBlockIPListResponse.class);
    }

    /**
     *This API is used to query the execution status of an async IP blocking (blocklisting) task by the async task ID returned by the `ModifyBlockIPList` API. (This API is in beta test. To use it, please submit a ticket.)
     * @param req DescribeBlockIPTaskRequest
     * @return DescribeBlockIPTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIPTaskResponse DescribeBlockIPTask(DescribeBlockIPTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockIPTask", DescribeBlockIPTaskResponse.class);
    }

    /**
     *This API is used to get the list of classic CLB instance IDs through a real server ID.
     * @param req DescribeClassicalLBByInstanceIdRequest
     * @return DescribeClassicalLBByInstanceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBByInstanceIdResponse DescribeClassicalLBByInstanceId(DescribeClassicalLBByInstanceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBByInstanceId", DescribeClassicalLBByInstanceIdResponse.class);
    }

    /**
     *This API (DescribeClassicalLBHealthStatus) is used to get the real server health status of a classic CLB
     * @param req DescribeClassicalLBHealthStatusRequest
     * @return DescribeClassicalLBHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBHealthStatusResponse DescribeClassicalLBHealthStatus(DescribeClassicalLBHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBHealthStatus", DescribeClassicalLBHealthStatusResponse.class);
    }

    /**
     *This API (DescribeClassicalLBListeners) is used to get the listener information of a classic CLB.
     * @param req DescribeClassicalLBListenersRequest
     * @return DescribeClassicalLBListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBListenersResponse DescribeClassicalLBListeners(DescribeClassicalLBListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBListeners", DescribeClassicalLBListenersResponse.class);
    }

    /**
     *This API is used to get the real servers bound to a classic CLB instance.
     * @param req DescribeClassicalLBTargetsRequest
     * @return DescribeClassicalLBTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBTargetsResponse DescribeClassicalLBTargets(DescribeClassicalLBTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBTargets", DescribeClassicalLBTargetsResponse.class);
    }

    /**
     *This API is used to get the CLB exclusive logset.
     * @param req DescribeClsLogSetRequest
     * @return DescribeClsLogSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClsLogSetResponse DescribeClsLogSet(DescribeClsLogSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClsLogSet", DescribeClsLogSetResponse.class);
    }

    /**
     *Queries information of CVMs and ENIs that use cross-region binding 2.0
     * @param req DescribeCrossTargetsRequest
     * @return DescribeCrossTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossTargetsResponse DescribeCrossTargets(DescribeCrossTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossTargets", DescribeCrossTargetsResponse.class);
    }

    /**
     *This API is used to query the configured location, bound server or bound CLB instance. If there are domain names, the result will be filtered by domain name.
     * @param req DescribeCustomizedConfigAssociateListRequest
     * @return DescribeCustomizedConfigAssociateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizedConfigAssociateListResponse DescribeCustomizedConfigAssociateList(DescribeCustomizedConfigAssociateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizedConfigAssociateList", DescribeCustomizedConfigAssociateListResponse.class);
    }

    /**
     *This API is used to pull custom configuration lists to return the user configuration of `AppId`.
     * @param req DescribeCustomizedConfigListRequest
     * @return DescribeCustomizedConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizedConfigListResponse DescribeCustomizedConfigList(DescribeCustomizedConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizedConfigList", DescribeCustomizedConfigListResponse.class);
    }

    /**
     *Idle CLB instances are pay-as-you-go load balancers that, within seven days after the creation, do not have rules configured or the configured rules are not associated with any servers. 
     * @param req DescribeIdleLoadBalancersRequest
     * @return DescribeIdleLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdleLoadBalancersResponse DescribeIdleLoadBalancers(DescribeIdleLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdleLoadBalancers", DescribeIdleLoadBalancersResponse.class);
    }

    /**
     *This API is used to query CLB instances bound to the CVM or ENI.
     * @param req DescribeLBListenersRequest
     * @return DescribeLBListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLBListenersResponse DescribeLBListeners(DescribeLBListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLBListeners", DescribeLBListenersResponse.class);
    }

    /**
     *This API is used to query the operation protection info of Cloud Load Balancer.
     * @param req DescribeLBOperateProtectRequest
     * @return DescribeLBOperateProtectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLBOperateProtectResponse DescribeLBOperateProtect(DescribeLBOperateProtectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLBOperateProtect", DescribeLBOperateProtectResponse.class);
    }

    /**
     *This API is used to get the list of listeners by CLB ID, listener protocol, or listener port. If no filter is specified, all listeners for the CLB instance will be returned.
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
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
     *Queries the total number of CLB instances and the number of CLB instances in different status (running, isolated and about to expire).
     * @param req DescribeLoadBalancerOverviewRequest
     * @return DescribeLoadBalancerOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerOverviewResponse DescribeLoadBalancerOverview(DescribeLoadBalancerOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerOverview", DescribeLoadBalancerOverviewResponse.class);
    }

    /**
     *This API is used to query CLB instances with high traffic under the current account, and return the top 10 results. For queries using a sub-account, only the CLB instances authorized to the sub-account will be returned.
     * @param req DescribeLoadBalancerTrafficRequest
     * @return DescribeLoadBalancerTrafficResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerTrafficResponse DescribeLoadBalancerTraffic(DescribeLoadBalancerTrafficRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerTraffic", DescribeLoadBalancerTrafficResponse.class);
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
     *This API is used to query CLB instance details, including listener, rules, and target real servers.
     * @param req DescribeLoadBalancersDetailRequest
     * @return DescribeLoadBalancersDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersDetailResponse DescribeLoadBalancersDetail(DescribeLoadBalancersDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancersDetail", DescribeLoadBalancersDetailResponse.class);
    }

    /**
     *This API is used to query various quotas in the current region.
     * @param req DescribeQuotaRequest
     * @return DescribeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaResponse DescribeQuota(DescribeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuota", DescribeQuotaResponse.class);
    }

    /**
     *This API is used to query the list of AZs and resources supported for the user in the current region.
     * @param req DescribeResourcesRequest
     * @return DescribeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesResponse DescribeResources(DescribeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResources", DescribeResourcesResponse.class);
    }

    /**
     *This API (DescribeRewrite) is used to query the redirection relationship between the forwarding rules of a CLB instance by instance ID. If no listener ID or forwarding rule ID is specified, all redirection relationships in the instance will be returned.
     * @param req DescribeRewriteRequest
     * @return DescribeRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRewriteResponse DescribeRewrite(DescribeRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRewrite", DescribeRewriteResponse.class);
    }

    /**
     *This API is used to get the information of servers bound to a target group.
     * @param req DescribeTargetGroupInstancesRequest
     * @return DescribeTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstancesResponse DescribeTargetGroupInstances(DescribeTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupInstances", DescribeTargetGroupInstancesResponse.class);
    }

    /**
     *This API is used to get the target group list.
     * @param req DescribeTargetGroupListRequest
     * @return DescribeTargetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupListResponse DescribeTargetGroupList(DescribeTargetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupList", DescribeTargetGroupListResponse.class);
    }

    /**
     *This API is used to query the target group information.
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroups", DescribeTargetGroupsResponse.class);
    }

    /**
     *This API (DescribeTargetHealth) is used to query the health check result of a real server of a CLB instance.
     * @param req DescribeTargetHealthRequest
     * @return DescribeTargetHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetHealthResponse DescribeTargetHealth(DescribeTargetHealthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetHealth", DescribeTargetHealthResponse.class);
    }

    /**
     *This API (DescribeTargets) is used to query the list of real servers bound to some listeners of a CLB instance.
     * @param req DescribeTargetsRequest
     * @return DescribeTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetsResponse DescribeTargets(DescribeTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargets", DescribeTargetsResponse.class);
    }

    /**
     *This API is used to query the execution status of an async task. After non-query APIs (used to create/delete CLB instances, listeners, or rules or to bind/unbind real servers) are called successfully, this API needs to be used to query whether the task is successful.
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *This API is used to disassociate personalized configurations and prepare for decommissioning. Please use SetCustomizedConfigForLoadBalancer.
     * @param req DisassociateCustomizedConfigRequest
     * @return DisassociateCustomizedConfigResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateCustomizedConfigResponse DisassociateCustomizedConfig(DisassociateCustomizedConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateCustomizedConfig", DisassociateCustomizedConfigResponse.class);
    }

    /**
     *This API is used to disassociate a target group from a rule.
This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
When unbinding a Layer 7 forwarding rule, LocationId is a required item.
     * @param req DisassociateTargetGroupsRequest
     * @return DisassociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateTargetGroupsResponse DisassociateTargetGroups(DisassociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateTargetGroups", DisassociateTargetGroupsResponse.class);
    }

    /**
     *This API is used to query the price of creating a CLB instance.
     * @param req InquiryPriceCreateLoadBalancerRequest
     * @return InquiryPriceCreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateLoadBalancerResponse InquiryPriceCreateLoadBalancer(InquiryPriceCreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateLoadBalancer", InquiryPriceCreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to query the price of adjusting the specification of a CLB instance.
     * @param req InquiryPriceModifyLoadBalancerRequest
     * @return InquiryPriceModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceModifyLoadBalancerResponse InquiryPriceModifyLoadBalancer(InquiryPriceModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceModifyLoadBalancer", InquiryPriceModifyLoadBalancerResponse.class);
    }

    /**
     *This API is used to query the refund price of Cloud Load Balancer and only supports prepaid load balancing instances.
     * @param req InquiryPriceRefundLoadBalancerRequest
     * @return InquiryPriceRefundLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRefundLoadBalancerResponse InquiryPriceRefundLoadBalancer(InquiryPriceRefundLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRefundLoadBalancer", InquiryPriceRefundLoadBalancerResponse.class);
    }

    /**
     *This API is used to query the price of renewing a CLB instance. It's only available to prepaid CLB instances.
     * @param req InquiryPriceRenewLoadBalancerRequest
     * @return InquiryPriceRenewLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewLoadBalancerResponse InquiryPriceRenewLoadBalancer(InquiryPriceRenewLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewLoadBalancer", InquiryPriceRenewLoadBalancerResponse.class);
    }

    /**
     *After the original access address and the address to be redirected are configured manually, the system will automatically redirect requests made to the original access address to the target address of the corresponding path. Multiple paths can be configured as a redirection policy under one domain name to achieve automatic redirection between HTTP and HTTPS. A redirection policy should meet the following rules: if A has already been redirected to B, then it cannot be redirected to C (unless the original redirection relationship is deleted and a new one is created), and B cannot be redirected to any other addresses.
     * @param req ManualRewriteRequest
     * @return ManualRewriteResponse
     * @throws TencentCloudSDKException
     */
    public ManualRewriteResponse ManualRewrite(ManualRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManualRewrite", ManualRewriteResponse.class);
    }

    /**
     *This API is used to upgrade classic CLB instances to application CLB instances.
This is an async API. After it is returned successfully, you can check the action result by calling `DescribeLoadBalancers`. 
     * @param req MigrateClassicalLoadBalancersRequest
     * @return MigrateClassicalLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public MigrateClassicalLoadBalancersResponse MigrateClassicalLoadBalancers(MigrateClassicalLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigrateClassicalLoadBalancers", MigrateClassicalLoadBalancersResponse.class);
    }

    /**
     *This API is used to modify the client IP blocklist of a CLB instance. One forwarding rule supports blocking up to 2,000,000 IPs. One blocklist can contain up to 2,000,000 entries.
(This API is in beta test. To use it, please submit a ticket.)
     * @param req ModifyBlockIPListRequest
     * @return ModifyBlockIPListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIPListResponse ModifyBlockIPList(ModifyBlockIPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlockIPList", ModifyBlockIPListResponse.class);
    }

    /**
     *This API is used to modify personalized configuration. If the configuration is already bound to clb, server or location, update simultaneously. Prepare for decommissioning. Please use SetCustomizedConfigForLoadBalancer.
     * @param req ModifyCustomizedConfigRequest
     * @return ModifyCustomizedConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizedConfigResponse ModifyCustomizedConfig(ModifyCustomizedConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomizedConfig", ModifyCustomizedConfigResponse.class);
    }

    /**
     *This API is used to modify the domain name under a layer-7 (HTTP/HTTPS) listener of Cloud Load Balancer.
This is an asynchronous API. After it returns the result successfully, you can call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomain", ModifyDomainResponse.class);
    }

    /**
     *This API is used to modify domain-level attributes of Cloud Load Balancer layer-7 listener forwarding rules, such as modifying domain name, changing DefaultServer, enabling/disabling Http/2, and modifying certificates.
This is an async API. After it returns a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req ModifyDomainAttributesRequest
     * @return ModifyDomainAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainAttributesResponse ModifyDomainAttributes(ModifyDomainAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainAttributes", ModifyDomainAttributesResponse.class);
    }

    /**
     *This API is used to modify the SCF bound to a Cloud Load Balancer forwarding rule.
This API is used to describe restrictions.
-Only supports binding SCF of the "Event function" type.
     * @param req ModifyFunctionTargetsRequest
     * @return ModifyFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionTargetsResponse ModifyFunctionTargets(ModifyFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionTargets", ModifyFunctionTargetsResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CLB instance listener, including the listener name, health check parameters, certificate information, and forwarding policy. This API does not support classic CLB instances.
This is an asynchronous API. After it returns the result successfully, you can call the [DescribeTaskStatus](https://intl.cloud.tencent.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListener", ModifyListenerResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CLB instance, such as name and cross-region attributes.
Non-bandwidth-upshift users must add their CLB instance to a bandwidth package to configure cross-domain attributes. To modify the network billing mode, go to the console.
This API is used to perform asynchronous operations. After returning a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *This API is used to adjust the performance capacity specification of usage-based billing mode instances, for example upgrading from shared type to performance capacity type or modifying the specification of LCU-supported instances.
This API is used to set use limits.
-This API only supports adjustments for pay-as-you-go CLB instances. For CLB instance upgrades with annual/monthly subscription, make adjustments through the console.
-After upgrading from a shared instance to a performance and capacity instance, reverting to a shared instance is not supported.
-A classic CLB instance does not support upgrading to a performance and capacity instance.
     * @param req ModifyLoadBalancerSlaRequest
     * @return ModifyLoadBalancerSlaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerSlaResponse ModifyLoadBalancerSla(ModifyLoadBalancerSlaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerSla", ModifyLoadBalancerSlaResponse.class);
    }

    /**
     *This API is used to modify the projects of CLB instances. 
     * @param req ModifyLoadBalancersProjectRequest
     * @return ModifyLoadBalancersProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancersProjectResponse ModifyLoadBalancersProject(ModifyLoadBalancersProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancersProject", ModifyLoadBalancersProjectResponse.class);
    }

    /**
     *This API is used to modify the properties of forwarding rules under a layer-7 (HTTP/HTTPS) listener in Cloud Load Balancer, including forwarding path, health check attributes and forwarding policy.
This is an asynchronous API. After it returns the result successfully, you can call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *This API is used to rename a target group or modify its default port attribute.
     * @param req ModifyTargetGroupAttributeRequest
     * @return ModifyTargetGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributeResponse ModifyTargetGroupAttribute(ModifyTargetGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupAttribute", ModifyTargetGroupAttributeResponse.class);
    }

    /**
     *This API is used to modify server ports of a target group in batches.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req ModifyTargetGroupInstancesPortRequest
     * @return ModifyTargetGroupInstancesPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesPortResponse ModifyTargetGroupInstancesPort(ModifyTargetGroupInstancesPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupInstancesPort", ModifyTargetGroupInstancesPortResponse.class);
    }

    /**
     *This API is used to modify server weights of a target group in batches.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req ModifyTargetGroupInstancesWeightRequest
     * @return ModifyTargetGroupInstancesWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesWeightResponse ModifyTargetGroupInstancesWeight(ModifyTargetGroupInstancesWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupInstancesWeight", ModifyTargetGroupInstancesWeightResponse.class);
    }

    /**
     *This API (ModifyTargetPort) is used to modify the port of a real server bound to a listener.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyTargetPortRequest
     * @return ModifyTargetPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetPortResponse ModifyTargetPort(ModifyTargetPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetPort", ModifyTargetPortResponse.class);
    }

    /**
     *This API is used to modify the forwarding weight of backend service bound to Cloud Load Balancer.
This is an asynchronous API. After it returns the result successfully, you can call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestId as an input parameter to query whether the task is successful.
     * @param req ModifyTargetWeightRequest
     * @return ModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetWeightResponse ModifyTargetWeight(ModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetWeight", ModifyTargetWeightResponse.class);
    }

    /**
     *This API is used to bind a cloud function to the forwarding rule of a Cloud Load Balancer. Before that, you need to create a related HTTP or HTTPS listener and forwarding rule.
This API is used to perform asynchronous operations. After returning a successful result, call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
This API is used to describe restrictions.
-SCF binding is supported only in Guangzhou, Shenzhen Finance, Shanghai, Shanghai Finance, Beijing, Chengdu, Hong Kong (China), Singapore, Tokyo, and Silicon Valley.
-Only the standard account type supports binding SCF. The classic account type is unsupported. We recommend upgrading to the standard account type. For more information, see [account type upgrade instructions](https://www.tencentcloud.com/document/product/1199/49090?from_cn_redirect=1). 
-Classic CLB does not support binding SCF.
-Basic Network Type does not support binding SCF.
-CLB supports binding ALL SCFs in the same region by default, supports cross-VPC binding, but cross-region selection is not supported.
-Currently, only IPv4 and IPv6 NAT64 versions of Cloud Load Balancer support binding SCF. IPv6 version is not currently supported.
-Only layer-7 (HTTP, HTTPS) listeners support binding SCF. Layer-4 (TCP, UDP, TCP SSL) listeners and layer-7 QUIC listeners are unsupported.
- CLB binding SCF only supports binding SCF of the "Event function" type.
-A forwarding rule supports binding only one SCF.
     * @param req RegisterFunctionTargetsRequest
     * @return RegisterFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public RegisterFunctionTargetsResponse RegisterFunctionTargets(RegisterFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterFunctionTargets", RegisterFunctionTargetsResponse.class);
    }

    /**
     *This API is used to register servers to a target group.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req RegisterTargetGroupInstancesRequest
     * @return RegisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetGroupInstancesResponse RegisterTargetGroupInstances(RegisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargetGroupInstances", RegisterTargetGroupInstancesResponse.class);
    }

    /**
     *This API is used to bind one or more backend services to a Cloud Load Balancer listener or layer-7 forwarding rule. Before that, you need to create a related CLB layer-4 listener or layer-7 forwarding rule. For Layer-4 listeners (TCP/UDP), only specify the listener ID. For layer-7 (HTTP/HTTPS) listeners, forwarding rules must be specified through LocationId or Domain+Url.
This API is used to perform asynchronous operations. After it returns a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req RegisterTargetsRequest
     * @return RegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetsResponse RegisterTargets(RegisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargets", RegisterTargetsResponse.class);
    }

    /**
     *This API is used to bind a real server with a classic CLB instance. This is an async API. After it is returned successfully, you can call the API `DescribeTaskStatus` with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req RegisterTargetsWithClassicalLBRequest
     * @return RegisterTargetsWithClassicalLBResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetsWithClassicalLBResponse RegisterTargetsWithClassicalLB(RegisterTargetsWithClassicalLBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargetsWithClassicalLB", RegisterTargetsWithClassicalLBResponse.class);
    }

    /**
     *This API (ReplaceCertForLoadBalancers) is used to replace the certificate associated with a CLB instance. A new certificates can be associated with a CLB only after the original certificate is disassociated from it.
This API supports replacing server certificates and client certificates.
The new certificate to be used can be specified by passing in the certificate ID. If no certificate ID is specified, relevant information such as certificate content must be passed in to create a new certificate and bind it to the CLB.
Note: This API can only be called in the Guangzhou region; for other regions, an error will occur due to domain name resolution problems.
     * @param req ReplaceCertForLoadBalancersRequest
     * @return ReplaceCertForLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertForLoadBalancersResponse ReplaceCertForLoadBalancers(ReplaceCertForLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceCertForLoadBalancers", ReplaceCertForLoadBalancersResponse.class);
    }

    /**
     *This API is used to create or manage a user-defined CLB configuration template.
     * @param req SetCustomizedConfigForLoadBalancerRequest
     * @return SetCustomizedConfigForLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public SetCustomizedConfigForLoadBalancerResponse SetCustomizedConfigForLoadBalancer(SetCustomizedConfigForLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCustomizedConfigForLoadBalancer", SetCustomizedConfigForLoadBalancerResponse.class);
    }

    /**
     *This API is used to add, delete, and update the CLS topic of a CLB instance.
     * @param req SetLoadBalancerClsLogRequest
     * @return SetLoadBalancerClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerClsLogResponse SetLoadBalancerClsLog(SetLoadBalancerClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerClsLog", SetLoadBalancerClsLogResponse.class);
    }

    /**
     *This API is used to bind or unbind security groups for a public network load balancing instance. To query currently bound security groups of a load balancing instance, use the DescribeLoadBalancers API (https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1). This API follows set semantics.
This API is used to pass in all security groups that should be bound to the Cloud Load Balancer instance during the binding operation (bound + new binding).
For unbinding operations, the input parameters should specify all security groups bound to a CLB instance after unbinding. If you want to unbind all security groups, you can omit this parameter or input an empty array. Note: After a private network CLB is bound to an EIP, the security groups on the CLB do not take effect for the traffic from the EIP, but take effect for the traffic from the private network CLB.
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

    /**
     *This API is used to start or stop a load balancing instance or listener.
This API is used to perform asynchronous operations. After returning a successful result, call the [DescribeTaskStatus](https://www.tencentcloud.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID as an input parameter to check whether this task is successful.
This feature is currently in beta test. To use it, submit a [ticket](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1) for application.
     * @param req SetLoadBalancerStartStatusRequest
     * @return SetLoadBalancerStartStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerStartStatusResponse SetLoadBalancerStartStatus(SetLoadBalancerStartStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerStartStatus", SetLoadBalancerStartStatusResponse.class);
    }

    /**
     *This API is used to bind or unbind a security group to or from multiple public network CLB instances.
     * @param req SetSecurityGroupForLoadbalancersRequest
     * @return SetSecurityGroupForLoadbalancersResponse
     * @throws TencentCloudSDKException
     */
    public SetSecurityGroupForLoadbalancersResponse SetSecurityGroupForLoadbalancers(SetSecurityGroupForLoadbalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSecurityGroupForLoadbalancers", SetSecurityGroupForLoadbalancersResponse.class);
    }

}
