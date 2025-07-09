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

public class ModifyRejectedQuestionRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Rejected question.


    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Unique id of the data source for the rejected question source.



    */
    @SerializedName("RejectedBizId")
    @Expose
    private String RejectedBizId;

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
     * Get Rejected question.

 
     * @return Question Rejected question.


     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Rejected question.


     * @param Question Rejected question.


     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Unique id of the data source for the rejected question source.


 
     * @return RejectedBizId Unique id of the data source for the rejected question source.



     */
    public String getRejectedBizId() {
        return this.RejectedBizId;
    }

    /**
     * Set Unique id of the data source for the rejected question source.



     * @param RejectedBizId Unique id of the data source for the rejected question source.



     */
    public void setRejectedBizId(String RejectedBizId) {
        this.RejectedBizId = RejectedBizId;
    }

    public ModifyRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRejectedQuestionRequest(ModifyRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.RejectedBizId != null) {
            this.RejectedBizId = new String(source.RejectedBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "RejectedBizId", this.RejectedBizId);

    }
}

