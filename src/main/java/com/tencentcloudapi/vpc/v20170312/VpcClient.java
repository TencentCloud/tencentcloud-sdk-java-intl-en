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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptAttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcceptAttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add resources to a bandwidth package, including [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1), [Cloud Load Balancer](https://intl.cloud.tencent.com/document/product/214/517?from_cn_redirect=1), and so on.
     * @param req AddBandwidthPackageResourcesRequest
     * @return AddBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AddBandwidthPackageResourcesResponse AddBandwidthPackageResources(AddBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddBandwidthPackageResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddBandwidthPackageResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for one or more [Elastic IP Addresses](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIPs for short).
* An EIP is a static IP address that is dedicated for dynamic cloud computing. You can quickly re-map an EIP to another instance under your account to protect against instance failures.
* Your EIP is associated with your Tencent Cloud account rather than an instance. It remains associated with your Tencent Cloud account until you choose to explicitly release it or your account is in arrears for more than 24 hours.
* The maximum number of EIPs that can be applied for a Tencent Cloud account in each region is restricted. For more information, see [EIP Product Introduction](https://intl.cloud.tencent.com/document/product/213/5733?from_cn_redirect=1). You can get the quota information through the DescribeAddressQuota API.
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignIpv6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to assign IPv6 ranges.
* To use this API, you must already have a VPC instance. If you do not have a VPC instance yet, use the <a href="https://intl.cloud.tencent.com/document/api/215/15774?from_cn_redirect=1" title="CreateVpc" target="_blank">CreateVpc</a> API to create one.
* Each VPC can apply for only one IPv6 range.
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6CidrBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6CidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignIpv6CidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignIpv6SubnetCidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignPrivateIpAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignPrivateIpAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssociateAddress) is used to bind an [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIP for short) to the specified private IP of an instance or ENI.
* Essentially, binding an EIP to an instance (CVM) means binding an EIP to the primary private IP of the primary ENI on an instance.
* When you bind an EIP to the primary private IP of the primary ENI, the previously bound public IP is automatically unbound and released.
* To bind the EIP to the private IP of the specified ENI (not the primary private IP of the primary ENI), you must unbind the EIP before you can bind a new one.
* To bind the EIP to a NAT gateway, use the API [EipBindNatGateway](https://intl.cloud.tencent.com/document/product/215/4093?from_cn_redirect=1)
* EIP that is in arrears or blocked cannot be bound.
* Only EIP in the UNBIND status can be bound.
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a direct connect gateway with a NAT gateway,  and direct its default route to the NAT Gateway.
     * @param req AssociateDirectConnectGatewayNatGatewayRequest
     * @return AssociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDirectConnectGatewayNatGatewayResponse AssociateDirectConnectGatewayNatGateway(AssociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDirectConnectGatewayNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDirectConnectGatewayNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDirectConnectGatewayNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an EIP to NAT Gateway.
     * @param req AssociateNatGatewayAddressRequest
     * @return AssociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNatGatewayAddressResponse AssociateNatGatewayAddress(AssociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNatGatewayAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNatGatewayAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateNatGatewayAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNetworkAclSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateNetworkAclSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNetworkInterfaceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateNetworkInterfaceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Classiclink between a VPC instance and a basic network device.
* The VPC instance and the basic network device must be in the same region.
* For differences between VPC and basic networks, see <a href="https://intl.cloud.tencent.com/document/product/215/30720?from_cn_redirect=1">VPC and Basic Networks</a>.
     * @param req AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public AttachClassicLinkVpcResponse AttachClassicLinkVpc(AttachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachClassicLinkVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachClassicLinkVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachClassicLinkVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind an ENI to a CVM.
* One CVM can be bound to multiple ENIs, but only one primary ENI. For more information on the limits, see <a href="https://intl.cloud.tencent.com/document/product/576/18527?from_cn_redirect=1">ENI Use Limits</a>.
* An ENI can only be bound to one CVM at a time.
* Only CVMs in the running or shutdown state can be bound to an ENI. For more information on CVM states, see <a href="https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#InstanceStatus">Tencent CVM Information</a>.
* An ENI can only be bound to a CVM in a VPC instance, and the CVM must reside in the same availability zone as the subnet of the ENI.
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used by the service provider to perform a compliance audit.
* This API is only provided for service providers to audit compliance review requests received. Tencent Cloud will verify the identity of the service provider by the `APPID`. 
* The status of the review request can be changed between `APPROVED` and `DENY`.
     * @param req AuditCrossBorderComplianceRequest
     * @return AuditCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public AuditCrossBorderComplianceResponse AuditCrossBorderCompliance(AuditCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuditCrossBorderComplianceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AuditCrossBorderComplianceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuditCrossBorderCompliance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckNetDetectStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckNetDetectState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAddressTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAddressTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an ENI and bind it to a CVM.
* You can specify private IP addresses and a primary IP when creating an ENI. The specified private IP must be idle and in the same subnet as the ENI.
* When creating an ENI, you can specify the number of private IP addresses that you want to apply for. The system will randomly generate private IP addresses.
* An ENI can only be bound to a limited number of IP addresses. For more information about resource limits, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can bind an existing security group when creating an ENI.
* You can bind a tag when creating an ENI. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateAndAttachNetworkInterfaceRequest
     * @return CreateAndAttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndAttachNetworkInterfaceResponse CreateAndAttachNetworkInterface(CreateAndAttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAndAttachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAndAttachNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAndAttachNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create [device bandwidth packages](https://intl.cloud.tencent.com/document/product/684/15246?from_cn_redirect=1#.E8.AE.BE.E5.A4.87.E5.B8.A6.E5.AE.BD.E5.8C.85) and [IP bandwidth packages](https://intl.cloud.tencent.com/document/product/684/15246?from_cn_redirect=1#ip-.E5.B8.A6.E5.AE.BD.E5.8C.85)
     * @param req CreateBandwidthPackageRequest
     * @return CreateBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateBandwidthPackageResponse CreateBandwidthPackage(CreateBandwidthPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBandwidthPackageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBandwidthPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBandwidthPackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomerGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomerGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDefaultVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a direct connect gateway.
     * @param req CreateDirectConnectGatewayRequest
     * @return CreateDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayResponse CreateDirectConnectGateway(CreateDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDirectConnectGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a flow log.
     * @param req CreateFlowLogRequest
     * @return CreateFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowLogResponse CreateFlowLog(CreateFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHaVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHaVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatGatewayDestinationIpPortTranslationNatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a <a href="https://intl.cloud.tencent.com/document/product/215/20088?from_cn_redirect=1">network ACL</a>.
* The inbound and outbound rules for a new network ACL are "Deny All" by default. You need to call `ModifyNetworkAclEntries` after creation to set rules for the network ACL as needed.
     * @param req CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclResponse CreateNetworkAcl(CreateNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetworkAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a security group (SecurityGroup).
* Note the <a href="https://intl.cloud.tencent.com/document/product/213/12453?from_cn_redirect=1">maximum number of security groups</a> per project in each region under each account.
* Both the inbound and outbound rules for a newly created security group are "Deny All" by default. You need to call CreateSecurityGroupPolicies to set security group rules based on your needs.
* You can bind a tag when creating a security group. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create security group policies (SecurityGroupPolicy).

For parameters of SecurityGroupPolicySet,
<ul>
<li>`Version`: the version number of a security group policy, which automatically increases by one each time you update the security policy, to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored.</li>
<li>When creating the `Egress` and `Ingress` polices,<ul>
<li>`Protocol`: allows TCP, UDP, ICMP, ICMPV6, GRE, or ALL.</li>
<li>`CidrBlock`: a CIDR block in the correct format. In a classic network, if a `CidrBlock` contains private IPs on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
<li>`Ipv6CidrBlock`: an IPv6 CIDR block in the correct format. In a classic network, if an `Ipv6CidrBlock` contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
<li>`SecurityGroupId`: ID of the security group. It can be the ID of security group to be modified, or the ID of other security group in the same project. All private IPs of all CVMs under the security group will be covered. If this field is used, the policy will automatically change according to the CVM associated with the group ID while being used to match network messages. You don't need to change it manually.</li>
<li>`Port`: a single port number such as 80, or a port range in the format of '8000-8010'. You may use this field only if the `Protocol` field takes the value `TCP` or `UDP`. Otherwise `Protocol` and `Port` are mutually exclusive.</li>
<li>`Action`: only allows `ACCEPT` or `DROP`.</li>
<li>`CidrBlock`, `Ipv6CidrBlock`, `SecurityGroupId`, and `AddressTemplate` are mutually exclusive. `Protocol` + `Port` and `ServiceTemplate` are mutually exclusive.</li>
<li>You can only create policies in one direction in each request. To specify the `PolicyIndex` parameter, use the same index number in policies.</li>
</ul></li></ul>
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateSecurityGroupWithPolicies) is used to create security groups, and add security group policies.
* Note the<a href="https://intl.cloud.tencent.com/document/product/213/12453?from_cn_redirect=1">maximum number of security groups</a>per project in each region under each account.
* Both the inbound and outbound policies for a newly created security group are Deny All by default. You need to call CreateSecurityGroupPolicies to set security group policies according to your needs.

Description:
* `Version`: Indicates the version number of a security group policy, which will automatically increment by 1 every time you update the security policy, to prevent the expiration of the updated policies. If this field is left empty, any conflicts will be ignored.
* `Protocol`: Values can be TCP, UDP, ICMP, ICMPV6, GRE, or ALL.
* `CidrBlock`:  A CIDR block in the correct format. In a basic network, if a CidrBlock contains private IPs on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* `Ipv6CidrBlock`: An IPv6 CIDR block in the correct format. In a basic network, if an Ipv6CidrBlock contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* `SecurityGroupId`: ID of the security group. It can be in the same project as the security group to be modified, including the ID of the security group itself, to represent private IP addresses of all CVMs under the security group. If this field is used, the policy will change without manual modification according to the CVM associated with the policy ID while being used to match network messages.
* `Port`: A single port number, or a port range in the format of '8000-8010'. The Port field is accepted only if the value of the `Protocol` field is `TCP` or `UDP`. Otherwise Protocol and Port are mutually exclusive. 
* `Action`: Values can be `ACCEPT` or `DROP`.
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, and AddressTemplate are exclusive and cannot be entered at the same time. 'Protocol + Port' and ServiceTemplate are mutually exclusive and cannot be entered at the same time.
* Only policies in one direction can be created in each request. If you need to specify the `PolicyIndex` parameter, the indexes of policies must be consistent.
     * @param req CreateSecurityGroupWithPoliciesRequest
     * @return CreateSecurityGroupWithPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupWithPoliciesResponse CreateSecurityGroupWithPolicies(CreateSecurityGroupWithPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupWithPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupWithPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupWithPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubnet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpnConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAddressTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAddressTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete bandwidth packages, including [device bandwidth packages](https://intl.cloud.tencent.com/document/product/684/15246?from_cn_redirect=1#.E8.AE.BE.E5.A4.87.E5.B8.A6.E5.AE.BD.E5.8C.85) and [IP bandwidth packages](https://intl.cloud.tencent.com/document/product/684/15246?from_cn_redirect=1#ip-.E5.B8.A6.E5.AE.BD.E5.8C.85).
     * @param req DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBandwidthPackageResponse DeleteBandwidthPackage(DeleteBandwidthPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBandwidthPackageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBandwidthPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBandwidthPackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomerGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomerGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a direct connect gateway.
<li>For a NAT gateway, NAT and ACL rules will be cleared upon the deletion of a direct connect gateway.
<li>After the deletion of a direct connect gateway, the routing policy associated with the gateway in the route table will also be deleted.
This API is completed asynchronously. If you need to query the async job execution results, please use the `RequestId` returned by this API to poll the `QueryTask` API.
     * @param req DeleteDirectConnectGatewayRequest
     * @return DeleteDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayResponse DeleteDirectConnectGateway(DeleteDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDirectConnectGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a flow log.
     * @param req DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFlowLogResponse DeleteFlowLog(DeleteFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHaVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteHaVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNatGatewayDestinationIpPortTranslationNatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetworkAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSubnetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSubnet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpnConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAddressQuota) is used to query the quota information of your [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIP) in the current region. For more information, see [EIP product introduction](https://intl.cloud.tencent.com/document/product/213/5733?from_cn_redirect=1).
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddressQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplateGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddressTemplateGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddressTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAddresses) is used to query the information of one or multiple [Elastic IPs](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
* If the parameter is empty, a number (as specified by the `Limit`, the default value is 20) of EIPs will be returned.
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the maximum and used number of bandwidth packages under the account in the current region.
     * @param req DescribeBandwidthPackageQuotaRequest
     * @return DescribeBandwidthPackageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageQuotaResponse DescribeBandwidthPackageQuota(DescribeBandwidthPackageQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBandwidthPackageQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBandwidthPackageQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query bandwidth package information, including the unique ID of the bandwidth package, the type, the billing mode, the name, and the resource information.
     * @param req DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackagesResponse DescribeBandwidthPackages(DescribeBandwidthPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBandwidthPackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBandwidthPackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnAttachedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnAttachedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcns");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicLinkInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClassicLinkInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the compliance review requests created by the user. 
A service provider can query all review requests created by any `APPID` under its account. Other users can only query their own review requests.
     * @param req DescribeCrossBorderComplianceRequest
     * @return DescribeCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderComplianceResponse DescribeCrossBorderCompliance(DescribeCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCrossBorderComplianceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCrossBorderComplianceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCrossBorderCompliance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerGatewayVendorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomerGatewayVendors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomerGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query direct connect gateways.
     * @param req DescribeDirectConnectGatewaysRequest
     * @return DescribeDirectConnectGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewaysResponse DescribeDirectConnectGateways(DescribeDirectConnectGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnectGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of a flow log.
     * @param req DescribeFlowLogRequest
     * @return DescribeFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogResponse DescribeFlowLog(DescribeFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query all the flow logs of the current account.
     * @param req DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogsResponse DescribeFlowLogs(DescribeFlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayFlowMonitorDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayFlowQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHaVipsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHaVips");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatGatewayDestinationIpPortTranslationNatRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectStatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetDetectStates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetDetects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetworkAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfaceLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetworkInterfaceLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetworkInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRouteTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupReferencesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupReferences");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplateGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceTemplateGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcIpv6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcIpv6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcPrivateIpAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcPrivateIpAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcResourceDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcResourceDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnConnectionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpnConnections");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpnGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpnGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachClassicLinkVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachClassicLinkVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableGatewayFlowMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableGatewayFlowMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateAddress) is used to unbind [Elastic IPs](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
* The unbinding of EIPs from CVM instances and ENIs is supported.
* The unbinding of EIPs from NATs is not supported. For information about how to unbind an EIP from a NAT, see [EipUnBindNatGateway](https://intl.cloud.tencent.com/document/product/215/4092?from_cn_redirect=1).
* You can only unbind EIPs in BIND or BIND_ENI status.
* Blocked EIPs cannot be unbound.
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a direct connect gateway from a NAT Gateway. After unbinding, the direct connect gateway cannot access internet through the NAT Gateway.
     * @param req DisassociateDirectConnectGatewayNatGatewayRequest
     * @return DisassociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDirectConnectGatewayNatGatewayResponse DisassociateDirectConnectGatewayNatGateway(DisassociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateDirectConnectGatewayNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateDirectConnectGatewayNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateDirectConnectGatewayNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNatGatewayAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateNatGatewayAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNetworkAclSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateNetworkAclSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNetworkInterfaceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateNetworkInterfaceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCustomerGatewayConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadCustomerGatewayConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGatewayFlowMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableGatewayFlowMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the bandwidth limits of a CCN instance. Monthly-subscribed CCNs only support Inter-region Bandwidth Limits, while the pay-as-you-go CCNs support both the Inter-region Bandwidth Limits and Region Outbound Bandwidth Limits. 
     * @param req GetCcnRegionBandwidthLimitsRequest
     * @return GetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public GetCcnRegionBandwidthLimitsResponse GetCcnRegionBandwidthLimits(GetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCcnRegionBandwidthLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipAssociateAddressIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HaVipAssociateAddressIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipDisassociateAddressIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HaVipDisassociateAddressIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRenewVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResetVpnGatewayInternetMaxBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MigrateNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MigrateNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MigratePrivateIpAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MigratePrivateIpAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAddressAttribute) is used to modify the name of an [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressInternetChargeTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressInternetChargeType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressTemplateAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressTemplateGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAddressesBandwidth) is used to adjust [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) bandwidth, including the postpaid EIP, prepaid EIP and bandwidth package EIP.
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressesBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressesBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressesBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a bandwidth package, including the bandwidth package name, and so on.
     * @param req ModifyBandwidthPackageAttributeRequest
     * @return ModifyBandwidthPackageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBandwidthPackageAttributeResponse ModifyBandwidthPackageAttribute(ModifyBandwidthPackageAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBandwidthPackageAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBandwidthPackageAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBandwidthPackageAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCcnAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnRegionBandwidthLimitsTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCcnRegionBandwidthLimitsType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomerGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomerGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a direct connect gateway.

     * @param req ModifyDirectConnectGatewayAttributeRequest
     * @return ModifyDirectConnectGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectGatewayAttributeResponse ModifyDirectConnectGatewayAttribute(ModifyDirectConnectGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDirectConnectGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDirectConnectGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDirectConnectGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a flow log.
     * @param req ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFlowLogAttributeResponse ModifyFlowLogAttribute(ModifyFlowLogAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFlowLogAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFlowLogAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFlowLogAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGatewayFlowQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGatewayFlowQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHaVipAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHaVipAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIpv6AddressesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIpv6AddressesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatGatewayDestinationIpPortTranslationNatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkAclAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetworkAclAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkAclEntriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetworkAclEntries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkInterfaceAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetworkInterfaceAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrivateIpAddressesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRouteTableAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRouteTableAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset the egress and ingress policies (SecurityGroupPolicy) of a security group.

<ul>
<li>This API deletes all the existing egress and ingress policies, and then adds Egress and Ingress policies. It does not support custom indexes `PolicyIndex`.</li>
<li>For parameters of SecurityGroupPolicySet,<ul>
	<li>If `SecurityGroupPolicySet.Version` is set to 0, all policies will be cleared, and `Egress` and `Ingress` will be ignored.</li>
	<li>If `SecurityGroupPolicySet.Version` is not set to 0, add `Egress` and `Ingress` policies:<ul>
		<li>`Protocol`: allows TCP, UDP, ICMP, ICMPV6, GRE, or ALL.</li>
		<li>`CidrBlock`: a CIDR block in the correct format. In a classic network, if a `CidrBlock` contains private IPs on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
		<li>`Ipv6CidrBlock`: an IPv6 CIDR block in the correct format. In a classic network, if an `Ipv6CidrBlock` contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
		<li>`SecurityGroupId`: ID of the security group. It can be the ID of security group to be modified, or the ID of other security group in the same project. All private IPs of all CVMs under the security group will be covered. If this field is used, the policy will automatically change according to the CVM associated with the group ID while being used to match network messages. You don't need to change it manually.</li>
		<li>`Port`: a single port number such as 80, or a port range in the format of '8000-8010'. You may use this field only if the `Protocol` field takes the value `TCP` or `UDP`.</li>
		<li>`Action`: only allows ACCEPT or DROP.</li>
		<li>`CidrBlock`, `Ipv6CidrBlock`, `SecurityGroupId`, and `AddressTemplate` are mutually exclusive. `Protocol` + `Port` and `ServiceTemplate` are mutually exclusive.</li>
</ul></li></ul></li>
</ul>
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceTemplateAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceTemplateGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubnetAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubnetAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpcAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpcAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnConnectionAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpnConnectionAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpnGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpnGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RejectAttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RejectAttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ReleaseAddresses) is used to release one or multiple [Elastic IPs](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
* This operation is irreversible. Once you release an EIP, the IP address associated with the EIP no longer belongs to you.
* Only EIPs in UNBIND status can be released.
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a bandwidth package resource, including [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1), [Cloud Load Balancer](https://intl.cloud.tencent.com/document/product/214/517?from_cn_redirect=1), and so on.
     * @param req RemoveBandwidthPackageResourcesRequest
     * @return RemoveBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBandwidthPackageResourcesResponse RemoveBandwidthPackageResources(RemoveBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveBandwidthPackageResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveBandwidthPackageResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRouteTableAssociationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceRouteTableAssociation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceSecurityGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceSecurityGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetAttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetNatGatewayConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetNatGatewayConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetVpnConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetVpnGatewayInternetMaxBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetCcnRegionBandwidthLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (TransformAddress) is used to switch common public IPs into [Elastic IPs](https://intl.cloud.tencent.comhttps://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1?from_cn_redirect=1).
* The platform limits the number of times that a user can unbind an EIP and reassign public IPs in each region per day. For more information, see [EIP product introduction](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1)). The preceding quota can be obtained through the [DescribeAddressQuota](https://intl.cloud.tencent.com/document/api/213/1378?from_cn_redirect=1) API.
     * @param req TransformAddressRequest
     * @return TransformAddressResponse
     * @throws TencentCloudSDKException
     */
    public TransformAddressResponse TransformAddress(TransformAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransformAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransformAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransformAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignIpv6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6CidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignIpv6CidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignIpv6SubnetCidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignPrivateIpAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignPrivateIpAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
