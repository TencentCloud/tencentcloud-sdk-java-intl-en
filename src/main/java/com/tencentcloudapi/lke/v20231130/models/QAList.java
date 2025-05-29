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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QAList extends AbstractModel {

    /**
    * Q&A ID.
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * Whether to accept.
    */
    @SerializedName("IsAccepted")
    @Expose
    private Boolean IsAccepted;

    /**
    * Category ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

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
     * Get Q&A ID. 
     * @return QaBizId Q&A ID.
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set Q&A ID.
     * @param QaBizId Q&A ID.
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get Whether to accept. 
     * @return IsAccepted Whether to accept.
     */
    public Boolean getIsAccepted() {
        return this.IsAccepted;
    }

    /**
     * Set Whether to accept.
     * @param IsAccepted Whether to accept.
     */
    public void setIsAccepted(Boolean IsAccepted) {
        this.IsAccepted = IsAccepted;
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

    public QAList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAList(QAList source) {
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.IsAccepted != null) {
            this.IsAccepted = new Boolean(source.IsAccepted);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "IsAccepted", this.IsAccepted);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);

    }
}

