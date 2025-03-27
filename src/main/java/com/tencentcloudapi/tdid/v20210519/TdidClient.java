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
package com.tencentcloudapi.tdid.v20210519;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdid.v20210519.models.*;

public class TdidClient extends AbstractClient{
    private static String endpoint = "tdid.intl.tencentcloudapi.com";
    private static String service = "tdid";
    private static String version = "2021-05-19";
    
    public TdidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdidClient(Credential credential, String region, ClientProfile profile) {
        super(TdidClient.endpoint, TdidClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a label to a DID.

     * @param req AddLabelRequest
     * @return AddLabelResponse
     * @throws TencentCloudSDKException
     */
    public AddLabelResponse AddLabel(AddLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLabel", AddLabelResponse.class);
    }

    /**
     *This API is used to revoke the certification of an issuing authority.
     * @param req CancelAuthorityIssuerRequest
     * @return CancelAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public CancelAuthorityIssuerResponse CancelAuthorityIssuer(CancelAuthorityIssuerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAuthorityIssuer", CancelAuthorityIssuerResponse.class);
    }

    /**
     *This API is used to get blockchain information.
     * @param req CheckChainRequest
     * @return CheckChainResponse
     * @throws TencentCloudSDKException
     */
    public CheckChainResponse CheckChain(CheckChainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckChain", CheckChainResponse.class);
    }

    /**
     *This API is used to query a deployment task.
     * @param req CheckDidDeployRequest
     * @return CheckDidDeployResponse
     * @throws TencentCloudSDKException
     */
    public CheckDidDeployResponse CheckDidDeploy(CheckDidDeployRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDidDeploy", CheckDidDeployResponse.class);
    }

    /**
     *This API is used to create a credential.
     * @param req CreateCredentialRequest
     * @return CreateCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateCredentialResponse CreateCredential(CreateCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCredential", CreateCredentialResponse.class);
    }

    /**
     *This API is used to create a DID service.
     * @param req CreateDidServiceRequest
     * @return CreateDidServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDidServiceResponse CreateDidService(CreateDidServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDidService", CreateDidServiceResponse.class);
    }

    /**
     *This API is used to create a label.
     * @param req CreateLabelRequest
     * @return CreateLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateLabelResponse CreateLabel(CreateLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLabel", CreateLabelResponse.class);
    }

    /**
     *This API is used to create a selective disclosure credential.
     * @param req CreateSelectiveCredentialRequest
     * @return CreateSelectiveCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateSelectiveCredentialResponse CreateSelectiveCredential(CreateSelectiveCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSelectiveCredential", CreateSelectiveCredentialResponse.class);
    }

    /**
     *This API is used to create an organization DID.
     * @param req CreateTDidRequest
     * @return CreateTDidResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidResponse CreateTDid(CreateTDidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDid", CreateTDidResponse.class);
    }

    /**
     *This API is used to generate a TDID by private key.
     * @param req CreateTDidByPrivateKeyRequest
     * @return CreateTDidByPrivateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPrivateKeyResponse CreateTDidByPrivateKey(CreateTDidByPrivateKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDidByPrivateKey", CreateTDidByPrivateKeyResponse.class);
    }

    /**
     * This API is used to generate a TDID by public key.
     * @param req CreateTDidByPublicKeyRequest
     * @return CreateTDidByPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPublicKeyResponse CreateTDidByPublicKey(CreateTDidByPublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDidByPublicKey", CreateTDidByPublicKeyResponse.class);
    }

    /**
     *This API is used to deploy a TDID contract by name.
     * @param req DeployByNameRequest
     * @return DeployByNameResponse
     * @throws TencentCloudSDKException
     */
    public DeployByNameResponse DeployByName(DeployByNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployByName", DeployByNameResponse.class);
    }

    /**
     *This API is used to download a claim protocol type (CPT).
     * @param req DownCptRequest
     * @return DownCptResponse
     * @throws TencentCloudSDKException
     */
    public DownCptResponse DownCpt(DownCptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownCpt", DownCptResponse.class);
    }

    /**
     *This API is used to enable a contract.
     * @param req EnableHashRequest
     * @return EnableHashResponse
     * @throws TencentCloudSDKException
     */
    public EnableHashResponse EnableHash(EnableHashRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableHash", EnableHashResponse.class);
    }

    /**
     *该接口已废弃

This API is used to get the DID details of the current organization.
     * @param req GetAgencyTDidRequest
     * @return GetAgencyTDidResponse
     * @throws TencentCloudSDKException
     */
    public GetAgencyTDidResponse GetAgencyTDid(GetAgencyTDidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAgencyTDid", GetAgencyTDidResponse.class);
    }

    /**
     *This API is used to query authorities.
     * @param req GetAuthoritiesListRequest
     * @return GetAuthoritiesListResponse
     * @throws TencentCloudSDKException
     */
    public GetAuthoritiesListResponse GetAuthoritiesList(GetAuthoritiesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAuthoritiesList", GetAuthoritiesListResponse.class);
    }

    /**
     *This API is used to get the information of an issuing authority.
     * @param req GetAuthorityIssuerRequest
     * @return GetAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public GetAuthorityIssuerResponse GetAuthorityIssuer(GetAuthorityIssuerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAuthorityIssuer", GetAuthorityIssuerResponse.class);
    }

    /**
     *This API is used to query the BCOS networks of a consortium.
     * @param req GetConsortiumClusterListRequest
     * @return GetConsortiumClusterListResponse
     * @throws TencentCloudSDKException
     */
    public GetConsortiumClusterListResponse GetConsortiumClusterList(GetConsortiumClusterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetConsortiumClusterList", GetConsortiumClusterListResponse.class);
    }

    /**
     *This API is used to query consortiums.
     * @param req GetConsortiumListRequest
     * @return GetConsortiumListResponse
     * @throws TencentCloudSDKException
     */
    public GetConsortiumListResponse GetConsortiumList(GetConsortiumListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetConsortiumList", GetConsortiumListResponse.class);
    }

    /**
     *This API is used to get the information of a claim protocol type (CPT).
     * @param req GetCptInfoRequest
     * @return GetCptInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCptInfoResponse GetCptInfo(GetCptInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCptInfo", GetCptInfoResponse.class);
    }

    /**
     *This API is used to query claim protocol types (CPT).
     * @param req GetCptListRequest
     * @return GetCptListResponse
     * @throws TencentCloudSDKException
     */
    public GetCptListResponse GetCptList(GetCptListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCptList", GetCptListResponse.class);
    }

    /**
     *This API is used to get the rankings of claim protocol types (CPT).
     * @param req GetCredentialCptRankRequest
     * @return GetCredentialCptRankResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialCptRankResponse GetCredentialCptRank(GetCredentialCptRankRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCredentialCptRank", GetCredentialCptRankResponse.class);
    }

    /**
     *This API is used to get the rankings of issuers.
     * @param req GetCredentialIssueRankRequest
     * @return GetCredentialIssueRankResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialIssueRankResponse GetCredentialIssueRank(GetCredentialIssueRankRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCredentialIssueRank", GetCredentialIssueRankResponse.class);
    }

    /**
     *This API is used to query credential issuing trends.
     * @param req GetCredentialIssueTrendRequest
     * @return GetCredentialIssueTrendResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialIssueTrendResponse GetCredentialIssueTrend(GetCredentialIssueTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCredentialIssueTrend", GetCredentialIssueTrendResponse.class);
    }

    /**
     *This API is used to query the on-chain status of a credential.
     * @param req GetCredentialStatusRequest
     * @return GetCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialStatusResponse GetCredentialStatus(GetCredentialStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCredentialStatus", GetCredentialStatusResponse.class);
    }

    /**
     *This API is used to query the overall statistics of a network.

     * @param req GetDataPanelRequest
     * @return GetDataPanelResponse
     * @throws TencentCloudSDKException
     */
    public GetDataPanelResponse GetDataPanel(GetDataPanelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataPanel", GetDataPanelResponse.class);
    }

    /**
     *This API is used to query the deployment information of a contract.

     * @param req GetDeployInfoRequest
     * @return GetDeployInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetDeployInfoResponse GetDeployInfo(GetDeployInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeployInfo", GetDeployInfoResponse.class);
    }

    /**
     *This API is used to query deployed contracts.
     * @param req GetDeployListRequest
     * @return GetDeployListResponse
     * @throws TencentCloudSDKException
     */
    public GetDeployListResponse GetDeployList(GetDeployListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeployList", GetDeployListResponse.class);
    }

    /**
     *This API is used to get the information of a DID blockchain network.
     * @param req GetDidClusterDetailRequest
     * @return GetDidClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetDidClusterDetailResponse GetDidClusterDetail(GetDidClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidClusterDetail", GetDidClusterDetailResponse.class);
    }

    /**
     *This API is used to query your DID networks.
     * @param req GetDidClusterListRequest
     * @return GetDidClusterListResponse
     * @throws TencentCloudSDKException
     */
    public GetDidClusterListResponse GetDidClusterList(GetDidClusterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidClusterList", GetDidClusterListResponse.class);
    }

    /**
     *This API is used to get the information of a DID.
     * @param req GetDidDetailRequest
     * @return GetDidDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetDidDetailResponse GetDidDetail(GetDidDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidDetail", GetDidDetailResponse.class);
    }

    /**
     *This API is used to get the document of a DID.

     * @param req GetDidDocumentRequest
     * @return GetDidDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GetDidDocumentResponse GetDidDocument(GetDidDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidDocument", GetDidDocumentResponse.class);
    }

    /**
     *This API is used to query DIDs.
     * @param req GetDidListRequest
     * @return GetDidListResponse
     * @throws TencentCloudSDKException
     */
    public GetDidListResponse GetDidList(GetDidListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidList", GetDidListResponse.class);
    }

    /**
     *This API is used to query DID registration trends.
     * @param req GetDidRegisterTrendRequest
     * @return GetDidRegisterTrendResponse
     * @throws TencentCloudSDKException
     */
    public GetDidRegisterTrendResponse GetDidRegisterTrend(GetDidRegisterTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidRegisterTrend", GetDidRegisterTrendResponse.class);
    }

    /**
     *This API is used to get the information of a DID service.
     * @param req GetDidServiceDetailRequest
     * @return GetDidServiceDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetDidServiceDetailResponse GetDidServiceDetail(GetDidServiceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidServiceDetail", GetDidServiceDetailResponse.class);
    }

    /**
     *This API is used to query DID services.
     * @param req GetDidServiceListRequest
     * @return GetDidServiceListResponse
     * @throws TencentCloudSDKException
     */
    public GetDidServiceListResponse GetDidServiceList(GetDidServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDidServiceList", GetDidServiceListResponse.class);
    }

    /**
     *This API is used to query main groups.
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupList", GetGroupListResponse.class);
    }

    /**
     *This API is used to query labels.
     * @param req GetLabelListRequest
     * @return GetLabelListResponse
     * @throws TencentCloudSDKException
     */
    public GetLabelListResponse GetLabelList(GetLabelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLabelList", GetLabelListResponse.class);
    }

    /**
     *This API is used to query disclosure policies.
     * @param req GetPolicyListRequest
     * @return GetPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyListResponse GetPolicyList(GetPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPolicyList", GetPolicyListResponse.class);
    }

    /**
     *This API is used to get the public key of a DID.
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPublicKey", GetPublicKeyResponse.class);
    }

    /**
     *This API is used to get the information of a disclosure policy.
     * @param req QueryPolicyRequest
     * @return QueryPolicyResponse
     * @throws TencentCloudSDKException
     */
    public QueryPolicyResponse QueryPolicy(QueryPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryPolicy", QueryPolicyResponse.class);
    }

    /**
     *This API is used to certify an issuing authority.
     * @param req RecognizeAuthorityIssuerRequest
     * @return RecognizeAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeAuthorityIssuerResponse RecognizeAuthorityIssuer(RecognizeAuthorityIssuerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeAuthorityIssuer", RecognizeAuthorityIssuerResponse.class);
    }

    /**
     *This API is used to register a disclosure policy.
     * @param req RegisterClaimPolicyRequest
     * @return RegisterClaimPolicyResponse
     * @throws TencentCloudSDKException
     */
    public RegisterClaimPolicyResponse RegisterClaimPolicy(RegisterClaimPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterClaimPolicy", RegisterClaimPolicyResponse.class);
    }

    /**
     *This API is used to create a claim protocol type (CPT).
     * @param req RegisterCptRequest
     * @return RegisterCptResponse
     * @throws TencentCloudSDKException
     */
    public RegisterCptResponse RegisterCpt(RegisterCptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterCpt", RegisterCptResponse.class);
    }

    /**
     *This API is used to register an issuing authority.
     * @param req RegisterIssuerRequest
     * @return RegisterIssuerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterIssuerResponse RegisterIssuer(RegisterIssuerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterIssuer", RegisterIssuerResponse.class);
    }

    /**
     *This API is used to delete a contract.
     * @param req RemoveHashRequest
     * @return RemoveHashResponse
     * @throws TencentCloudSDKException
     */
    public RemoveHashResponse RemoveHash(RemoveHashRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveHash", RemoveHashResponse.class);
    }

    /**
     *This API is used to change the on-chain status of a credential.
     * @param req SetCredentialStatusRequest
     * @return SetCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetCredentialStatusResponse SetCredentialStatus(SetCredentialStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCredentialStatus", SetCredentialStatusResponse.class);
    }

    /**
     *This API is used to verify a credential.
     * @param req VerifyCredentialRequest
     * @return VerifyCredentialResponse
     * @throws TencentCloudSDKException
     */
    public VerifyCredentialResponse VerifyCredential(VerifyCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyCredential", VerifyCredentialResponse.class);
    }

}
