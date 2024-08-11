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
package com.tencentcloudapi.tcmpp.v20240801;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcmpp.v20240801.models.*;

public class TcmppClient extends AbstractClient{
    private static String endpoint = "tcmpp.tencentcloudapi.com";
    private static String service = "tcmpp";
    private static String version = "2024-08-01";
    
    public TcmppClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcmppClient(Credential credential, String region, ClientProfile profile) {
        super(TcmppClient.endpoint, TcmppClient.version, credential, region, profile);
    }

    /**
     *This API is used to add users to a team
     * @param req AddTeamMemberRequest
     * @return AddTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddTeamMemberResponse AddTeamMember(AddTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTeamMember", AddTeamMemberResponse.class);
    }

    /**
     *This API is used to query if the domain is in the allowlist or blocklist
     * @param req CheckGlobalDomainRequest
     * @return CheckGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public CheckGlobalDomainResponse CheckGlobalDomain(CheckGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckGlobalDomain", CheckGlobalDomainResponse.class);
    }

    /**
     *This API is used to add an application
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
    }

    /**
     *This API is used to add new mini program version to the console
     * @param req CreateConsoleMNPVersionCompileTaskRequest
     * @return CreateConsoleMNPVersionCompileTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleMNPVersionCompileTaskResponse CreateConsoleMNPVersionCompileTask(CreateConsoleMNPVersionCompileTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsoleMNPVersionCompileTask", CreateConsoleMNPVersionCompileTaskResponse.class);
    }

    /**
     *This API is used to create a mini program service domain
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *This API is used to add domains to allowlist or blocklist
     * @param req CreateGlobalDomainRequest
     * @return CreateGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalDomainResponse CreateGlobalDomain(CreateGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalDomain", CreateGlobalDomainResponse.class);
    }

    /**
     *This API is used to create a mini program
     * @param req CreateMNPRequest
     * @return CreateMNPResponse
     * @throws TencentCloudSDKException
     */
    public CreateMNPResponse CreateMNP(CreateMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMNP", CreateMNPResponse.class);
    }

    /**
     *This API is used to release the mini program
     * @param req CreateOnlineApplyRequest
     * @return CreateOnlineApplyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOnlineApplyResponse CreateOnlineApply(CreateOnlineApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOnlineApply", CreateOnlineApplyResponse.class);
    }

    /**
     *This API is used to submit mini program version for approval
     * @param req CreatePlatformAuditRequest
     * @return CreatePlatformAuditResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlatformAuditResponse CreatePlatformAudit(CreatePlatformAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlatformAudit", CreatePlatformAuditResponse.class);
    }

    /**
     *This API is used to obtain the encryption key
     * @param req CreatePresetKeyRequest
     * @return CreatePresetKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePresetKeyResponse CreatePresetKey(CreatePresetKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePresetKey", CreatePresetKeyResponse.class);
    }

    /**
     *This API is used to add a sensitive API
     * @param req CreateSensitiveAPIRequest
     * @return CreateSensitiveAPIResponse
     * @throws TencentCloudSDKException
     */
    public CreateSensitiveAPIResponse CreateSensitiveAPI(CreateSensitiveAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSensitiveAPI", CreateSensitiveAPIResponse.class);
    }

    /**
     *This API is used to apply for sensitive API call permissions
     * @param req CreateSensitiveApiApplyRequest
     * @return CreateSensitiveApiApplyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSensitiveApiApplyResponse CreateSensitiveApiApply(CreateSensitiveApiApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSensitiveApiApply", CreateSensitiveApiApplyResponse.class);
    }

    /**
     *This API is used to create a team
     * @param req CreateTeamRequest
     * @return CreateTeamResponse
     * @throws TencentCloudSDKException
     */
    public CreateTeamResponse CreateTeam(CreateTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTeam", CreateTeamResponse.class);
    }

