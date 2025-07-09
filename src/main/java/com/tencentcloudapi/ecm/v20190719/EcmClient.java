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
package com.tencentcloudapi.ecm.v20190719;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ecm.v20190719.models.*;

public class EcmClient extends AbstractClient{
    private static String endpoint = "ecm.intl.tencentcloudapi.com";
    private static String service = "ecm";
    private static String version = "2019-07-19";

    public EcmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EcmClient(Credential credential, String region, ClientProfile profile) {
        super(EcmClient.endpoint, EcmClient.version, credential, region, profile);
    }

    /**
     *This API is used to apply for one or multiple EIPs.
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateAddresses", AllocateAddressesResponse.class);
    }

    /**
     *This API is used to apply for an IPv6 address for an ENI.
     * @param req AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6AddressesResponse AssignIpv6Addresses(AssignIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6Addresses", AssignIpv6AddressesResponse.class);
    }

    /**
     *This API is used to apply for a private IP for an ENI.
     * @param req AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignPrivateIpAddressesResponse AssignPrivateIpAddresses(AssignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignPrivateIpAddresses", AssignPrivateIpAddressesResponse.class);
    }

    /**
     *This API is used to bind an EIP to an instance or the specified private IP of an ENI.
Binding an EIP to an instance (ECM) is essentially to bind it to the primary private IP of the primary ENI of the instance.
When you bind an EIP to the private IP of the specified ENI, if the private IP is already bound to an EIP or public IP, a failure will be reported, and you must unbind it first before you can bind it to a new EIP.
Only EIPs in `UNBIND` status can be bound to a private IP.
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateAddress", AssociateAddressResponse.class);
    }

    /**
     *This API is used to bind a security group.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to bind an ENI to a CVM instance.
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachNetworkInterface", AttachNetworkInterfaceResponse.class);
    }

    /**
     *This API is used to batch unbind real servers.
     * @param req BatchDeregisterTargetsRequest
     * @return BatchDeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeregisterTargetsResponse BatchDeregisterTargets(BatchDeregisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeregisterTargets", BatchDeregisterTargetsResponse.class);
    }

    /**
     *This API is used to batch modify the forwarding weights of the real servers bound to a listener.
     * @param req BatchModifyTargetWeightRequest
     * @return BatchModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetWeightResponse BatchModifyTargetWeight(BatchModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetWeight", BatchModifyTargetWeightResponse.class);
    }

    /**
     *This API is used to batch bind backend targets.
     * @param req BatchRegisterTargetsRequest
     * @return BatchRegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterTargetsResponse BatchRegisterTargets(BatchRegisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRegisterTargets", BatchRegisterTargetsResponse.class);
    }

    /**
     *This API is used to create an HAVIP.
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHaVip", CreateHaVipResponse.class);
    }

    /**
     *This API is used to create an image with the system disk of an instance. The image can be used to create instances.
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImage", CreateImageResponse.class);
    }

    /**
     *This API is used to create an `OpenSSH RSA` key pair, which can be used to log in to a Linux instance.
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKeyPair", CreateKeyPairResponse.class);
    }

    /**
     *This API is used to create a CLB listener.
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     *This API is used to purchase a CLB instance.
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to create a module.
     * @param req CreateModuleRequest
     * @return CreateModuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateModuleResponse CreateModule(CreateModuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModule", CreateModuleResponse.class);
    }

    /**
     *This API is used to create an ENI.
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkInterface", CreateNetworkInterfaceResponse.class);
    }

    /**
     *After a VPC is created, the system will create a default route table, with which all new subnets will be associated. By default, you can use the default route table to manage your routing policies. If you have multiple routing policies, you can call the API for route table creation to create more route tables to manage your routing policies.
     * @param req CreateRouteTableRequest
     * @return CreateRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteTableResponse CreateRouteTable(CreateRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRouteTable", CreateRouteTableResponse.class);
    }

    /**
     *This API is used to create a routing policy.
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoutes", CreateRoutesResponse.class);
    }

    /**
     *This API is used to create a security group.
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroup", CreateSecurityGroupResponse.class);
    }

    /**
     *<p>This API is used to create a security group policy.</p>
<p>In the `SecurityGroupPolicySet` parameter:</p>
<ul>
<li>`Version`: the version number of a security group policy, which automatically increases by one each time you update the security policy, to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored.</li>
<li>When creating the `Egress` and `Ingress` polices,<ul>
<li><code>Protocol</code>: <code>TCP</code>, <code>UDP</code>, <code>ICMP</code>, <code>GRE</code>, or <code>ALL</code>.</li>
<li>`CidrBlock`: a CIDR block in the correct format. In a classic network, if a `CidrBlock` contains private IPs on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
<li>`SecurityGroupId`: ID of the security group. It can be the ID of security group to be modified, or the ID of other security group in the same project. All private IPs of all CVMs under the security group will be covered. If this field is used, the policy will automatically change according to the CVM associated with the group ID while being used to match network messages. You don’t need to change it manually.</li>
<li>`Port`: a single port number such as 80, or a port range in the format of “8000-8010”. You may use this field only if the `Protocol` field takes the value `TCP` or `UDP`. Otherwise `Protocol` and `Port` are mutually exclusive.</li>
<li>`Action`: only allows `ACCEPT` or `DROP`.</li>
<li>`CidrBlock`, `SecurityGroupId`, and `AddressTemplate` are mutually exclusive. `Protocol` + `Port` and `ServiceTemplate` are mutually exclusive.</li>
<li>You can only create policies in one direction in each request. To specify the `PolicyIndex` parameter, use the same index number in policies.</li>
</ul></li></ul>
<p>Default API request rate limit: 20 requests/sec.</p>
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupPolicies", CreateSecurityGroupPoliciesResponse.class);
    }

    /**
     *This API is used to create a subnet. After the subnet is created successfully, it will become the default subnet for the AZ.
     * @param req CreateSubnetRequest
     * @return CreateSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubnet", CreateSubnetResponse.class);
    }

    /**
     *This API is used to create a VPC.
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpc", CreateVpcResponse.class);
    }

    /**
     *This API is used to delete an HAVIP.
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHaVip", DeleteHaVipResponse.class);
    }

    /**
     *This API is used to delete an image.
     * @param req DeleteImageRequest
     * @return DeleteImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageResponse DeleteImage(DeleteImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImage", DeleteImageResponse.class);
    }

    /**
     *This API is used to delete a CLB listener.
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *This API is used to delete a CLB instance.
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *This API is used to delete multiple CLB listeners.
     * @param req DeleteLoadBalancerListenersRequest
     * @return DeleteLoadBalancerListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerListenersResponse DeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerListeners", DeleteLoadBalancerListenersResponse.class);
    }

    /**
     *This API is used to delete a business module.
     * @param req DeleteModuleRequest
     * @return DeleteModuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModuleResponse DeleteModule(DeleteModuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModule", DeleteModuleResponse.class);
    }

    /**
     *This API is used to delete an ENI.
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkInterface", DeleteNetworkInterfaceResponse.class);
    }

    /**
     *This API is used to delete a route table.
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRouteTable", DeleteRouteTableResponse.class);
    }

    /**
     *This API is used to batch delete routing policies from a route table.
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoutes", DeleteRoutesResponse.class);
    }

    /**
     *Only security groups under the current account can be deleted.
A security group cannot be deleted directly if its instance ID is used in the policy of another security group. In this case, you need to modify the policy first before deleting the security group.
Deleted security groups cannot be recovered. Therefore, call this API with caution.
     * @param req DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupResponse DeleteSecurityGroup(DeleteSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroup", DeleteSecurityGroupResponse.class);
    }

    /**
     *`SecurityGroupPolicySet.Version` is used to specify the version of the security group to be manipulated. If the `Version` value passed in differs from the current latest version of the security group, a failure will be returned. If `Version` is not passed in, the policy of the specified `PolicyIndex` will be deleted directly.
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroupPolicies", DeleteSecurityGroupPoliciesResponse.class);
    }

    /**
     *This API is used to delete a snapshot.

* Only snapshots in the `NORMAL` state can be deleted. To query the state of a snapshot, you can call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and check the `SnapshotState` field in the response.
* Batch operations are supported. If there is any snapshot that cannot be deleted, the operation will not be performed and a specific error code will be returned.
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshots", DeleteSnapshotsResponse.class);
    }

    /**
     *This API is used to delete a subnet. If the subnet is the current default subnet in the AZ, after it is deleted, the default subnet automatically created by the system rather than the last subnet created by you will be used as the new default subnet. If the new default subnet does not meet your needs, you can call the API for setting the default subnet to configure it.
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubnet", DeleteSubnetResponse.class);
    }

    /**
     *This API is used to delete a VPC.
     * @param req DeleteVpcRequest
     * @return DeleteVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcResponse DeleteVpc(DeleteVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpc", DeleteVpcResponse.class);
    }

    /**
     *This API is used to query the quota information of the EIP under your account in the current region.
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressQuota", DescribeAddressQuotaResponse.class);
    }

    /**
     *This API is used to query the list of EIPs.
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddresses", DescribeAddressesResponse.class);
    }

    /**
     *This API is used to get the basic data displayed on the overview page.
     * @param req DescribeBaseOverviewRequest
     * @return DescribeBaseOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseOverviewResponse DescribeBaseOverview(DescribeBaseOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaseOverview", DescribeBaseOverviewResponse.class);
    }

    /**
     *This API is used to get the limits of data such as bandwidth and disk.
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfig", DescribeConfigResponse.class);
    }

    /**
     *This API is used to query an image import task.
     * @param req DescribeCustomImageTaskRequest
     * @return DescribeCustomImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomImageTaskResponse DescribeCustomImageTask(DescribeCustomImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomImageTask", DescribeCustomImageTaskResponse.class);
    }

    /**
     *This API is used to query the default subnet in an AZ.
     * @param req DescribeDefaultSubnetRequest
     * @return DescribeDefaultSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultSubnetResponse DescribeDefaultSubnet(DescribeDefaultSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultSubnet", DescribeDefaultSubnetResponse.class);
    }

    /**
     *This API is used to query the list of HAVIPs.
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHaVips", DescribeHaVipsResponse.class);
    }

    /**
     *This API is used to display the list of images.
     * @param req DescribeImageRequest
     * @return DescribeImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageResponse DescribeImage(DescribeImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImage", DescribeImageResponse.class);
    }

    /**
     *This API is used to query the list of operating systems supported by an image imported from an external resource.
     * @param req DescribeImportImageOsRequest
     * @return DescribeImportImageOsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportImageOsResponse DescribeImportImageOs(DescribeImportImageOsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImportImageOs", DescribeImportImageOsResponse.class);
    }

    /**
     *This API is used to get the list of model configurations.
     * @param req DescribeInstanceTypeConfigRequest
     * @return DescribeInstanceTypeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypeConfigResponse DescribeInstanceTypeConfig(DescribeInstanceTypeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTypeConfig", DescribeInstanceTypeConfigResponse.class);
    }

    /**
     *This API is used to query the VNC URL of an instance.
     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceVncUrl", DescribeInstanceVncUrlResponse.class);
    }

    /**
     *This API is used to get the information of an instance.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to get the information of prohibited operations by instance ID.
     * @param req DescribeInstancesDeniedActionsRequest
     * @return DescribeInstancesDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDeniedActionsResponse DescribeInstancesDeniedActions(DescribeInstancesDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDeniedActions", DescribeInstancesDeniedActionsResponse.class);
    }

    /**
     *This API is used to query the list of CLB listeners.
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *This API is used to query the task status of a CLB instance.
     * @param req DescribeLoadBalanceTaskStatusRequest
     * @return DescribeLoadBalanceTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalanceTaskStatusResponse DescribeLoadBalanceTaskStatus(DescribeLoadBalanceTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalanceTaskStatus", DescribeLoadBalanceTaskStatusResponse.class);
    }

    /**
     *This API is used to query the list of CLB instances.
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *This API is used to get the list of modules.
     * @param req DescribeModuleRequest
     * @return DescribeModuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleResponse DescribeModule(DescribeModuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModule", DescribeModuleResponse.class);
    }

    /**
     *This API is used to display the details of a module.
     * @param req DescribeModuleDetailRequest
     * @return DescribeModuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleDetailResponse DescribeModuleDetail(DescribeModuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModuleDetail", DescribeModuleDetailResponse.class);
    }

    /**
     *This API is used to get the monthly peak and billable inbound/outbound bandwidth values of your node.
     * @param req DescribeMonthPeakNetworkRequest
     * @return DescribeMonthPeakNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonthPeakNetworkResponse DescribeMonthPeakNetwork(DescribeMonthPeakNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonthPeakNetwork", DescribeMonthPeakNetworkResponse.class);
    }

    /**
     *This API is used to query the list of ENIs.
     * @param req DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkInterfaces", DescribeNetworkInterfacesResponse.class);
    }

    /**
     *This API is used to get the list of nodes.
     * @param req DescribeNodeRequest
     * @return DescribeNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeResponse DescribeNode(DescribeNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNode", DescribeNodeResponse.class);
    }

    /**
     *This API is used to get the packing quota of a model in a region (when a virtual model is used, a set of correlated packing quotas will be returned).
     * @param req DescribePackingQuotaGroupRequest
     * @return DescribePackingQuotaGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackingQuotaGroupResponse DescribePackingQuotaGroup(DescribePackingQuotaGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackingQuotaGroup", DescribePackingQuotaGroupResponse.class);
    }

    /**
     *This API is used to get the peak data of basic information such as CPU, memory, and disk.
     * @param req DescribePeakBaseOverviewRequest
     * @return DescribePeakBaseOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakBaseOverviewResponse DescribePeakBaseOverview(DescribePeakBaseOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakBaseOverview", DescribePeakBaseOverviewResponse.class);
    }

    /**
     *This API is used to get the peak network data.
     * @param req DescribePeakNetworkOverviewRequest
     * @return DescribePeakNetworkOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakNetworkOverviewResponse DescribePeakNetworkOverview(DescribePeakNetworkOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakNetworkOverview", DescribePeakNetworkOverviewResponse.class);
    }

    /**
     *This API is used to query the price of an instance.
     * @param req DescribePriceRunInstanceRequest
     * @return DescribePriceRunInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePriceRunInstanceResponse DescribePriceRunInstance(DescribePriceRunInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePriceRunInstance", DescribePriceRunInstanceResponse.class);
    }

    /**
     *This API is used to query the list of conflicts between a custom routing policy and a CCN routing policy.
     * @param req DescribeRouteConflictsRequest
     * @return DescribeRouteConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteConflictsResponse DescribeRouteConflicts(DescribeRouteConflictsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteConflicts", DescribeRouteConflictsResponse.class);
    }

    /**
     *This API is used to query the list of the objects in a route table.
     * @param req DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTablesResponse DescribeRouteTables(DescribeRouteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteTables", DescribeRouteTablesResponse.class);
    }

    /**
     *This API is used to query statistics on the instances associated with a security group.
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics", DescribeSecurityGroupAssociationStatisticsResponse.class);
    }

    /**
     *This API is used to query the security group quota.
     * @param req DescribeSecurityGroupLimitsRequest
     * @return DescribeSecurityGroupLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupLimitsResponse DescribeSecurityGroupLimits(DescribeSecurityGroupLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupLimits", DescribeSecurityGroupLimitsResponse.class);
    }

    /**
     *This API is used to query a security group rule.
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupPolicies", DescribeSecurityGroupPoliciesResponse.class);
    }

    /**
     *This API is used to view a security group.
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroups", DescribeSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the list of snapshots.

* You can filter results by snapshot ID and the ID and type of the cloud disk for which the snapshot is created. The relationship between different filters is `AND`. For more information on filters, see `Filter`.
* If no parameter is defined, the status of a certain number of snapshots under the current account will be returned. The number is specified by `Limit` and is 20 by default.
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *This API is used to query the list of subnets.
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnets", DescribeSubnetsResponse.class);
    }

    /**
     *This API is used to get the health check status of a CLB real server.
     * @param req DescribeTargetHealthRequest
     * @return DescribeTargetHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetHealthResponse DescribeTargetHealth(DescribeTargetHealthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetHealth", DescribeTargetHealthResponse.class);
    }

    /**
     *This API is used to query the list of the real servers bound to a CLB instance.
     * @param req DescribeTargetsRequest
     * @return DescribeTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetsResponse DescribeTargets(DescribeTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargets", DescribeTargetsResponse.class);
    }

    /**
     *This API is used to query the execution result of an EIP async task.
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
    }

    /**
     *This API is used to get the status of an async task.
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *This API is used to query the list of VPCs.
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcs", DescribeVpcsResponse.class);
    }

    /**
     *This API is used to unbind an ENI from a CVM instance.
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachNetworkInterface", DetachNetworkInterfaceResponse.class);
    }

    /**
     *This API is used to disable a subnet route.
     * @param req DisableRoutesRequest
     * @return DisableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableRoutesResponse DisableRoutes(DisableRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRoutes", DisableRoutesResponse.class);
    }

    /**
     *This API is used to unbind an EIP.
Only EIPs in `BIND` or `BIND_ENI` status can be unbound.
Blocked EIPs cannot be unbound.
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateAddress", DisassociateAddressResponse.class);
    }

    /**
     *This API is used to unbind a key pair from an instance.
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateInstancesKeyPairs", DisassociateInstancesKeyPairsResponse.class);
    }

    /**
     *This API is used to unbind a security group.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to enable a disabled subnet route.
This API verifies whether a CCN route will conflict with an existing route after it is enabled, and if so, you cannot enable it before you disable the conflicting route first.
     * @param req EnableRoutesRequest
     * @return EnableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableRoutesResponse EnableRoutes(EnableRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableRoutes", EnableRoutesResponse.class);
    }

    /**
     *This API is used to import an image from a CVM instance to an ECM instance.
     * @param req ImportImageRequest
     * @return ImportImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportImageResponse ImportImage(ImportImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportImage", ImportImageResponse.class);
    }

    /**
     *This API is used to migrate an ENI.
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigrateNetworkInterface", MigrateNetworkInterfaceResponse.class);
    }

    /**
     *This API is used to migrate a private IP from an ENI.
It migrates a private IP from one ENI to another. Primary IPs cannot be migrated.
The source and destination ENIs must be in the same subnet.
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigratePrivateIpAddress", MigratePrivateIpAddressResponse.class);
    }

    /**
     *This API is used to modify EIP attributes.
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressAttribute", ModifyAddressAttributeResponse.class);
    }

    /**
     *This API is used to modify the EIP bandwidth.

     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressesBandwidth", ModifyAddressesBandwidthResponse.class);
    }

    /**
     *This API is used to modify the default subnet used when you create an instance in an AZ (if you don't specify the VPC parameter when creating the instance, `sunbetId` will be used).
     * @param req ModifyDefaultSubnetRequest
     * @return ModifyDefaultSubnetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultSubnetResponse ModifyDefaultSubnet(ModifyDefaultSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDefaultSubnet", ModifyDefaultSubnetResponse.class);
    }

    /**
     *This API is used to modify the attributes of an HAVIP.
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHaVipAttribute", ModifyHaVipAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of an image.
     * @param req ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAttributeResponse ModifyImageAttribute(ModifyImageAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageAttribute", ModifyImageAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of an instance.
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesAttribute", ModifyInstancesAttributeResponse.class);
    }

    /**
     *This API is used to modify the IPv6 address attributes of an ENI.
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpv6AddressesAttribute", ModifyIpv6AddressesAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CLB listener.
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListener", ModifyListenerResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CLB instance.
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *This API is used to modify the configuration of a module. You cannot modify the configuration of the module if it is associated with an instance.
     * @param req ModifyModuleConfigRequest
     * @return ModifyModuleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleConfigResponse ModifyModuleConfig(ModifyModuleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleConfig", ModifyModuleConfigResponse.class);
    }

    /**
     *This API is used to specify whether to prohibit public IP assignment for a module.
     * @param req ModifyModuleDisableWanIpRequest
     * @return ModifyModuleDisableWanIpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleDisableWanIpResponse ModifyModuleDisableWanIp(ModifyModuleDisableWanIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleDisableWanIp", ModifyModuleDisableWanIpResponse.class);
    }

    /**
     *This API is used to modify the default image of a module.
     * @param req ModifyModuleImageRequest
     * @return ModifyModuleImageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleImageResponse ModifyModuleImage(ModifyModuleImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleImage", ModifyModuleImageResponse.class);
    }

    /**
     *This API is used to modify the IP direct access of a module.
     * @param req ModifyModuleIpDirectRequest
     * @return ModifyModuleIpDirectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleIpDirectResponse ModifyModuleIpDirect(ModifyModuleIpDirectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleIpDirect", ModifyModuleIpDirectResponse.class);
    }

    /**
     *This API is used to rename a module.
     * @param req ModifyModuleNameRequest
     * @return ModifyModuleNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleNameResponse ModifyModuleName(ModifyModuleNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleName", ModifyModuleNameResponse.class);
    }

    /**
     *This API is used to modify the default bandwidth cap of a module.
     * @param req ModifyModuleNetworkRequest
     * @return ModifyModuleNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleNetworkResponse ModifyModuleNetwork(ModifyModuleNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleNetwork", ModifyModuleNetworkResponse.class);
    }

    /**
     *This API is used to modify the default security group of a module.
     * @param req ModifyModuleSecurityGroupsRequest
     * @return ModifyModuleSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleSecurityGroupsResponse ModifyModuleSecurityGroups(ModifyModuleSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleSecurityGroups", ModifyModuleSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify the private IP attributes of an ENI.
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateIpAddressesAttribute", ModifyPrivateIpAddressesAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of a route table.
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRouteTableAttribute", ModifyRouteTableAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of a security group.
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupAttribute", ModifySecurityGroupAttributeResponse.class);
    }

    /**
     *This API is used to modify the outbound and inbound rules of a security group.
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupPolicies", ModifySecurityGroupPoliciesResponse.class);
    }

    /**
     *This API is used to modify the attributes of a subnet.
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubnetAttribute", ModifySubnetAttributeResponse.class);
    }

    /**
     *This API is used to modify the port of a real server bound to a listener.
     * @param req ModifyTargetPortRequest
     * @return ModifyTargetPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetPortResponse ModifyTargetPort(ModifyTargetPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetPort", ModifyTargetPortResponse.class);
    }

    /**
     *This API is used to modify the forwarding weight of a real server bound to a listener.
     * @param req ModifyTargetWeightRequest
     * @return ModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetWeightResponse ModifyTargetWeight(ModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetWeight", ModifyTargetWeightResponse.class);
    }

    /**
     *This API is used to modify the attributes of a VPC.
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcAttribute", ModifyVpcAttributeResponse.class);
    }

    /**
     *This API is used to restart an instance. Only instances in `RUNNING` status can be restarted. The instance status will become `REBOOTING` when the API is called successfully and will become `RUNNING` when the instance is restarted successfully. Forced restart is supported. Just like powering off a physical PC and restarting it, a forced restart may cause data loss or file system corruption. Make sure that you use this API only when the server cannot be restarted normally.
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootInstances", RebootInstancesResponse.class);
    }

    /**
     *This API is used to release one or multiple EIPs.
This operation is irreversible. Once you release an EIP, the IP address associated with it will no longer belong to you.
Only EIPs in `UNBIND` status can be released.
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseAddresses", ReleaseAddressesResponse.class);
    }

    /**
     *This API is used to release the IPv6 addresses of an ENI.
     * @param req ReleaseIpv6AddressesRequest
     * @return ReleaseIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIpv6AddressesResponse ReleaseIpv6Addresses(ReleaseIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseIpv6Addresses", ReleaseIpv6AddressesResponse.class);
    }

    /**
     *This API is used to return the private IPs of an ENI.
To return the secondary private IPs of an ENI, the API will automatically unbind them from the ENI. The primary private IP of the ENI cannot be returned.
     * @param req RemovePrivateIpAddressesRequest
     * @return RemovePrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public RemovePrivateIpAddressesResponse RemovePrivateIpAddresses(RemovePrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemovePrivateIpAddresses", RemovePrivateIpAddressesResponse.class);
    }

    /**
     *This API is used to modify the route table associated with a subnet. A subnet can be associated with only one route table.
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceRouteTableAssociation", ReplaceRouteTableAssociationResponse.class);
    }

    /**
     *This API is used to replace a routing policy.
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceRoutes", ReplaceRoutesResponse.class);
    }

    /**
     *This API is used to replace a single routing rule of a security group. You can replace only one rule in a single direction in one request and must specify the index (PolicyIndex).
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceSecurityGroupPolicy", ReplaceSecurityGroupPolicyResponse.class);
    }

    /**
     *This API is used to reinstall an instance. If you specify the `ImageId` parameter, the specified image will be used; otherwise, the image used by the current instance will be used. If you don't specify the password, a password will be sent later in Message Center.
     * @param req ResetInstancesRequest
     * @return ResetInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesResponse ResetInstances(ResetInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstances", ResetInstancesResponse.class);
    }

    /**
     *This API is used to reset the bandwidth cap of an instance.
     * @param req ResetInstancesMaxBandwidthRequest
     * @return ResetInstancesMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesMaxBandwidthResponse ResetInstancesMaxBandwidth(ResetInstancesMaxBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesMaxBandwidth", ResetInstancesMaxBandwidthResponse.class);
    }

    /**
     *This API is used to reset the password for a running status. You need to explicitly specify the `ForceStop` parameter; otherwise, you can reset the password only for instances that have been shut down.
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesPassword", ResetInstancesPasswordResponse.class);
    }

    /**
     *This API is used to reset a route table name and all routing policies.
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRoutes", ResetRoutesResponse.class);
    }

    /**
     *This API is used to create an ECM instance.
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunInstances", RunInstancesResponse.class);
    }

    /**
     *This API is used to configure security groups for a CLB instance.
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

    /**
     *This API is used to bind or unbind a security group to or from multiple CLB instances.
     * @param req SetSecurityGroupForLoadbalancersRequest
     * @return SetSecurityGroupForLoadbalancersResponse
     * @throws TencentCloudSDKException
     */
    public SetSecurityGroupForLoadbalancersResponse SetSecurityGroupForLoadbalancers(SetSecurityGroupForLoadbalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSecurityGroupForLoadbalancers", SetSecurityGroupForLoadbalancersResponse.class);
    }

    /**
     *This API is used to start an instance. Only instances in `STOPPED` status can be started. The instance status will become `STARTING` when this API is called successfully and will become `RUNNING` when the instance is started successfully.
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstances", StartInstancesResponse.class);
    }

    /**
     *Only instances in `RUNNING` status can be shut down.
The instance status will become `STOPPING` when the API is called successfully and will become `STOPPED` when the instance is shut down successfully.
Forced shutdown is supported. Just like powering off a physical PC, a forced shutdown may cause data loss or file system corruption. Make sure that you use this API only when the server cannot be shut down normally.
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstances", StopInstancesResponse.class);
    }

    /**
     *This API is used to terminate an instance.
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
