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
package com.tencentcloudapi.lke.v20231130;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lke.v20231130.models.*;

public class LkeClient extends AbstractClient{
    private static String endpoint = "lke.intl.tencentcloudapi.com";
    private static String service = "lke";
    private static String version = "2023-11-30";

    public LkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LkeClient(Credential credential, String region, ClientProfile profile) {
        super(LkeClient.endpoint, LkeClient.version, credential, region, profile);
    }

    /**
     *This API is used to check if the label name under an attribute exist.
     * @param req CheckAttributeLabelExistRequest
     * @return CheckAttributeLabelExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckAttributeLabelExistResponse CheckAttributeLabelExist(CheckAttributeLabelExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAttributeLabelExist", CheckAttributeLabelExistResponse.class);
    }

    /**
     *This API is used to check attribute label references.
     * @param req CheckAttributeLabelReferRequest
     * @return CheckAttributeLabelReferResponse
     * @throws TencentCloudSDKException
     */
    public CheckAttributeLabelReferResponse CheckAttributeLabelRefer(CheckAttributeLabelReferRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAttributeLabelRefer", CheckAttributeLabelReferResponse.class);
    }

    /**
     *This API is used to create knowledge engine applications.
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApp", CreateAppResponse.class);
    }

    /**
     *This API is used to create attributes.
     * @param req CreateAttributeLabelRequest
     * @return CreateAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAttributeLabelResponse CreateAttributeLabel(CreateAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAttributeLabel", CreateAttributeLabelResponse.class);
    }

    /**
     *This API is used to create enterprises.
     * @param req CreateCorpRequest
     * @return CreateCorpResponse
     * @throws TencentCloudSDKException
     */
    public CreateCorpResponse CreateCorp(CreateCorpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCorp", CreateCorpResponse.class);
    }

    /**
     *This API is used to create doc categories.
     * @param req CreateDocCateRequest
     * @return CreateDocCateResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocCateResponse CreateDocCate(CreateDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDocCate", CreateDocCateResponse.class);
    }

    /**
     *This API is used to enter Q&As.
     * @param req CreateQARequest
     * @return CreateQAResponse
     * @throws TencentCloudSDKException
     */
    public CreateQAResponse CreateQA(CreateQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQA", CreateQAResponse.class);
    }

    /**
     *This API is used to create Q&A categories.
     * @param req CreateQACateRequest
     * @return CreateQACateResponse
     * @throws TencentCloudSDKException
     */
    public CreateQACateResponse CreateQACate(CreateQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQACate", CreateQACateResponse.class);
    }

