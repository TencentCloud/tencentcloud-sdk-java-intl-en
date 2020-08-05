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
    private static String endpoint = "clb.tencentcloudapi.com";
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
        JsonResponseModel<AssociateTargetGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateTargetGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateTargetGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *An HTTPS:443 listener needs to be created first, along with a forwarding rule. When this API is called, an HTTP:80 listener will be created automatically if it did not exist and a forwarding rule corresponding to `Domains` (specified in the input parameter) under the HTTPS:443 listener will also be created. After successful creation, access requests to an HTTP:80 address will be redirected to an HTTPS:443 address automatically.
     * @param req AutoRewriteRequest
     * @return AutoRewriteResponse
     * @throws TencentCloudSDKException
     */
    public AutoRewriteResponse AutoRewrite(AutoRewriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AutoRewriteResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AutoRewriteResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AutoRewrite"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind layer-4/layer-7 real servers in batches.
     * @param req BatchDeregisterTargetsRequest
     * @return BatchDeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeregisterTargetsResponse BatchDeregisterTargets(BatchDeregisterTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeregisterTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeregisterTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BatchDeregisterTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the forwarding weights of real servers bound to a CLB listener in batches. It supports layer-4 and layer-7 CLB listeners but not Classic CLB.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req BatchModifyTargetWeightRequest
     * @return BatchModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetWeightResponse BatchModifyTargetWeight(BatchModifyTargetWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyTargetWeightResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyTargetWeightResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BatchModifyTargetWeight"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind CVM instances or ENIs in batches. It supports cross-region binding and layer-4 and layer-7 (TCP, UDP, HTTP, HTTPS) protocols.
     * @param req BatchRegisterTargetsRequest
     * @return BatchRegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterTargetsResponse BatchRegisterTargets(BatchRegisterTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchRegisterTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BatchRegisterTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BatchRegisterTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a listener for a CLB instance.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateLoadBalancerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoadBalancerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLoadBalancer"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a SNAT IP for a SnatPro CLB instance. If SnatPro is not enabled for CLB, it will be automatically enabled after the SNAT IP is added.
     * @param req CreateLoadBalancerSnatIpsRequest
     * @return CreateLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerSnatIpsResponse CreateLoadBalancerSnatIps(CreateLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLoadBalancerSnatIpsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoadBalancerSnatIpsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLoadBalancerSnatIps"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateRule) is used to create a forwarding rule under an existing layer-7 CLB listener, where real servers must be bound to the rule instead of the listener.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a target group. This feature is in beta test, if you want to try it out, please [submit a ticket](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1).
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTargetGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTargetGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTargetGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a listener from a CLB instance (layer-4 or layer-7).
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteLoadBalancer) is used to delete one or more specified CLB instances.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoadBalancerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoadBalancerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoadBalancer"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete multiple listeners of a CLB instance.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req DeleteLoadBalancerListenersRequest
     * @return DeleteLoadBalancerListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerListenersResponse DeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoadBalancerListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoadBalancerListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoadBalancerListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a SNAT IP for a SnatPro CLB instance.
     * @param req DeleteLoadBalancerSnatIpsRequest
     * @return DeleteLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerSnatIpsResponse DeleteLoadBalancerSnatIps(DeleteLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoadBalancerSnatIpsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoadBalancerSnatIpsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoadBalancerSnatIps"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteRewrite) is used to delete the redirection relationship between the specified forwarding rules.
     * @param req DeleteRewriteRequest
     * @return DeleteRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRewriteResponse DeleteRewrite(DeleteRewriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRewriteResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRewriteResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRewrite"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteRule) is used to delete a forwarding rule under a layer-7 CLB instance listener
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a target group.
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTargetGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTargetGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTargetGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a server from a target group.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetGroupInstancesRequest
     * @return DeregisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetGroupInstancesResponse DeregisterTargetGroupInstances(DeregisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeregisterTargetGroupInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeregisterTargetGroupInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeregisterTargetGroupInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeregisterTargets) is used to unbind one or more real servers from a CLB listener or forwarding rule. For layer-4 listeners, only the listener ID needs to be specified. For layer-7 listeners, the forwarding rule also needs to be specified through LocationId or Domain+Url.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetsRequest
     * @return DeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetsResponse DeregisterTargets(DeregisterTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeregisterTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeregisterTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeregisterTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeregisterTargetsFromClassicalLB) is used to unbind real servers from a classic load balancer.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetsFromClassicalLBRequest
     * @return DeregisterTargetsFromClassicalLBResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetsFromClassicalLBResponse DeregisterTargetsFromClassicalLB(DeregisterTargetsFromClassicalLBRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeregisterTargetsFromClassicalLBResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeregisterTargetsFromClassicalLBResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeregisterTargetsFromClassicalLB"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of blocked IPs (blocklist) of a CLB instance. (This API is in beta test. To use it, please submit a ticket.)
     * @param req DescribeBlockIPListRequest
     * @return DescribeBlockIPListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIPListResponse DescribeBlockIPList(DescribeBlockIPListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlockIPListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlockIPListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBlockIPList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the execution status of an async IP blocking (blocklisting) task by the async task ID returned by the `ModifyBlockIPList` API. (This API is in beta test. To use it, please submit a ticket.)
     * @param req DescribeBlockIPTaskRequest
     * @return DescribeBlockIPTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIPTaskResponse DescribeBlockIPTask(DescribeBlockIPTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlockIPTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlockIPTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBlockIPTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeClassicalLBByInstanceId) is used to get the list of classic CLB IDs through the real server instance ID.
     * @param req DescribeClassicalLBByInstanceIdRequest
     * @return DescribeClassicalLBByInstanceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBByInstanceIdResponse DescribeClassicalLBByInstanceId(DescribeClassicalLBByInstanceIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicalLBByInstanceIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicalLBByInstanceIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClassicalLBByInstanceId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeClassicalLBHealthStatus) is used to get the real server health status of a classic CLB
     * @param req DescribeClassicalLBHealthStatusRequest
     * @return DescribeClassicalLBHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBHealthStatusResponse DescribeClassicalLBHealthStatus(DescribeClassicalLBHealthStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicalLBHealthStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicalLBHealthStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClassicalLBHealthStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeClassicalLBListeners) is used to get the listener information of a classic CLB.
     * @param req DescribeClassicalLBListenersRequest
     * @return DescribeClassicalLBListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBListenersResponse DescribeClassicalLBListeners(DescribeClassicalLBListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicalLBListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicalLBListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClassicalLBListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeClassicalLBTargets) is used to get the real servers bound to a classic CLB.
     * @param req DescribeClassicalLBTargetsRequest
     * @return DescribeClassicalLBTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBTargetsResponse DescribeClassicalLBTargets(DescribeClassicalLBTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicalLBTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicalLBTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClassicalLBTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of listeners by CLB instance ID, listener protocol, or port. If no filter is specified, all listeners under the CLB instance will be returned.
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of CLB instances associated with a certificate in a region by certificate ID.
     * @param req DescribeLoadBalancerListByCertIdRequest
     * @return DescribeLoadBalancerListByCertIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerListByCertIdResponse DescribeLoadBalancerListByCertId(DescribeLoadBalancerListByCertIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancerListByCertIdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancerListByCertIdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoadBalancerListByCertId"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of CLB instances in a region.

     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoadBalancers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRewrite) is used to query the redirection relationship between the forwarding rules of a CLB instance by instance ID. If no listener ID or forwarding rule ID is specified, all redirection relationships in the instance will be returned.
     * @param req DescribeRewriteRequest
     * @return DescribeRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRewriteResponse DescribeRewrite(DescribeRewriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRewriteResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRewriteResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRewrite"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of servers bound to a target group.
     * @param req DescribeTargetGroupInstancesRequest
     * @return DescribeTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstancesResponse DescribeTargetGroupInstances(DescribeTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTargetGroupInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTargetGroupInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTargetGroupInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the target group list.
     * @param req DescribeTargetGroupListRequest
     * @return DescribeTargetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupListResponse DescribeTargetGroupList(DescribeTargetGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTargetGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTargetGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTargetGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the target group information.
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTargetGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTargetGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTargetGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTargetHealth) is used to query the health check result of a real server of a CLB instance.
     * @param req DescribeTargetHealthRequest
     * @return DescribeTargetHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetHealthResponse DescribeTargetHealth(DescribeTargetHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTargetHealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTargetHealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTargetHealth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeTargets) is used to query the list of real servers bound to some listeners of a CLB instance.
     * @param req DescribeTargetsRequest
     * @return DescribeTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetsResponse DescribeTargets(DescribeTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the execution status of an async task. After non-query APIs (used to create/delete CLB instances, listeners, or rules or to bind/unbind real servers) are called successfully, this API needs to be used to query whether the task is successful.
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind target groups from a rule.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req DisassociateTargetGroupsRequest
     * @return DisassociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateTargetGroupsResponse DisassociateTargetGroups(DisassociateTargetGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateTargetGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateTargetGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateTargetGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *After the original access address and the address to be redirected are configured manually, the system will automatically redirect requests made to the original access address to the target address of the corresponding path. Multiple paths can be configured as a redirection policy under one domain name to achieve automatic redirection between HTTP and HTTPS. A redirection policy should meet the following rules: if A has already been redirected to B, then it cannot be redirected to C (unless the original redirection relationship is deleted and a new one is created), and B cannot be redirected to any other addresses.
     * @param req ManualRewriteRequest
     * @return ManualRewriteResponse
     * @throws TencentCloudSDKException
     */
    public ManualRewriteResponse ManualRewrite(ManualRewriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManualRewriteResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManualRewriteResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManualRewrite"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the client IP blocklist of a CLB instance. One forwarding rule supports blocking up to 2,000,000 IPs. One blocklist can contain up to 2,000,000 entries.
(This API is in beta test. To use it, please submit a ticket.)
     * @param req ModifyBlockIPListRequest
     * @return ModifyBlockIPListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIPListResponse ModifyBlockIPList(ModifyBlockIPListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlockIPListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlockIPListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyBlockIPList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDomain) is used to modify a domain name under a layer-7 CLB listener.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the domain name-level attributes of a layer-7 listener's forwarding rule, such as modifying the domain name, changing the DefaultServer, enabling/disabling HTTP/2, and modifying certificates.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req ModifyDomainAttributesRequest
     * @return ModifyDomainAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainAttributesResponse ModifyDomainAttributes(ModifyDomainAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDomainAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyListener) is used to modify the attributes of a CLB listener, such as listener name, health check parameter, certificate information, and forwarding policy.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a CLB instance such as name and cross-region attributes.
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoadBalancerAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancerAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLoadBalancerAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyRule) is used to modify the attributes of a forwarding rule under a layer-7 CLB listener, such as forwarding path, health check attribute, and forwarding policy.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a target group or modify its default port attribute.
     * @param req ModifyTargetGroupAttributeRequest
     * @return ModifyTargetGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributeResponse ModifyTargetGroupAttribute(ModifyTargetGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTargetGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTargetGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTargetGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify server ports of a target group in batches.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req ModifyTargetGroupInstancesPortRequest
     * @return ModifyTargetGroupInstancesPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesPortResponse ModifyTargetGroupInstancesPort(ModifyTargetGroupInstancesPortRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTargetGroupInstancesPortResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTargetGroupInstancesPortResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTargetGroupInstancesPort"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify server weights of a target group in batches.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req ModifyTargetGroupInstancesWeightRequest
     * @return ModifyTargetGroupInstancesWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesWeightResponse ModifyTargetGroupInstancesWeight(ModifyTargetGroupInstancesWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTargetGroupInstancesWeightResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTargetGroupInstancesWeightResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTargetGroupInstancesWeight"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyTargetPort) is used to modify the port of a real server bound to a listener.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyTargetPortRequest
     * @return ModifyTargetPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetPortResponse ModifyTargetPort(ModifyTargetPortRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTargetPortResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTargetPortResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTargetPort"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyTargetWeight) is used to modify the forwarding weight of a real server bound to a CLB instance.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyTargetWeightRequest
     * @return ModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetWeightResponse ModifyTargetWeight(ModifyTargetWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTargetWeightResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTargetWeightResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTargetWeight"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to register servers to a target group.
This is an async API. After it is returned successfully, you can call the `DescribeTaskStatus` API with the returned `RequestID` as an input parameter to check whether this task is successful.
     * @param req RegisterTargetGroupInstancesRequest
     * @return RegisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetGroupInstancesResponse RegisterTargetGroupInstances(RegisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterTargetGroupInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterTargetGroupInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RegisterTargetGroupInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RegisterTargets) is used to bind one or more real servers to a CLB listener or layer-7 forwarding rule. Before using this API, you need to create relevant layer-4 listeners or layer-7 forwarding rules. For the former (TCP/UDP), only the listener ID needs to be specified, while for the latter (HTTP/HTTPS), the forwarding rule also needs to be specified through LocationId or Domain+Url.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req RegisterTargetsRequest
     * @return RegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetsResponse RegisterTargets(RegisterTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterTargetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterTargetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RegisterTargets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RegisterTargetsWithClassicalLB) is used to bind real servers to a classic CLB.
This is an async API. After it is returned successfully, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req RegisterTargetsWithClassicalLBRequest
     * @return RegisterTargetsWithClassicalLBResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetsWithClassicalLBResponse RegisterTargetsWithClassicalLB(RegisterTargetsWithClassicalLBRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterTargetsWithClassicalLBResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterTargetsWithClassicalLBResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RegisterTargetsWithClassicalLB"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ReplaceCertForLoadBalancersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceCertForLoadBalancersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceCertForLoadBalancers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add, delete, and update the CLS topic of a CLB instance.
     * @param req SetLoadBalancerClsLogRequest
     * @return SetLoadBalancerClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerClsLogResponse SetLoadBalancerClsLog(SetLoadBalancerClsLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetLoadBalancerClsLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetLoadBalancerClsLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetLoadBalancerClsLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (SetLoadBalancerSecurityGroups) is used to bind/unbind security groups for a public network CLB instance. You can use the DescribeLoadBalancers API to query the security groups bound to a CLB instance. This API uses `set` semantics.
During a binding operation, the input parameters need to be all security groups to be bound to the CLB instance (including those already bound ones and new ones).
During an unbinding operation, the input parameters need to be all the security groups still bound to the CLB instance after the unbinding operation. To unbind all security groups, you can leave this parameter empty or pass in an empty array. Note: Private network CLB do not support binding security groups.
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetLoadBalancerSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetLoadBalancerSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetLoadBalancerSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind or unbind a security group for multiple public network CLB instances. Note: Private network CLB do not support binding security groups.
     * @param req SetSecurityGroupForLoadbalancersRequest
     * @return SetSecurityGroupForLoadbalancersResponse
     * @throws TencentCloudSDKException
     */
    public SetSecurityGroupForLoadbalancersResponse SetSecurityGroupForLoadbalancers(SetSecurityGroupForLoadbalancersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetSecurityGroupForLoadbalancersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetSecurityGroupForLoadbalancersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetSecurityGroupForLoadbalancers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
