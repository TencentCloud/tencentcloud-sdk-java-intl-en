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
package com.tencentcloudapi.alb.v20251030;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.alb.v20251030.models.*;

public class AlbClient extends AbstractClient{
    private static String endpoint = "alb.intl.tencentcloudapi.com";
    private static String service = "alb";
    private static String version = "2025-10-30";

    public AlbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AlbClient(Credential credential, String region, ClientProfile profile) {
        super(AlbClient.endpoint, AlbClient.version, credential, region, profile);
    }

    /**
     *Add a backend service in the target group.
     * @param req AddTargetsToTargetGroupRequest
     * @return AddTargetsToTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddTargetsToTargetGroupResponse AddTargetsToTargetGroup(AddTargetsToTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTargetsToTargetGroup", AddTargetsToTargetGroupResponse.class);
    }

    /**
     *Bind a Bandwidth Package to an application CLB instance.
     * @param req AssociateBandwidthPackageWithLoadBalancerRequest
     * @return AssociateBandwidthPackageWithLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public AssociateBandwidthPackageWithLoadBalancerResponse AssociateBandwidthPackageWithLoadBalancer(AssociateBandwidthPackageWithLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateBandwidthPackageWithLoadBalancer", AssociateBandwidthPackageWithLoadBalancerResponse.class);
    }

    /**
     *AssociateListenerAdditionalCertificates is an async API. The system returns a request ID, but the additional cert is not yet successfully added. The add task is still in progress in the system backend. You can call the DescribeListenerCertificates API to query the add status of the additional cert.
When HTTPS and QUIC listeners are in Associating status, it means certificate expansion is ongoing.
When HTTPS and QUIC listeners are in the Associated status, the extension cert is successfully added.
     * @param req AssociateListenerAdditionalCertificatesRequest
     * @return AssociateListenerAdditionalCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public AssociateListenerAdditionalCertificatesResponse AssociateListenerAdditionalCertificates(AssociateListenerAdditionalCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateListenerAdditionalCertificates", AssociateListenerAdditionalCertificatesResponse.class);
    }

    /**
     *This API is used to create a health check Template.
     * @param req CreateHealthCheckTemplateRequest
     * @return CreateHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateHealthCheckTemplateResponse CreateHealthCheckTemplate(CreateHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHealthCheckTemplate", CreateHealthCheckTemplateResponse.class);
    }

    /**
     *This API is used to create a listener.
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     ***CreateLoadBalancer** is an async API. The system returns an instance ID, but the application CLB instance is not created successfully yet, and the creation task is still in progress in the system backend. You can call [DescribeLoadBalancerDetail](https://www.tencentcloud.com/document/api/1822/133711) to query the creation status of the application CLB instance.
- When an application CLB instance is in the **Provisioning** status, it means the application CLB instance is being created.
-When an application CLB instance is in the **Active** status, the application CLB instance is successfully created.
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *This API is used to create forwarding rules. It is an async API. After returning successfully, call the DescribeAsyncJobs API with the returned RequestID as an input parameter to check whether this task is successful.
A rule supports up to 10 forward Conditions and 5 forward Actions.
     * @param req CreateRulesRequest
     * @return CreateRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRulesResponse CreateRules(CreateRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRules", CreateRulesResponse.class);
    }

    /**
     *Create a custom security policy for configuring the TLS protocol version and encryption suite of an HTTPS listener. With a security policy, you can flexibly control the security level of HTTPS communication between clients and load balancing.
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityPolicy", CreateSecurityPolicyResponse.class);
    }

    /**
     *Target Group APIs
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTargetGroup", CreateTargetGroupResponse.class);
    }

    /**
     *Deletes a health check Template
     * @param req DeleteHealthCheckTemplatesRequest
     * @return DeleteHealthCheckTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHealthCheckTemplatesResponse DeleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHealthCheckTemplates", DeleteHealthCheckTemplatesResponse.class);
    }

    /**
     *Delete a listener
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *The **DeleteLoadBalancers** API is an async API. The system returns a request ID, but the application CLB instance is not yet deleted successfully. The deletion task is still in progress in the system backend. You can call [DescribeLoadBalancerDetail](https://www.tencentcloud.com/document/api/1822/133711) to query the deletion status of the application CLB instance.
- When an application CLB instance is in the **Deleting** status, it means the application CLB instance is being deleted.
-If the specified application CLB instance cannot be queried, the application CLB instance has been deleted successfully.
     * @param req DeleteLoadBalancersRequest
     * @return DeleteLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancersResponse DeleteLoadBalancers(DeleteLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancers", DeleteLoadBalancersResponse.class);
    }

    /**
     *DeleteRules deletes forwarding rules. This is an async API. After returning successfully, call the DescribeAsyncJobs API with the returned RequestID as an input parameter to check whether this task is successful.
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRules", DeleteRulesResponse.class);
    }

    /**
     *Delete one or more custom security policies. Before deletion, please ensure the policy hasn't been referenced by any HTTPS listener, otherwise the deletion will fail.
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityPolicy", DeleteSecurityPolicyResponse.class);
    }

    /**
     *Delete a target group.
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTargetGroups", DeleteTargetGroupsResponse.class);
    }

    /**
     *Query API for async tasks
     * @param req DescribeAsyncJobsRequest
     * @return DescribeAsyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncJobsResponse DescribeAsyncJobs(DescribeAsyncJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncJobs", DescribeAsyncJobsResponse.class);
    }

    /**
     *This API is used to query the health check template list.
     * @param req DescribeHealthCheckTemplatesRequest
     * @return DescribeHealthCheckTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckTemplatesResponse DescribeHealthCheckTemplates(DescribeHealthCheckTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckTemplates", DescribeHealthCheckTemplatesResponse.class);
    }

    /**
     *This API is used to query the list of certificates bound to a specified listener by instance id and listener id.
If `CertificateType` is set to `SVR`, the information of the extended server certificate and the default server certificate is returned.
If CertificateType is set to CA, the default CA certificate info is returned.
     * @param req DescribeListenerCertificatesRequest
     * @return DescribeListenerCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerCertificatesResponse DescribeListenerCertificates(DescribeListenerCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerCertificates", DescribeListenerCertificatesResponse.class);
    }

    /**
     *Queries details of one listener.
     * @param req DescribeListenerDetailRequest
     * @return DescribeListenerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerDetailResponse DescribeListenerDetail(DescribeListenerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerDetail", DescribeListenerDetailResponse.class);
    }

    /**
     *Queries the health status of a listener.
     * @param req DescribeListenerHealthStatusRequest
     * @return DescribeListenerHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerHealthStatusResponse DescribeListenerHealthStatus(DescribeListenerHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerHealthStatus", DescribeListenerHealthStatusResponse.class);
    }

    /**
     *Queries the listener list
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *Queries detailed information of a specified load balancing instance.
     * @param req DescribeLoadBalancerDetailRequest
     * @return DescribeLoadBalancerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerDetailResponse DescribeLoadBalancerDetail(DescribeLoadBalancerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerDetail", DescribeLoadBalancerDetailResponse.class);
    }

    /**
     *Query instance configuration.
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *Queries the ALB quota configuration of the current account. It supports querying by quota type and allows you to pass a resource ID to query resource-level quotas. You can use DisplayFields to return the used amount and remaining available quantity as needed.
     * @param req DescribeQuotaRequest
     * @return DescribeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaResponse DescribeQuota(DescribeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuota", DescribeQuotaResponse.class);
    }

    /**
     *This API is used to query forwarding rules.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *Queries the custom security policy list, supports filtering by security policy ID, name, or tag, and supports paging query.
     * @param req DescribeSecurityPoliciesRequest
     * @return DescribeSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPoliciesResponse DescribeSecurityPolicies(DescribeSecurityPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicies", DescribeSecurityPoliciesResponse.class);
    }

    /**
     *Query the security policy configuration capacity supported in the current region, including optional TLS protocol versions and the encryption suite list for each version. Before creating or modifying a custom security policy, call this API to get available configuration options.
     * @param req DescribeSecurityPolicyCapabilitiesRequest
     * @return DescribeSecurityPolicyCapabilitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyCapabilitiesResponse DescribeSecurityPolicyCapabilities(DescribeSecurityPolicyCapabilitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyCapabilities", DescribeSecurityPolicyCapabilitiesResponse.class);
    }

    /**
     *Query the relationship between a security policy and the HTTPS listeners that refer to it. Before deleting or modifying a security policy, it is advisable to call this API to confirm the impact.
     * @param req DescribeSecurityPolicyRelationsRequest
     * @return DescribeSecurityPolicyRelationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyRelationsResponse DescribeSecurityPolicyRelations(DescribeSecurityPolicyRelationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyRelations", DescribeSecurityPolicyRelationsResponse.class);
    }

    /**
     *Queries system security policies.
     * @param req DescribeSystemSecurityPoliciesRequest
     * @return DescribeSystemSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemSecurityPoliciesResponse DescribeSystemSecurityPolicies(DescribeSystemSecurityPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemSecurityPolicies", DescribeSystemSecurityPoliciesResponse.class);
    }

    /**
     *Queries backend services in the target group.
     * @param req DescribeTargetGroupTargetsRequest
     * @return DescribeTargetGroupTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupTargetsResponse DescribeTargetGroupTargets(DescribeTargetGroupTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupTargets", DescribeTargetGroupTargetsResponse.class);
    }

    /**
     *Query the target group list.
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroups", DescribeTargetGroupsResponse.class);
    }

    /**
     *Query bound target groups based on the slave machine.
     * @param req DescribeTargetGroupsByTargetRequest
     * @return DescribeTargetGroupsByTargetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsByTargetResponse DescribeTargetGroupsByTarget(DescribeTargetGroupsByTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupsByTarget", DescribeTargetGroupsByTargetResponse.class);
    }

    /**
     *Querying Availability Zones
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *Unbind a Bandwidth Package from an application CLB instance.
     * @param req DisassociateBandwidthPackageFromLoadBalancerRequest
     * @return DisassociateBandwidthPackageFromLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateBandwidthPackageFromLoadBalancerResponse DisassociateBandwidthPackageFromLoadBalancer(DisassociateBandwidthPackageFromLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateBandwidthPackageFromLoadBalancer", DisassociateBandwidthPackageFromLoadBalancerResponse.class);
    }

    /**
     *DisassociateListenerAdditionalCertificates is an async API. The system returns a request ID, but the additional cert is not yet unbound. The unbinding task is still in progress in the system backend. You can call the DescribeListenerCertificates API to query the cert unbinding status. If the cert is in Disassociating status, it is being unbound.
     * @param req DisassociateListenerAdditionalCertificatesRequest
     * @return DisassociateListenerAdditionalCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateListenerAdditionalCertificatesResponse DisassociateListenerAdditionalCertificates(DisassociateListenerAdditionalCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateListenerAdditionalCertificates", DisassociateListenerAdditionalCertificatesResponse.class);
    }

    /**
     *This API is used to query the price for creating a load balancer.
     * @param req InquirePriceCreateLoadBalancerRequest
     * @return InquirePriceCreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateLoadBalancerResponse InquirePriceCreateLoadBalancer(InquirePriceCreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateLoadBalancer", InquirePriceCreateLoadBalancerResponse.class);
    }

    /**
     *Modify a health check template
     * @param req ModifyHealthCheckTemplateRequest
     * @return ModifyHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHealthCheckTemplateResponse ModifyHealthCheckTemplate(ModifyHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHealthCheckTemplate", ModifyHealthCheckTemplateResponse.class);
    }

    /**
     *Modifies listener properties.
     * @param req ModifyListenerAttributesRequest
     * @return ModifyListenerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerAttributesResponse ModifyListenerAttributes(ModifyListenerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListenerAttributes", ModifyListenerAttributesResponse.class);
    }

    /**
     ***Prerequisite:**
You have created an application CLB instance. For detailed operations, please see CreateLoadBalancer.
When you need to change the network type of an application CLB instance from private network to public network through this API, you need to create an Elastic IP first.
**Instructions:**
The ModifyLoadBalancerAddressType API is an async API. The system returns a request ID, but the network type of the application CLB instance has not been changed yet. The change task is still in progress in the system backend. You can call DescribeLoadBalancerDetail to query the change status of the network type of the application CLB instance.
When an application CLB instance is in the Configuring status, it means the network type of the instance is changing.
When an application CLB instance is in the Active status, the network type change of the instance is successful.
     * @param req ModifyLoadBalancerAddressTypeRequest
     * @return ModifyLoadBalancerAddressTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAddressTypeResponse ModifyLoadBalancerAddressType(ModifyLoadBalancerAddressTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAddressType", ModifyLoadBalancerAddressTypeResponse.class);
    }

    /**
     *The **ModifyLoadBalancerAttributes** API is an async API. It returns a request ID, but the application CLB instance attribute has not been modified yet. The modifying task is still in progress in the system backend. You can call [DescribeLoadBalancerDetail](https://www.tencentcloud.com/document/api/1822/133711) to query the modification status of the application CLB instance attribute.
-When the application CLB instance attribute is in the **Configuring** status, it means the application CLB instance attribute is being modified.
- When the application CLB instance attribute is in the **Active** status, it means the application CLB instance attribute was modified successfully.
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *Set load balancing instance modification protection.
     * @param req ModifyLoadBalancerModificationProtectionRequest
     * @return ModifyLoadBalancerModificationProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerModificationProtectionResponse ModifyLoadBalancerModificationProtection(ModifyLoadBalancerModificationProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerModificationProtection", ModifyLoadBalancerModificationProtectionResponse.class);
    }

    /**
     *This API is used to modify forwarding rule attributes. This is an async API. After the API return succeeds, you can call the DescribeAsyncJobs API with the returned RequestID as an input parameter to check whether this task is successful.
A rule supports up to 10 forward Conditions and 5 forward Actions.
     * @param req ModifyRulesAttributesRequest
     * @return ModifyRulesAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRulesAttributesResponse ModifyRulesAttributes(ModifyRulesAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRulesAttributes", ModifyRulesAttributesResponse.class);
    }

    /**
     *Modify the properties of a custom security policy, including the policy name, TLS protocol version, and encryption suite. The modified configuration will be applied to all HTTPS listeners associated with this policy immediately.
     * @param req ModifySecurityPolicyAttributesRequest
     * @return ModifySecurityPolicyAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyAttributesResponse ModifySecurityPolicyAttributes(ModifySecurityPolicyAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityPolicyAttributes", ModifySecurityPolicyAttributesResponse.class);
    }

    /**
     *Modify the target group.
     * @param req ModifyTargetGroupAttributesRequest
     * @return ModifyTargetGroupAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributesResponse ModifyTargetGroupAttributes(ModifyTargetGroupAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupAttributes", ModifyTargetGroupAttributesResponse.class);
    }

    /**
     *Modifies backend service information in the target group.
     * @param req ModifyTargetsInTargetGroupRequest
     * @return ModifyTargetsInTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetsInTargetGroupResponse ModifyTargetsInTargetGroup(ModifyTargetsInTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetsInTargetGroup", ModifyTargetsInTargetGroupResponse.class);
    }

    /**
     *Notify load balancing to unbind real servers
     * @param req NotifyUnbindTargetRequest
     * @return NotifyUnbindTargetResponse
     * @throws TencentCloudSDKException
     */
    public NotifyUnbindTargetResponse NotifyUnbindTarget(NotifyUnbindTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "NotifyUnbindTarget", NotifyUnbindTargetResponse.class);
    }

    /**
     *Removes a backend service from the target group
     * @param req RemoveTargetsFromTargetGroupRequest
     * @return RemoveTargetsFromTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveTargetsFromTargetGroupResponse RemoveTargetsFromTargetGroup(RemoveTargetsFromTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveTargetsFromTargetGroup", RemoveTargetsFromTargetGroupResponse.class);
    }

    /**
     *The SetLoadBalancerSecurityGroups API supports setting (binding and unbinding) security groups for a public network load balancing instance. To query the security groups currently bound to a load balancing instance, use the DescribeLoadBalancerDetail API (https://www.tencentcloud.com/document/api/1822/133711?from_cn_redirect=1). This API uses SET semantics.
For the binding operation, input parameters need to be passed in for all security groups that should be bound to the load balancing instance (bound + new binding).
During unbinding, input parameters need to pass in all security groups bound to a CLB instance after unbinding. To unbind all security groups, omit this parameter or specify an empty array.
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

}