    /**
     *This API is used to initiate requests for this asynchronous API, for initiating document parsing tasks.
Document parsing supports converting images or PDF files into Markdown format files, and can parse content elements including tables, formulas, images, headings, paragraphs, headers, and footers, and intelligently convert the content into reading order.
During the trial period, the QPS limit for a single account is only 1. If you need to access officially, please contact our R&D team.
     * @param req CreateReconstructDocumentFlowRequest
     * @return CreateReconstructDocumentFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateReconstructDocumentFlowResponse CreateReconstructDocumentFlow(CreateReconstructDocumentFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReconstructDocumentFlow", CreateReconstructDocumentFlowResponse.class);
    }

    /**
     *This API is used to create rejected questions.
     * @param req CreateRejectedQuestionRequest
     * @return CreateRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public CreateRejectedQuestionResponse CreateRejectedQuestion(CreateRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRejectedQuestion", CreateRejectedQuestionResponse.class);
    }

    /**
     *This API is used to create a release.
     * @param req CreateReleaseRequest
     * @return CreateReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseResponse CreateRelease(CreateReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRelease", CreateReleaseResponse.class);
    }

    /**
     *This API is used to delete applications.
     * @param req DeleteAppRequest
     * @return DeleteAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppResponse DeleteApp(DeleteAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApp", DeleteAppResponse.class);
    }

    /**
     *This API is used to delete attribute labels.
     * @param req DeleteAttributeLabelRequest
     * @return DeleteAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttributeLabelResponse DeleteAttributeLabel(DeleteAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAttributeLabel", DeleteAttributeLabelResponse.class);
    }

    /**
     *This API is used to delete documents.
     * @param req DeleteDocRequest
     * @return DeleteDocResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocResponse DeleteDoc(DeleteDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDoc", DeleteDocResponse.class);
    }

    /**
     *This API is used to delete Doc categories.
     * @param req DeleteDocCateRequest
     * @return DeleteDocCateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocCateResponse DeleteDocCate(DeleteDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDocCate", DeleteDocCateResponse.class);
    }

    /**
     *This API is used to delete Q&As.
     * @param req DeleteQARequest
     * @return DeleteQAResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQAResponse DeleteQA(DeleteQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQA", DeleteQAResponse.class);
    }

    /**
     *This API is used to delete categories.
     * @param req DeleteQACateRequest
     * @return DeleteQACateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQACateResponse DeleteQACate(DeleteQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQACate", DeleteQACateResponse.class);
    }

    /**
     *This API is used to delete rejected questions.
     * @param req DeleteRejectedQuestionRequest
     * @return DeleteRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRejectedQuestionResponse DeleteRejectedQuestion(DeleteRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRejectedQuestion", DeleteRejectedQuestionResponse.class);
    }

    /**
     *This API is used to obtain application details under the corporate.
     * @param req DescribeAppRequest
     * @return DescribeAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppResponse DescribeApp(DescribeAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApp", DescribeAppResponse.class);
    }

    /**
     *This API is used to query attribute label details.
     * @param req DescribeAttributeLabelRequest
     * @return DescribeAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttributeLabelResponse DescribeAttributeLabel(DescribeAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttributeLabel", DescribeAttributeLabelResponse.class);
    }

    /**
     *This API is used to show line chart of API calls.
     * @param req DescribeCallStatsGraphRequest
     * @return DescribeCallStatsGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallStatsGraphResponse DescribeCallStatsGraph(DescribeCallStatsGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallStatsGraph", DescribeCallStatsGraphResponse.class);
    }

    /**
     *This API is used to response to concurrent calls.
     * @param req DescribeConcurrencyUsageRequest
     * @return DescribeConcurrencyUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrencyUsageResponse DescribeConcurrencyUsage(DescribeConcurrencyUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrencyUsage", DescribeConcurrencyUsageResponse.class);
    }

    /**
     *This API is used to show line chart of concurrent calls.
     * @param req DescribeConcurrencyUsageGraphRequest
     * @return DescribeConcurrencyUsageGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrencyUsageGraphResponse DescribeConcurrencyUsageGraph(DescribeConcurrencyUsageGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrencyUsageGraph", DescribeConcurrencyUsageGraphResponse.class);
    }

    /**
     *This API is used to query corporate details.
     * @param req DescribeCorpRequest
     * @return DescribeCorpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCorpResponse DescribeCorp(DescribeCorpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCorp", DescribeCorpResponse.class);
    }

    /**
     *This API is used to query document details.
     * @param req DescribeDocRequest
     * @return DescribeDocResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocResponse DescribeDoc(DescribeDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDoc", DescribeDocResponse.class);
    }

    /**
     *This API is used to query the knowledge library usage.
     * @param req DescribeKnowledgeUsageRequest
     * @return DescribeKnowledgeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeUsageResponse DescribeKnowledgeUsage(DescribeKnowledgeUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeUsage", DescribeKnowledgeUsageResponse.class);
    }

    /**
     *This API is used to query pie chart of the enterprise knowledge base capacity .
     * @param req DescribeKnowledgeUsagePieGraphRequest
     * @return DescribeKnowledgeUsagePieGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKnowledgeUsagePieGraphResponse DescribeKnowledgeUsagePieGraph(DescribeKnowledgeUsagePieGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKnowledgeUsagePieGraph", DescribeKnowledgeUsagePieGraphResponse.class);
    }

    /**
     *This API is used to query Q&A details.
     * @param req DescribeQARequest
     * @return DescribeQAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQAResponse DescribeQA(DescribeQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQA", DescribeQAResponse.class);
    }

    /**
     *This API is used to get the reference source details list.
     * @param req DescribeReferRequest
     * @return DescribeReferResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReferResponse DescribeRefer(DescribeReferRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRefer", DescribeReferResponse.class);
    }

    /**
     *This API is used to query release details.
     * @param req DescribeReleaseRequest
     * @return DescribeReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseResponse DescribeRelease(DescribeReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelease", DescribeReleaseResponse.class);
    }

    /**
     *This API is used to pull the release button status and last release time.
     * @param req DescribeReleaseInfoRequest
     * @return DescribeReleaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseInfoResponse DescribeReleaseInfo(DescribeReleaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseInfo", DescribeReleaseInfoResponse.class);
    }

    /**
     *This API is used to get application business ID through appKey.
     * @param req DescribeRobotBizIDByAppKeyRequest
     * @return DescribeRobotBizIDByAppKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRobotBizIDByAppKeyResponse DescribeRobotBizIDByAppKey(DescribeRobotBizIDByAppKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRobotBizIDByAppKey", DescribeRobotBizIDByAppKeyResponse.class);
    }

    /**
     *This API is used to query line chart of search service calls.
     * @param req DescribeSearchStatsGraphRequest
     * @return DescribeSearchStatsGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchStatsGraphResponse DescribeSearchStatsGraph(DescribeSearchStatsGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchStatsGraph", DescribeSearchStatsGraphResponse.class);
    }

    /**
     *This API is used to get fragment details.
     * @param req DescribeSegmentsRequest
     * @return DescribeSegmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSegmentsResponse DescribeSegments(DescribeSegmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSegments", DescribeSegmentsResponse.class);
    }

    /**
     *This API is used to get the temporary key for file upload.
     * @param req DescribeStorageCredentialRequest
     * @return DescribeStorageCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageCredentialResponse DescribeStorageCredential(DescribeStorageCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageCredential", DescribeStorageCredentialResponse.class);
    }

    /**
     *This API is used to query API call token details.
     * @param req DescribeTokenUsageRequest
     * @return DescribeTokenUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenUsageResponse DescribeTokenUsage(DescribeTokenUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenUsage", DescribeTokenUsageResponse.class);
    }

    /**
     *This API is used to show API call token line chart.
     * @param req DescribeTokenUsageGraphRequest
     * @return DescribeTokenUsageGraphResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenUsageGraphResponse DescribeTokenUsageGraph(DescribeTokenUsageGraphRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenUsageGraph", DescribeTokenUsageGraphResponse.class);
    }

    /**
     *This API is used to get the context of dissatisfied responses.
     * @param req DescribeUnsatisfiedReplyContextRequest
     * @return DescribeUnsatisfiedReplyContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnsatisfiedReplyContextResponse DescribeUnsatisfiedReplyContext(DescribeUnsatisfiedReplyContextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnsatisfiedReplyContext", DescribeUnsatisfiedReplyContextResponse.class);
    }

    /**
     *This API is used to export attribute labels.
     * @param req ExportAttributeLabelRequest
     * @return ExportAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttributeLabelResponse ExportAttributeLabel(ExportAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAttributeLabel", ExportAttributeLabelResponse.class);
    }

    /**
     *This API is used to export Q&A list.
     * @param req ExportQAListRequest
     * @return ExportQAListResponse
     * @throws TencentCloudSDKException
     */
    public ExportQAListResponse ExportQAList(ExportQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportQAList", ExportQAListResponse.class);
    }

