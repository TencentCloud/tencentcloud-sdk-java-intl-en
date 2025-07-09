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
package com.tencentcloudapi.organization.v20210331;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.organization.v20210331.models.*;

public class OrganizationClient extends AbstractClient{
    private static String endpoint = "organization.intl.tencentcloudapi.com";
    private static String service = "organization";
    private static String version = "2021-03-31";

    public OrganizationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OrganizationClient(Credential credential, String region, ClientProfile profile) {
        super(OrganizationClient.endpoint, OrganizationClient.version, credential, region, profile);
    }

    /**
     *This API is used to accept an invitation to join a shared unit.
     * @param req AcceptJoinShareUnitInvitationRequest
     * @return AcceptJoinShareUnitInvitationResponse
     * @throws TencentCloudSDKException
     */
    public AcceptJoinShareUnitInvitationResponse AcceptJoinShareUnitInvitation(AcceptJoinShareUnitInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptJoinShareUnitInvitation", AcceptJoinShareUnitInvitationResponse.class);
    }

    /**
     *This API is used to add SAML signing certificates.
     * @param req AddExternalSAMLIdPCertificateRequest
     * @return AddExternalSAMLIdPCertificateResponse
     * @throws TencentCloudSDKException
     */
    public AddExternalSAMLIdPCertificateResponse AddExternalSAMLIdPCertificate(AddExternalSAMLIdPCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddExternalSAMLIdPCertificate", AddExternalSAMLIdPCertificateResponse.class);
    }

    /**
     *This API is used to add an organization member's mailbox.
     * @param req AddOrganizationMemberEmailRequest
     * @return AddOrganizationMemberEmailResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationMemberEmailResponse AddOrganizationMemberEmail(AddOrganizationMemberEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationMemberEmail", AddOrganizationMemberEmailResponse.class);
    }

    /**
     *This API is used to add an organization node.
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationNode", AddOrganizationNodeResponse.class);
    }

    /**
     *This API is used to add policies to permission configurations.
     * @param req AddPermissionPolicyToRoleConfigurationRequest
     * @return AddPermissionPolicyToRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public AddPermissionPolicyToRoleConfigurationResponse AddPermissionPolicyToRoleConfiguration(AddPermissionPolicyToRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddPermissionPolicyToRoleConfiguration", AddPermissionPolicyToRoleConfigurationResponse.class);
    }

    /**
     *This API is used to create a shared unit.
     * @param req AddShareUnitRequest
     * @return AddShareUnitResponse
     * @throws TencentCloudSDKException
     */
    public AddShareUnitResponse AddShareUnit(AddShareUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddShareUnit", AddShareUnitResponse.class);
    }

    /**
     *This API is used to add a shared unit member.
     * @param req AddShareUnitMembersRequest
     * @return AddShareUnitMembersResponse
     * @throws TencentCloudSDKException
     */
    public AddShareUnitMembersResponse AddShareUnitMembers(AddShareUnitMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddShareUnitMembers", AddShareUnitMembersResponse.class);
    }

    /**
     *This API is used to add resources to a shared unit.
     * @param req AddShareUnitResourcesRequest
     * @return AddShareUnitResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AddShareUnitResourcesResponse AddShareUnitResources(AddShareUnitResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddShareUnitResources", AddShareUnitResourcesResponse.class);
    }

    /**
     *This API is used to add users to a user group.
     * @param req AddUserToGroupRequest
     * @return AddUserToGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToGroupResponse AddUserToGroup(AddUserToGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserToGroup", AddUserToGroupResponse.class);
    }

    /**
     *This API is used to bind an organization member to a sub-account of the organization admin.
     * @param req BindOrganizationMemberAuthAccountRequest
     * @return BindOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindOrganizationMemberAuthAccountResponse BindOrganizationMemberAuthAccount(BindOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindOrganizationMemberAuthAccount", BindOrganizationMemberAuthAccountResponse.class);
    }

    /**
     *This API is used to unbind an organization member from a sub-account of the organization admin.
     * @param req CancelOrganizationMemberAuthAccountRequest
     * @return CancelOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationMemberAuthAccountResponse CancelOrganizationMemberAuthAccount(CancelOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelOrganizationMemberAuthAccount", CancelOrganizationMemberAuthAccountResponse.class);
    }

    /**
     *This API is used to clear the SAML identity provider configuration information.
     * @param req ClearExternalSAMLIdentityProviderRequest
     * @return ClearExternalSAMLIdentityProviderResponse
     * @throws TencentCloudSDKException
     */
    public ClearExternalSAMLIdentityProviderResponse ClearExternalSAMLIdentityProvider(ClearExternalSAMLIdentityProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearExternalSAMLIdentityProvider", ClearExternalSAMLIdentityProviderResponse.class);
    }

