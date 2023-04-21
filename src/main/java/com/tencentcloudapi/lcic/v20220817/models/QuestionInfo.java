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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionInfo extends AbstractModel{

    /**
    * The question ID.
    */
    @SerializedName("QuestionId")
    @Expose
    private String QuestionId;

    /**
    * The question.
    */
    @SerializedName("QuestionContent")
    @Expose
    private String QuestionContent;

    /**
    * The time limit for the question. If you set this parameter to `0`, there will not be a time limit.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The correct answer. Bits are used to indicate the options that should be chosen. For example, `0x1` indicates option A; `0x11` indicates A and B, and so on.
    */
    @SerializedName("CorrectAnswer")
    @Expose
    private Long CorrectAnswer;

    /**
    * The statistics for each type of answer.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnswerStats")
    @Expose
    private AnswerStat [] AnswerStats;

    /**
     * Get The question ID. 
     * @return QuestionId The question ID.
     */
    public String getQuestionId() {
        return this.QuestionId;
    }

    /**
     * Set The question ID.
     * @param QuestionId The question ID.
     */
    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }

    /**
     * Get The question. 
     * @return QuestionContent The question.
     */
    public String getQuestionContent() {
        return this.QuestionContent;
    }

    /**
     * Set The question.
     * @param QuestionContent The question.
     */
    public void setQuestionContent(String QuestionContent) {
        this.QuestionContent = QuestionContent;
    }

    /**
     * Get The time limit for the question. If you set this parameter to `0`, there will not be a time limit. 
     * @return Duration The time limit for the question. If you set this parameter to `0`, there will not be a time limit.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The time limit for the question. If you set this parameter to `0`, there will not be a time limit.
     * @param Duration The time limit for the question. If you set this parameter to `0`, there will not be a time limit.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The correct answer. Bits are used to indicate the options that should be chosen. For example, `0x1` indicates option A; `0x11` indicates A and B, and so on. 
     * @return CorrectAnswer The correct answer. Bits are used to indicate the options that should be chosen. For example, `0x1` indicates option A; `0x11` indicates A and B, and so on.
     */
    public Long getCorrectAnswer() {
        return this.CorrectAnswer;
    }

    /**
     * Set The correct answer. Bits are used to indicate the options that should be chosen. For example, `0x1` indicates option A; `0x11` indicates A and B, and so on.
     * @param CorrectAnswer The correct answer. Bits are used to indicate the options that should be chosen. For example, `0x1` indicates option A; `0x11` indicates A and B, and so on.
     */
    public void setCorrectAnswer(Long CorrectAnswer) {
        this.CorrectAnswer = CorrectAnswer;
    }

    /**
     * Get The statistics for each type of answer.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnswerStats The statistics for each type of answer.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnswerStat [] getAnswerStats() {
        return this.AnswerStats;
    }

    /**
     * Set The statistics for each type of answer.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnswerStats The statistics for each type of answer.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnswerStats(AnswerStat [] AnswerStats) {
        this.AnswerStats = AnswerStats;
    }

    public QuestionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionInfo(QuestionInfo source) {
        if (source.QuestionId != null) {
            this.QuestionId = new String(source.QuestionId);
        }
        if (source.QuestionContent != null) {
            this.QuestionContent = new String(source.QuestionContent);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CorrectAnswer != null) {
            this.CorrectAnswer = new Long(source.CorrectAnswer);
        }
        if (source.AnswerStats != null) {
            this.AnswerStats = new AnswerStat[source.AnswerStats.length];
            for (int i = 0; i < source.AnswerStats.length; i++) {
                this.AnswerStats[i] = new AnswerStat(source.AnswerStats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuestionId", this.QuestionId);
        this.setParamSimple(map, prefix + "QuestionContent", this.QuestionContent);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CorrectAnswer", this.CorrectAnswer);
        this.setParamArrayObj(map, prefix + "AnswerStats.", this.AnswerStats);

    }
}

