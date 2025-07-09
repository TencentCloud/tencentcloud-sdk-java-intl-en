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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQARequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Question.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Answer.
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * Applicable scope of labels: 1. all; 2. by conditions.
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * Custom parameter.
    */
    @SerializedName("CustomParam")
    @Expose
    private String CustomParam;

    /**
    * Label reference.
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
    * Document ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Category ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * Effective start time, unix timestamp.
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * Effective end time, unix timestamp. 0 indicates permanent validity.
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * Similar question content.
    */
    @SerializedName("SimilarQuestions")
    @Expose
    private String [] SimilarQuestions;

    /**
    * Question description.
    */
    @SerializedName("QuestionDesc")
    @Expose
    private String QuestionDesc;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Question. 
     * @return Question Question.
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Question.
     * @param Question Question.
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Answer. 
     * @return Answer Answer.
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set Answer.
     * @param Answer Answer.
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get Applicable scope of labels: 1. all; 2. by conditions. 
     * @return AttrRange Applicable scope of labels: 1. all; 2. by conditions.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Applicable scope of labels: 1. all; 2. by conditions.
     * @param AttrRange Applicable scope of labels: 1. all; 2. by conditions.
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get Custom parameter. 
     * @return CustomParam Custom parameter.
     */
    public String getCustomParam() {
        return this.CustomParam;
    }

    /**
     * Set Custom parameter.
     * @param CustomParam Custom parameter.
     */
    public void setCustomParam(String CustomParam) {
        this.CustomParam = CustomParam;
    }

    /**
     * Get Label reference. 
     * @return AttrLabels Label reference.
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set Label reference.
     * @param AttrLabels Label reference.
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get Document ID. 
     * @return DocBizId Document ID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document ID.
     * @param DocBizId Document ID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get Category ID. 
     * @return CateBizId Category ID.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Category ID.
     * @param CateBizId Category ID.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get Effective start time, unix timestamp. 
     * @return ExpireStart Effective start time, unix timestamp.
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set Effective start time, unix timestamp.
     * @param ExpireStart Effective start time, unix timestamp.
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get Effective end time, unix timestamp. 0 indicates permanent validity. 
     * @return ExpireEnd Effective end time, unix timestamp. 0 indicates permanent validity.
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set Effective end time, unix timestamp. 0 indicates permanent validity.
     * @param ExpireEnd Effective end time, unix timestamp. 0 indicates permanent validity.
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get Similar question content. 
     * @return SimilarQuestions Similar question content.
     */
    public String [] getSimilarQuestions() {
        return this.SimilarQuestions;
    }

    /**
     * Set Similar question content.
     * @param SimilarQuestions Similar question content.
     */
    public void setSimilarQuestions(String [] SimilarQuestions) {
        this.SimilarQuestions = SimilarQuestions;
    }

    /**
     * Get Question description. 
     * @return QuestionDesc Question description.
     */
    public String getQuestionDesc() {
        return this.QuestionDesc;
    }

    /**
     * Set Question description.
     * @param QuestionDesc Question description.
     */
    public void setQuestionDesc(String QuestionDesc) {
        this.QuestionDesc = QuestionDesc;
    }

    public CreateQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQARequest(CreateQARequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.CustomParam != null) {
            this.CustomParam = new String(source.CustomParam);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabelRefer[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabelRefer(source.AttrLabels[i]);
            }
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.SimilarQuestions != null) {
            this.SimilarQuestions = new String[source.SimilarQuestions.length];
            for (int i = 0; i < source.SimilarQuestions.length; i++) {
                this.SimilarQuestions[i] = new String(source.SimilarQuestions[i]);
            }
        }
        if (source.QuestionDesc != null) {
            this.QuestionDesc = new String(source.QuestionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamSimple(map, prefix + "CustomParam", this.CustomParam);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamArraySimple(map, prefix + "SimilarQuestions.", this.SimilarQuestions);
        this.setParamSimple(map, prefix + "QuestionDesc", this.QuestionDesc);

    }
}