    /**
     *This API is used to create user groups.
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroup", CreateGroupResponse.class);
    }

    /**
     *This API is used to add a delegated admin of the organization service.
     * @param req CreateOrgServiceAssignRequest
     * @return CreateOrgServiceAssignResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrgServiceAssignResponse CreateOrgServiceAssign(CreateOrgServiceAssignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrgServiceAssign", CreateOrgServiceAssignResponse.class);
    }

    /**
     *This API is used to create an organization.
     * @param req CreateOrganizationRequest
     * @return CreateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationResponse CreateOrganization(CreateOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganization", CreateOrganizationResponse.class);
    }

    /**
     *This API is used to add an organization identity.
     * @param req CreateOrganizationIdentityRequest
     * @return CreateOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationIdentityResponse CreateOrganizationIdentity(CreateOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationIdentity", CreateOrganizationIdentityResponse.class);
    }

    /**
     *This API is used to create an organization member.
     * @param req CreateOrganizationMemberRequest
     * @return CreateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberResponse CreateOrganizationMember(CreateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMember", CreateOrganizationMemberResponse.class);
    }

    /**
     *This API is used to add organization member access authorization.
     * @param req CreateOrganizationMemberAuthIdentityRequest
     * @return CreateOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberAuthIdentityResponse CreateOrganizationMemberAuthIdentity(CreateOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMemberAuthIdentity", CreateOrganizationMemberAuthIdentityResponse.class);
    }

    /**
     *This API is used to create an organization member access authorization policy.
     * @param req CreateOrganizationMemberPolicyRequest
     * @return CreateOrganizationMemberPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberPolicyResponse CreateOrganizationMemberPolicy(CreateOrganizationMemberPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMemberPolicy", CreateOrganizationMemberPolicyResponse.class);
    }

    /**
     *This API is used to create an organization member access policy.
     * @param req CreateOrganizationMembersPolicyRequest
     * @return CreateOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMembersPolicyResponse CreateOrganizationMembersPolicy(CreateOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMembersPolicy", CreateOrganizationMembersPolicyResponse.class);
    }

    /**
     *This API is used to grant authorizations on member accounts.
     * @param req CreateRoleAssignmentRequest
     * @return CreateRoleAssignmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleAssignmentResponse CreateRoleAssignment(CreateRoleAssignmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoleAssignment", CreateRoleAssignmentResponse.class);
    }

    /**
     *This API is used to create permission configurations.
     * @param req CreateRoleConfigurationRequest
     * @return CreateRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleConfigurationResponse CreateRoleConfiguration(CreateRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoleConfiguration", CreateRoleConfigurationResponse.class);
    }

    /**
     *This API is used to create a SCIM key.
     * @param req CreateSCIMCredentialRequest
     * @return CreateSCIMCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateSCIMCredentialResponse CreateSCIMCredential(CreateSCIMCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSCIMCredential", CreateSCIMCredentialResponse.class);
    }

    /**
     *This API is used to create a user.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *This API is used to create sub-user synchronization tasks.
     * @param req CreateUserSyncProvisioningRequest
     * @return CreateUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSyncProvisioningResponse CreateUserSyncProvisioning(CreateUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserSyncProvisioning", CreateUserSyncProvisioningResponse.class);
    }

    /**
     *This API is used to delete user groups.
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *This API is used to delete a delegated admin of the organization service.
     * @param req DeleteOrgServiceAssignRequest
     * @return DeleteOrgServiceAssignResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrgServiceAssignResponse DeleteOrgServiceAssign(DeleteOrgServiceAssignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrgServiceAssign", DeleteOrgServiceAssignResponse.class);
    }

    /**
     *This API is used to delete an organization.
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganization", DeleteOrganizationResponse.class);
    }

    /**
     *This API is used to delete an organization identity.
     * @param req DeleteOrganizationIdentityRequest
     * @return DeleteOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationIdentityResponse DeleteOrganizationIdentity(DeleteOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationIdentity", DeleteOrganizationIdentityResponse.class);
    }

    /**
     *This API is used to delete organization member access authorization.
     * @param req DeleteOrganizationMemberAuthIdentityRequest
     * @return DeleteOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberAuthIdentityResponse DeleteOrganizationMemberAuthIdentity(DeleteOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMemberAuthIdentity", DeleteOrganizationMemberAuthIdentityResponse.class);
    }

    /**
     *This API is used to remove a member account from the organization, rather than delete the account.
     * @param req DeleteOrganizationMembersRequest
     * @return DeleteOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersResponse DeleteOrganizationMembers(DeleteOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMembers", DeleteOrganizationMembersResponse.class);
    }

    /**
     *This API is used to delete an organization member access policy.
     * @param req DeleteOrganizationMembersPolicyRequest
     * @return DeleteOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersPolicyResponse DeleteOrganizationMembersPolicy(DeleteOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMembersPolicy", DeleteOrganizationMembersPolicyResponse.class);
    }

    /**
     *This API is used to batch delete organization nodes.
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationNodes", DeleteOrganizationNodesResponse.class);
    }

    /**
     *This API is used to remove authorizations on member accounts.
     * @param req DeleteRoleAssignmentRequest
     * @return DeleteRoleAssignmentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleAssignmentResponse DeleteRoleAssignment(DeleteRoleAssignmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoleAssignment", DeleteRoleAssignmentResponse.class);
    }

    /**
     *This API is used to delete the permission configuration information.
     * @param req DeleteRoleConfigurationRequest
     * @return DeleteRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleConfigurationResponse DeleteRoleConfiguration(DeleteRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoleConfiguration", DeleteRoleConfigurationResponse.class);
    }

    /**
     *This API is used to delete a SCIM key.
     * @param req DeleteSCIMCredentialRequest
     * @return DeleteSCIMCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSCIMCredentialResponse DeleteSCIMCredential(DeleteSCIMCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSCIMCredential", DeleteSCIMCredentialResponse.class);
    }

    /**
     *This API is used to delete a shared unit.
     * @param req DeleteShareUnitRequest
     * @return DeleteShareUnitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareUnitResponse DeleteShareUnit(DeleteShareUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareUnit", DeleteShareUnitResponse.class);
    }

    /**
     *This API is used to delete a shared unit member.
     * @param req DeleteShareUnitMembersRequest
     * @return DeleteShareUnitMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareUnitMembersResponse DeleteShareUnitMembers(DeleteShareUnitMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareUnitMembers", DeleteShareUnitMembersResponse.class);
    }

    /**
     *This API is used to delete shared unit resources.
     * @param req DeleteShareUnitResourcesRequest
     * @return DeleteShareUnitResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareUnitResourcesResponse DeleteShareUnitResources(DeleteShareUnitResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareUnitResources", DeleteShareUnitResourcesResponse.class);
    }

    /**
     *This API is used to delete a user.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *This API is used to delete sub-user synchronization tasks.
     * @param req DeleteUserSyncProvisioningRequest
     * @return DeleteUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserSyncProvisioningResponse DeleteUserSyncProvisioning(DeleteUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserSyncProvisioning", DeleteUserSyncProvisioningResponse.class);
    }

    /**
     *This API is used to obtain TCO Identity Center service information.
     * @param req DescribeIdentityCenterRequest
     * @return DescribeIdentityCenterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentityCenterResponse DescribeIdentityCenter(DescribeIdentityCenterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdentityCenter", DescribeIdentityCenterResponse.class);
    }

    /**
     *This API is used to get the organization information.
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganization", DescribeOrganizationResponse.class);
    }

    /**
     *This API is used to get the list of sub-accounts bound to an organization member.
     * @param req DescribeOrganizationMemberAuthAccountsRequest
     * @return DescribeOrganizationMemberAuthAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthAccountsResponse DescribeOrganizationMemberAuthAccounts(DescribeOrganizationMemberAuthAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberAuthAccounts", DescribeOrganizationMemberAuthAccountsResponse.class);
    }

    /**
     *This API is used to obtain the list of organization member access authorization.
     * @param req DescribeOrganizationMemberAuthIdentitiesRequest
     * @return DescribeOrganizationMemberAuthIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthIdentitiesResponse DescribeOrganizationMemberAuthIdentities(DescribeOrganizationMemberAuthIdentitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberAuthIdentities", DescribeOrganizationMemberAuthIdentitiesResponse.class);
    }

    /**
     *This API is used to query detailed information about member mailbox binding.
     * @param req DescribeOrganizationMemberEmailBindRequest
     * @return DescribeOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberEmailBindResponse DescribeOrganizationMemberEmailBind(DescribeOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberEmailBind", DescribeOrganizationMemberEmailBindResponse.class);
    }

    /**
     *This API is used to get the list of authorization policies of an organization member.
     * @param req DescribeOrganizationMemberPoliciesRequest
     * @return DescribeOrganizationMemberPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberPoliciesResponse DescribeOrganizationMemberPolicies(DescribeOrganizationMemberPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberPolicies", DescribeOrganizationMemberPoliciesResponse.class);
    }

    /**
     *This API is used to get the list of organization members.
     * @param req DescribeOrganizationMembersRequest
     * @return DescribeOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMembersResponse DescribeOrganizationMembers(DescribeOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMembers", DescribeOrganizationMembersResponse.class);
    }

    /**
     *This API is used to get the list of organization nodes.
     * @param req DescribeOrganizationNodesRequest
     * @return DescribeOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationNodesResponse DescribeOrganizationNodes(DescribeOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationNodes", DescribeOrganizationNodesResponse.class);
    }

    /**
     *This API is used to obtain a list of shareable regions.
     * @param req DescribeShareAreasRequest
     * @return DescribeShareAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareAreasResponse DescribeShareAreas(DescribeShareAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareAreas", DescribeShareAreasResponse.class);
    }

    /**
     *This API is used to obtain the member list of a shared unit.
     * @param req DescribeShareUnitMembersRequest
     * @return DescribeShareUnitMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareUnitMembersResponse DescribeShareUnitMembers(DescribeShareUnitMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareUnitMembers", DescribeShareUnitMembersResponse.class);
    }

    /**
     *This API is used to obtain the resource list of a shared unit.
     * @param req DescribeShareUnitResourcesRequest
     * @return DescribeShareUnitResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareUnitResourcesResponse DescribeShareUnitResources(DescribeShareUnitResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareUnitResources", DescribeShareUnitResourcesResponse.class);
    }

    /**
     *This API is used to obtain a list of shared units.
     * @param req DescribeShareUnitsRequest
     * @return DescribeShareUnitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShareUnitsResponse DescribeShareUnits(DescribeShareUnitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShareUnits", DescribeShareUnitsResponse.class);
    }

    /**
     *This API is used to undeploy permission configurations on member accounts.
     * @param req DismantleRoleConfigurationRequest
     * @return DismantleRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DismantleRoleConfigurationResponse DismantleRoleConfiguration(DismantleRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DismantleRoleConfiguration", DismantleRoleConfigurationResponse.class);
    }

    /**
     *This API is used to query the SAML identity provider configuration information.
     * @param req GetExternalSAMLIdentityProviderRequest
     * @return GetExternalSAMLIdentityProviderResponse
     * @throws TencentCloudSDKException
     */
    public GetExternalSAMLIdentityProviderResponse GetExternalSAMLIdentityProvider(GetExternalSAMLIdentityProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetExternalSAMLIdentityProvider", GetExternalSAMLIdentityProviderResponse.class);
    }