    /**
     *This API is used to add team members
     * @param req CreateTeamMemberRequest
     * @return CreateTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateTeamMemberResponse CreateTeamMember(CreateTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTeamMember", CreateTeamMemberResponse.class);
    }

    /**
     *This API is used to create a user
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *This API is used to delete applications
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *This API is used to delete domains from allowlist or blocklist
     * @param req DeleteGlobalDomainRequest
     * @return DeleteGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalDomainResponse DeleteGlobalDomain(DeleteGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalDomain", DeleteGlobalDomainResponse.class);
    }

    /**
     *This API is used to delete the mini program
     * @param req DeleteMNPRequest
     * @return DeleteMNPResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMNPResponse DeleteMNP(DeleteMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMNP", DeleteMNPResponse.class);
    }

    /**
     *This API is used to delete a sensitive API
     * @param req DeleteSensitiveAPIRequest
     * @return DeleteSensitiveAPIResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSensitiveAPIResponse DeleteSensitiveAPI(DeleteSensitiveAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSensitiveAPI", DeleteSensitiveAPIResponse.class);
    }

    /**
     *This API is used to delete a team
     * @param req DeleteTeamRequest
     * @return DeleteTeamResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamResponse DeleteTeam(DeleteTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTeam", DeleteTeamResponse.class);
    }

    /**
     *This API is used to delete a team member
     * @param req DeleteTeamMemberRequest
     * @return DeleteTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamMemberResponse DeleteTeamMember(DeleteTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTeamMember", DeleteTeamMemberResponse.class);
    }

    /**
     *This API is used to delete a user
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *This API is used to query application details
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplication", DescribeApplicationResponse.class);
    }

    /**
     *This API is used to query application configuration information
     * @param req DescribeApplicationConfigRequest
     * @return DescribeApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationConfigResponse DescribeApplicationConfig(DescribeApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationConfig", DescribeApplicationConfigResponse.class);
    }

    /**
     *This API is used to query application list data
     * @param req DescribeApplicationListRequest
     * @return DescribeApplicationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationListResponse DescribeApplicationList(DescribeApplicationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationList", DescribeApplicationListResponse.class);
    }

    /**
     *This API is used to query the approval list of the mini program versions
     * @param req DescribeApplicationMNPVersionAuditListRequest
     * @return DescribeApplicationMNPVersionAuditListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationMNPVersionAuditListResponse DescribeApplicationMNPVersionAuditList(DescribeApplicationMNPVersionAuditListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationMNPVersionAuditList", DescribeApplicationMNPVersionAuditListResponse.class);
    }

    /**
     *This API is used to query if the mini program version is uploaded successfully
     * @param req DescribeConsoleMNPVersionCompileTaskRequest
     * @return DescribeConsoleMNPVersionCompileTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsoleMNPVersionCompileTaskResponse DescribeConsoleMNPVersionCompileTask(DescribeConsoleMNPVersionCompileTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsoleMNPVersionCompileTask", DescribeConsoleMNPVersionCompileTaskResponse.class);
    }

    /**
     *This API is used to query the domain name list configured for the mini program
     * @param req DescribeDomainInfoRequest
     * @return DescribeDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainInfoResponse DescribeDomainInfo(DescribeDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainInfo", DescribeDomainInfoResponse.class);
    }

    /**
     *This API is used to query the list of teams with domains that obtained the ICP filing
     * @param req DescribeDomainTeamListRequest
     * @return DescribeDomainTeamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainTeamListResponse DescribeDomainTeamList(DescribeDomainTeamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainTeamList", DescribeDomainTeamListResponse.class);
    }

    /**
     *This API is used to query domain allowlist and blocklist
     * @param req DescribeGlobalDomainListRequest
     * @return DescribeGlobalDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalDomainListResponse DescribeGlobalDomainList(DescribeGlobalDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalDomainList", DescribeGlobalDomainListResponse.class);
    }

    /**
     *This API is used to query the mini program version management information
     * @param req DescribeMNPBoardRequest
     * @return DescribeMNPBoardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPBoardResponse DescribeMNPBoard(DescribeMNPBoardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPBoard", DescribeMNPBoardResponse.class);
    }

    /**
     *This API is used to query mini program details
     * @param req DescribeMNPDetailRequest
     * @return DescribeMNPDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPDetailResponse DescribeMNPDetail(DescribeMNPDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPDetail", DescribeMNPDetailResponse.class);
    }

    /**
     *This API is used to query mini program details in the mini program list
     * @param req DescribeMNPManagerDetailRequest
     * @return DescribeMNPManagerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPManagerDetailResponse DescribeMNPManagerDetail(DescribeMNPManagerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPManagerDetail", DescribeMNPManagerDetailResponse.class);
    }

    /**
     *This API is used to query the mini program list
     * @param req DescribeMNPManagerListRequest
     * @return DescribeMNPManagerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPManagerListResponse DescribeMNPManagerList(DescribeMNPManagerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPManagerList", DescribeMNPManagerListResponse.class);
    }

    /**
     *This API is used to query the details filled in the service description
     * @param req DescribeMNPPrivacyRequest
     * @return DescribeMNPPrivacyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPPrivacyResponse DescribeMNPPrivacy(DescribeMNPPrivacyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPPrivacy", DescribeMNPPrivacyResponse.class);
    }

    /**
     *This API is used to query the mini program type list
     * @param req DescribeMNPTypeRequest
     * @return DescribeMNPTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPTypeResponse DescribeMNPType(DescribeMNPTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPType", DescribeMNPTypeResponse.class);
    }

    /**
     *This API is used to query the details of the mini program trial version
     * @param req DescribeMNPVersionPreviewRequest
     * @return DescribeMNPVersionPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPVersionPreviewResponse DescribeMNPVersionPreview(DescribeMNPVersionPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPVersionPreview", DescribeMNPVersionPreviewResponse.class);
    }

    /**
     *This API is used to query offline mini program packages
     * @param req DescribeOfflineMNPPackageRequest
     * @return DescribeOfflineMNPPackageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineMNPPackageResponse DescribeOfflineMNPPackage(DescribeOfflineMNPPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfflineMNPPackage", DescribeOfflineMNPPackageResponse.class);
    }

    /**
     *This API is used to query the current release version of the mini program
     * @param req DescribeOnlineVersionRequest
     * @return DescribeOnlineVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineVersionResponse DescribeOnlineVersion(DescribeOnlineVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOnlineVersion", DescribeOnlineVersionResponse.class);
    }

    /**
     *This API is used to query role permission information
     * @param req DescribeRoleDetailRequest
     * @return DescribeRoleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleDetailResponse DescribeRoleDetail(DescribeRoleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleDetail", DescribeRoleDetailResponse.class);
    }

    /**
     *This API is used to query role list data
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *This API is used to query sensitive API approval list
     * @param req DescribeSensitiveAPIAuditListRequest
     * @return DescribeSensitiveAPIAuditListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveAPIAuditListResponse DescribeSensitiveAPIAuditList(DescribeSensitiveAPIAuditListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveAPIAuditList", DescribeSensitiveAPIAuditListResponse.class);
    }

    /**
     *This API is used to query all sensitive APIs list
     * @param req DescribeSensitiveAPIListRequest
     * @return DescribeSensitiveAPIListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveAPIListResponse DescribeSensitiveAPIList(DescribeSensitiveAPIListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveAPIList", DescribeSensitiveAPIListResponse.class);
    }

    /**
     *This API is used to query sensitive API call details
     * @param req DescribeSensitiveApiApplyDetailRequest
     * @return DescribeSensitiveApiApplyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveApiApplyDetailResponse DescribeSensitiveApiApplyDetail(DescribeSensitiveApiApplyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveApiApplyDetail", DescribeSensitiveApiApplyDetailResponse.class);
    }

    /**
     *This API is used to query the sensitive APIs that require permission
     * @param req DescribeSensitiveApiAuthListRequest
     * @return DescribeSensitiveApiAuthListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveApiAuthListResponse DescribeSensitiveApiAuthList(DescribeSensitiveApiAuthListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveApiAuthList", DescribeSensitiveApiAuthListResponse.class);
    }

    /**
     *This API is used to query application list information
     * @param req DescribeSimpleApplicationInfoListRequest
     * @return DescribeSimpleApplicationInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleApplicationInfoListResponse DescribeSimpleApplicationInfoList(DescribeSimpleApplicationInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleApplicationInfoList", DescribeSimpleApplicationInfoListResponse.class);
    }

    /**
     *This API is used to query the team information list
     * @param req DescribeSimpleTeamListRequest
     * @return DescribeSimpleTeamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleTeamListResponse DescribeSimpleTeamList(DescribeSimpleTeamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleTeamList", DescribeSimpleTeamListResponse.class);
    }

    /**
     *This API is used to query team details
     * @param req DescribeTeamRequest
     * @return DescribeTeamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamResponse DescribeTeam(DescribeTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeam", DescribeTeamResponse.class);
    }

    /**
     *This API is used to query a specified team’s domains that obtained ICP filing
     * @param req DescribeTeamDomainListRequest
     * @return DescribeTeamDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamDomainListResponse DescribeTeamDomainList(DescribeTeamDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamDomainList", DescribeTeamDomainListResponse.class);
    }

    /**
     *This API is used to query the team list that can be viewed by the current role permissions
     * @param req DescribeTeamListRequest
     * @return DescribeTeamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamListResponse DescribeTeamList(DescribeTeamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamList", DescribeTeamListResponse.class);
    }

    /**
     *This API is used to query team member list
     * @param req DescribeTeamMemberListRequest
     * @return DescribeTeamMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamMemberListResponse DescribeTeamMemberList(DescribeTeamMemberListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamMemberList", DescribeTeamMemberListResponse.class);
    }

    /**
     *This API is used to query the member list of a specified team
     * @param req DescribeTeamMembersRequest
     * @return DescribeTeamMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamMembersResponse DescribeTeamMembers(DescribeTeamMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamMembers", DescribeTeamMembersResponse.class);
    }

    /**
     *This API is used to obtain a temporary key for file uploads
     * @param req DescribeTempSecret4UploadFile2CosRequest
     * @return DescribeTempSecret4UploadFile2CosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTempSecret4UploadFile2CosResponse DescribeTempSecret4UploadFile2Cos(DescribeTempSecret4UploadFile2CosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTempSecret4UploadFile2Cos", DescribeTempSecret4UploadFile2CosResponse.class);
    }

    /**
     *This API is used to query user details
     * @param req DescribeUserDetailRequest
     * @return DescribeUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDetailResponse DescribeUserDetail(DescribeUserDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDetail", DescribeUserDetailResponse.class);
    }

    /**
     *This API is used to query the user list
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserList", DescribeUserListResponse.class);
    }

    /**
     *This API is used to disable the company’s domain name that obtained the ICP filing
     * @param req DisableTeamDomainRequest
     * @return DisableTeamDomainResponse
     * @throws TencentCloudSDKException
     */
    public DisableTeamDomainResponse DisableTeamDomain(DisableTeamDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableTeamDomain", DisableTeamDomainResponse.class);
    }

