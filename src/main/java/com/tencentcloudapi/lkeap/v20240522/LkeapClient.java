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
package com.tencentcloudapi.lkeap.v20240522;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lkeap.v20240522.models.*;

public class LkeapClient extends AbstractClient{
    private static String endpoint = "lkeap.intl.tencentcloudapi.com";
    private static String service = "lkeap";
    private static String version = "2024-05-22";

    public LkeapClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LkeapClient(Credential credential, String region, ClientProfile profile) {
        super(LkeapClient.endpoint, LkeapClient.version, credential, region, profile);
    }

    /**
     *This API is used to initiate requests for this asynchronous API, for initiating document parsing tasks.
Document parsing supports converting images or PDF files into Markdown format files, and can parse content elements including tables, formulas, images, headings, paragraphs, headers, and footers, and intelligently convert the content into reading order. Please refer to the input parameter list below for specific supported file types.
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
     *This API is used to create document segmentation tasks, support various file types, possess mllm capacity, and can analyze and deeply understand the information in charts.
     * @param req CreateSplitDocumentFlowRequest
     * @return CreateSplitDocumentFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateSplitDocumentFlowResponse CreateSplitDocumentFlow(CreateSplitDocumentFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSplitDocumentFlow", CreateSplitDocumentFlowResponse.class);
    }

    /**
     *This is an asynchronous API for querying results, which is used to obtain the result of document parsing.
     * @param req GetReconstructDocumentResultRequest
     * @return GetReconstructDocumentResultResponse
     * @throws TencentCloudSDKException
     */
    public GetReconstructDocumentResultResponse GetReconstructDocumentResult(GetReconstructDocumentResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetReconstructDocumentResult", GetReconstructDocumentResultResponse.class);
    }

    /**
     *This API is used to query the results of document splitting tasks.
     * @param req GetSplitDocumentResultRequest
     * @return GetSplitDocumentResultResponse
     * @throws TencentCloudSDKException
     */
    public GetSplitDocumentResultResponse GetSplitDocumentResult(GetSplitDocumentResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSplitDocumentResult", GetSplitDocumentResultResponse.class);
    }

    /**
     *QueryRewrite is mainly used in multi-round conversations for reference resolution and ellipsis completion. Using this API, you don't need to input prompt descriptions. A more accurate user query can be generated based on the conversation history. In terms of application scenarios, this API can be applied to various scenarios such as intelligent Q&A and conversational search.
There is a call limit for single-account for this API. If you need to increase the concurrency limit, please contact us (https://cloud.tencent.com/act/event/Online_service).
     * @param req QueryRewriteRequest
     * @return QueryRewriteResponse
     * @throws TencentCloudSDKException
     */
    public QueryRewriteResponse QueryRewrite(QueryRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryRewrite", QueryRewriteResponse.class);
    }

    /**
     *This API is used to reorder the results of multi-channel recall based on the rerank model of knowledge engine fine-tuning model technology, sort the segments according to the relevance between the query and the segment content from high to low score, and output the corresponding scoring results.
     * @param req RunRerankRequest
     * @return RunRerankResponse
     * @throws TencentCloudSDKException
     */
    public RunRerankResponse RunRerank(RunRerankRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunRerank", RunRerankResponse.class);
    }

}