    /**
     *This API is used to query the user group information.
     * @param req GetGroupRequest
     * @return GetGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupResponse GetGroup(GetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroup", GetGroupResponse.class);
    }

    /**
     *This API is used to query the status of async tasks of user synchronization.
     * @param req GetProvisioningTaskStatusRequest
     * @return GetProvisioningTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetProvisioningTaskStatusResponse GetProvisioningTaskStatus(GetProvisioningTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProvisioningTaskStatus", GetProvisioningTaskStatusResponse.class);
    }

    /**
     *This API is used to query the permission configuration information.
     * @param req GetRoleConfigurationRequest
     * @return GetRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public GetRoleConfigurationResponse GetRoleConfiguration(GetRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRoleConfiguration", GetRoleConfigurationResponse.class);
    }

    /**
     *This API is used to query SCIM synchronization status.
     * @param req GetSCIMSynchronizationStatusRequest
     * @return GetSCIMSynchronizationStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetSCIMSynchronizationStatusResponse GetSCIMSynchronizationStatus(GetSCIMSynchronizationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSCIMSynchronizationStatus", GetSCIMSynchronizationStatusResponse.class);
    }

    /**
     *This API is used to query the status of async tasks.
     * @param req GetTaskStatusRequest
     * @return GetTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskStatusResponse GetTaskStatus(GetTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskStatus", GetTaskStatusResponse.class);
    }

    /**
     *This API is used to query the user information.
     * @param req GetUserRequest
     * @return GetUserResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResponse GetUser(GetUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUser", GetUserResponse.class);
    }

    /**
     *This API is used to query the CAM user synchronization.
     * @param req GetUserSyncProvisioningRequest
     * @return GetUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public GetUserSyncProvisioningResponse GetUserSyncProvisioning(GetUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUserSyncProvisioning", GetUserSyncProvisioningResponse.class);
    }

    /**
     *This API is used to query the SAML service provider configuration information.
     * @param req GetZoneSAMLServiceProviderInfoRequest
     * @return GetZoneSAMLServiceProviderInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetZoneSAMLServiceProviderInfoResponse GetZoneSAMLServiceProviderInfo(GetZoneSAMLServiceProviderInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetZoneSAMLServiceProviderInfo", GetZoneSAMLServiceProviderInfoResponse.class);
    }

    /**
     *This API is used to query space statistics.
     * @param req GetZoneStatisticsRequest
     * @return GetZoneStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public GetZoneStatisticsResponse GetZoneStatistics(GetZoneStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetZoneStatistics", GetZoneStatisticsResponse.class);
    }

    /**
     *This API is used to invite a member.
     * @param req InviteOrganizationMemberRequest
     * @return InviteOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public InviteOrganizationMemberResponse InviteOrganizationMember(InviteOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InviteOrganizationMember", InviteOrganizationMemberResponse.class);
    }

    /**
     *This API is used to query the SAML signing certificate list.
     * @param req ListExternalSAMLIdPCertificatesRequest
     * @return ListExternalSAMLIdPCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public ListExternalSAMLIdPCertificatesResponse ListExternalSAMLIdPCertificates(ListExternalSAMLIdPCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListExternalSAMLIdPCertificates", ListExternalSAMLIdPCertificatesResponse.class);
    }

    /**
     *This API is used to query the user list of the user group.
     * @param req ListGroupMembersRequest
     * @return ListGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupMembersResponse ListGroupMembers(ListGroupMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGroupMembers", ListGroupMembersResponse.class);
    }

    /**
     *This API is used to query the user group list.
     * @param req ListGroupsRequest
     * @return ListGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsResponse ListGroups(ListGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGroups", ListGroupsResponse.class);
    }

    /**
     *This API is used to query the user group joined by users.
     * @param req ListJoinedGroupsForUserRequest
     * @return ListJoinedGroupsForUserResponse
     * @throws TencentCloudSDKException
     */
    public ListJoinedGroupsForUserResponse ListJoinedGroupsForUser(ListJoinedGroupsForUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListJoinedGroupsForUser", ListJoinedGroupsForUserResponse.class);
    }

