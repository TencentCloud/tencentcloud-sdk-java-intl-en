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
package com.tencentcloudapi.eiam.v20210420;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eiam.v20210420.models.*;

public class EiamClient extends AbstractClient{
    private static String endpoint = "eiam.tencentcloudapi.com";
    private static String service = "eiam";
    private static String version = "2021-04-20";
    
    public EiamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EiamClient(Credential credential, String region, ClientProfile profile) {
        super(EiamClient.endpoint, EiamClient.version, credential, region, profile);
    }

    /**
     *This API is used to add an account to an account group.
     * @param req AddAccountToAccountGroupRequest
     * @return AddAccountToAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddAccountToAccountGroupResponse AddAccountToAccountGroup(AddAccountToAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAccountToAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddAccountToAccountGroup", AddAccountToAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a user to a user group.
     * @param req AddUserToUserGroupRequest
     * @return AddUserToUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToUserGroupResponse AddUserToUserGroup(AddUserToUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserToUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddUserToUserGroup", AddUserToUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an account group.
     * @param req CreateAccountGroupRequest
     * @return CreateAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountGroupResponse CreateAccountGroup(CreateAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAccountGroup", CreateAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an application account.
     * @param req CreateAppAccountRequest
     * @return CreateAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppAccountResponse CreateAppAccount(CreateAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAppAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAppAccount", CreateAppAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an organization node.
     * @param req CreateOrgNodeRequest
     * @return CreateOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrgNodeResponse CreateOrgNode(CreateOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrgNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateOrgNode", CreateOrgNodeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a user.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a user group.
     * @param req CreateUserGroupRequest
     * @return CreateUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserGroupResponse CreateUserGroup(CreateUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateUserGroup", CreateUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an account group.
     * @param req DeleteAccountGroupRequest
     * @return DeleteAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountGroupResponse DeleteAccountGroup(DeleteAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAccountGroup", DeleteAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an application account.
     * @param req DeleteAppAccountRequest
     * @return DeleteAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppAccountResponse DeleteAppAccount(DeleteAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAppAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAppAccount", DeleteAppAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an organization node.
     * @param req DeleteOrgNodeRequest
     * @return DeleteOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrgNodeResponse DeleteOrgNode(DeleteOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrgNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteOrgNode", DeleteOrgNodeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a user by username or user ID.
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
     *This API is used to delete a user group.
     * @param req DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupResponse DeleteUserGroup(DeleteUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteUserGroup", DeleteUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch delete the users under the current node. If an error occurs when a user is deleted, the deletion of other selected users will not be affected, and the username/ID of the user who fails to be deleted will be prompted.
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteUsers", DeleteUsersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of account groups.
     * @param req DescribeAccountGroupRequest
     * @return DescribeAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountGroupResponse DescribeAccountGroup(DescribeAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccountGroup", DescribeAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of application accounts.
     * @param req DescribeAppAccountRequest
     * @return DescribeAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppAccountResponse DescribeAppAccount(DescribeAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAppAccount", DescribeAppAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of an application.
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeApplication", DescribeApplicationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to read the information of an organization node by organization node ID.
     * @param req DescribeOrgNodeRequest
     * @return DescribeOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrgNodeResponse DescribeOrgNode(DescribeOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrgNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOrgNode", DescribeOrgNodeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of a JWT public key.
     * @param req DescribePublicKeyRequest
     * @return DescribePublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicKeyResponse DescribePublicKey(DescribePublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePublicKey", DescribePublicKeyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of a user group.
     * @param req DescribeUserGroupRequest
     * @return DescribeUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupResponse DescribeUserGroup(DescribeUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserGroup", DescribeUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to search for a user by username or user ID.
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserInfo", DescribeUserInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of resource authorizations under the specified user.
     * @param req DescribeUserResourcesAuthorizationRequest
     * @return DescribeUserResourcesAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResourcesAuthorizationResponse DescribeUserResourcesAuthorization(DescribeUserResourcesAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResourcesAuthorizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserResourcesAuthorization", DescribeUserResourcesAuthorizationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the third-party account binding information by username or user ID.
     * @param req DescribeUserThirdPartyAccountInfoRequest
     * @return DescribeUserThirdPartyAccountInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserThirdPartyAccountInfoResponse DescribeUserThirdPartyAccountInfo(DescribeUserThirdPartyAccountInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserThirdPartyAccountInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserThirdPartyAccountInfo", DescribeUserThirdPartyAccountInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     * This API is used to get the list of accounts in an account group.
     * @param req ListAccountInAccountGroupRequest
     * @return ListAccountInAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListAccountInAccountGroupResponse ListAccountInAccountGroup(ListAccountInAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAccountInAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAccountInAccountGroup", ListAccountInAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of authorization relationships of an application (including search criteria-based match).
     * @param req ListApplicationAuthorizationsRequest
     * @return ListApplicationAuthorizationsResponse
     * @throws TencentCloudSDKException
     */
    public ListApplicationAuthorizationsResponse ListApplicationAuthorizations(ListApplicationAuthorizationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListApplicationAuthorizationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListApplicationAuthorizations", ListApplicationAuthorizationsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of applications.
     * @param req ListApplicationsRequest
     * @return ListApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public ListApplicationsResponse ListApplications(ListApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListApplicationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListApplications", ListApplicationsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of accessible applications by organization node ID.
     * @param req ListAuthorizedApplicationsToOrgNodeRequest
     * @return ListAuthorizedApplicationsToOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToOrgNodeResponse ListAuthorizedApplicationsToOrgNode(ListAuthorizedApplicationsToOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToOrgNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAuthorizedApplicationsToOrgNode", ListAuthorizedApplicationsToOrgNodeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of accessible applications by user ID.
     * @param req ListAuthorizedApplicationsToUserRequest
     * @return ListAuthorizedApplicationsToUserResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToUserResponse ListAuthorizedApplicationsToUser(ListAuthorizedApplicationsToUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAuthorizedApplicationsToUser", ListAuthorizedApplicationsToUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of accessible applications by user group ID.
     * @param req ListAuthorizedApplicationsToUserGroupRequest
     * @return ListAuthorizedApplicationsToUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToUserGroupResponse ListAuthorizedApplicationsToUserGroup(ListAuthorizedApplicationsToUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListAuthorizedApplicationsToUserGroup", ListAuthorizedApplicationsToUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of the user group list (including query conditions).
     * @param req ListUserGroupsRequest
     * @return ListUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsResponse ListUserGroups(ListUserGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListUserGroups", ListUserGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of a user's user groups.
     * @param req ListUserGroupsOfUserRequest
     * @return ListUserGroupsOfUserResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsOfUserResponse ListUserGroupsOfUser(ListUserGroupsOfUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserGroupsOfUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListUserGroupsOfUser", ListUserGroupsOfUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of the user list.
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
     *This API is used to read the users under an organization node by organization node ID.
     * @param req ListUsersInOrgNodeRequest
     * @return ListUsersInOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersInOrgNodeResponse ListUsersInOrgNode(ListUsersInOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersInOrgNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListUsersInOrgNode", ListUsersInOrgNodeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of the users in a user group.
     * @param req ListUsersInUserGroupRequest
     * @return ListUsersInUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersInUserGroupResponse ListUsersInUserGroup(ListUsersInUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersInUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListUsersInUserGroup", ListUsersInUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an account group.
     * @param req ModifyAccountGroupRequest
     * @return ModifyAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountGroupResponse ModifyAccountGroup(ModifyAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAccountGroup", ModifyAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an application account.
     * @param req ModifyAppAccountRequest
     * @return ModifyAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppAccountResponse ModifyAppAccount(ModifyAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAppAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAppAccount", ModifyAppAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update the information of an application.
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the information of a user by username or user ID.
     * @param req ModifyUserInfoRequest
     * @return ModifyUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserInfoResponse ModifyUserInfo(ModifyUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyUserInfo", ModifyUserInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to remove an account from an account group.
     * @param req RemoveAccountFromAccountGroupRequest
     * @return RemoveAccountFromAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAccountFromAccountGroupResponse RemoveAccountFromAccountGroup(RemoveAccountFromAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveAccountFromAccountGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RemoveAccountFromAccountGroup", RemoveAccountFromAccountGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to remove a user from a user group.
     * @param req RemoveUserFromUserGroupRequest
     * @return RemoveUserFromUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromUserGroupResponse RemoveUserFromUserGroup(RemoveUserFromUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserFromUserGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RemoveUserFromUserGroup", RemoveUserFromUserGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an organization node.
     * @param req UpdateOrgNodeRequest
     * @return UpdateOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrgNodeResponse UpdateOrgNode(UpdateOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrgNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateOrgNode", UpdateOrgNodeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
