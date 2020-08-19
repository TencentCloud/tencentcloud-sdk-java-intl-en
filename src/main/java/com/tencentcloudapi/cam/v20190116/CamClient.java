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
package com.tencentcloudapi.cam.v20190116;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cam.v20190116.models.*;

public class CamClient extends AbstractClient{
    private static String endpoint = "cam.tencentcloudapi.com";
    private static String version = "2019-01-16";

    public CamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CamClient(Credential credential, String region, ClientProfile profile) {
        super(CamClient.endpoint, CamClient.version, credential, region, profile);
    }

    /**
     *This API is used to add sub-users.
     * @param req AddUserRequest
     * @return AddUserResponse
     * @throws TencentCloudSDKException
     */
    public AddUserResponse AddUser(AddUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add users to a user group.
     * @param req AddUserToGroupRequest
     * @return AddUserToGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToGroupResponse AddUserToGroup(AddUserToGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserToGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserToGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddUserToGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AttachGroupPolicy) is used to associate a policy with a user group.
     * @param req AttachGroupPolicyRequest
     * @return AttachGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachGroupPolicyResponse AttachGroupPolicy(AttachGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachGroupPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachGroupPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachGroupPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AttachRolePolicy) is used to associate a policy with a role.
     * @param req AttachRolePolicyRequest
     * @return AttachRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachRolePolicyResponse AttachRolePolicy(AttachRolePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachRolePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachRolePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachRolePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AttachUserPolicy) is used to associates a policy with a user.
     * @param req AttachUserPolicyRequest
     * @return AttachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachUserPolicyResponse AttachUserPolicy(AttachUserPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachUserPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachUserPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachUserPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify a custom multi-factor Token.
     * @param req ConsumeCustomMFATokenRequest
     * @return ConsumeCustomMFATokenResponse
     * @throws TencentCloudSDKException
     */
    public ConsumeCustomMFATokenResponse ConsumeCustomMFAToken(ConsumeCustomMFATokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConsumeCustomMFATokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ConsumeCustomMFATokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ConsumeCustomMFAToken"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a user group.
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreatePolicy) is used to create a policy.
     * @param req CreatePolicyRequest
     * @return CreatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyResponse CreatePolicy(CreatePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a policy version. After creating a policy version, you can easily change the policy by changing the policy version.
     * @param req CreatePolicyVersionRequest
     * @return CreatePolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyVersionResponse CreatePolicyVersion(CreatePolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePolicyVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePolicyVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateRole) is used to create a role.
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRole"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a SAML identity provider.
     * @param req CreateSAMLProviderRequest
     * @return CreateSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSAMLProviderResponse CreateSAMLProvider(CreateSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSAMLProviderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSAMLProviderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSAMLProvider"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a service-linked role.
     * @param req CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceLinkedRoleResponse CreateServiceLinkedRole(CreateServiceLinkedRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceLinkedRoleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceLinkedRoleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServiceLinkedRole"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a user group.
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeletePolicy) is used to delete a policy.
     * @param req DeletePolicyRequest
     * @return DeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyResponse DeletePolicy(DeletePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a policy version of a policy.
     * @param req DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeletePolicyVersionResponse DeletePolicyVersion(DeletePolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePolicyVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePolicyVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteRole) is used to delete a specified role.
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRole"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a role permission boundary.
     * @param req DeleteRolePermissionsBoundaryRequest
     * @return DeleteRolePermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolePermissionsBoundaryResponse DeleteRolePermissionsBoundary(DeleteRolePermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRolePermissionsBoundaryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRolePermissionsBoundaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRolePermissionsBoundary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a SAML identity provider.
     * @param req DeleteSAMLProviderRequest
     * @return DeleteSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSAMLProviderResponse DeleteSAMLProvider(DeleteSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSAMLProviderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSAMLProviderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSAMLProvider"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a service-linked role.
     * @param req DeleteServiceLinkedRoleRequest
     * @return DeleteServiceLinkedRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceLinkedRoleResponse DeleteServiceLinkedRole(DeleteServiceLinkedRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceLinkedRoleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceLinkedRoleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceLinkedRole"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a sub-user.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a user permission boundary.
     * @param req DeleteUserPermissionsBoundaryRequest
     * @return DeleteUserPermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserPermissionsBoundaryResponse DeleteUserPermissionsBoundary(DeleteUserPermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserPermissionsBoundaryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserPermissionsBoundaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUserPermissionsBoundary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRoleList) is used to get the role list under the account.
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoleListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoleListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRoleList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachGroupPolicy) is used to unassociate a policy and a user group.
     * @param req DetachGroupPolicyRequest
     * @return DetachGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachGroupPolicyResponse DetachGroupPolicy(DetachGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachGroupPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachGroupPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachGroupPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachRolePolicy) is used to unassociate a policy and a role.
     * @param req DetachRolePolicyRequest
     * @return DetachRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachRolePolicyResponse DetachRolePolicy(DetachRolePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachRolePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachRolePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachRolePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachUserPolicy) is used to unassociate a policy and a user.
     * @param req DetachUserPolicyRequest
     * @return DetachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachUserPolicyResponse DetachUserPolicy(DetachUserPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachUserPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachUserPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachUserPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get information associated with a custom multi-factor Token
     * @param req GetCustomMFATokenInfoRequest
     * @return GetCustomMFATokenInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCustomMFATokenInfoResponse GetCustomMFATokenInfo(GetCustomMFATokenInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCustomMFATokenInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetCustomMFATokenInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetCustomMFATokenInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query user group details.
     * @param req GetGroupRequest
     * @return GetGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupResponse GetGroup(GetGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (GetPolicy) is used to query and view policy details.
     * @param req GetPolicyRequest
     * @return GetPolicyResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyResponse GetPolicy(GetPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query policy version details.
     * @param req GetPolicyVersionRequest
     * @return GetPolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyVersionResponse GetPolicyVersion(GetPolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPolicyVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPolicyVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (GetRole) is used to get the details of a specified role.
     * @param req GetRoleRequest
     * @return GetRoleResponse
     * @throws TencentCloudSDKException
     */
    public GetRoleResponse GetRole(GetRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRole"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query SAML identity provider details.
     * @param req GetSAMLProviderRequest
     * @return GetSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public GetSAMLProviderResponse GetSAMLProvider(GetSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSAMLProviderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetSAMLProviderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetSAMLProvider"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the status of the service-linked role deletion based on the `TaskId`
     * @param req GetServiceLinkedRoleDeletionStatusRequest
     * @return GetServiceLinkedRoleDeletionStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceLinkedRoleDeletionStatusResponse GetServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetServiceLinkedRoleDeletionStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceLinkedRoleDeletionStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetServiceLinkedRoleDeletionStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query sub-users.
     * @param req GetUserRequest
     * @return GetUserResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResponse GetUser(GetUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list the access keys associated with a specified CAM user.
     * @param req ListAccessKeysRequest
     * @return ListAccessKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListAccessKeysResponse ListAccessKeys(ListAccessKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAccessKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAccessKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAccessKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ListAttachedGroupPolicies) is used to query the list of policies associated with a user group.
     * @param req ListAttachedGroupPoliciesRequest
     * @return ListAttachedGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedGroupPoliciesResponse ListAttachedGroupPolicies(ListAttachedGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAttachedGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ListAttachedRolePolicies) is used to obtain the list of the policies associated with a role.
     * @param req ListAttachedRolePoliciesRequest
     * @return ListAttachedRolePoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedRolePoliciesResponse ListAttachedRolePolicies(ListAttachedRolePoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedRolePoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedRolePoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAttachedRolePolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ListAttachedUserPolicies) is used to query the list of policies associated with a sub-account.
     * @param req ListAttachedUserPoliciesRequest
     * @return ListAttachedUserPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedUserPoliciesResponse ListAttachedUserPolicies(ListAttachedUserPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedUserPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedUserPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAttachedUserPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the collaborator list.
     * @param req ListCollaboratorsRequest
     * @return ListCollaboratorsResponse
     * @throws TencentCloudSDKException
     */
    public ListCollaboratorsResponse ListCollaborators(ListCollaboratorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListCollaboratorsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListCollaboratorsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListCollaborators"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ListEntitiesForPolicy) is used to query the list of entities associated with a policy.
     * @param req ListEntitiesForPolicyRequest
     * @return ListEntitiesForPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListEntitiesForPolicyResponse ListEntitiesForPolicy(ListEntitiesForPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEntitiesForPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListEntitiesForPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListEntitiesForPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of user groups.
     * @param req ListGroupsRequest
     * @return ListGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsResponse ListGroups(ListGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list user groups associated with a user.
     * @param req ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     * @throws TencentCloudSDKException
     */
    public ListGroupsForUserResponse ListGroupsForUser(ListGroupsForUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListGroupsForUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListGroupsForUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListGroupsForUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the policy list.
     * @param req ListPoliciesRequest
     * @return ListPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListPoliciesResponse ListPolicies(ListPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of policy versions.
     * @param req ListPolicyVersionsRequest
     * @return ListPolicyVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListPolicyVersionsResponse ListPolicyVersions(ListPolicyVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListPolicyVersionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListPolicyVersionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListPolicyVersions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of SAML identity providers.
     * @param req ListSAMLProvidersRequest
     * @return ListSAMLProvidersResponse
     * @throws TencentCloudSDKException
     */
    public ListSAMLProvidersResponse ListSAMLProviders(ListSAMLProvidersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListSAMLProvidersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListSAMLProvidersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListSAMLProviders"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pull sub-users.
     * @param req ListUsersRequest
     * @return ListUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersResponse ListUsers(ListUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListUsers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of users associated with a user group.
     * @param req ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersForGroupResponse ListUsersForGroup(ListUsersForGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersForGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersForGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListUsersForGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set a role permission boundary.
     * @param req PutRolePermissionsBoundaryRequest
     * @return PutRolePermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public PutRolePermissionsBoundaryResponse PutRolePermissionsBoundary(PutRolePermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutRolePermissionsBoundaryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PutRolePermissionsBoundaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PutRolePermissionsBoundary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set a user permission boundary.
     * @param req PutUserPermissionsBoundaryRequest
     * @return PutUserPermissionsBoundaryResponse
     * @throws TencentCloudSDKException
     */
    public PutUserPermissionsBoundaryResponse PutUserPermissionsBoundary(PutUserPermissionsBoundaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutUserPermissionsBoundaryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PutUserPermissionsBoundaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PutUserPermissionsBoundary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete users from a user group.
     * @param req RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromGroupResponse RemoveUserFromGroup(RemoveUserFromGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserFromGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserFromGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveUserFromGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the operative policy version.
     * @param req SetDefaultPolicyVersionRequest
     * @return SetDefaultPolicyVersionResponse
     * @throws TencentCloudSDKException
     */
    public SetDefaultPolicyVersionResponse SetDefaultPolicyVersion(SetDefaultPolicyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetDefaultPolicyVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetDefaultPolicyVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetDefaultPolicyVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set account verification for login and sensitive operations for sub-users.
     * @param req SetMfaFlagRequest
     * @return SetMfaFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetMfaFlagResponse SetMfaFlag(SetMfaFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetMfaFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetMfaFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetMfaFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpdateAssumeRolePolicy) is used to modify the trust policy of a role.
     * @param req UpdateAssumeRolePolicyRequest
     * @return UpdateAssumeRolePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssumeRolePolicyResponse UpdateAssumeRolePolicy(UpdateAssumeRolePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAssumeRolePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAssumeRolePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAssumeRolePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a user group.
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a policy.
This API will update the default version of an existing policy instead of creating a new one. If no policy exists, a default version will be created.
     * @param req UpdatePolicyRequest
     * @return UpdatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePolicyResponse UpdatePolicy(UpdatePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdatePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a role's login permissions.
     * @param req UpdateRoleConsoleLoginRequest
     * @return UpdateRoleConsoleLoginResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleConsoleLoginResponse UpdateRoleConsoleLogin(UpdateRoleConsoleLoginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRoleConsoleLoginResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRoleConsoleLoginResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateRoleConsoleLogin"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpdateRoleDescription) is used to modify the description of a role.
     * @param req UpdateRoleDescriptionRequest
     * @return UpdateRoleDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRoleDescriptionResponse UpdateRoleDescription(UpdateRoleDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRoleDescriptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRoleDescriptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateRoleDescription"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update SAML identity provider information.
     * @param req UpdateSAMLProviderRequest
     * @return UpdateSAMLProviderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSAMLProviderResponse UpdateSAMLProvider(UpdateSAMLProviderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateSAMLProviderResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateSAMLProviderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateSAMLProvider"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a sub-user.
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
