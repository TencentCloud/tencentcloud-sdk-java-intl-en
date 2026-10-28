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

public class SearchAdvancedConfig extends AbstractModel {

    /**
    * <p>Final ReRank Configuration</p>
    */
    @SerializedName("FinalRerankConfig")
    @Expose
    private FinalRerankConfig FinalRerankConfig;

    /**
    * <p>Search configuration of each knowledge base</p>
    */
    @SerializedName("KbRetrievalList")
    @Expose
    private KBRetrievalConfig [] KbRetrievalList;

    /**
    * <p>Retrieve knowledge type: 1=document and QA, 2=rejected question<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_DOC_QA</td><td>1</td><td>Document and QA</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_REJECTED_QUESTION</td><td>2</td><td>Rejected question</td></tr></tbody></table></p>
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
    * <p>Number of final returned results</p>
    */
    @SerializedName("RecallCount")
    @Expose
    private Long RecallCount;

    /**
     * Get <p>Final ReRank Configuration</p> 
     * @return FinalRerankConfig <p>Final ReRank Configuration</p>
     */
    public FinalRerankConfig getFinalRerankConfig() {
        return this.FinalRerankConfig;
    }

    /**
     * Set <p>Final ReRank Configuration</p>
     * @param FinalRerankConfig <p>Final ReRank Configuration</p>
     */
    public void setFinalRerankConfig(FinalRerankConfig FinalRerankConfig) {
        this.FinalRerankConfig = FinalRerankConfig;
    }

    /**
     * Get <p>Search configuration of each knowledge base</p> 
     * @return KbRetrievalList <p>Search configuration of each knowledge base</p>
     */
    public KBRetrievalConfig [] getKbRetrievalList() {
        return this.KbRetrievalList;
    }

    /**
     * Set <p>Search configuration of each knowledge base</p>
     * @param KbRetrievalList <p>Search configuration of each knowledge base</p>
     */
    public void setKbRetrievalList(KBRetrievalConfig [] KbRetrievalList) {
        this.KbRetrievalList = KbRetrievalList;
    }

    /**
     * Get <p>Retrieve knowledge type: 1=document and QA, 2=rejected question<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_DOC_QA</td><td>1</td><td>Document and QA</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_REJECTED_QUESTION</td><td>2</td><td>Rejected question</td></tr></tbody></table></p> 
     * @return KnowledgeType <p>Retrieve knowledge type: 1=document and QA, 2=rejected question<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_DOC_QA</td><td>1</td><td>Document and QA</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_REJECTED_QUESTION</td><td>2</td><td>Rejected question</td></tr></tbody></table></p>
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set <p>Retrieve knowledge type: 1=document and QA, 2=rejected question<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_DOC_QA</td><td>1</td><td>Document and QA</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_REJECTED_QUESTION</td><td>2</td><td>Rejected question</td></tr></tbody></table></p>
     * @param KnowledgeType <p>Retrieve knowledge type: 1=document and QA, 2=rejected question<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_DOC_QA</td><td>1</td><td>Document and QA</td></tr><tr><td>SEARCH_KNOWLEDGE_TYPE_REJECTED_QUESTION</td><td>2</td><td>Rejected question</td></tr></tbody></table></p>
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    /**
     * Get <p>Number of final returned results</p> 
     * @return RecallCount <p>Number of final returned results</p>
     */
    public Long getRecallCount() {
        return this.RecallCount;
    }

    /**
     * Set <p>Number of final returned results</p>
     * @param RecallCount <p>Number of final returned results</p>
     */
    public void setRecallCount(Long RecallCount) {
        this.RecallCount = RecallCount;
    }

    public SearchAdvancedConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAdvancedConfig(SearchAdvancedConfig source) {
        if (source.FinalRerankConfig != null) {
            this.FinalRerankConfig = new FinalRerankConfig(source.FinalRerankConfig);
        }
        if (source.KbRetrievalList != null) {
            this.KbRetrievalList = new KBRetrievalConfig[source.KbRetrievalList.length];
            for (int i = 0; i < source.KbRetrievalList.length; i++) {
                this.KbRetrievalList[i] = new KBRetrievalConfig(source.KbRetrievalList[i]);
            }
        }
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
        if (source.RecallCount != null) {
            this.RecallCount = new Long(source.RecallCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FinalRerankConfig.", this.FinalRerankConfig);
        this.setParamArrayObj(map, prefix + "KbRetrievalList.", this.KbRetrievalList);
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);
        this.setParamSimple(map, prefix + "RecallCount", this.RecallCount);

    }
}

