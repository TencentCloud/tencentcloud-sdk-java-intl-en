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

public class QAModifyFields extends AbstractModel {

    /**
    * <p>Answer</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>Category ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Associated document ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>Knowledge application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
    */
    @SerializedName("EffectiveDomain")
    @Expose
    private Long EffectiveDomain;

    /**
    * <p>Expiration policy (validity time and behavior after the validity period expires)</p>
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>Whether to adopt (verification passed)</p>
    */
    @SerializedName("IsAccepted")
    @Expose
    private Boolean IsAccepted;

    /**
    * <p>Applicable scope (tag condition).</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentity [] LabelRefList;

    /**
    * <p>Query</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>Problem description</p>
    */
    @SerializedName("QuestionDescription")
    @Expose
    private String QuestionDescription;

    /**
    * <p>Similar question modification list</p>
    */
    @SerializedName("SimilarQuestionList")
    @Expose
    private SimilarQuestionModifySpec [] SimilarQuestionList;

    /**
     * Get <p>Answer</p> 
     * @return Answer <p>Answer</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>Answer</p>
     * @param Answer <p>Answer</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>Category ID</p> 
     * @return CategoryId <p>Category ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category ID</p>
     * @param CategoryId <p>Category ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Associated document ID</p> 
     * @return DocId <p>Associated document ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>Associated document ID</p>
     * @param DocId <p>Associated document ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>Knowledge application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>Knowledge application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>Knowledge application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>Knowledge application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public void setEffectiveDomain(Long EffectiveDomain) {
        this.EffectiveDomain = EffectiveDomain;
    }

    /**
     * Get <p>Expiration policy (validity time and behavior after the validity period expires)</p> 
     * @return ExpirationPolicy <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     * @param ExpirationPolicy <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>Whether to adopt (verification passed)</p> 
     * @return IsAccepted <p>Whether to adopt (verification passed)</p>
     */
    public Boolean getIsAccepted() {
        return this.IsAccepted;
    }

    /**
     * Set <p>Whether to adopt (verification passed)</p>
     * @param IsAccepted <p>Whether to adopt (verification passed)</p>
     */
    public void setIsAccepted(Boolean IsAccepted) {
        this.IsAccepted = IsAccepted;
    }

    /**
     * Get <p>Applicable scope (tag condition).</p> 
     * @return LabelRefList <p>Applicable scope (tag condition).</p>
     */
    public LabelRefIdentity [] getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>Applicable scope (tag condition).</p>
     * @param LabelRefList <p>Applicable scope (tag condition).</p>
     */
    public void setLabelRefList(LabelRefIdentity [] LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    /**
     * Get <p>Query</p> 
     * @return Question <p>Query</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>Query</p>
     * @param Question <p>Query</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>Problem description</p> 
     * @return QuestionDescription <p>Problem description</p>
     */
    public String getQuestionDescription() {
        return this.QuestionDescription;
    }

    /**
     * Set <p>Problem description</p>
     * @param QuestionDescription <p>Problem description</p>
     */
    public void setQuestionDescription(String QuestionDescription) {
        this.QuestionDescription = QuestionDescription;
    }

    /**
     * Get <p>Similar question modification list</p> 
     * @return SimilarQuestionList <p>Similar question modification list</p>
     */
    public SimilarQuestionModifySpec [] getSimilarQuestionList() {
        return this.SimilarQuestionList;
    }

    /**
     * Set <p>Similar question modification list</p>
     * @param SimilarQuestionList <p>Similar question modification list</p>
     */
    public void setSimilarQuestionList(SimilarQuestionModifySpec [] SimilarQuestionList) {
        this.SimilarQuestionList = SimilarQuestionList;
    }

    public QAModifyFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAModifyFields(QAModifyFields source) {
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.EffectiveDomain != null) {
            this.EffectiveDomain = new Long(source.EffectiveDomain);
        }
        if (source.ExpirationPolicy != null) {
            this.ExpirationPolicy = new ExpirationPolicy(source.ExpirationPolicy);
        }
        if (source.IsAccepted != null) {
            this.IsAccepted = new Boolean(source.IsAccepted);
        }
        if (source.LabelRefList != null) {
            this.LabelRefList = new LabelRefIdentity[source.LabelRefList.length];
            for (int i = 0; i < source.LabelRefList.length; i++) {
                this.LabelRefList[i] = new LabelRefIdentity(source.LabelRefList[i]);
            }
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.QuestionDescription != null) {
            this.QuestionDescription = new String(source.QuestionDescription);
        }
        if (source.SimilarQuestionList != null) {
            this.SimilarQuestionList = new SimilarQuestionModifySpec[source.SimilarQuestionList.length];
            for (int i = 0; i < source.SimilarQuestionList.length; i++) {
                this.SimilarQuestionList[i] = new SimilarQuestionModifySpec(source.SimilarQuestionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamSimple(map, prefix + "IsAccepted", this.IsAccepted);
        this.setParamArrayObj(map, prefix + "LabelRefList.", this.LabelRefList);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "QuestionDescription", this.QuestionDescription);
        this.setParamArrayObj(map, prefix + "SimilarQuestionList.", this.SimilarQuestionList);

    }
}

