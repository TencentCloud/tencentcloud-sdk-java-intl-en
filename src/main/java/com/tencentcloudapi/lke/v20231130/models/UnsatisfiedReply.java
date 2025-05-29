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

public class UnsatisfiedReply extends AbstractModel {

    /**
    * Unsatisfied response ID.
    */
    @SerializedName("ReplyBizId")
    @Expose
    private String ReplyBizId;

    /**
    * Message record ID.
    */
    @SerializedName("RecordBizId")
    @Expose
    private String RecordBizId;

    /**
    * User question.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Application response.
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * Error type.
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
     * Get Unsatisfied response ID. 
     * @return ReplyBizId Unsatisfied response ID.
     */
    public String getReplyBizId() {
        return this.ReplyBizId;
    }

    /**
     * Set Unsatisfied response ID.
     * @param ReplyBizId Unsatisfied response ID.
     */
    public void setReplyBizId(String ReplyBizId) {
        this.ReplyBizId = ReplyBizId;
    }

    /**
     * Get Message record ID. 
     * @return RecordBizId Message record ID.
     */
    public String getRecordBizId() {
        return this.RecordBizId;
    }

    /**
     * Set Message record ID.
     * @param RecordBizId Message record ID.
     */
    public void setRecordBizId(String RecordBizId) {
        this.RecordBizId = RecordBizId;
    }

    /**
     * Get User question. 
     * @return Question User question.
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set User question.
     * @param Question User question.
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Application response. 
     * @return Answer Application response.
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set Application response.
     * @param Answer Application response.
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get Error type. 
     * @return Reasons Error type.
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set Error type.
     * @param Reasons Error type.
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    public UnsatisfiedReply() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnsatisfiedReply(UnsatisfiedReply source) {
        if (source.ReplyBizId != null) {
            this.ReplyBizId = new String(source.ReplyBizId);
        }
        if (source.RecordBizId != null) {
            this.RecordBizId = new String(source.RecordBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplyBizId", this.ReplyBizId);
        this.setParamSimple(map, prefix + "RecordBizId", this.RecordBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);

    }
}

