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
    private static String endpoint = "tdid.tencentcloudapi.com";
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
        JsonResponseModel<AddLabelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddLabelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddLabel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to revoke the certification of an issuing authority.
     * @param req CancelAuthorityIssuerRequest
     * @return CancelAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public CancelAuthorityIssuerResponse CancelAuthorityIssuer(CancelAuthorityIssuerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelAuthorityIssuerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelAuthorityIssuerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelAuthorityIssuer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get blockchain information.
     * @param req CheckChainRequest
     * @return CheckChainResponse
     * @throws TencentCloudSDKException
     */
    public CheckChainResponse CheckChain(CheckChainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckChainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckChainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckChain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a deployment task.
     * @param req CheckDidDeployRequest
     * @return CheckDidDeployResponse
     * @throws TencentCloudSDKException
     */
    public CheckDidDeployResponse CheckDidDeploy(CheckDidDeployRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDidDeployResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDidDeployResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDidDeploy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a credential.
     * @param req CreateCredentialRequest
     * @return CreateCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateCredentialResponse CreateCredential(CreateCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a DID service.
     * @param req CreateDidServiceRequest
     * @return CreateDidServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDidServiceResponse CreateDidService(CreateDidServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDidServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDidServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDidService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a label.
     * @param req CreateLabelRequest
     * @return CreateLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateLabelResponse CreateLabel(CreateLabelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLabelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLabelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLabel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a selective disclosure credential.
     * @param req CreateSelectiveCredentialRequest
     * @return CreateSelectiveCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateSelectiveCredentialResponse CreateSelectiveCredential(CreateSelectiveCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSelectiveCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSelectiveCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSelectiveCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an organization DID.
     * @param req CreateTDidRequest
     * @return CreateTDidResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidResponse CreateTDid(CreateTDidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDid");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to generate a TDID by private key.
     * @param req CreateTDidByPrivateKeyRequest
     * @return CreateTDidByPrivateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPrivateKeyResponse CreateTDidByPrivateKey(CreateTDidByPrivateKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidByPrivateKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidByPrivateKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDidByPrivateKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API is used to generate a TDID by public key.
     * @param req CreateTDidByPublicKeyRequest
     * @return CreateTDidByPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPublicKeyResponse CreateTDidByPublicKey(CreateTDidByPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidByPublicKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidByPublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDidByPublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deploy a TDID contract by name.
     * @param req DeployByNameRequest
     * @return DeployByNameResponse
     * @throws TencentCloudSDKException
     */
    public DeployByNameResponse DeployByName(DeployByNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployByNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeployByNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployByName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to download a claim protocol type (CPT).
     * @param req DownCptRequest
     * @return DownCptResponse
     * @throws TencentCloudSDKException
     */
    public DownCptResponse DownCpt(DownCptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownCptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownCptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownCpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a contract.
     * @param req EnableHashRequest
     * @return EnableHashResponse
     * @throws TencentCloudSDKException
     */
    public EnableHashResponse EnableHash(EnableHashRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableHashResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableHashResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableHash");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口已废弃

This API is used to get the DID details of the current organization.
     * @param req GetAgencyTDidRequest
     * @return GetAgencyTDidResponse
     * @throws TencentCloudSDKException
     */
    public GetAgencyTDidResponse GetAgencyTDid(GetAgencyTDidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAgencyTDidResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAgencyTDidResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAgencyTDid");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query authorities.
     * @param req GetAuthoritiesListRequest
     * @return GetAuthoritiesListResponse
     * @throws TencentCloudSDKException
     */
    public GetAuthoritiesListResponse GetAuthoritiesList(GetAuthoritiesListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAuthoritiesListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAuthoritiesListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAuthoritiesList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of an issuing authority.
     * @param req GetAuthorityIssuerRequest
     * @return GetAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public GetAuthorityIssuerResponse GetAuthorityIssuer(GetAuthorityIssuerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAuthorityIssuerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAuthorityIssuerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAuthorityIssuer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the BCOS networks of a consortium.
     * @param req GetConsortiumClusterListRequest
     * @return GetConsortiumClusterListResponse
     * @throws TencentCloudSDKException
     */
    public GetConsortiumClusterListResponse GetConsortiumClusterList(GetConsortiumClusterListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetConsortiumClusterListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetConsortiumClusterListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetConsortiumClusterList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query consortiums.
     * @param req GetConsortiumListRequest
     * @return GetConsortiumListResponse
     * @throws TencentCloudSDKException
     */
    public GetConsortiumListResponse GetConsortiumList(GetConsortiumListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetConsortiumListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetConsortiumListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetConsortiumList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a claim protocol type (CPT).
     * @param req GetCptInfoRequest
     * @return GetCptInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCptInfoResponse GetCptInfo(GetCptInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCptInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCptInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCptInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query claim protocol types (CPT).
     * @param req GetCptListRequest
     * @return GetCptListResponse
     * @throws TencentCloudSDKException
     */
    public GetCptListResponse GetCptList(GetCptListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCptListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCptListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCptList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the rankings of claim protocol types (CPT).
     * @param req GetCredentialCptRankRequest
     * @return GetCredentialCptRankResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialCptRankResponse GetCredentialCptRank(GetCredentialCptRankRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCredentialCptRankResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCredentialCptRankResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCredentialCptRank");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the rankings of issuers.
     * @param req GetCredentialIssueRankRequest
     * @return GetCredentialIssueRankResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialIssueRankResponse GetCredentialIssueRank(GetCredentialIssueRankRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCredentialIssueRankResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCredentialIssueRankResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCredentialIssueRank");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query credential issuing trends.
     * @param req GetCredentialIssueTrendRequest
     * @return GetCredentialIssueTrendResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialIssueTrendResponse GetCredentialIssueTrend(GetCredentialIssueTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCredentialIssueTrendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCredentialIssueTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCredentialIssueTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the on-chain status of a credential.
     * @param req GetCredentialStatusRequest
     * @return GetCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialStatusResponse GetCredentialStatus(GetCredentialStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCredentialStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCredentialStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCredentialStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the overall statistics of a network.

     * @param req GetDataPanelRequest
     * @return GetDataPanelResponse
     * @throws TencentCloudSDKException
     */
    public GetDataPanelResponse GetDataPanel(GetDataPanelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDataPanelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDataPanelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDataPanel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the deployment information of a contract.

     * @param req GetDeployInfoRequest
     * @return GetDeployInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetDeployInfoResponse GetDeployInfo(GetDeployInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeployInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeployInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDeployInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query deployed contracts.
     * @param req GetDeployListRequest
     * @return GetDeployListResponse
     * @throws TencentCloudSDKException
     */
    public GetDeployListResponse GetDeployList(GetDeployListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeployListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeployListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDeployList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a DID blockchain network.
     * @param req GetDidClusterDetailRequest
     * @return GetDidClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetDidClusterDetailResponse GetDidClusterDetail(GetDidClusterDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidClusterDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidClusterDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidClusterDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query your DID networks.
     * @param req GetDidClusterListRequest
     * @return GetDidClusterListResponse
     * @throws TencentCloudSDKException
     */
    public GetDidClusterListResponse GetDidClusterList(GetDidClusterListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidClusterListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidClusterListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidClusterList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a DID.
     * @param req GetDidDetailRequest
     * @return GetDidDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetDidDetailResponse GetDidDetail(GetDidDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the document of a DID.

     * @param req GetDidDocumentRequest
     * @return GetDidDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GetDidDocumentResponse GetDidDocument(GetDidDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query DIDs.
     * @param req GetDidListRequest
     * @return GetDidListResponse
     * @throws TencentCloudSDKException
     */
    public GetDidListResponse GetDidList(GetDidListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query DID registration trends.
     * @param req GetDidRegisterTrendRequest
     * @return GetDidRegisterTrendResponse
     * @throws TencentCloudSDKException
     */
    public GetDidRegisterTrendResponse GetDidRegisterTrend(GetDidRegisterTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidRegisterTrendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidRegisterTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidRegisterTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a DID service.
     * @param req GetDidServiceDetailRequest
     * @return GetDidServiceDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetDidServiceDetailResponse GetDidServiceDetail(GetDidServiceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidServiceDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidServiceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidServiceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query DID services.
     * @param req GetDidServiceListRequest
     * @return GetDidServiceListResponse
     * @throws TencentCloudSDKException
     */
    public GetDidServiceListResponse GetDidServiceList(GetDidServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidServiceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query main groups.
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query labels.
     * @param req GetLabelListRequest
     * @return GetLabelListResponse
     * @throws TencentCloudSDKException
     */
    public GetLabelListResponse GetLabelList(GetLabelListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLabelListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetLabelListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLabelList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query disclosure policies.
     * @param req GetPolicyListRequest
     * @return GetPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public GetPolicyListResponse GetPolicyList(GetPolicyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPolicyListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPolicyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPolicyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the public key of a DID.
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPublicKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a disclosure policy.
     * @param req QueryPolicyRequest
     * @return QueryPolicyResponse
     * @throws TencentCloudSDKException
     */
    public QueryPolicyResponse QueryPolicy(QueryPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to certify an issuing authority.
     * @param req RecognizeAuthorityIssuerRequest
     * @return RecognizeAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeAuthorityIssuerResponse RecognizeAuthorityIssuer(RecognizeAuthorityIssuerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeAuthorityIssuerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeAuthorityIssuerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeAuthorityIssuer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to register a disclosure policy.
     * @param req RegisterClaimPolicyRequest
     * @return RegisterClaimPolicyResponse
     * @throws TencentCloudSDKException
     */
    public RegisterClaimPolicyResponse RegisterClaimPolicy(RegisterClaimPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterClaimPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterClaimPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterClaimPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a claim protocol type (CPT).
     * @param req RegisterCptRequest
     * @return RegisterCptResponse
     * @throws TencentCloudSDKException
     */
    public RegisterCptResponse RegisterCpt(RegisterCptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterCptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterCptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterCpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to register an issuing authority.
     * @param req RegisterIssuerRequest
     * @return RegisterIssuerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterIssuerResponse RegisterIssuer(RegisterIssuerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterIssuerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterIssuerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterIssuer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a contract.
     * @param req RemoveHashRequest
     * @return RemoveHashResponse
     * @throws TencentCloudSDKException
     */
    public RemoveHashResponse RemoveHash(RemoveHashRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveHashResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveHashResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveHash");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the on-chain status of a credential.
     * @param req SetCredentialStatusRequest
     * @return SetCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetCredentialStatusResponse SetCredentialStatus(SetCredentialStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCredentialStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetCredentialStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetCredentialStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify a credential.
     * @param req VerifyCredentialRequest
     * @return VerifyCredentialResponse
     * @throws TencentCloudSDKException
     */
    public VerifyCredentialResponse VerifyCredential(VerifyCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
