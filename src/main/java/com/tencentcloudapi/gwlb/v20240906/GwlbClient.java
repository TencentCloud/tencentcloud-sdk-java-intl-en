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
package com.tencentcloudapi.gwlb.v20240906;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gwlb.v20240906.models.*;

public class GwlbClient extends AbstractClient{
    private static String endpoint = "gwlb.intl.tencentcloudapi.com";
    private static String service = "gwlb";
    private static String version = "2024-09-06";
    
    public GwlbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GwlbClient(Credential credential, String region, ClientProfile profile) {
        super(GwlbClient.endpoint, GwlbClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind target groups to a CLB.This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req AssociateTargetGroupsRequest
     * @return AssociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateTargetGroupsResponse AssociateTargetGroups(AssociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateTargetGroups", AssociateTargetGroupsResponse.class);
    }

    /**
     *This API is used to create a GWLB instance. To use the GWLB service, you must purchase one or more GWLB instances. After this API is called successfully, a unique ID for the GWLB instance will be returned.Note: The default purchase quota for each account in each region is 10.This is an async API. After the API is called successfully, you can use the DescribeGatewayLoadBalancers API to query the status of the GWLB instance (such as creating and normal) to determine whether the creation is successful.
     * @param req CreateGatewayLoadBalancerRequest
     * @return CreateGatewayLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateGatewayLoadBalancerResponse CreateGatewayLoadBalancer(CreateGatewayLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGatewayLoadBalancer", CreateGatewayLoadBalancerResponse.class);
    }

    /**
     *This API is used to create a target group. This feature is in beta testing. If you need to use it, please [submit a ticket](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1).
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTargetGroup", CreateTargetGroupResponse.class);
    }

    /**
     *This API is used to delete one or more specified GWLB instances. After successful deletion, the GWLB instances will be unbound from the backend service.This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestId as an input parameter to check whether this task is successful.
     * @param req DeleteGatewayLoadBalancerRequest
     * @return DeleteGatewayLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatewayLoadBalancerResponse DeleteGatewayLoadBalancer(DeleteGatewayLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGatewayLoadBalancer", DeleteGatewayLoadBalancerResponse.class);
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
     *This API is used to unbind a server from a target group.
This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeregisterTargetGroupInstancesRequest
     * @return DeregisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetGroupInstancesResponse DeregisterTargetGroupInstances(DeregisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargetGroupInstances", DeregisterTargetGroupInstancesResponse.class);
    }

    /**
     *This API is used to query the list of GWLB instances in a region.
     * @param req DescribeGatewayLoadBalancersRequest
     * @return DescribeGatewayLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayLoadBalancersResponse DescribeGatewayLoadBalancers(DescribeGatewayLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayLoadBalancers", DescribeGatewayLoadBalancersResponse.class);
    }

    /**
     *This API is used to query the backend service status of a target group. Currently, only GWLB type target groups support querying backend service status.
     * @param req DescribeTargetGroupInstanceStatusRequest
     * @return DescribeTargetGroupInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstanceStatusResponse DescribeTargetGroupInstanceStatus(DescribeTargetGroupInstanceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupInstanceStatus", DescribeTargetGroupInstanceStatusResponse.class);
    }

    /**
     *This API is used to obtain information on servers bound to a target group.
     * @param req DescribeTargetGroupInstancesRequest
     * @return DescribeTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstancesResponse DescribeTargetGroupInstances(DescribeTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupInstances", DescribeTargetGroupInstancesResponse.class);
    }

    /**
     *This API is used to obtain a target group list.
     * @param req DescribeTargetGroupListRequest
     * @return DescribeTargetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupListResponse DescribeTargetGroupList(DescribeTargetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupList", DescribeTargetGroupListResponse.class);
    }

    /**
     *This API is used to query target group information.
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroups", DescribeTargetGroupsResponse.class);
    }

    /**
     *This API is used to query the execution status of an async task. After non-query APIs (for example, used to create/delete CLB instances) are called successfully, this API needs to be used to query whether the task is successful.
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *This API is used to disassociate a CLB from a target group.This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DisassociateTargetGroupsRequest
     * @return DisassociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateTargetGroupsResponse DisassociateTargetGroups(DisassociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateTargetGroups", DisassociateTargetGroupsResponse.class);
    }

    /**
     *This API is used to query the price for creating a GWLB.
     * @param req InquirePriceCreateGatewayLoadBalancerRequest
     * @return InquirePriceCreateGatewayLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateGatewayLoadBalancerResponse InquirePriceCreateGatewayLoadBalancer(InquirePriceCreateGatewayLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateGatewayLoadBalancer", InquirePriceCreateGatewayLoadBalancerResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CLB instance. It supports modifying the name and bandwidth cap of the CLB instance.
     * @param req ModifyGatewayLoadBalancerAttributeRequest
     * @return ModifyGatewayLoadBalancerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayLoadBalancerAttributeResponse ModifyGatewayLoadBalancerAttribute(ModifyGatewayLoadBalancerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGatewayLoadBalancerAttribute", ModifyGatewayLoadBalancerAttributeResponse.class);
    }

    /**
     *This API is used to modify the name, health check, and other attributes of the target group.
     * @param req ModifyTargetGroupAttributeRequest
     * @return ModifyTargetGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributeResponse ModifyTargetGroupAttribute(ModifyTargetGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupAttribute", ModifyTargetGroupAttributeResponse.class);
    }

    /**
     *This API is used to modify the server weight of a target group.This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req ModifyTargetGroupInstancesWeightRequest
     * @return ModifyTargetGroupInstancesWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesWeightResponse ModifyTargetGroupInstancesWeight(ModifyTargetGroupInstancesWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupInstancesWeight", ModifyTargetGroupInstancesWeightResponse.class);
    }

    /**
     *This API is used to register servers to a target group.This is an async API. After the API return succeeds, you can call the DescribeTaskStatus API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req RegisterTargetGroupInstancesRequest
     * @return RegisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetGroupInstancesResponse RegisterTargetGroupInstances(RegisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargetGroupInstances", RegisterTargetGroupInstancesResponse.class);
    }

}
