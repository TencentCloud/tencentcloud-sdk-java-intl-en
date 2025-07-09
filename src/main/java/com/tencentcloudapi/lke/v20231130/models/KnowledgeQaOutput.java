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

public class KnowledgeQaOutput extends AbstractModel {

    /**
    * Output method, 1: streaming 2: non-streaming.
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * General model response.
    */
    @SerializedName("UseGeneralKnowledge")
    @Expose
    private Boolean UseGeneralKnowledge;

    /**
    * Unknown response, within 300 characters.
    */
    @SerializedName("BareAnswer")
    @Expose
    private String BareAnswer;

    /**
    * Whether to display the question clarification switch.
    */
    @SerializedName("ShowQuestionClarify")
    @Expose
    private Boolean ShowQuestionClarify;

    /**
    * Whether to enable question clarification.
    */
    @SerializedName("UseQuestionClarify")
    @Expose
    private Boolean UseQuestionClarify;

    /**
    * List of keywords for question clarification.
    */
    @SerializedName("QuestionClarifyKeywords")
    @Expose
    private String [] QuestionClarifyKeywords;

    /**
    * Whether to enable recommended questions.
    */
    @SerializedName("UseRecommended")
    @Expose
    private Boolean UseRecommended;

    /**
     * Get Output method, 1: streaming 2: non-streaming. 
     * @return Method Output method, 1: streaming 2: non-streaming.
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set Output method, 1: streaming 2: non-streaming.
     * @param Method Output method, 1: streaming 2: non-streaming.
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get General model response. 
     * @return UseGeneralKnowledge General model response.
     */
    public Boolean getUseGeneralKnowledge() {
        return this.UseGeneralKnowledge;
    }

    /**
     * Set General model response.
     * @param UseGeneralKnowledge General model response.
     */
    public void setUseGeneralKnowledge(Boolean UseGeneralKnowledge) {
        this.UseGeneralKnowledge = UseGeneralKnowledge;
    }

    /**
     * Get Unknown response, within 300 characters. 
     * @return BareAnswer Unknown response, within 300 characters.
     */
    public String getBareAnswer() {
        return this.BareAnswer;
    }

    /**
     * Set Unknown response, within 300 characters.
     * @param BareAnswer Unknown response, within 300 characters.
     */
    public void setBareAnswer(String BareAnswer) {
        this.BareAnswer = BareAnswer;
    }

    /**
     * Get Whether to display the question clarification switch. 
     * @return ShowQuestionClarify Whether to display the question clarification switch.
     */
    public Boolean getShowQuestionClarify() {
        return this.ShowQuestionClarify;
    }

    /**
     * Set Whether to display the question clarification switch.
     * @param ShowQuestionClarify Whether to display the question clarification switch.
     */
    public void setShowQuestionClarify(Boolean ShowQuestionClarify) {
        this.ShowQuestionClarify = ShowQuestionClarify;
    }

    /**
     * Get Whether to enable question clarification. 
     * @return UseQuestionClarify Whether to enable question clarification.
     */
    public Boolean getUseQuestionClarify() {
        return this.UseQuestionClarify;
    }

    /**
     * Set Whether to enable question clarification.
     * @param UseQuestionClarify Whether to enable question clarification.
     */
    public void setUseQuestionClarify(Boolean UseQuestionClarify) {
        this.UseQuestionClarify = UseQuestionClarify;
    }

    /**
     * Get List of keywords for question clarification. 
     * @return QuestionClarifyKeywords List of keywords for question clarification.
     */
    public String [] getQuestionClarifyKeywords() {
        return this.QuestionClarifyKeywords;
    }

    /**
     * Set List of keywords for question clarification.
     * @param QuestionClarifyKeywords List of keywords for question clarification.
     */
    public void setQuestionClarifyKeywords(String [] QuestionClarifyKeywords) {
        this.QuestionClarifyKeywords = QuestionClarifyKeywords;
    }

    /**
     * Get Whether to enable recommended questions. 
     * @return UseRecommended Whether to enable recommended questions.
     */
    public Boolean getUseRecommended() {
        return this.UseRecommended;
    }

    /**
     * Set Whether to enable recommended questions.
     * @param UseRecommended Whether to enable recommended questions.
     */
    public void setUseRecommended(Boolean UseRecommended) {
        this.UseRecommended = UseRecommended;
    }

    public KnowledgeQaOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaOutput(KnowledgeQaOutput source) {
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.UseGeneralKnowledge != null) {
            this.UseGeneralKnowledge = new Boolean(source.UseGeneralKnowledge);
        }
        if (source.BareAnswer != null) {
            this.BareAnswer = new String(source.BareAnswer);
        }
        if (source.ShowQuestionClarify != null) {
            this.ShowQuestionClarify = new Boolean(source.ShowQuestionClarify);
        }
        if (source.UseQuestionClarify != null) {
            this.UseQuestionClarify = new Boolean(source.UseQuestionClarify);
        }
        if (source.QuestionClarifyKeywords != null) {
            this.QuestionClarifyKeywords = new String[source.QuestionClarifyKeywords.length];
            for (int i = 0; i < source.QuestionClarifyKeywords.length; i++) {
                this.QuestionClarifyKeywords[i] = new String(source.QuestionClarifyKeywords[i]);
            }
        }
        if (source.UseRecommended != null) {
            this.UseRecommended = new Boolean(source.UseRecommended);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "UseGeneralKnowledge", this.UseGeneralKnowledge);
        this.setParamSimple(map, prefix + "BareAnswer", this.BareAnswer);
        this.setParamSimple(map, prefix + "ShowQuestionClarify", this.ShowQuestionClarify);
        this.setParamSimple(map, prefix + "UseQuestionClarify", this.UseQuestionClarify);
        this.setParamArraySimple(map, prefix + "QuestionClarifyKeywords.", this.QuestionClarifyKeywords);
        this.setParamSimple(map, prefix + "UseRecommended", this.UseRecommended);

    }
}

