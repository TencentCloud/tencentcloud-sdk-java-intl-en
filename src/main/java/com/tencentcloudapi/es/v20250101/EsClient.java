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
package com.tencentcloudapi.es.v20250101;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.es.v20250101.models.*;

public class EsClient extends AbstractClient{
    private static String endpoint = "es.intl.tencentcloudapi.com";
    private static String service = "es";
    private static String version = "2025-01-01";

    public EsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EsClient(Credential credential, String region, ClientProfile profile) {
        super(EsClient.endpoint, EsClient.version, credential, region, profile);
    }

    /**
     *Text segmentation is a technology that splits long text into short fragments for adapting to model input, improving processing efficiency, or information retrieval. It balances fragment length and semantic consistency, suitable for NLP and data analysis scenarios.
This API is used to slice text based on delimiter rules. It has a single-account call limit. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req ChunkDocumentRequest
     * @return ChunkDocumentResponse
     * @throws TencentCloudSDKException
     */
    public ChunkDocumentResponse ChunkDocument(ChunkDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChunkDocument", ChunkDocumentResponse.class);
    }

    /**
     *Text segmentation is a technology that splits long text into short clips for adapting to model input, improving processing efficiency, or information retrieval. It balances clip length and semantic consistency, suitable for NLP and data analysis scenarios.
This API is an async API with a model dimensional call limit. Each model has a qps limit of 5. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req ChunkDocumentAsyncRequest
     * @return ChunkDocumentAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ChunkDocumentAsyncResponse ChunkDocumentAsync(ChunkDocumentAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChunkDocumentAsync", ChunkDocumentAsyncResponse.class);
    }

    /**
     *Retrieve document slices
     * @param req GetDocumentChunkResultRequest
     * @return GetDocumentChunkResultResponse
     * @throws TencentCloudSDKException
     */
    public GetDocumentChunkResultResponse GetDocumentChunkResult(GetDocumentChunkResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDocumentChunkResult", GetDocumentChunkResultResponse.class);
    }

    /**
     *This API is used to retrieve the asynchronous processing result of document parsing.
     * @param req GetDocumentParseResultRequest
     * @return GetDocumentParseResultResponse
     * @throws TencentCloudSDKException
     */
    public GetDocumentParseResultResponse GetDocumentParseResult(GetDocumentParseResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDocumentParseResult", GetDocumentParseResultResponse.class);
    }

    /**
     *Embedding is a technology that maps high-dimensional data to a low-dimensional space, usually used for converting unstructured data such as text, images, or audio into vector representation, making it easier to input into machine models for processing, and the distance between vectors can reflect the similarity between objects. 
This API has a model dimensional call limit. Each model has a qps limit of 10. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req GetMultiModalEmbeddingRequest
     * @return GetMultiModalEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public GetMultiModalEmbeddingResponse GetMultiModalEmbedding(GetMultiModalEmbeddingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMultiModalEmbedding", GetMultiModalEmbeddingResponse.class);
    }

    /**
     *Embedding is a technology that maps high-dimensional data to a low-dimensional space, usually used for converting unstructured data such as text, images, or audio into vector representation, making it easier to input into machine models for processing, and the distance between vectors can reflect the similarity between objects.
This API has a model dimensional call limit. Each model has a qps limit of 20. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req GetTextEmbeddingRequest
     * @return GetTextEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public GetTextEmbeddingResponse GetTextEmbedding(GetTextEmbeddingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTextEmbedding", GetTextEmbeddingResponse.class);
    }

    /**
     *This service can accurately convert various types of documents into a standard format to meet the requirements for building an enterprise knowledge base, migrating technical documentation, and structured storage for content platforms.
This API has a model dimensional call limit. Each model has a qps limit of 5. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req ParseDocumentRequest
     * @return ParseDocumentResponse
     * @throws TencentCloudSDKException
     */
    public ParseDocumentResponse ParseDocument(ParseDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseDocument", ParseDocumentResponse.class);
    }

    /**
     *This service accurately converts various format documents into standard format, meeting requirements for Enterprise Knowledge Base construction, technical documentation migration, and structured storage for content platforms.
This API is an async API with a model dimensional call limit. Each model has a qps limit of 5. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req ParseDocumentAsyncRequest
     * @return ParseDocumentAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ParseDocumentAsyncResponse ParseDocumentAsync(ParseDocumentAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseDocumentAsync", ParseDocumentAsyncResponse.class);
    }

    /**
     *Rearrangement refers to the process in RAG where, by assessing the relevance between documents and queries, the most relevant documents are placed at the front. This ensures that the language model prioritizes high-ranking context when generating responses, improving the accuracy and reliability of generated results. It can also be used for filtering to reduce large model costs.
This API has a single-account call limit. If you need to increase the concurrent limit, please contact us (https://www.tencentcloud.com/act/event/Online_service?from_cn_redirect=1).
     * @param req RunRerankRequest
     * @return RunRerankResponse
     * @throws TencentCloudSDKException
     */
    public RunRerankResponse RunRerank(RunRerankRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunRerank", RunRerankResponse.class);
    }

}
