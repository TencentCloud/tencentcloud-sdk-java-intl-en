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
     *This API is used to bind target groups to CLB listeners (layer-4 protocol) or forwarding rules (layer-7 protocol).
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
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
     *This API is used to modify forwarding weights of real servers bound to CLB listeners in batches. Up to 500 servers can be unbound in a batch. As this API is async, you should check whether the task is successful by passing the RequestId returned to the API call `DescribeTaskStatus`.<br/> This API is supported by CLB layer-4 and layer-7 listeners, but not Classis CLB counterparts.

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
     *This API is used to clone a CLB instance. CLB instance cloning indicates copying a specified CLB instance to create one with the same rules and binding relationships. The operation of this cloning API is asynchronous. The cloned data is based on the state when CloneLoadBalancer is called. If the cloned CLB instance changes after CloneLoadBalancer is called, the changed rules will not be cloned.Note: You can query the instance creation status by calling the [DescribeTaskStatus](https://intl.cloud.tencent.com/document/product/214/30683?from_cn_redirect=1) API with the returned requestId.RestrictionsInstance attribute restrictions:- Instances billed in pay-as-you-go and monthly subscription modes can be cloned. For a new instance cloned from a monthly subscription instance, its network billing mode will switch to billing by hourly bandwidth, but its bandwidth and specifications will remain the same as the settings of the original instance.- CLB instances not associated with any billable items cannot be cloned.- Classic CLB instances and CLB instances with Anti-DDoS Pro cannot be cloned.- Classic network-based instances cannot be cloned.- Anycast instances cannot be cloned.- IPv6 NAT64 instances cannot be cloned.- Blocked or frozen instances cannot be cloned.- Before cloning an instance, make sure that all certificates used on the instance have not expired; otherwise, the cloning will fail.Quota restrictions:- Instances with more than 50 listeners cannot be cloned.- Shared instances with the public network bandwidth cap exceeding 2 Gbps cannot be cloned.API calling restrictions:The bandwidth package ID must be input for BGP bandwidth packages.Corresponding parameters should be input for cloning of an exclusive cluster; otherwise, a shared instance will be created.The feature is in beta test. You can submit a [beta test application](https://intl.cloud.tencent.com/apply/p/1akuvsmyn0g?from_cn_redirect=1).
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
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
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
     *This API is used to add an SNAT IP for an SnatPro CLB instance. If SnatPro is not enabled for CLB, it will be automatically enabled after the SNAT IP is added.
This is an async API. After it is returned successfully, you can check the task result by calling `DescribeTaskStatus` with the returned `RequestID`.
     * @param req CreateLoadBalancerSnatIpsRequest
     * @return CreateLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerSnatIpsResponse CreateLoadBalancerSnatIps(CreateLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancerSnatIps", CreateLoadBalancerSnatIpsResponse.class);
    }

    /**
     *This API (CreateRule) is used to create a forwarding rule under an existing layer-7 CLB listener, where real servers must be bound to the rule instead of the listener.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
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
     *This API is used to delete a listener from a CLB instance (layer-4 or layer-7).
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *This API (DeleteLoadBalancer) is used to delete one or more specified CLB instances.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *This API is used to delete multiple listeners of a CLB instance.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req DeleteLoadBalancerListenersRequest
     * @return DeleteLoadBalancerListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerListenersResponse DeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerListeners", DeleteLoadBalancerListenersResponse.class);
    }

    /**
     *This API is used to delete the SNAT IP for an SnatPro CLB instance.
This is an async API. After it is returned successfully, you can check the task result by calling `DescribeTaskStatus` with the returned `RequestID`.
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
     *This API (DeleteRule) is used to delete a forwarding rule under a layer-7 CLB instance listener
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *This API is used to delete a target group.
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTargetGroups", DeleteTargetGroupsResponse.class);
    }

    /**
     *This API is used to unbind a SCF function with a CLB forwarding rule. For L7 listeners, you need to specify the forwarding rule by using `LocationId` or `Domain+Url`. 
This is an async API. After it is returned successfully, you can call the [DescribeTaskStatus](https://intl.cloud.tencent.com/document/product/214/30683?from_cn_redirect=1) API with the returned RequestID to check whether this task is successful.
<br/>Limits: 

- Binding with SCF is only available in Guangzhou, Shenzhen Finance, Shanghai, Shanghai Finance, Beijing, Chengdu, Hong Kong (China), Singapore, Mumbai, Tokyo, and Silicon Valley.
- SCF functions can only be bound with CLB instances of bill-by-IP accounts but not with bill-by-CVM accounts. If you are using a bill-by-CVM account, we recommend upgrading it to a bill-by-IP account. For more information, please see [Checking Account Type](https://intl.cloud.tencent.com/document/product/1199/49090?from_cn_redirect=1).
- SCF functions cannot be bound with classic CLB instances.
- SCF functions cannot be bound with classic network-based CLB instances.
- SCF functions in the same region can be bound with CLB instances. SCF functions can only be bound across VPCs but not regions.
- SCF functions can only be bound with IPv4 and IPv6 NAT64 CLB instances, but currently not with IPv6 CLB instances.
- SCF functions can only be bound with layer-7 HTTP and HTTPS listeners, but not with layer-7 QUIC listeners or layer-4 (TCP, UDP, and TCP SSL) listeners.
- Only SCF event-triggered functions can be bound with CLB instances.
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
This is an async API. After it is returned successfully, you can call the API `DescribeTaskStatus` with the returned RequestId as an input parameter to check whether this task is successful.
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
     *This API is used to unbind target groups from a rule.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
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
     *This API is used to query the refund amount of returning a CLB instance. 
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
     *This API (ModifyDomain) is used to modify a domain name under a layer-7 CLB listener.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomain", ModifyDomainResponse.class);
    }

    /**
     *This API is used to modify the domain name-level attributes of a layer-7 listener's forwarding rule, such as modifying the domain name, changing the DefaultServer, enabling/disabling HTTP/2, and modifying certificates.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req ModifyDomainAttributesRequest
     * @return ModifyDomainAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainAttributesResponse ModifyDomainAttributes(ModifyDomainAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainAttributes", ModifyDomainAttributesResponse.class);
    }

    /**
     *This API is used to modify the cloud functions associated with a load balancing forwarding rule.
     * @param req ModifyFunctionTargetsRequest
     * @return ModifyFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionTargetsResponse ModifyFunctionTargets(ModifyFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionTargets", ModifyFunctionTargetsResponse.class);
    }

    /**
     *This API (ModifyListener) is used to modify the attributes of a CLB listener, such as listener name, health check parameter, certificate information, and forwarding policy.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
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

Note: For CLB instances of bill-by-CVM users, cross-region attributes can be set only after a bandwidth package is purchased.This is an asynchronous API. After it returns a result successfully, the obtained RequestID should be used as an input parameter to call the DescribeTaskStatus API, for checking whether this task succeeds.
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *This API is used to upgrade a pay-as-you-go shared CLB instance to an LCU-supported CLB instance. <br/>
Limits
- This API can only be used to upgrade pay-as-you-go shared instances. To upgrade monthly-subscribed shared instances, please go to the CLB console.
- An LCU-supported instance cannot be changed back to a shared instance.
- Classic CLB instances cannot be upgraded to LCU-supported instances.
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
     *This API (ModifyRule) is used to modify the attributes of a forwarding rule under a layer-7 CLB listener, such as forwarding path, health check attribute, and forwarding policy.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
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
     *This API (ModifyTargetWeight) is used to modify the forwarding weight of a real server bound to a CLB instance.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyTargetWeightRequest
     * @return ModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetWeightResponse ModifyTargetWeight(ModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetWeight", ModifyTargetWeightResponse.class);
    }

    /**
     *This API is used to bind an SCF function with the L7 forwarding rule of a CLB instance. Note that you need to create an L7 listener (HTTP, HTTPS) and forwarding rule first.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.<br/>
**Limits:**
- Binding with SCF is only available in Guangzhou, Shenzhen Finance, Shanghai, Shanghai Finance, Beijing, Chengdu, Hong Kong (China), Singapore, Mumbai, Tokyo, and Silicon Valley.
- SCF functions can only be bound with CLB instances of bill-by-IP accounts but not with bill-by-CVM accounts. If you are using a bill-by-CVM account, we recommend upgrading it to a bill-by-IP account. For more information, please see [Checking Account Type](https://intl.cloud.tencent.com/document/product/1199/49090?from_cn_redirect=1). 
- SCF functions cannot be bound with classic CLB instances.
- SCF functions cannot be bound with classic network-based CLB instances.
- SCF functions in the same region can be bound with CLB instances. SCF functions can only be bound across VPCs but not regions.
- SCF functions can only be bound with IPv4 and IPv6 NAT64 CLB instances, but currently not with IPv6 CLB instances.
- SCF functions can only be bound with layer-7 HTTP and HTTPS listeners, but not with layer-7 QUIC listeners or layer-4 (TCP, UDP, and TCP SSL) listeners.
- Only SCF event-triggered functions can be bound with CLB instances.
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
     *This API (RegisterTargets) is used to bind one or more real servers to a CLB listener or layer-7 forwarding rule. Before using this API, you need to create relevant layer-4 listeners or layer-7 forwarding rules. For the former (TCP/UDP), only the listener ID needs to be specified, while for the latter (HTTP/HTTPS), the forwarding rule also needs to be specified through LocationId or Domain+Url.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
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
     *This API is used to configure (bind and unbind) security groups for a public network CLB instance. You can use the DescribeLoadBalancers API to query the security groups currently bound to a CLB instance. This API follows the set semantics.For binding operations, the input parameters should specify all security groups that should be bound (have been bound and will be bound) to the CLB instance.For unbinding operations, the input parameters should specify all security groups bound to a CLB instance after unbinding. If you want to unbind all security groups, you can omit this parameter or input an empty array. Note: After a private network CLB is bound to an EIP, the security groups on the CLB do not take effect for the traffic from the EIP, but take effect for the traffic from the private network CLB.
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

    /**
     *This API is used to enable or disable a CLB instance or listener.This is an asynchronous API. After it returns a result successfully, the obtained RequestID should be used as an input parameter to call the DescribeTaskStatus API, for checking whether this task succeeds.This feature is currently in beta test. To use it, submit a [ticket](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1) for application.
     * @param req SetLoadBalancerStartStatusRequest
     * @return SetLoadBalancerStartStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerStartStatusResponse SetLoadBalancerStartStatus(SetLoadBalancerStartStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerStartStatus", SetLoadBalancerStartStatusResponse.class);
    }

    /**
     *This API is used to bind or unbind a security group for multiple public network CLB instances. Note: Private network CLB do not support binding security groups.
     * @param req SetSecurityGroupForLoadbalancersRequest
     * @return SetSecurityGroupForLoadbalancersResponse
     * @throws TencentCloudSDKException
     */
    public SetSecurityGroupForLoadbalancersResponse SetSecurityGroupForLoadbalancers(SetSecurityGroupForLoadbalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSecurityGroupForLoadbalancers", SetSecurityGroupForLoadbalancersResponse.class);
    }

}