    /**
     *This API is used to obtain the list of delegated admins of the organization service.
     * @param req ListOrgServiceAssignMemberRequest
     * @return ListOrgServiceAssignMemberResponse
     * @throws TencentCloudSDKException
     */
    public ListOrgServiceAssignMemberResponse ListOrgServiceAssignMember(ListOrgServiceAssignMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrgServiceAssignMember", ListOrgServiceAssignMemberResponse.class);
    }

    /**
     *This API is used to get the list of access identities of an organization member.
     * @param req ListOrganizationIdentityRequest
     * @return ListOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationIdentityResponse ListOrganizationIdentity(ListOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationIdentity", ListOrganizationIdentityResponse.class);
    }

    /**
     *This API is used to obtain the list of organization service settings.
     * @param req ListOrganizationServiceRequest
     * @return ListOrganizationServiceResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationServiceResponse ListOrganizationService(ListOrganizationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationService", ListOrganizationServiceResponse.class);
    }

    /**
     *This API is used to obtain the policy list in permission configurations.
     * @param req ListPermissionPoliciesInRoleConfigurationRequest
     * @return ListPermissionPoliciesInRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ListPermissionPoliciesInRoleConfigurationResponse ListPermissionPoliciesInRoleConfiguration(ListPermissionPoliciesInRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPermissionPoliciesInRoleConfiguration", ListPermissionPoliciesInRoleConfigurationResponse.class);
    }

    /**
     *This API is used to query the authorization list.
     * @param req ListRoleAssignmentsRequest
     * @return ListRoleAssignmentsResponse
     * @throws TencentCloudSDKException
     */
    public ListRoleAssignmentsResponse ListRoleAssignments(ListRoleAssignmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRoleAssignments", ListRoleAssignmentsResponse.class);
    }