    /**
     *This API is used to export dissatisfied responses.
     * @param req ExportUnsatisfiedReplyRequest
     * @return ExportUnsatisfiedReplyResponse
     * @throws TencentCloudSDKException
     */
    public ExportUnsatisfiedReplyResponse ExportUnsatisfiedReply(ExportUnsatisfiedReplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportUnsatisfiedReply", ExportUnsatisfiedReplyResponse.class);
    }

    /**
     *This API is used to generate Q%A from document.
     * @param req GenerateQARequest
     * @return GenerateQAResponse
     * @throws TencentCloudSDKException
     */
    public GenerateQAResponse GenerateQA(GenerateQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateQA", GenerateQAResponse.class);
    }

    /**
     *This API is used to get response type data statistics.
     * @param req GetAnswerTypeDataCountRequest
     * @return GetAnswerTypeDataCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAnswerTypeDataCountResponse GetAnswerTypeDataCount(GetAnswerTypeDataCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAnswerTypeDataCount", GetAnswerTypeDataCountResponse.class);
    }

    /**
     *This API is used to get a model list.
     * @param req GetAppKnowledgeCountRequest
     * @return GetAppKnowledgeCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAppKnowledgeCountResponse GetAppKnowledgeCount(GetAppKnowledgeCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAppKnowledgeCount", GetAppKnowledgeCountResponse.class);
    }

    /**
     *This API is used to get application secret keys.
     * @param req GetAppSecretRequest
     * @return GetAppSecretResponse
     * @throws TencentCloudSDKException
     */
    public GetAppSecretResponse GetAppSecret(GetAppSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAppSecret", GetAppSecretResponse.class);
    }

