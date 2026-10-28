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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeResult extends AbstractModel {

    /**
    * <p>Confidence degree</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>Hit knowledge type: 1=QA, 2=document fragment, 3=database, 4=map<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>QA</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>Document fragment</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>Database</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>Map</td></tr></tbody></table></p>
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
    * <p>Recall type list</p>
    */
    @SerializedName("RecallTypeList")
    @Expose
    private Long [] RecallTypeList;

    /**
    * <p>Result payload</p>
    */
    @SerializedName("ResultPayload")
    @Expose
    private SearchResultPayload ResultPayload;

    /**
    * <p>Result type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>Standard search result</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql result</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * <p>Additional information for similar questions.</p>
    */
    @SerializedName("SimilarQuestionExtra")
    @Expose
    private SimilarQuestionExtra SimilarQuestionExtra;

    /**
    * <p>Basic information of knowledge fragment</p>
    */
    @SerializedName("SnippetProfile")
    @Expose
    private KnowledgeSnippetProfile SnippetProfile;

    /**
    * <p>Knowledge source information</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private KnowledgeSource SourceInfo;

    /**
     * Get <p>Confidence degree</p> 
     * @return Confidence <p>Confidence degree</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Confidence degree</p>
     * @param Confidence <p>Confidence degree</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Hit knowledge type: 1=QA, 2=document fragment, 3=database, 4=map<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>QA</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>Document fragment</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>Database</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>Map</td></tr></tbody></table></p> 
     * @return KnowledgeType <p>Hit knowledge type: 1=QA, 2=document fragment, 3=database, 4=map<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>QA</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>Document fragment</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>Database</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>Map</td></tr></tbody></table></p>
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set <p>Hit knowledge type: 1=QA, 2=document fragment, 3=database, 4=map<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>QA</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>Document fragment</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>Database</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>Map</td></tr></tbody></table></p>
     * @param KnowledgeType <p>Hit knowledge type: 1=QA, 2=document fragment, 3=database, 4=map<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>QA</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>Document fragment</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>Database</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>Map</td></tr></tbody></table></p>
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    /**
     * Get <p>Recall type list</p> 
     * @return RecallTypeList <p>Recall type list</p>
     */
    public Long [] getRecallTypeList() {
        return this.RecallTypeList;
    }

    /**
     * Set <p>Recall type list</p>
     * @param RecallTypeList <p>Recall type list</p>
     */
    public void setRecallTypeList(Long [] RecallTypeList) {
        this.RecallTypeList = RecallTypeList;
    }

    /**
     * Get <p>Result payload</p> 
     * @return ResultPayload <p>Result payload</p>
     */
    public SearchResultPayload getResultPayload() {
        return this.ResultPayload;
    }

    /**
     * Set <p>Result payload</p>
     * @param ResultPayload <p>Result payload</p>
     */
    public void setResultPayload(SearchResultPayload ResultPayload) {
        this.ResultPayload = ResultPayload;
    }

    /**
     * Get <p>Result type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>Standard search result</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql result</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p> 
     * @return ResultType <p>Result type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>Standard search result</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql result</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>Result type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>Standard search result</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql result</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
     * @param ResultType <p>Result type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>Standard search result</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql result</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>Additional information for similar questions.</p> 
     * @return SimilarQuestionExtra <p>Additional information for similar questions.</p>
     */
    public SimilarQuestionExtra getSimilarQuestionExtra() {
        return this.SimilarQuestionExtra;
    }

    /**
     * Set <p>Additional information for similar questions.</p>
     * @param SimilarQuestionExtra <p>Additional information for similar questions.</p>
     */
    public void setSimilarQuestionExtra(SimilarQuestionExtra SimilarQuestionExtra) {
        this.SimilarQuestionExtra = SimilarQuestionExtra;
    }

    /**
     * Get <p>Basic information of knowledge fragment</p> 
     * @return SnippetProfile <p>Basic information of knowledge fragment</p>
     */
    public KnowledgeSnippetProfile getSnippetProfile() {
        return this.SnippetProfile;
    }

    /**
     * Set <p>Basic information of knowledge fragment</p>
     * @param SnippetProfile <p>Basic information of knowledge fragment</p>
     */
    public void setSnippetProfile(KnowledgeSnippetProfile SnippetProfile) {
        this.SnippetProfile = SnippetProfile;
    }

    /**
     * Get <p>Knowledge source information</p> 
     * @return SourceInfo <p>Knowledge source information</p>
     */
    public KnowledgeSource getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>Knowledge source information</p>
     * @param SourceInfo <p>Knowledge source information</p>
     */
    public void setSourceInfo(KnowledgeSource SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public KnowledgeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeResult(KnowledgeResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
        if (source.RecallTypeList != null) {
            this.RecallTypeList = new Long[source.RecallTypeList.length];
            for (int i = 0; i < source.RecallTypeList.length; i++) {
                this.RecallTypeList[i] = new Long(source.RecallTypeList[i]);
            }
        }
        if (source.ResultPayload != null) {
            this.ResultPayload = new SearchResultPayload(source.ResultPayload);
        }
        if (source.ResultType != null) {
            this.ResultType = new Long(source.ResultType);
        }
        if (source.SimilarQuestionExtra != null) {
            this.SimilarQuestionExtra = new SimilarQuestionExtra(source.SimilarQuestionExtra);
        }
        if (source.SnippetProfile != null) {
            this.SnippetProfile = new KnowledgeSnippetProfile(source.SnippetProfile);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new KnowledgeSource(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);
        this.setParamArraySimple(map, prefix + "RecallTypeList.", this.RecallTypeList);
        this.setParamObj(map, prefix + "ResultPayload.", this.ResultPayload);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamObj(map, prefix + "SimilarQuestionExtra.", this.SimilarQuestionExtra);
        this.setParamObj(map, prefix + "SnippetProfile.", this.SnippetProfile);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