    /**
     *This API is used to query the permission configuration deployment list.
     * @param req ListRoleConfigurationProvisioningsRequest
     * @return ListRoleConfigurationProvisioningsResponse
     * @throws TencentCloudSDKException
     */
    public ListRoleConfigurationProvisioningsResponse ListRoleConfigurationProvisionings(ListRoleConfigurationProvisioningsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRoleConfigurationProvisionings", ListRoleConfigurationProvisioningsResponse.class);
    }

    /**
     *This API is used to query the permission configuration list.
     * @param req ListRoleConfigurationsRequest
     * @return ListRoleConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public ListRoleConfigurationsResponse ListRoleConfigurations(ListRoleConfigurationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRoleConfigurations", ListRoleConfigurationsResponse.class);
    }

    /**
     *This API is used to query the user SCIM key list.
     * @param req ListSCIMCredentialsRequest
     * @return ListSCIMCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public ListSCIMCredentialsResponse ListSCIMCredentials(ListSCIMCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSCIMCredentials", ListSCIMCredentialsResponse.class);
    }

    /**
     *This API is used to query the async task list.
     * @param req ListTasksRequest
     * @return ListTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTasksResponse ListTasks(ListTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTasks", ListTasksResponse.class);
    }

    /**
     *This API is used to query the CAM user synchronization list.
     * @param req ListUserSyncProvisioningsRequest
     * @return ListUserSyncProvisioningsResponse
     * @throws TencentCloudSDKException
     */
    public ListUserSyncProvisioningsResponse ListUserSyncProvisionings(ListUserSyncProvisioningsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUserSyncProvisionings", ListUserSyncProvisioningsResponse.class);
    }