    /**
     *This API is used to get document preview information.
     * @param req GetDocPreviewRequest
     * @return GetDocPreviewResponse
     * @throws TencentCloudSDKException
     */
    public GetDocPreviewResponse GetDocPreview(GetDocPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDocPreview", GetDocPreviewResponse.class);
    }

    /**
     *This API is used to get likes and dislikes data statistics.
     * @param req GetLikeDataCountRequest
     * @return GetLikeDataCountResponse
     * @throws TencentCloudSDKException
     */
    public GetLikeDataCountResponse GetLikeDataCount(GetLikeDataCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLikeDataCount", GetLikeDataCountResponse.class);
    }

    /**
     *This API is used to obtain chat history based on the session ID (only historical session data within the past 180 days will be retained).
     * @param req GetMsgRecordRequest
     * @return GetMsgRecordResponse
     * @throws TencentCloudSDKException
     */
    public GetMsgRecordResponse GetMsgRecord(GetMsgRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMsgRecord", GetMsgRecordResponse.class);
    }

    /**
     *This is an asynchronous APIs, used to get document parsing task results.
     * @param req GetReconstructDocumentResultRequest
     * @return GetReconstructDocumentResultResponse
     * @throws TencentCloudSDKException
     */
    public GetReconstructDocumentResultResponse GetReconstructDocumentResult(GetReconstructDocumentResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetReconstructDocumentResult", GetReconstructDocumentResultResponse.class);
    }

    /**
     *This API is used to get the task status.
     * @param req GetTaskStatusRequest
     * @return GetTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskStatusResponse GetTaskStatus(GetTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskStatus", GetTaskStatusResponse.class);
    }

    /**
     *This API is used to get ws token.
     * @param req GetWsTokenRequest
     * @return GetWsTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetWsTokenResponse GetWsToken(GetWsTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWsToken", GetWsTokenResponse.class);
    }

    /**
     *DocGroup.
     * @param req GroupDocRequest
     * @return GroupDocResponse
     * @throws TencentCloudSDKException
     */
    public GroupDocResponse GroupDoc(GroupDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupDoc", GroupDocResponse.class);
    }

    /**
     *Q&A Group.
     * @param req GroupQARequest
     * @return GroupQAResponse
     * @throws TencentCloudSDKException
     */
    public GroupQAResponse GroupQA(GroupQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupQA", GroupQAResponse.class);
    }

    /**
     *This API is used to ignore dissatisfied responses.
     * @param req IgnoreUnsatisfiedReplyRequest
     * @return IgnoreUnsatisfiedReplyResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreUnsatisfiedReplyResponse IgnoreUnsatisfiedReply(IgnoreUnsatisfiedReplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IgnoreUnsatisfiedReply", IgnoreUnsatisfiedReplyResponse.class);
    }

    /**
     *This API is used to get the application list under the corporate.
     * @param req ListAppRequest
     * @return ListAppResponse
     * @throws TencentCloudSDKException
     */
    public ListAppResponse ListApp(ListAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListApp", ListAppResponse.class);
    }

    /**
     *This API is used to get list of application types.
     * @param req ListAppCategoryRequest
     * @return ListAppCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ListAppCategoryResponse ListAppCategory(ListAppCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAppCategory", ListAppCategoryResponse.class);
    }

    /**
     *This API is used to query the knowledge base capacity details in a list.
     * @param req ListAppKnowledgeDetailRequest
     * @return ListAppKnowledgeDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListAppKnowledgeDetailResponse ListAppKnowledgeDetail(ListAppKnowledgeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAppKnowledgeDetail", ListAppKnowledgeDetailResponse.class);
    }

    /**
     *This API is used to query attribute label lists.
     * @param req ListAttributeLabelRequest
     * @return ListAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public ListAttributeLabelResponse ListAttributeLabel(ListAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAttributeLabel", ListAttributeLabelResponse.class);
    }

    /**
     *This API is used to get document list.
     * @param req ListDocRequest
     * @return ListDocResponse
     * @throws TencentCloudSDKException
     */
    public ListDocResponse ListDoc(ListDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDoc", ListDocResponse.class);
    }

    /**
     *This API is used to get document category.
     * @param req ListDocCateRequest
     * @return ListDocCateResponse
     * @throws TencentCloudSDKException
     */
    public ListDocCateResponse ListDocCate(ListDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDocCate", ListDocCateResponse.class);
    }

    /**
     *This API is used to get the model list.
     * @param req ListModelRequest
     * @return ListModelResponse
     * @throws TencentCloudSDKException
     */
    public ListModelResponse ListModel(ListModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListModel", ListModelResponse.class);
    }

