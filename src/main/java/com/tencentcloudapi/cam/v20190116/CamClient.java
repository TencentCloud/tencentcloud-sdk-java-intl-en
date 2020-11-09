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
    private static String service = "cam";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserToGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserToGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachRolePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachRolePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachUserPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachUserPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ConsumeCustomMFATokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ConsumeCustomMFAToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceLinkedRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceLinkedRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRolePermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRolePermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceLinkedRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceLinkedRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserPermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserPermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query security settings.
     * @param req DescribeSafeAuthFlagRequest
     * @return DescribeSafeAuthFlagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagResponse DescribeSafeAuthFlag(DescribeSafeAuthFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafeAuthFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafeAuthFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query security settings.
     * @param req DescribeSafeAuthFlagCollRequest
     * @return DescribeSafeAuthFlagCollResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagCollResponse DescribeSafeAuthFlagColl(DescribeSafeAuthFlagCollRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagCollResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafeAuthFlagCollResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafeAuthFlagColl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachRolePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachRolePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachUserPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachUserPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCustomMFATokenInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCustomMFATokenInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceLinkedRoleDeletionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetServiceLinkedRoleDeletionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAccessKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAccessKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedRolePoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedRolePolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAttachedUserPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAttachedUserPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListCollaboratorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListCollaborators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEntitiesForPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEntitiesForPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListGroupsForUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListGroupsForUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListPolicyVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListPolicyVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListSAMLProvidersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListSAMLProviders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersForGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsersForGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutRolePermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutRolePermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutUserPermissionsBoundaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutUserPermissionsBoundary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserFromGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUserFromGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetDefaultPolicyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetDefaultPolicyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetMfaFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetMfaFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAssumeRolePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAssumeRolePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRoleConsoleLoginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRoleConsoleLogin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRoleDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRoleDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateSAMLProviderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateSAMLProvider");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
