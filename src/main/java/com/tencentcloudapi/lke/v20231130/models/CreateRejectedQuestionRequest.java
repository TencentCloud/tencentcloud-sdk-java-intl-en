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

public class CreateRejectedQuestionRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Rejected question
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Unique ID of the data source for the rejected question - "2" will be returned when the rejected question is not satisfied - The rejected question comes from manual addition.
    */
    @SerializedName("BusinessSource")
    @Expose
    private Long BusinessSource;

    /**
    * Unique ID of the data source for the rejected question.


    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
     * Get Application ID 
     * @return BotBizId Application ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID
     * @param BotBizId Application ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Rejected question 
     * @return Question Rejected question
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Rejected question
     * @param Question Rejected question
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Unique ID of the data source for the rejected question - "2" will be returned when the rejected question is not satisfied - The rejected question comes from manual addition. 
     * @return BusinessSource Unique ID of the data source for the rejected question - "2" will be returned when the rejected question is not satisfied - The rejected question comes from manual addition.
     */
    public Long getBusinessSource() {
        return this.BusinessSource;
    }

    /**
     * Set Unique ID of the data source for the rejected question - "2" will be returned when the rejected question is not satisfied - The rejected question comes from manual addition.
     * @param BusinessSource Unique ID of the data source for the rejected question - "2" will be returned when the rejected question is not satisfied - The rejected question comes from manual addition.
     */
    public void setBusinessSource(Long BusinessSource) {
        this.BusinessSource = BusinessSource;
    }

    /**
     * Get Unique ID of the data source for the rejected question.

 
     * @return BusinessId Unique ID of the data source for the rejected question.


     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set Unique ID of the data source for the rejected question.


     * @param BusinessId Unique ID of the data source for the rejected question.


     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    public CreateRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRejectedQuestionRequest(CreateRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.BusinessSource != null) {
            this.BusinessSource = new Long(source.BusinessSource);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "BusinessSource", this.BusinessSource);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);

    }
}