    /**
     *This API is used to query the user list.
     * @param req ListUsersRequest
     * @return ListUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersResponse ListUsers(ListUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUsers", ListUsersResponse.class);
    }

    /**
     *This API is used to move a member to the specified organization node.
     * @param req MoveOrganizationNodeMembersRequest
     * @return MoveOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationNodeMembersResponse MoveOrganizationNodeMembers(MoveOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveOrganizationNodeMembers", MoveOrganizationNodeMembersResponse.class);
    }

    /**
     *This API is used to activate Identity Center service (CIC).
     * @param req OpenIdentityCenterRequest
     * @return OpenIdentityCenterResponse
     * @throws TencentCloudSDKException
     */
    public OpenIdentityCenterResponse OpenIdentityCenter(OpenIdentityCenterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenIdentityCenter", OpenIdentityCenterResponse.class);
    }

    /**
     *This API is used to deploy permission configurations on member accounts.
     * @param req ProvisionRoleConfigurationRequest
     * @return ProvisionRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ProvisionRoleConfigurationResponse ProvisionRoleConfiguration(ProvisionRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProvisionRoleConfiguration", ProvisionRoleConfigurationResponse.class);
    }

    /**
     *This API is used to exit an organization.
     * @param req QuitOrganizationRequest
     * @return QuitOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public QuitOrganizationResponse QuitOrganization(QuitOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QuitOrganization", QuitOrganizationResponse.class);
    }

    /**
     *This API is used to reject an invitation to join a shared unit.
     * @param req RejectJoinShareUnitInvitationRequest
     * @return RejectJoinShareUnitInvitationResponse
     * @throws TencentCloudSDKException
     */
    public RejectJoinShareUnitInvitationResponse RejectJoinShareUnitInvitation(RejectJoinShareUnitInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RejectJoinShareUnitInvitation", RejectJoinShareUnitInvitationResponse.class);
    }