    /**
     *This API is used to change application information
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
    }

    /**
     *This API is used to modify the application package name
     * @param req ModifyApplicationAppKeyRequest
     * @return ModifyApplicationAppKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationAppKeyResponse ModifyApplicationAppKey(ModifyApplicationAppKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationAppKey", ModifyApplicationAppKeyResponse.class);
    }

    /**
     *This API is used to change the app download address
     * @param req ModifyApplicationAppUrlRequest
     * @return ModifyApplicationAppUrlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationAppUrlResponse ModifyApplicationAppUrl(ModifyApplicationAppUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationAppUrl", ModifyApplicationAppUrlResponse.class);
    }

    /**
     *This API is used to edit the mini program domain information
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomain", ModifyDomainResponse.class);
    }

    /**
     *This API is used to modify domain allowlist or blocklist
     * @param req ModifyGlobalDomainRequest
     * @return ModifyGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalDomainResponse ModifyGlobalDomain(ModifyGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalDomain", ModifyGlobalDomainResponse.class);
    }

    /**
     *This API is used to modify mini program information
     * @param req ModifyMNPRequest
     * @return ModifyMNPResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMNPResponse ModifyMNP(ModifyMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMNP", ModifyMNPResponse.class);
    }

    /**
     *This API is used to remove the mini program
     * @param req ModifyMNPStatusOfflineRequest
     * @return ModifyMNPStatusOfflineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMNPStatusOfflineResponse ModifyMNPStatusOffline(ModifyMNPStatusOfflineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMNPStatusOffline", ModifyMNPStatusOfflineResponse.class);
    }

    /**
     *This API is used to configure the mini program trial version
     * @param req ModifyMNPVersionPreviewRequest
     * @return ModifyMNPVersionPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMNPVersionPreviewResponse ModifyMNPVersionPreview(ModifyMNPVersionPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMNPVersionPreview", ModifyMNPVersionPreviewResponse.class);
    }

    /**
     *This API is used to rollback a mini program release version
     * @param req ModifyOnlineVersionRequest
     * @return ModifyOnlineVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOnlineVersionResponse ModifyOnlineVersion(ModifyOnlineVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOnlineVersion", ModifyOnlineVersionResponse.class);
    }

    /**
     *This API is used to approve the release of the mini program version
     * @param req ModifyPlatformAuditStatusRequest
     * @return ModifyPlatformAuditStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPlatformAuditStatusResponse ModifyPlatformAuditStatus(ModifyPlatformAuditStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlatformAuditStatus", ModifyPlatformAuditStatusResponse.class);
    }

    /**
     *This API is used to approve sensitive API call permission
     * @param req ModifySensitiveAPIAuditStatusRequest
     * @return ModifySensitiveAPIAuditStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySensitiveAPIAuditStatusResponse ModifySensitiveAPIAuditStatus(ModifySensitiveAPIAuditStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySensitiveAPIAuditStatus", ModifySensitiveAPIAuditStatusResponse.class);
    }

    /**
     *This API is used to change team information
     * @param req ModifyTeamRequest
     * @return ModifyTeamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamResponse ModifyTeam(ModifyTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTeam", ModifyTeamResponse.class);
    }

    /**
     *This API is used to change team member roles
     * @param req ModifyTeamMemberRequest
     * @return ModifyTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamMemberResponse ModifyTeamMember(ModifyTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTeamMember", ModifyTeamMemberResponse.class);
    }

    /**
     *This API is used to edit user information
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *This API is used to reset user password
     * @param req ModifyUserPasswordRequest
     * @return ModifyUserPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserPasswordResponse ModifyUserPassword(ModifyUserPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPassword", ModifyUserPasswordResponse.class);
    }

}