    /**
     *This API is used to query Q&A lists.
     * @param req ListQARequest
     * @return ListQAResponse
     * @throws TencentCloudSDKException
     */
    public ListQAResponse ListQA(ListQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQA", ListQAResponse.class);
    }

    /**
     *This API is used to get Q&A categories.
     * @param req ListQACateRequest
     * @return ListQACateResponse
     * @throws TencentCloudSDKException
     */
    public ListQACateResponse ListQACate(ListQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQACate", ListQACateResponse.class);
    }

    /**
     *This API is used to get rejected questions.
     * @param req ListRejectedQuestionRequest
     * @return ListRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public ListRejectedQuestionResponse ListRejectedQuestion(ListRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRejectedQuestion", ListRejectedQuestionResponse.class);
    }

    /**
     *This API is used to release a preview of rejected questions.
     * @param req ListRejectedQuestionPreviewRequest
     * @return ListRejectedQuestionPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListRejectedQuestionPreviewResponse ListRejectedQuestionPreview(ListRejectedQuestionPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRejectedQuestionPreview", ListRejectedQuestionPreviewResponse.class);
    }

    /**
     *This API is used to get the release list.
     * @param req ListReleaseRequest
     * @return ListReleaseResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseResponse ListRelease(ListReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRelease", ListReleaseResponse.class);
    }

    /**
     *This API is used to preview the release configuration items.
     * @param req ListReleaseConfigPreviewRequest
     * @return ListReleaseConfigPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseConfigPreviewResponse ListReleaseConfigPreview(ListReleaseConfigPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReleaseConfigPreview", ListReleaseConfigPreviewResponse.class);
    }

    /**
     *This API is used to preview released documents.
     * @param req ListReleaseDocPreviewRequest
     * @return ListReleaseDocPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseDocPreviewResponse ListReleaseDocPreview(ListReleaseDocPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReleaseDocPreview", ListReleaseDocPreviewResponse.class);
    }

    /**
     *List of documents.
     * @param req ListReleaseQAPreviewRequest
     * @return ListReleaseQAPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ListReleaseQAPreviewResponse ListReleaseQAPreview(ListReleaseQAPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReleaseQAPreview", ListReleaseQAPreviewResponse.class);
    }

    /**
     *This API is used to get account information.
     * @param req ListSelectDocRequest
     * @return ListSelectDocResponse
     * @throws TencentCloudSDKException
     */
    public ListSelectDocResponse ListSelectDoc(ListSelectDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSelectDoc", ListSelectDocResponse.class);
    }

    /**
     *This API is used to query a list of dissatisfied responses.
     * @param req ListUnsatisfiedReplyRequest
     * @return ListUnsatisfiedReplyResponse
     * @throws TencentCloudSDKException
     */
    public ListUnsatisfiedReplyResponse ListUnsatisfiedReply(ListUnsatisfiedReplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUnsatisfiedReply", ListUnsatisfiedReplyResponse.class);
    }

    /**
     *This API is used to query single call details in a list.
     * @param req ListUsageCallDetailRequest
     * @return ListUsageCallDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListUsageCallDetailResponse ListUsageCallDetail(ListUsageCallDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUsageCallDetail", ListUsageCallDetailResponse.class);
    }

    /**
     *This API is used to modify application request structure.
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApp", ModifyAppResponse.class);
    }

    /**
     *This API is used to edit attribute labels.
     * @param req ModifyAttributeLabelRequest
     * @return ModifyAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAttributeLabelResponse ModifyAttributeLabel(ModifyAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAttributeLabel", ModifyAttributeLabelResponse.class);
    }

    /**
     *This API is used to modify documents.
     * @param req ModifyDocRequest
     * @return ModifyDocResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocResponse ModifyDoc(ModifyDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDoc", ModifyDocResponse.class);
    }

    /**
     *This API is used to modify applicable scope of the document in batches.
     * @param req ModifyDocAttrRangeRequest
     * @return ModifyDocAttrRangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocAttrRangeResponse ModifyDocAttrRange(ModifyDocAttrRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDocAttrRange", ModifyDocAttrRangeResponse.class);
    }

    /**
     *This API is used to modify Doc categories.
     * @param req ModifyDocCateRequest
     * @return ModifyDocCateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocCateResponse ModifyDocCate(ModifyDocCateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDocCate", ModifyDocCateResponse.class);
    }

    /**
     *This API is used to update Q&As.
     * @param req ModifyQARequest
     * @return ModifyQAResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAResponse ModifyQA(ModifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQA", ModifyQAResponse.class);
    }

    /**
     *This API is used to modify Q&A applicable scope in batches.
     * @param req ModifyQAAttrRangeRequest
     * @return ModifyQAAttrRangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAAttrRangeResponse ModifyQAAttrRange(ModifyQAAttrRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQAAttrRange", ModifyQAAttrRangeResponse.class);
    }

    /**
     *This API is used to modify Q&A categories.
     * @param req ModifyQACateRequest
     * @return ModifyQACateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQACateResponse ModifyQACate(ModifyQACateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQACate", ModifyQACateResponse.class);
    }

    /**
     *This API is used to modify rejected questions.
     * @param req ModifyRejectedQuestionRequest
     * @return ModifyRejectedQuestionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRejectedQuestionResponse ModifyRejectedQuestion(ModifyRejectedQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRejectedQuestion", ModifyRejectedQuestionResponse.class);
    }

    /**
     *This API is used to show messages for likes and dislikes.
     * @param req RateMsgRecordRequest
     * @return RateMsgRecordResponse
     * @throws TencentCloudSDKException
     */
    public RateMsgRecordResponse RateMsgRecord(RateMsgRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RateMsgRecord", RateMsgRecordResponse.class);
    }