    /**
     *This API is used to remove SAML signing certificates.
     * @param req RemoveExternalSAMLIdPCertificateRequest
     * @return RemoveExternalSAMLIdPCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RemoveExternalSAMLIdPCertificateResponse RemoveExternalSAMLIdPCertificate(RemoveExternalSAMLIdPCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveExternalSAMLIdPCertificate", RemoveExternalSAMLIdPCertificateResponse.class);
    }

    /**
     *This API is used to remove policies from permission configurations.
     * @param req RemovePermissionPolicyFromRoleConfigurationRequest
     * @return RemovePermissionPolicyFromRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public RemovePermissionPolicyFromRoleConfigurationResponse RemovePermissionPolicyFromRoleConfiguration(RemovePermissionPolicyFromRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemovePermissionPolicyFromRoleConfiguration", RemovePermissionPolicyFromRoleConfigurationResponse.class);
    }

    /**
     *This API is used to removes users from a user group.
     * @param req RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromGroupResponse RemoveUserFromGroup(RemoveUserFromGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveUserFromGroup", RemoveUserFromGroupResponse.class);
    }

    /**
     *This API is used to resend an email for activating the member's bound mailbox.
     * @param req SendOrgMemberAccountBindEmailRequest
     * @return SendOrgMemberAccountBindEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendOrgMemberAccountBindEmailResponse SendOrgMemberAccountBindEmail(SendOrgMemberAccountBindEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendOrgMemberAccountBindEmail", SendOrgMemberAccountBindEmailResponse.class);
    }

    /**
     *This API is used to configure the SAML identity provider information.
     * @param req SetExternalSAMLIdentityProviderRequest
     * @return SetExternalSAMLIdentityProviderResponse
     * @throws TencentCloudSDKException
     */
    public SetExternalSAMLIdentityProviderResponse SetExternalSAMLIdentityProvider(SetExternalSAMLIdentityProviderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetExternalSAMLIdentityProvider", SetExternalSAMLIdentityProviderResponse.class);
    }

