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
     *This API is used to create a sub-user.
     * @param req AddUserRequest
     * @return AddUserResponse
     * @throws TencentCloudSDKException
     */
    public AddUserResponse AddUser(AddUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddUser", AddUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddUserToGroup", AddUserToGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachGroupPolicy", AttachGroupPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachRolePolicy", AttachRolePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachUserPolicy", AttachUserPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ConsumeCustomMFAToken", ConsumeCustomMFATokenResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an access key for a CAM user.
     * @param req CreateAccessKeyRequest
     * @return CreateAccessKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeyResponse CreateAccessKey(CreateAccessKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccessKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAccessKey", CreateAccessKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateGroup", CreateGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create role OIDC configurations.
     * @param req CreateOIDCConfigRequest
     * @return CreateOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateOIDCConfigResponse CreateOIDCConfig(CreateOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateOIDCConfig", CreateOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreatePolicy", CreatePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreatePolicyVersion", CreatePolicyVersionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSAMLProvider", CreateSAMLProviderResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateServiceLinkedRole", CreateServiceLinkedRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a user OIDC configuration. Only one user OIDC IdP can be created, and the user SAML SSO IdP will be automatically disabled after it is created.
     * @param req CreateUserOIDCConfigRequest
     * @return CreateUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserOIDCConfigResponse CreateUserOIDCConfig(CreateUserOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateUserOIDCConfig", CreateUserOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create user SAML configurations.
     * @param req CreateUserSAMLConfigRequest
     * @return CreateUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSAMLConfigResponse CreateUserSAMLConfig(CreateUserSAMLConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserSAMLConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateUserSAMLConfig", CreateUserSAMLConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an access key for a CAM user.
Calling this API is a high-risk operation because the key cannot be recovered once deleted and Tencent Cloud will deny all requests that use this key. Proceed with caution.
     * @param req DeleteAccessKeyRequest
     * @return DeleteAccessKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessKeyResponse DeleteAccessKey(DeleteAccessKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAccessKey", DeleteAccessKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete OIDC IdPs.
     * @param req DeleteOIDCConfigRequest
     * @return DeleteOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOIDCConfigResponse DeleteOIDCConfig(DeleteOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteOIDCConfig", DeleteOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeletePolicy", DeletePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeletePolicyVersion", DeletePolicyVersionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRolePermissionsBoundary", DeleteRolePermissionsBoundaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSAMLProvider", DeleteSAMLProviderResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteServiceLinkedRole", DeleteServiceLinkedRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteUserPermissionsBoundary", DeleteUserPermissionsBoundaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query role OIDC configurations.
     * @param req DescribeOIDCConfigRequest
     * @return DescribeOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOIDCConfigResponse DescribeOIDCConfig(DescribeOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOIDCConfig", DescribeOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a sub-account’s security settings.
     * @param req DescribeSafeAuthFlagCollRequest
     * @return DescribeSafeAuthFlagCollResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagCollResponse DescribeSafeAuthFlagColl(DescribeSafeAuthFlagCollRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagCollResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSafeAuthFlagColl", DescribeSafeAuthFlagCollResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query security settings.
     * @param req DescribeSafeAuthFlagIntlRequest
     * @return DescribeSafeAuthFlagIntlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeAuthFlagIntlResponse DescribeSafeAuthFlagIntl(DescribeSafeAuthFlagIntlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeAuthFlagIntlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSafeAuthFlagIntl", DescribeSafeAuthFlagIntlResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query sub-users through the sub-user UIN list.
     * @param req DescribeSubAccountsRequest
     * @return DescribeSubAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAccountsResponse DescribeSubAccounts(DescribeSubAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSubAccounts", DescribeSubAccountsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the user OIDC configuration.
     * @param req DescribeUserOIDCConfigRequest
     * @return DescribeUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserOIDCConfigResponse DescribeUserOIDCConfig(DescribeUserOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserOIDCConfig", DescribeUserOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query user SAML configurations.
     * @param req DescribeUserSAMLConfigRequest
     * @return DescribeUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSAMLConfigResponse DescribeUserSAMLConfig(DescribeUserSAMLConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserSAMLConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserSAMLConfig", DescribeUserSAMLConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachGroupPolicy", DetachGroupPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachRolePolicy", DetachRolePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachUserPolicy", DetachUserPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disable user SSO.
     * @param req DisableUserSSORequest
     * @return DisableUserSSOResponse
     * @throws TencentCloudSDKException
     */
    public DisableUserSSOResponse DisableUserSSO(DisableUserSSORequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableUserSSOResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisableUserSSO", DisableUserSSOResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query account summary. 
     * @param req GetAccountSummaryRequest
     * @return GetAccountSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountSummaryResponse GetAccountSummary(GetAccountSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAccountSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetAccountSummary", GetAccountSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetCustomMFATokenInfo", GetCustomMFATokenInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetGroup", GetGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetPolicy", GetPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetPolicyVersion", GetPolicyVersionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetRole", GetRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetSAMLProvider", GetSAMLProviderResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a key’s recent usage details.
     * @param req GetSecurityLastUsedRequest
     * @return GetSecurityLastUsedResponse
     * @throws TencentCloudSDKException
     */
    public GetSecurityLastUsedResponse GetSecurityLastUsed(GetSecurityLastUsedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSecurityLastUsedResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetSecurityLastUsed", GetSecurityLastUsedResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetServiceLinkedRoleDeletionStatus", GetServiceLinkedRoleDeletionStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetUser", GetUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the user AppId.
     * @param req GetUserAppIdRequest
     * @return GetUserAppIdResponse
     * @throws TencentCloudSDKException
     */
    public GetUserAppIdResponse GetUserAppId(GetUserAppIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserAppIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetUserAppId", GetUserAppIdResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAccessKeys", ListAccessKeysResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAttachedGroupPolicies", ListAttachedGroupPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAttachedRolePolicies", ListAttachedRolePoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to list policies associated with the user (including those inherited from the user group).
     * @param req ListAttachedUserAllPoliciesRequest
     * @return ListAttachedUserAllPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ListAttachedUserAllPoliciesResponse ListAttachedUserAllPolicies(ListAttachedUserAllPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAttachedUserAllPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAttachedUserAllPolicies", ListAttachedUserAllPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAttachedUserPolicies", ListAttachedUserPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListCollaborators", ListCollaboratorsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListEntitiesForPolicy", ListEntitiesForPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListGroups", ListGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListGroupsForUser", ListGroupsForUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListPolicies", ListPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListPolicyVersions", ListPolicyVersionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListSAMLProviders", ListSAMLProvidersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListUsers", ListUsersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListUsersForGroup", ListUsersForGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "PutRolePermissionsBoundary", PutRolePermissionsBoundaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "PutUserPermissionsBoundary", PutUserPermissionsBoundaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RemoveUserFromGroup", RemoveUserFromGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SetDefaultPolicyVersion", SetDefaultPolicyVersionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SetMfaFlag", SetMfaFlagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind tags to a role.
     * @param req TagRoleRequest
     * @return TagRoleResponse
     * @throws TencentCloudSDKException
     */
    public TagRoleResponse TagRole(TagRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TagRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "TagRole", TagRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind tags from a role.
     * @param req UntagRoleRequest
     * @return UntagRoleResponse
     * @throws TencentCloudSDKException
     */
    public UntagRoleResponse UntagRole(UntagRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntagRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UntagRole", UntagRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update an access key for a CAM user.
     * @param req UpdateAccessKeyRequest
     * @return UpdateAccessKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyResponse UpdateAccessKey(UpdateAccessKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAccessKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateAccessKey", UpdateAccessKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateAssumeRolePolicy", UpdateAssumeRolePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateGroup", UpdateGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify role OIDC configurations.
     * @param req UpdateOIDCConfigRequest
     * @return UpdateOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOIDCConfigResponse UpdateOIDCConfig(UpdateOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateOIDCConfig", UpdateOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdatePolicy", UpdatePolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateRoleConsoleLogin", UpdateRoleConsoleLoginResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateRoleDescription", UpdateRoleDescriptionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateSAMLProvider", UpdateSAMLProviderResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateUser", UpdateUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the user OIDC configuration.
     * @param req UpdateUserOIDCConfigRequest
     * @return UpdateUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserOIDCConfigResponse UpdateUserOIDCConfig(UpdateUserOIDCConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserOIDCConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateUserOIDCConfig", UpdateUserOIDCConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify user SAML configurations.
     * @param req UpdateUserSAMLConfigRequest
     * @return UpdateUserSAMLConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserSAMLConfigResponse UpdateUserSAMLConfig(UpdateUserSAMLConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserSAMLConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateUserSAMLConfig", UpdateUserSAMLConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
