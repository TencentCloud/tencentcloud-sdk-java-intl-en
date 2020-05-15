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
package com.tencentcloudapi.vpc.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vpc.v20170312.models.*;

public class VpcClient extends AbstractClient{
    private static String endpoint = "vpc.tencentcloudapi.com";
    private static String version = "2017-03-12";

    public VpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VpcClient(Credential credential, String region, ClientProfile profile) {
        super(VpcClient.endpoint, VpcClient.version, credential, region, profile);
    }

    /**
     *This API (AcceptAttachCcnInstances) is used to associate instances across accounts. Cloud Connect Network (CCN) owners accept and agree to the operations.
     * @param req AcceptAttachCcnInstancesRequest
     * @return AcceptAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AcceptAttachCcnInstancesResponse AcceptAttachCcnInstances(AcceptAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptAttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptAttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AcceptAttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for one or more [Elastic IP Addresses](https://cloud.tencent.com/document/product/213/1941) (EIPs for short).
* An EIP is a static IP address that is dedicated for dynamic cloud computing. You can quickly re-map an EIP to another instance under your account to protect against instance failures.
* Your EIP is associated with your Tencent Cloud account rather than an instance. It remains associated with your Tencent Cloud account until you choose to explicitly release it or your account is in arrears for more than 24 hours.
* The maximum number of EIPs that can be applied for a Tencent Cloud account in each region is restricted. For more information, see [EIP Product Introduction](https://cloud.tencent.com/document/product/213/5733). You can get the quota information through the DescribeAddressQuota API.
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AllocateAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssignIpv6Addresses) is used to apply for an IPv6 address for the ENI.<br />
This API is completed asynchronously. If you need to query the async execution results, use the `RequestId` returned by this API to query the `QueryTask` API.
* An ENI can only be bound with a limited number of IPs. For more information about resource limits, see<a href="/document/product/576/18527">ENI use limits</a>.
* You can specify the `IPv6` address when applying. The address type cannot be the primary `IP`. Currently, `IPv6` can only be supported as the secondary `IP`.
* The address must be unoccupied and is in the subnet to which the ENI belongs.
* When applying for one to multiple secondary `IPv6` addresses on ENI, the API will return the specified number of secondary `IPv6` addresses in the subnet range where the ENI is located.
     * @param req AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6AddressesResponse AssignIpv6Addresses(AssignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6AddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6AddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignIpv6Addresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to assign IPv6 ranges.
* To use this API, you must already have a VPC instance. If you do not have a VPC instance yet, use the <a href="https://cloud.tencent.com/document/api/215/15774" title="CreateVpc" target="_blank">CreateVpc</a> API to create one.
* Each VPC can apply for only one IPv6 range.
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6CidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6CidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignIpv6CidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssignIpv6SubnetCidrBlock) is used to assign IPv6 subnet IP ranges.
* To assign an `IPv6` IP range to a subnet, the `VPC` that the subnet belongs to should have obtained the `IPv6` IP range. If this has not been assigned, use the `AssignIpv6CidrBlock` API to assign an `IPv6` IP range to the `VPC` to which the subnet belongs. Otherwise, the `IPv6` subnet IP range cannot be assigned.
* Each subnet can only be assigned one IPv6 IP range.
     * @param req AssignIpv6SubnetCidrBlockRequest
     * @return AssignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6SubnetCidrBlockResponse AssignIpv6SubnetCidrBlock(AssignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6SubnetCidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignIpv6SubnetCidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssignPrivateIpAddresses) is used for the ENI to apply for private IPs.
* An ENI can only be bound with a limited number of IP addresses. For more information about resource limits, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can specify the private IP you want to apply for. It cannot be the primary IP, which already exists and cannot be modified. The private IP must be in the same subnet as the ENI, and cannot be occupied.
* You can apply for more than one secondary private IP on the ENI. The API will return the specified number of secondary private IPs in the subnet IP range of the ENI.
     * @param req AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignPrivateIpAddressesResponse AssignPrivateIpAddresses(AssignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignPrivateIpAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignPrivateIpAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignPrivateIpAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssociateAddress) is used to bind an [Elastic IP](https://cloud.tencent.com/document/product/213/1941) (EIP for short) to the specified private IP of an instance or ENI.
* Essentially, binding an EIP to an instance (CVM) means binding an EIP to the primary private IP of the primary ENI on an instance.
* When you bind an EIP to the primary private IP of the primary ENI, the previously bound public IP is automatically unbound and released.
* To bind the EIP to the private IP of the specified ENI (not the primary private IP of the primary ENI), you must unbind the EIP before you can bind a new one.
* To bind the EIP to a NAT gateway, use the API [EipBindNatGateway](https://cloud.tencent.com/document/product/215/4093)
* EIP that is in arrears or blocked cannot be bound.
* Only EIP in the UNBIND status can be bound.
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to associate a network ACL with subnets in a VPC instance.
     * @param req AssociateNetworkAclSubnetsRequest
     * @return AssociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkAclSubnetsResponse AssociateNetworkAclSubnets(AssociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNetworkAclSubnetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNetworkAclSubnetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateNetworkAclSubnets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssociateNetworkInterfaceSecurityGroups) is used to attach a security group to an ENI.
     * @param req AssociateNetworkInterfaceSecurityGroupsRequest
     * @return AssociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkInterfaceSecurityGroupsResponse AssociateNetworkInterfaceSecurityGroups(AssociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNetworkInterfaceSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNetworkInterfaceSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateNetworkInterfaceSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AttachCcnInstances) is used to load a network instance to a CCN instance. Network instances include VPCs and Direct Connect gateways.<br />
The number of network instances that each CCN can be associated with is limited. For more information, see the product documentation. If you need to associate more instances, please contact online customer service.
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Classiclink between a VPC instance and a basic network device.
* The VPC instance and the basic network device must be in the same region.
* For differences between VPC and basic networks, see <a href="https://cloud.tencent.com/document/product/215/30720">VPC and Basic Networks</a>.
     * @param req AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public AttachClassicLinkVpcResponse AttachClassicLinkVpc(AttachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachClassicLinkVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachClassicLinkVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachClassicLinkVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an ENI to a CVM.
* One CVM can be bound to multiple ENIs, but only one primary ENI. For more information on the limits, see <a href="https://cloud.tencent.com/document/product/576/18527">ENI Use Limits</a>.
* An ENI can only be bound to one CVM at a time.
* Only CVMs in the running or shutdown state can be bound to an ENI. For more information on CVM states, see <a href="https://cloud.tencent.com/document/api/213/9452#InstanceStatus">Tencent CVM Information</a>.
* An ENI can only be bound to a CVM in a VPC instance, and the CVM must reside in the same availability zone as the subnet of the ENI.
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CheckAssistantCidr) is used to check overlapping of a secondary CIDR block with inventory routing, peering connection (opposite VPC CIDR block), and any other resources. If an overlap is present, the overlapped resources are returned. (To use this API that is in Beta, please submit a ticket.)
* Check whether the secondary CIDR block overlaps with a primary or secondary CIDR block of the current VPC.
* Check whether the secondary CIDR block overlaps with the routing destination of the current VPC.
* Check whether the secondary CIDR block is peer-connected to the current VPC, and whether it overlaps with a main or secondary CIDR block of the opposite VPC.
     * @param req CheckAssistantCidrRequest
     * @return CheckAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CheckAssistantCidrResponse CheckAssistantCidr(CheckAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAssistantCidrResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAssistantCidrResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckAssistantCidr"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify the network detection status.
     * @param req CheckNetDetectStateRequest
     * @return CheckNetDetectStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetDetectStateResponse CheckNetDetectState(CheckNetDetectStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckNetDetectStateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckNetDetectStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckNetDetectState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAddressTemplate) is used to create an IP address template.
     * @param req CreateAddressTemplateRequest
     * @return CreateAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateResponse CreateAddressTemplate(CreateAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAddressTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAddressTemplateGroup) is used to create an IP address template group.
     * @param req CreateAddressTemplateGroupRequest
     * @return CreateAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateGroupResponse CreateAddressTemplateGroup(CreateAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAddressTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAssistantCidr) is used to batch create secondary CIDR blocks. (To use this API that is in Beta, please submit a ticket.)
     * @param req CreateAssistantCidrRequest
     * @return CreateAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssistantCidrResponse CreateAssistantCidr(CreateAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssistantCidrResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssistantCidrResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAssistantCidr"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Cloud Connect Network (CCN).<br />
* You can bind a tag when creating a CCN instance. The tag list in the response indicates the tags that have been successfully added.
Each account can only create a limited number of CCN instances. For more information, see product documentation. To create more instances, contact the online customer service.
     * @param req CreateCcnRequest
     * @return CreateCcnResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcnResponse CreateCcn(CreateCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCcnResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCcnResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCcn"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateCustomerGateway) is used to create customer gateways.
     * @param req CreateCustomerGatewayRequest
     * @return CreateCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomerGatewayResponse CreateCustomerGateway(CreateCustomerGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomerGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomerGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCustomerGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a default VPC.

The default VPC is suitable for getting started with and launching public instances, and it can be used like any other VPCs. To create a standard VPC, for which you need to specify a VPC name, VPC IP range, subnet IP range, and subnet availability zone, use the regular CreateVpc API.

Under normal circumstances, this API may not create a default VPC. It depends on the network attributes (DescribeAccountAttributes) of your account.
* If both basic network and VPC are supported, the returned VpcId is 0.
* If only VPC is supported, the default VPC information is returned.

You can also use the Force parameter to forcibly return a default VPC.
     * @param req CreateDefaultVpcRequest
     * @return CreateDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultVpcResponse CreateDefaultVpc(CreateDefaultVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDefaultVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateDirectConnectGatewayCcnRoutes) is used to create the CCN route (IDC IP range) of a Direct Connect gateway.
     * @param req CreateDirectConnectGatewayCcnRoutesRequest
     * @return CreateDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayCcnRoutesResponse CreateDirectConnectGatewayCcnRoutes(CreateDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateHaVip) is used to create a highly available virtual IP (HAVIP)
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHaVipResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHaVipResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHaVip"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateNatGateway) is used to create a NAT gateway.
     * @param req CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayResponse CreateNatGateway(CreateNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNatGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateNatGatewayDestinationIpPortTranslationNatRule) is used to create a port forwarding rule for a NAT gateway.
     * @param req CreateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return CreateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayDestinationIpPortTranslationNatRuleResponse CreateNatGatewayDestinationIpPortTranslationNatRule(CreateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNatGatewayDestinationIpPortTranslationNatRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a network detection instance.
     * @param req CreateNetDetectRequest
     * @return CreateNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetDetectResponse CreateNetDetect(CreateNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a <a href="https://cloud.tencent.com/document/product/215/20088">network ACL</a>.
* The inbound and outbound rules for a new network ACL are "Deny All" by default. You need to call `ModifyNetworkAclEntries` after creation to set rules for the network ACL as needed.
     * @param req CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclResponse CreateNetworkAcl(CreateNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkAclResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkAclResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetworkAcl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more ENIs.
* You can specify private IP addresses and a primary IP when creating an ENI. The specified private IP must be in the same subnet as the ENI and is not occupied.
* When creating an ENI, you can specify the number of private IP addresses that you want to apply for. The system will randomly generate private IP addresses.
* An ENI can only be bound with a limited number of IP addresses. For more information about resource limits, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can bind an existing security group when creating an ENI.
* You can bind a tag when creating an ENI. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a route table.
* After the VPC instance has been created, the system creates a default route table with which all newly created subnets will be associated. By default, you can use this route table to manage your routing policies. If you have multiple routing policies, you can call the API for creating route tables to create more route tables to manage these routing policies.
* You can bind a tag when creating a route table. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateRouteTableRequest
     * @return CreateRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteTableResponse CreateRouteTable(CreateRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRouteTableResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRouteTableResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRouteTable"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateRoutes) is used to create a routing policy.
* You can create routing policies in batch for a specified route table.
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a security group (SecurityGroup).
* Note the <a href="https://cloud.tencent.com/document/product/213/12453">maximum number of security groups</a> per project in each region under each account.
* Both the inbound and outbound rules for a newly created security group are "Deny All" by default. You need to call CreateSecurityGroupPolicies to set security group rules based on your needs.
* You can bind a tag when creating a security group. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create security group policies (SecurityGroupPolicy).

* The `Version` field indicates the version number of a security group policy, which will automatically increment by 1 every time you update the security policy, to prevent the expiration of the updated routing policies. If this field is left empty, any conflicts will be ignored.
* The value of the `Protocol` field can be TCP, UDP, ICMP, ICMPV6, GRE, or ALL.
* The `CidrBlock` field allows you to enter any string that conforms to the CIDR format. (More details) In a basic network, if a CidrBlock contains private IP addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The `Ipv6CidrBlock` field allows you to enter any string that conforms to the IPv6 CIDR format. (More details) In a basic network, if an Ipv6CidrBlock contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The SecurityGroupId field allows you to enter the IDs of security groups that are in the same project as the security group to be modified, including the ID of the security group itself, to represent private IP addresses of all CVMs under the security group. If this field is used, the policy will change without manual modification according to the CVM associated with the policy ID while being used to match network messages.
* The Port field allows you to enter a single port number, or two port numbers separated by a minus sign to represent a port range, such as 80 or 8000-8010. The Port field is accepted only if the value of the Protocol field is TCP or UDP. In other words, if the value of the Protocol field is not TCP or UDP, Protocol and Port are exclusive and cannot be entered at the same time, otherwise an error will occur with the API.
* The Action field only allows you to enter ACCEPT or DROP.
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, and AddressTemplate are exclusive and cannot be entered at the same time. Protocol + Port and ServiceTemplate are mutually exclusive and cannot be entered at the same time.
* Only policies in one direction can be created in each request. If you need to specify the PolicyIndex parameter, the indexes of policies must be consistent.
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateSecurityGroupWithPolicies) is used to create security groups, and add security group policies.
* Note the<a href="https://cloud.tencent.com/document/product/213/12453">maximum number of security groups</a>per project in each region under each account.
* Both the inbound and outbound policies for a newly created security group are Deny All by default. You need to call CreateSecurityGroupPolicies to set security group policies according to your needs.

Description:
* `Version`: Indicates the version number of a security group policy, which will automatically increment by 1 every time you update the security policy, to prevent the expiration of the updated policies. If this field is left empty, any conflicts will be ignored.
* `Protocol`: Values can be TCP, UDP, ICMP, ICMPV6, GRE, or ALL.
* `CidrBlock`:  A CIDR block in the correct format. In a basic network, if a CidrBlock contains private IPs on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* `Ipv6CidrBlock`: An IPv6 CIDR block in the correct format. In a basic network, if an Ipv6CidrBlock contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* `SecurityGroupId`: ID of the security group. It can be in the same project as the security group to be modified, including the ID of the security group itself, to represent private IP addresses of all CVMs under the security group. If this field is used, the policy will change without manual modification according to the CVM associated with the policy ID while being used to match network messages.
* `Port`: A single port number, or a port range in the format of “8000-8010”. The Port field is accepted only if the value of the `Protocol` field is `TCP` or `UDP`. Otherwise Protocol and Port are mutually exclusive. 
* `Action`: Values can be `ACCEPT` or `DROP`.
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, and AddressTemplate are exclusive and cannot be entered at the same time. “Protocol + Port” and ServiceTemplate are mutually exclusive and cannot be entered at the same time.
* Only policies in one direction can be created in each request. If you need to specify the `PolicyIndex` parameter, the indexes of policies must be consistent.
     * @param req CreateSecurityGroupWithPoliciesRequest
     * @return CreateSecurityGroupWithPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupWithPoliciesResponse CreateSecurityGroupWithPolicies(CreateSecurityGroupWithPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupWithPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupWithPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityGroupWithPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateServiceTemplate) is used to create a protocol port template.
     * @param req CreateServiceTemplateRequest
     * @return CreateServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateResponse CreateServiceTemplate(CreateServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServiceTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateServiceTemplateGroup) is used to create a protocol port template group.
     * @param req CreateServiceTemplateGroupRequest
     * @return CreateServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateGroupResponse CreateServiceTemplateGroup(CreateServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServiceTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a subnet.
* You must create a VPC instance before creating a subnet.
* After the subnet is successfully created, its IP address range cannot be modified. The subnet IP address range must fall within the VPC IP address range. They can be the same if the VPC instance has only one subnet. We recommend that you keep the subnet IP address range within the VPC IP address range to reserve IP address ranges for other subnets.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses).
* IP address ranges of different subnets cannot overlap with each other within the same VPC instance.
* A subnet is automatically associated with the default route table once created.
* You can bind a tag when creating a subnet. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSubnetRequest
     * @return CreateSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubnet"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create subnets in batches.
* You must create a VPC instance before creating a subnet.
* After the subnet is successfully created, its IP address range cannot be modified. The subnet IP address range must fall within the VPC IP address range. They can be the same if the VPC has only one subnet. We recommend that you keep the subnet IP address range within the VPC IP address range to reserve IP address ranges for other subnets.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses).
* IP address ranges of different subnets cannot overlap with each other within the same VPC instance.
* A subnet is automatically associated with the default route table once created.
* You can bind a tag when creating a subnet. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSubnetsRequest
     * @return CreateSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetsResponse CreateSubnets(CreateSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubnets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a VPC instance.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses). For more information, see the corresponding documents about VPC IP address ranges.
* The number of VPC instances that can be created in a region is limited. For more information, see <a href="https://intl.cloud.tencent.com/doc/product/215/537" title="VPC Use Limits">VPC Use Limits</a>. To request more resources, contact the online customer service.
* You can bind a tag when creating a VPC instance. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateVpnConnection) is used to create VPN tunnel.
     * @param req CreateVpnConnectionRequest
     * @return CreateVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVpnConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateVpnGateway) is used to create a VPN gateway.
     * @param req CreateVpnGatewayRequest
     * @return CreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayResponse CreateVpnGateway(CreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAddressTemplate) is used to delete an IP address template.
     * @param req DeleteAddressTemplateRequest
     * @return DeleteAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateResponse DeleteAddressTemplate(DeleteAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAddressTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAddressTemplateGroup) is used to delete an IP address template group.
     * @param req DeleteAddressTemplateGroupRequest
     * @return DeleteAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateGroupResponse DeleteAddressTemplateGroup(DeleteAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAddressTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAssistantCidr) is used to delete secondary CIDR blocks. (To use this API that is in Beta, please submit a ticket.)
     * @param req DeleteAssistantCidrRequest
     * @return DeleteAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssistantCidrResponse DeleteAssistantCidr(DeleteAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAssistantCidrResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAssistantCidrResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAssistantCidr"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteCcn) is used to delete CCNs.
* After deletion, the routes between all instances associated with the CCN will be deleted, and the network will be interrupted. Please confirm this operation in advance.
* CCN deletion is an irreversible operation. Please proceed with caution.

     * @param req DeleteCcnRequest
     * @return DeleteCcnResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcnResponse DeleteCcn(DeleteCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCcnResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCcnResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCcn"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteCustomerGateway) is used to delete customer gateways.
     * @param req DeleteCustomerGatewayRequest
     * @return DeleteCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomerGatewayResponse DeleteCustomerGateway(DeleteCustomerGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomerGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomerGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCustomerGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteDirectConnectGatewayCcnRoutes) is used to delete the CCN routes (IDC IP range) of a Direct Connect gateway.
     * @param req DeleteDirectConnectGatewayCcnRoutesRequest
     * @return DeleteDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayCcnRoutesResponse DeleteDirectConnectGatewayCcnRoutes(DeleteDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteHaVip) is used to delete Highly Available Virtual IP (HAVIP)<br />
This API is completed asynchronously. If you need to query the async job execution results, please use the `RequestId` returned by this API to query the `QueryTask` API.
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHaVipResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHaVipResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteHaVip"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNatGateway) is used to delete a NAT gateway.
After the deletion of a NAT gateway, the system will automatically delete the routing entry that contains the NAT gateway from the route table. It will also unbind the Elastic IP.
     * @param req DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayResponse DeleteNatGateway(DeleteNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNatGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNatGatewayDestinationIpPortTranslationNatRule) is used to delete a port forwarding rule for a NAT gateway.
     * @param req DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse DeleteNatGatewayDestinationIpPortTranslationNatRule(DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNatGatewayDestinationIpPortTranslationNatRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNetDetect) is used to delete a network detection instance.
     * @param req DeleteNetDetectRequest
     * @return DeleteNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetDetectResponse DeleteNetDetect(DeleteNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNetDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a network ACL.
     * @param req DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclResponse DeleteNetworkAcl(DeleteNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkAclResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkAclResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNetworkAcl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNetworkInterface) is used to delete ENIs.
* An ENI that has been bound to a CVM cannot be deleted.
* An ENI can be deleted only after being unbound from the server. After the deletion, all private IP addresses associated with the ENI will be released.
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a route table.
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRouteTableResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRouteTableResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRouteTable"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteRoutes) is used to delete routing policies in batches from a route table.
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteSecurityGroup) is used to delete security groups (SecurityGroup).
* Only security groups under the current account can be deleted.
* A security group cannot be deleted directly if its instance ID is used in the policy of another security group. You need to modify the policy first and then delete the security group.
* A security group cannot be recovered after deletion, please proceed with caution.
     * @param req DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupResponse DeleteSecurityGroup(DeleteSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteSecurityGroupPolicies) is used to delete security group policies (SecurityGroupPolicy).
* SecurityGroupPolicySet.Version is used to specify the version of the security group you are operating. If the specified Version number differs from the latest version of the current security group, a failure will be returned. If Version is not specified, the policy of the specified PolicyIndex will be deleted directly.
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteServiceTemplate) is used to delete a protocol port template.
     * @param req DeleteServiceTemplateRequest
     * @return DeleteServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateResponse DeleteServiceTemplate(DeleteServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteServiceTemplateGroup) is used to delete a protocol port template group.
     * @param req DeleteServiceTemplateGroupRequest
     * @return DeleteServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateGroupResponse DeleteServiceTemplateGroup(DeleteServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteSubnet) is used to delete subnets.
Before deleting a subnet, you need to remove all resources in the subnet, including CVMs, load balancers, cloud data, NoSQL databases, and ENIs.
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubnetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSubnetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSubnet"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteVpc) is used to delete VPCs.
* Before deleting a VPC, ensure that the VPC contains no resources, including CVMs, cloud databases, NoSQL databases, VPN gateways, direct connect gateways, load balancers, peering connections, and basic network devices that are linked to the VPC.
* The deletion of VPCs is irreversible. Proceed with caution.
     * @param req DeleteVpcRequest
     * @return DeleteVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcResponse DeleteVpc(DeleteVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteVpnConnection) is used to delete VPN tunnels.
     * @param req DeleteVpnConnectionRequest
     * @return DeleteVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnConnectionResponse DeleteVpnConnection(DeleteVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVpnConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteVpnGateway) is used to delete a VPN gateway. Currently, only deletion of pay-as-you-go IPSEC gateway instances in running status is supported.
     * @param req DeleteVpnGatewayRequest
     * @return DeleteVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayResponse DeleteVpnGateway(DeleteVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccountAttributes) is used to query your account attributes.
     * @param req DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountAttributesResponse DescribeAccountAttributes(DescribeAccountAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAddressQuota) is used to query the quota information of your [Elastic IP](https://cloud.tencent.com/document/product/213/1941) (EIP) in the current region. For more information, see [EIP product introduction](https://cloud.tencent.com/document/product/213/5733).
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddressQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAddressTemplateGroups) is used to query an IP address template group.
     * @param req DescribeAddressTemplateGroupsRequest
     * @return DescribeAddressTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplateGroupsResponse DescribeAddressTemplateGroups(DescribeAddressTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplateGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplateGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddressTemplateGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAddressTemplates) is used to query an IP address template.
     * @param req DescribeAddressTemplatesRequest
     * @return DescribeAddressTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplatesResponse DescribeAddressTemplates(DescribeAddressTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddressTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAddresses) is used to query the information of one or multiple [Elastic IPs](https://cloud.tencent.com/document/product/213/1941).
* If the parameter is empty, a number (as specified by the `Limit`, the default value is 20) of EIPs will be returned.
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAssistantCidr) is used to query a list of secondary CIDR blocks. (To use this API that is in Beta, please submit a ticket.)
     * @param req DescribeAssistantCidrRequest
     * @return DescribeAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssistantCidrResponse DescribeAssistantCidr(DescribeAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssistantCidrResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssistantCidrResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAssistantCidr"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCcnAttachedInstances) is used to query the network instances associated with the CCN instance.
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnAttachedInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnAttachedInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcnAttachedInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCcnRoutes) is used to query routes that have been added to a CCN.
     * @param req DescribeCcnRoutesRequest
     * @return DescribeCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRoutesResponse DescribeCcnRoutes(DescribeCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCcns) is used to query the CCN list.
     * @param req DescribeCcnsRequest
     * @return DescribeCcnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnsResponse DescribeCcns(DescribeCcnsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcns"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeClassicLinkInstances) is used to query the Classiclink instances list.
     * @param req DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicLinkInstancesResponse DescribeClassicLinkInstances(DescribeClassicLinkInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicLinkInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicLinkInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClassicLinkInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCustomerGatewayVendors) is used to query the information of supported customer gateway vendors.
     * @param req DescribeCustomerGatewayVendorsRequest
     * @return DescribeCustomerGatewayVendorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewayVendorsResponse DescribeCustomerGatewayVendors(DescribeCustomerGatewayVendorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerGatewayVendorsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerGatewayVendorsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCustomerGatewayVendors"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCustomerGateways) is used to query the customer gateway list.
     * @param req DescribeCustomerGatewaysRequest
     * @return DescribeCustomerGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewaysResponse DescribeCustomerGateways(DescribeCustomerGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerGatewaysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerGatewaysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCustomerGateways"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDirectConnectGatewayCcnRoutes) is used to query the CCN routes (IDC IP range) of the Direct Connect gateway.
     * @param req DescribeDirectConnectGatewayCcnRoutesRequest
     * @return DescribeDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewayCcnRoutesResponse DescribeDirectConnectGatewayCcnRoutes(DescribeDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeGatewayFlowMonitorDetail) is used to query the monitoring details of the gateway traffic.
* Only querying of a single gateway instance is supported. That is, only one of the `VpnId`, `DirectConnectGatewayId`, `PeeringConnectionId`, or `NatId` input parameters is supported, and one must be used.
* If the gateway has traffic, but no data is returned when this API is called, please check whether gateway traffic monitoring has been enabled in the corresponding gateway details page in the console.
     * @param req DescribeGatewayFlowMonitorDetailRequest
     * @return DescribeGatewayFlowMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowMonitorDetailResponse DescribeGatewayFlowMonitorDetail(DescribeGatewayFlowMonitorDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGatewayFlowMonitorDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeGatewayFlowQos) is used to query the QoS bandwidth limit of inbound IP flow in a gateway.
     * @param req DescribeGatewayFlowQosRequest
     * @return DescribeGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowQosResponse DescribeGatewayFlowQos(DescribeGatewayFlowQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowQosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowQosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGatewayFlowQos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeHaVips) is used to query the list of highly available virtual IPs (HAVIP).
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHaVipsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHaVipsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHaVips"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNatGatewayDestinationIpPortTranslationNatRules) is used to query the array of objects of the port forwarding rules for a NAT gateway.
     * @param req DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest
     * @return DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse DescribeNatGatewayDestinationIpPortTranslationNatRules(DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNatGatewayDestinationIpPortTranslationNatRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNatGateways) is used to query NAT gateways.
     * @param req DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaysResponse DescribeNatGateways(DescribeNatGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewaysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewaysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNatGateways"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetDetectStates) is used to query the list of network detection verification results.
     * @param req DescribeNetDetectStatesRequest
     * @return DescribeNetDetectStatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectStatesResponse DescribeNetDetectStates(DescribeNetDetectStatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectStatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectStatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetDetectStates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetDetects) is used to query the list of network detection instances.
     * @param req DescribeNetDetectsRequest
     * @return DescribeNetDetectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectsResponse DescribeNetDetects(DescribeNetDetectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetDetects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a list of network ACLs.
     * @param req DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAclsResponse DescribeNetworkAcls(DescribeNetworkAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkAclsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkAclsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetworkAcls"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetworkInterfaceLimit) is used to query the ENI quota based on the ID of CVM instance or ENI. It returns the ENI quota to which the CVM instance can be bound and the IP address quota that can be allocated to the ENI.
     * @param req DescribeNetworkInterfaceLimitRequest
     * @return DescribeNetworkInterfaceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfaceLimitResponse DescribeNetworkInterfaceLimit(DescribeNetworkInterfaceLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfaceLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfaceLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetworkInterfaceLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetworkInterfaces) is used to query the ENI list.
     * @param req DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetworkInterfaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API (DescribeRouteTables) is used to query route tables.
     * @param req DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTablesResponse DescribeRouteTables(DescribeRouteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteTablesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteTablesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRouteTables"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSecurityGroupAssociationStatistics) is used to query statistics on the instances associated with a security group.
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSecurityGroupPolicies) is used to query security group policies.
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSecurityGroupReferences) is used to query referred security groups.
     * @param req DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupReferencesResponse DescribeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupReferencesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupReferencesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroupReferences"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSecurityGroups) is used to query security groups.
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeServiceTemplateGroups) is used to query a protocol port template group.
     * @param req DescribeServiceTemplateGroupsRequest
     * @return DescribeServiceTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplateGroupsResponse DescribeServiceTemplateGroups(DescribeServiceTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplateGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplateGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceTemplateGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeServiceTemplates) is used to query protocol port templates.
     * @param req DescribeServiceTemplatesRequest
     * @return DescribeServiceTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplatesResponse DescribeServiceTemplates(DescribeServiceTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSubnets) is used to query the list of subnets.
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubnets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the EIP async job execution results.
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API (DescribeVpcInstances) is used to query a list of VCM instances on VPC.
     * @param req DescribeVpcInstancesRequest
     * @return DescribeVpcInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcInstancesResponse DescribeVpcInstances(DescribeVpcInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeVpcIpv6Addresses) is used to query `VPC` `IPv6` information.
This API is used to query only the information of `IPv6` addresses that are already in use. When querying IPs that have not yet been used, this API will not report an error, but the IPs will not appear in the returned results.
     * @param req DescribeVpcIpv6AddressesRequest
     * @return DescribeVpcIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcIpv6AddressesResponse DescribeVpcIpv6Addresses(DescribeVpcIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcIpv6AddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcIpv6AddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcIpv6Addresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeVpcPrivateIpAddresses) is used to query the private IP information of a VPC.<br />
This API is used to query only the information of IP addresses that are already in use. When querying IPs that have not yet been used, this API will not report an error, but the IPs will not appear in the returned results.
     * @param req DescribeVpcPrivateIpAddressesRequest
     * @return DescribeVpcPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPrivateIpAddressesResponse DescribeVpcPrivateIpAddresses(DescribeVpcPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcPrivateIpAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcPrivateIpAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcPrivateIpAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the VPC resource information.
     * @param req DescribeVpcResourceDashboardRequest
     * @return DescribeVpcResourceDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResourceDashboardResponse DescribeVpcResourceDashboard(DescribeVpcResourceDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcResourceDashboardResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcResourceDashboardResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcResourceDashboard"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeVpcs) is used to query the VPC list.
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API (DescribeVpnConnections) is used to query the VPN tunnel list.
     * @param req DescribeVpnConnectionsRequest
     * @return DescribeVpnConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnConnectionsResponse DescribeVpnConnections(DescribeVpnConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnConnectionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnConnectionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpnConnections"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeVpnGatewayCcnRoutes) is used to query VPN gateway-based CCN routes.
     * @param req DescribeVpnGatewayCcnRoutesRequest
     * @return DescribeVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewayCcnRoutesResponse DescribeVpnGatewayCcnRoutes(DescribeVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpnGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeVpnGateways) is used to query the VPN gateway list.
     * @param req DescribeVpnGatewaysRequest
     * @return DescribeVpnGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaysResponse DescribeVpnGateways(DescribeVpnGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewaysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewaysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpnGateways"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachCcnInstances) is used to unbind a specified network instance from a CCN instance.<br />
After unbinding the network instance, the corresponding routing policy will also be deleted.
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachClassicLinkVpc) is used to delete a Classiclink.
     * @param req DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public DetachClassicLinkVpcResponse DetachClassicLinkVpc(DetachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachClassicLinkVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachClassicLinkVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachClassicLinkVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachNetworkInterface) is used to unbind an ENI from a CVM.
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisableCcnRoutes) is used to disable CCN routes that are already enabled.
     * @param req DisableCcnRoutesRequest
     * @return DisableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCcnRoutesResponse DisableCcnRoutes(DisableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisableGatewayFlowMonitor) is used to disable gateway flow monitor.
     * @param req DisableGatewayFlowMonitorRequest
     * @return DisableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DisableGatewayFlowMonitorResponse DisableGatewayFlowMonitor(DisableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableGatewayFlowMonitorResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableGatewayFlowMonitorResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableGatewayFlowMonitor"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateAddress) is used to unbind [Elastic IPs](https://cloud.tencent.com/document/product/213/1941).
* The unbinding of EIPs from CVM instances and ENIs is supported.
* The unbinding of EIPs from NATs is not supported. For information about how to unbind an EIP from a NAT, see [EipUnBindNatGateway](https://cloud.tencent.com/document/product/215/4092).
* You can only unbind EIPs in BIND or BIND_ENI status.
* Blocked EIPs cannot be unbound.
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateNatGatewayAddress) is used to unbind an EIP from a NAT gateway.
     * @param req DisassociateNatGatewayAddressRequest
     * @return DisassociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNatGatewayAddressResponse DisassociateNatGatewayAddress(DisassociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNatGatewayAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNatGatewayAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateNatGatewayAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disassociate a network ACL from subnets in a VPC instance.
     * @param req DisassociateNetworkAclSubnetsRequest
     * @return DisassociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkAclSubnetsResponse DisassociateNetworkAclSubnets(DisassociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNetworkAclSubnetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNetworkAclSubnetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateNetworkAclSubnets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateNetworkInterfaceSecurityGroups) is used to detach (or fully detach if possible) a security group from an ENI.
     * @param req DisassociateNetworkInterfaceSecurityGroupsRequest
     * @return DisassociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkInterfaceSecurityGroupsResponse DisassociateNetworkInterfaceSecurityGroups(DisassociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNetworkInterfaceSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNetworkInterfaceSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateNetworkInterfaceSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DownloadCustomerGatewayConfiguration) is used to download a VPN tunnel configuration.
     * @param req DownloadCustomerGatewayConfigurationRequest
     * @return DownloadCustomerGatewayConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCustomerGatewayConfigurationResponse DownloadCustomerGatewayConfiguration(DownloadCustomerGatewayConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadCustomerGatewayConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCustomerGatewayConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadCustomerGatewayConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (EnableCcnRoutes) is used to enable CCN routes that are already added.<br />
This API is used to verify whether there will be conflict with an existing route after a CCN route is enabled. If there is a conflict, the route will not be enabled, and the process will fail. When a conflict occurs, you must disable the conflicting route before you can enable the desired route.
     * @param req EnableCcnRoutesRequest
     * @return EnableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCcnRoutesResponse EnableCcnRoutes(EnableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (EnableGatewayFlowMonitor) is used to enable gateway flow monitor.
     * @param req EnableGatewayFlowMonitorRequest
     * @return EnableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public EnableGatewayFlowMonitorResponse EnableGatewayFlowMonitor(EnableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGatewayFlowMonitorResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGatewayFlowMonitorResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableGatewayFlowMonitor"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (HaVipAssociateAddressIp) is used to bind an EIP to an HAVIP.<br />
This API is completed asynchronously. If you need to query the async job execution results, please use the `RequestId` returned by this API to query the `QueryTask` API.
     * @param req HaVipAssociateAddressIpRequest
     * @return HaVipAssociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipAssociateAddressIpResponse HaVipAssociateAddressIp(HaVipAssociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipAssociateAddressIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipAssociateAddressIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HaVipAssociateAddressIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (HaVipDisassociateAddressIp) is used to unbind an EIP which has been bound to an HAVIP.<br />
This API is completed asynchronously. If you need to query the async job execution results, please use the `RequestId` returned by this API to query the `QueryTask` API.
     * @param req HaVipDisassociateAddressIpRequest
     * @return HaVipDisassociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipDisassociateAddressIpResponse HaVipDisassociateAddressIp(HaVipDisassociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipDisassociateAddressIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipDisassociateAddressIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HaVipDisassociateAddressIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceCreateVpnGateway) is used to query the price for VPN gateway creation.
     * @param req InquiryPriceCreateVpnGatewayRequest
     * @return InquiryPriceCreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateVpnGatewayResponse InquiryPriceCreateVpnGateway(InquiryPriceCreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceRenewVpnGateway) is used to query the price for VPN gateway renewal. Currently, only querying prices for IPSEC-type gateways is supported.
     * @param req InquiryPriceRenewVpnGatewayRequest
     * @return InquiryPriceRenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewVpnGatewayResponse InquiryPriceRenewVpnGateway(InquiryPriceRenewVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceRenewVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceResetVpnGatewayInternetMaxBandwidth) is used to query the price for adjusting the bandwidth cap of a VPN gateway.
     * @param req InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest
     * @return InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse InquiryPriceResetVpnGatewayInternetMaxBandwidth(InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceResetVpnGatewayInternetMaxBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (MigrateNetworkInterface) is used to migrate ENIs.
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigrateNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MigrateNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MigrateNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API (MigratePrivateIpAddress) is used to migrate the private IPs of ENIs.

* This API is used to migrate a private IP from one ENI to another. Primary IPs cannot be migrated.
* The ENIs before and after migration must belong to the same subnet.
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigratePrivateIpAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MigratePrivateIpAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MigratePrivateIpAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAddressAttribute) is used to modify the name of an [Elastic IP](https://cloud.tencent.com/document/product/213/1941).
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to adjust the network billing mode of an EIP. Please note that it's available to users whose network fees are billed on IPs but not CVMs.
* The network billing mode can be switched between `BANDWIDTH_PREPAID_BY_MONTH` and `TRAFFIC_POSTPAID_BY_HOUR`.
* The network billing mode for each EIP be changed for up to twice.
     * @param req ModifyAddressInternetChargeTypeRequest
     * @return ModifyAddressInternetChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressInternetChargeTypeResponse ModifyAddressInternetChargeType(ModifyAddressInternetChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressInternetChargeTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressInternetChargeTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressInternetChargeType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAddressTemplateAttribute) is used to modify an IP address template.
     * @param req ModifyAddressTemplateAttributeRequest
     * @return ModifyAddressTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateAttributeResponse ModifyAddressTemplateAttribute(ModifyAddressTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressTemplateAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAddressTemplateGroupAttribute) is used to modify an IP address template group.
     * @param req ModifyAddressTemplateGroupAttributeRequest
     * @return ModifyAddressTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateGroupAttributeResponse ModifyAddressTemplateGroupAttribute(ModifyAddressTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressTemplateGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAddressesBandwidth) is used to adjust [Elastic IP](https://cloud.tencent.com/document/product/213/1941) bandwidth, including the postpaid EIP, prepaid EIP and bandwidth package EIP.
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressesBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressesBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressesBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAssistantCidr) is used to batch modify (e.g. add and delete) secondary CIDR blocks. (To use this API that is in Beta, please submit a ticket.)
     * @param req ModifyAssistantCidrRequest
     * @return ModifyAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssistantCidrResponse ModifyAssistantCidr(ModifyAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssistantCidrResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssistantCidrResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAssistantCidr"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyCcnAttribute) is used to modify CCN attributes.
     * @param req ModifyCcnAttributeRequest
     * @return ModifyCcnAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttributeResponse ModifyCcnAttribute(ModifyCcnAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCcnAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the bandwidth limit policy of a postpaid CCN instance.
     * @param req ModifyCcnRegionBandwidthLimitsTypeRequest
     * @return ModifyCcnRegionBandwidthLimitsTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnRegionBandwidthLimitsTypeResponse ModifyCcnRegionBandwidthLimitsType(ModifyCcnRegionBandwidthLimitsTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnRegionBandwidthLimitsTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnRegionBandwidthLimitsTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCcnRegionBandwidthLimitsType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyCustomerGatewayAttribute) is used to modify the customer gateway information.
     * @param req ModifyCustomerGatewayAttributeRequest
     * @return ModifyCustomerGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomerGatewayAttributeResponse ModifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomerGatewayAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomerGatewayAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCustomerGatewayAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyGatewayFlowQos) is used to adjust the QoS bandwidth limit in a gateway.
     * @param req ModifyGatewayFlowQosRequest
     * @return ModifyGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayFlowQosResponse ModifyGatewayFlowQos(ModifyGatewayFlowQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGatewayFlowQosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGatewayFlowQosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGatewayFlowQos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyHaVipAttribute) is used to modify HAVIP attributes.
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHaVipAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHaVipAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHaVipAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyIpv6AddressesAttribute) is used to modify the private IPv6 address attributes of an ENI.
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIpv6AddressesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIpv6AddressesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyIpv6AddressesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyNatGatewayAttribute) is used to modify the attributes of a NAT gateway.
     * @param req ModifyNatGatewayAttributeRequest
     * @return ModifyNatGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayAttributeResponse ModifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNatGatewayAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyNatGatewayDestinationIpPortTranslationNatRule) is used to modify a port forwarding rule for a NAT gateway.
     * @param req ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse ModifyNatGatewayDestinationIpPortTranslationNatRule(ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNatGatewayDestinationIpPortTranslationNatRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyNetDetect) is used to modify network detection parameters.
     * @param req ModifyNetDetectRequest
     * @return ModifyNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetDetectResponse ModifyNetDetect(ModifyNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a network ACL.
     * @param req ModifyNetworkAclAttributeRequest
     * @return ModifyNetworkAclAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclAttributeResponse ModifyNetworkAclAttribute(ModifyNetworkAclAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkAclAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetworkAclAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify (add or delete) the inbound and outbound rules of a network ACL.
     * @param req ModifyNetworkAclEntriesRequest
     * @return ModifyNetworkAclEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclEntriesResponse ModifyNetworkAclEntries(ModifyNetworkAclEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclEntriesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkAclEntriesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetworkAclEntries"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyNetworkInterfaceAttribute) is used to modify ENI attributes.
     * @param req ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkInterfaceAttributeResponse ModifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkInterfaceAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkInterfaceAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetworkInterfaceAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyPrivateIpAddressesAttribute) is used to modify the private IP attributes of an ENI.
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPrivateIpAddressesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyRouteTableAttribute) is used to modify the attributes of a route table.
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRouteTableAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRouteTableAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRouteTableAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifySecurityGroupAttribute) is used to modify the attributes of a security group (SecurityGroupPolicy).
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySecurityGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifySecurityGroupPolicies) is used to reset the egress and ingress policies (SecurityGroupPolicy) of a security group.

* This API deletes all the current egress and ingress policies, and then adds new Egress and Ingress policies. It does not support custom PolicyIndex indexes.
* If SecurityGroupPolicySet.Version is set to 0, all policies will be cleared, and Egress and Ingress will be ignored.
* The value of the Protocol field can be TCP, UDP, ICMP, ICMPV6, GRE, or ALL.
* The CidrBlock field allows you to enter any string that conforms to the CIDR format. (More details) In a basic network, if a CidrBlock contains private IP addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The Ipv6CidrBlock field allows you to enter any string that conforms to the IPv6 CIDR format. (More details) In a basic network, if an Ipv6CidrBlock contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The SecurityGroupId field allows you to enter the IDs of security groups that are in the same project as the security group to be modified, including the ID of the security group itself, to represent private IP addresses of all CVMs under the security group. If this field is used, this policy will change without manual modification according to the CVM associated with the policy ID while being used to match network messages.
* The Port field allows you to enter a single port number, or two port numbers separated by a minus sign to represent a port range, such as 80 or 8000-8010. The Port field can be used only when the value of the Protocol field is TCP or UDP.
* The Action field only allows you to enter ACCEPT or DROP.
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, and AddressTemplate are exclusive and cannot be entered at the same time. Protocol + Port and ServiceTemplate are mutually exclusive and cannot be entered at the same time.
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyServiceTemplateAttribute) is used to modify a protocol port template.
     * @param req ModifyServiceTemplateAttributeRequest
     * @return ModifyServiceTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateAttributeResponse ModifyServiceTemplateAttribute(ModifyServiceTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyServiceTemplateAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyServiceTemplateGroupAttribute) is used to modify a protocol port template group.
     * @param req ModifyServiceTemplateGroupAttributeRequest
     * @return ModifyServiceTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateGroupAttributeResponse ModifyServiceTemplateGroupAttribute(ModifyServiceTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyServiceTemplateGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifySubnetAttribute) is used to modify subnet attributes.
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubnetAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubnetAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubnetAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyVpcAttribute) is used to modify VPC attributes.
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpcAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpcAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyVpnConnectionAttribute) is used to modify VPN tunnels.
     * @param req ModifyVpnConnectionAttributeRequest
     * @return ModifyVpnConnectionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnConnectionAttributeResponse ModifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnConnectionAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnConnectionAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpnConnectionAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyVpnGatewayAttribute) is used to modify the attributes of VPN gateways.
     * @param req ModifyVpnGatewayAttributeRequest
     * @return ModifyVpnGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayAttributeResponse ModifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpnGatewayAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyVpnGatewayCcnRoutes) is used to modify VPN gateway-based CCN routes.
     * @param req ModifyVpnGatewayCcnRoutesRequest
     * @return ModifyVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayCcnRoutesResponse ModifyVpnGatewayCcnRoutes(ModifyVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpnGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RejectAttachCcnInstances) is used to reject association operations when instances are associated across accounts for the CCN owner.

     * @param req RejectAttachCcnInstancesRequest
     * @return RejectAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RejectAttachCcnInstancesResponse RejectAttachCcnInstances(RejectAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectAttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RejectAttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RejectAttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ReleaseAddresses) is used to release one or multiple [Elastic IPs](https://cloud.tencent.com/document/product/213/1941).
* This operation is irreversible. Once you release an EIP, the IP address associated with the EIP no longer belongs to you.
* Only EIPs in UNBIND status can be released.
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RenewVpnGateway) is used to renew prepaid (monthly subscription) VPN gateways. Currently, only IPSEC gateways are supported.
     * @param req RenewVpnGatewayRequest
     * @return RenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public RenewVpnGatewayResponse RenewVpnGateway(RenewVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ReplaceDirectConnectGatewayCcnRoutes) is used to modify the specified route according to the route ID. Batch modification is supported.
     * @param req ReplaceDirectConnectGatewayCcnRoutesRequest
     * @return ReplaceDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceDirectConnectGatewayCcnRoutesResponse ReplaceDirectConnectGatewayCcnRoutes(ReplaceDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ReplaceRouteTableAssociation) is used to modify the route table associated with a subnet.
* A subnet can only be associated with one route table.
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRouteTableAssociationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRouteTableAssociationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceRouteTableAssociation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ReplaceRoutes) is used to modify a specified routing policy by its ID (RouteId). Batch modification is supported.
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ReplaceSecurityGroupPolicy) is used to replace a single security group policy (SecurityGroupPolicy).
Only one policy in a single direction can be replaced in each request, and the PolicyIndex parameter must be specified.
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceSecurityGroupPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceSecurityGroupPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceSecurityGroupPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetAttachCcnInstances) is used to re-apply for the association operation when the application for cross-account instance association expires.
     * @param req ResetAttachCcnInstancesRequest
     * @return ResetAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnInstancesResponse ResetAttachCcnInstances(ResetAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetAttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetNatGatewayConnection) is used to adjust concurrent connection cap for the NAT gateway.
     * @param req ResetNatGatewayConnectionRequest
     * @return ResetNatGatewayConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetNatGatewayConnectionResponse ResetNatGatewayConnection(ResetNatGatewayConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetNatGatewayConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetNatGatewayConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetNatGatewayConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetRoutes) is used to reset the name of a route table and all its routing policies.<br />
Note: When this API is called, all routing policies in the current route table are deleted before new routing policies are saved, which may incur network interruption.
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *The API (ResetVpnConnection) is used to reset VPN tunnels.
     * @param req ResetVpnConnectionRequest
     * @return ResetVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnConnectionResponse ResetVpnConnection(ResetVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetVpnConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetVpnGatewayInternetMaxBandwidth) is used to adjust the bandwidth cap of VPN gateways. Currently, only configuration upgrade is supported. VPN gateways with monthly subscription must be within the validity period.
     * @param req ResetVpnGatewayInternetMaxBandwidthRequest
     * @return ResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnGatewayInternetMaxBandwidthResponse ResetVpnGatewayInternetMaxBandwidth(ResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetVpnGatewayInternetMaxBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (SetCcnRegionBandwidthLimits) is used to set the outbound bandwidth cap for CCNs in each region. This API can only set the outbound bandwidth cap for regions in the network instances that have already been associated.
     * @param req SetCcnRegionBandwidthLimitsRequest
     * @return SetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public SetCcnRegionBandwidthLimitsResponse SetCcnRegionBandwidthLimits(SetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCcnRegionBandwidthLimitsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetCcnRegionBandwidthLimits"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (TransformAddress) is used to switch common public IPs into [Elastic IPs](https://cloud.tencent.com/document/product/213/1941).
* The platform limits the number of times that a user can unbind an EIP and reassign public IPs in each region per day. For more information, see [EIP product introduction](/document/product/213/1941)). The preceding quota can be obtained through the [DescribeAddressQuota](https://cloud.tencent.com/document/api/213/1378) API.
     * @param req TransformAddressRequest
     * @return TransformAddressResponse
     * @throws TencentCloudSDKException
     */
    public TransformAddressResponse TransformAddress(TransformAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransformAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TransformAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TransformAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UnassignIpv6Addresses) is used to release ENI `IPv6` addresses.<br />
This API is completed asynchronously. If you need to query the async execution results, use the `RequestId` returned by this API to query the `QueryTask` API.
     * @param req UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6AddressesResponse UnassignIpv6Addresses(UnassignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6AddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6AddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignIpv6Addresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UnassignIpv6CidrBlock) is used to release IPv6 IP ranges.
If the IP range still has occupied IPs that are not yet repossessed, the IP range cannot be released.
     * @param req UnassignIpv6CidrBlockRequest
     * @return UnassignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6CidrBlockResponse UnassignIpv6CidrBlock(UnassignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6CidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6CidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignIpv6CidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UnassignIpv6SubnetCidrBlock) is used to release IPv6 subnet IP ranges.
If the subnet IP range still has occupied IPs that are not yet repossessed, the subnet IP range cannot be released.
     * @param req UnassignIpv6SubnetCidrBlockRequest
     * @return UnassignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6SubnetCidrBlockResponse UnassignIpv6SubnetCidrBlock(UnassignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignIpv6SubnetCidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UnassignPrivateIpAddresses) is used to return the private IPs of ENI.
* To return the secondary private IPs of an ENI, the API will automatically unbind the IPs of an ENI. The primary private IP of the ENI cannot be returned.
     * @param req UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignPrivateIpAddressesResponse UnassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignPrivateIpAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignPrivateIpAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignPrivateIpAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