    /**
     *This API is used to modify a custom policy for permission configurations.
     * @param req UpdateCustomPolicyForRoleConfigurationRequest
     * @return UpdateCustomPolicyForRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCustomPolicyForRoleConfigurationResponse UpdateCustomPolicyForRoleConfiguration(UpdateCustomPolicyForRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCustomPolicyForRoleConfiguration", UpdateCustomPolicyForRoleConfigurationResponse.class);
    }

    /**
     *This API is used to modify user group information.
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGroup", UpdateGroupResponse.class);
    }

    /**
     *This API is used to update an organization identity.
     * @param req UpdateOrganizationIdentityRequest
     * @return UpdateOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationIdentityResponse UpdateOrganizationIdentity(UpdateOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationIdentity", UpdateOrganizationIdentityResponse.class);
    }

    /**
     *This API is used to update organization member information.
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMember", UpdateOrganizationMemberResponse.class);
    }

    /**
     *This API is used to modify the mailbox of a bound member.
     * @param req UpdateOrganizationMemberEmailBindRequest
     * @return UpdateOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberEmailBindResponse UpdateOrganizationMemberEmailBind(UpdateOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMemberEmailBind", UpdateOrganizationMemberEmailBindResponse.class);
    }

    /**
     *This API is used to update an organization node.
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationNode", UpdateOrganizationNodeResponse.class);
    }

    /**
     *This API is used to modify the permission configuration information.
     * @param req UpdateRoleConfigurationRequest
     * @return UpdateRoleConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleConfigurationResponse UpdateRoleConfiguration(UpdateRoleConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRoleConfiguration", UpdateRoleConfigurationResponse.class);
    }

    /**
     *This API is used to enable or disable a SCIM key.
     * @param req UpdateSCIMCredentialStatusRequest
     * @return UpdateSCIMCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSCIMCredentialStatusResponse UpdateSCIMCredentialStatus(UpdateSCIMCredentialStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSCIMCredentialStatus", UpdateSCIMCredentialStatusResponse.class);
    }

    /**
     *This API is used to enable or disable user SCIM synchronization.
     * @param req UpdateSCIMSynchronizationStatusRequest
     * @return UpdateSCIMSynchronizationStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSCIMSynchronizationStatusResponse UpdateSCIMSynchronizationStatus(UpdateSCIMSynchronizationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSCIMSynchronizationStatus", UpdateSCIMSynchronizationStatusResponse.class);
    }

    /**
     *This API is used to update a shared unit.
     * @param req UpdateShareUnitRequest
     * @return UpdateShareUnitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateShareUnitResponse UpdateShareUnit(UpdateShareUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateShareUnit", UpdateShareUnitResponse.class);
    }

    /**
     *This API is used to modify user information.
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUser", UpdateUserResponse.class);
    }

    /**
     *This API is used to modify the user status.
     * @param req UpdateUserStatusRequest
     * @return UpdateUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserStatusResponse UpdateUserStatus(UpdateUserStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserStatus", UpdateUserStatusResponse.class);
    }

    /**
     *This API is used to create sub-user synchronization tasks.
     * @param req UpdateUserSyncProvisioningRequest
     * @return UpdateUserSyncProvisioningResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserSyncProvisioningResponse UpdateUserSyncProvisioning(UpdateUserSyncProvisioningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserSyncProvisioning", UpdateUserSyncProvisioningResponse.class);
    }

    /**
     *This API is used to update the user's space name.
     * @param req UpdateZoneRequest
     * @return UpdateZoneResponse
     * @throws TencentCloudSDKException
     */
    public UpdateZoneResponse UpdateZone(UpdateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateZone", UpdateZoneResponse.class);
    }

}