    /**
     *This API is used to rename a document.
     * @param req RenameDocRequest
     * @return RenameDocResponse
     * @throws TencentCloudSDKException
     */
    public RenameDocResponse RenameDoc(RenameDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameDoc", RenameDocResponse.class);
    }

    /**
     *This API is used to retry document parsing.
     * @param req RetryDocAuditRequest
     * @return RetryDocAuditResponse
     * @throws TencentCloudSDKException
     */
    public RetryDocAuditResponse RetryDocAudit(RetryDocAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDocAudit", RetryDocAuditResponse.class);
    }

    /**
     *This API is used to retry document parsing.
     * @param req RetryDocParseRequest
     * @return RetryDocParseResponse
     * @throws TencentCloudSDKException
     */
    public RetryDocParseResponse RetryDocParse(RetryDocParseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDocParse", RetryDocParseResponse.class);
    }

    /**
     *This API is used to retry after release suspension.
     * @param req RetryReleaseRequest
     * @return RetryReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RetryReleaseResponse RetryRelease(RetryReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRelease", RetryReleaseResponse.class);
    }

    /**
     *This API is used to save a knowledge base document Q&As.
Three steps to store a file in the knowledge library of the application: 
1. Obtain a temporary key. For more information, see [API Documentation](https://cloud.tencent.com/document/product/1759/105050). Different parameter combinations of the temporary key have different permissions. For more information, see [Tencent Cloud Agent Development Platform/TCADP COS Guide](https://cloud.tencent.com/document/product/1759/116238). 
2. Call the COS storage API provided by Tencent Cloud to store the file in the COS of TCADP. For details, see [COS SDK Overview](https://cloud.tencent.com/document/product/436/6474). Note that the temporary key method is used to operate COS. 
3. Call this API to store the basic information of the file in TCADP. 
For the above steps, see [Documentation](https://cloud.tencent.com/document/product/1759/108903). At the end of the documentation, there is a [code demo](https://cloud.tencent.com/document/product/1759/108903#demo), which can be used as a reference.
     * @param req SaveDocRequest
     * @return SaveDocResponse
     * @throws TencentCloudSDKException
     */
    public SaveDocResponse SaveDoc(SaveDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveDoc", SaveDocResponse.class);
    }

    /**
     *This API is used to terminate document parsing.
     * @param req StopDocParseRequest
     * @return StopDocParseResponse
     * @throws TencentCloudSDKException
     */
    public StopDocParseResponse StopDocParse(StopDocParseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopDocParse", StopDocParseResponse.class);
    }

    /**
     *This API is used to upload and import attribute labels.
     * @param req UploadAttributeLabelRequest
     * @return UploadAttributeLabelResponse
     * @throws TencentCloudSDKException
     */
    public UploadAttributeLabelResponse UploadAttributeLabel(UploadAttributeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadAttributeLabel", UploadAttributeLabelResponse.class);
    }

    /**
     *This API is used to verify Q&A.
     * @param req VerifyQARequest
     * @return VerifyQAResponse
     * @throws TencentCloudSDKException
     */
    public VerifyQAResponse VerifyQA(VerifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyQA", VerifyQAResponse.class);
    }

}
