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

public class MsgRecord extends AbstractModel {

    /**
    * Answer.
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Category ID
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Intent.
    */
    @SerializedName("Intent")
    @Expose
    private String Intent;

    /**
    * Intent category
    */
    @SerializedName("IntentCategory")
    @Expose
    private String IntentCategory;

    /**
    * Whether it is intelligent categorization
    */
    @SerializedName("IsSmart")
    @Expose
    private Boolean IsSmart;

    /**
    * Issue
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Record ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * method. Enumerates ReplyMethod: 0=not specified, 1=direct reply by large model, 2=conservative reply, 3=refuse to answer, 4=sensitive reply, 5=Q&A pair prioritized reply, 6=welcome message, 7=concurrency limit exceeded, 8=global intervention knowledge, 9=task flow process reply, 10=task flow answer, 11=search engine, 12=knowledge polish, 13=image understanding, 14=real-time document, 15=clarification confirmation, 16=workflow reply, 17=workflow completion, 18=Intelligent Agent reply, 19=multiple intents, 20=interruption, 21=Intelligent Agent plan preview, 22=Intelligent Agent plan result, 23=Intelligent Agent structured output.
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
    * Returned result
    */
    @SerializedName("Result")
    @Expose
    private MsgRecordResult Result;

    /**
    * Score
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Session ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source.
    */
    @SerializedName("Source")
    @Expose
    private MsgRecordSource Source;

    /**
    * trace_id
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

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
     * Get Application ID 
     * @return AppId Application ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Category ID 
     * @return CategoryId Category ID
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Category ID
     * @param CategoryId Category ID
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Intent. 
     * @return Intent Intent.
     */
    public String getIntent() {
        return this.Intent;
    }

    /**
     * Set Intent.
     * @param Intent Intent.
     */
    public void setIntent(String Intent) {
        this.Intent = Intent;
    }

    /**
     * Get Intent category 
     * @return IntentCategory Intent category
     */
    public String getIntentCategory() {
        return this.IntentCategory;
    }

    /**
     * Set Intent category
     * @param IntentCategory Intent category
     */
    public void setIntentCategory(String IntentCategory) {
        this.IntentCategory = IntentCategory;
    }

    /**
     * Get Whether it is intelligent categorization 
     * @return IsSmart Whether it is intelligent categorization
     */
    public Boolean getIsSmart() {
        return this.IsSmart;
    }

    /**
     * Set Whether it is intelligent categorization
     * @param IsSmart Whether it is intelligent categorization
     */
    public void setIsSmart(Boolean IsSmart) {
        this.IsSmart = IsSmart;
    }

    /**
     * Get Issue 
     * @return Question Issue
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Issue
     * @param Question Issue
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Record ID 
     * @return RecordId Record ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID
     * @param RecordId Record ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get method. Enumerates ReplyMethod: 0=not specified, 1=direct reply by large model, 2=conservative reply, 3=refuse to answer, 4=sensitive reply, 5=Q&A pair prioritized reply, 6=welcome message, 7=concurrency limit exceeded, 8=global intervention knowledge, 9=task flow process reply, 10=task flow answer, 11=search engine, 12=knowledge polish, 13=image understanding, 14=real-time document, 15=clarification confirmation, 16=workflow reply, 17=workflow completion, 18=Intelligent Agent reply, 19=multiple intents, 20=interruption, 21=Intelligent Agent plan preview, 22=Intelligent Agent plan result, 23=Intelligent Agent structured output. 
     * @return ReplyMethod method. Enumerates ReplyMethod: 0=not specified, 1=direct reply by large model, 2=conservative reply, 3=refuse to answer, 4=sensitive reply, 5=Q&A pair prioritized reply, 6=welcome message, 7=concurrency limit exceeded, 8=global intervention knowledge, 9=task flow process reply, 10=task flow answer, 11=search engine, 12=knowledge polish, 13=image understanding, 14=real-time document, 15=clarification confirmation, 16=workflow reply, 17=workflow completion, 18=Intelligent Agent reply, 19=multiple intents, 20=interruption, 21=Intelligent Agent plan preview, 22=Intelligent Agent plan result, 23=Intelligent Agent structured output.
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set method. Enumerates ReplyMethod: 0=not specified, 1=direct reply by large model, 2=conservative reply, 3=refuse to answer, 4=sensitive reply, 5=Q&A pair prioritized reply, 6=welcome message, 7=concurrency limit exceeded, 8=global intervention knowledge, 9=task flow process reply, 10=task flow answer, 11=search engine, 12=knowledge polish, 13=image understanding, 14=real-time document, 15=clarification confirmation, 16=workflow reply, 17=workflow completion, 18=Intelligent Agent reply, 19=multiple intents, 20=interruption, 21=Intelligent Agent plan preview, 22=Intelligent Agent plan result, 23=Intelligent Agent structured output.
     * @param ReplyMethod method. Enumerates ReplyMethod: 0=not specified, 1=direct reply by large model, 2=conservative reply, 3=refuse to answer, 4=sensitive reply, 5=Q&A pair prioritized reply, 6=welcome message, 7=concurrency limit exceeded, 8=global intervention knowledge, 9=task flow process reply, 10=task flow answer, 11=search engine, 12=knowledge polish, 13=image understanding, 14=real-time document, 15=clarification confirmation, 16=workflow reply, 17=workflow completion, 18=Intelligent Agent reply, 19=multiple intents, 20=interruption, 21=Intelligent Agent plan preview, 22=Intelligent Agent plan result, 23=Intelligent Agent structured output.
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    /**
     * Get Returned result 
     * @return Result Returned result
     */
    public MsgRecordResult getResult() {
        return this.Result;
    }

    /**
     * Set Returned result
     * @param Result Returned result
     */
    public void setResult(MsgRecordResult Result) {
        this.Result = Result;
    }

    /**
     * Get Score 
     * @return Score Score
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Score
     * @param Score Score
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Session ID 
     * @return SessionId Session ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID
     * @param SessionId Session ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source. 
     * @return Source Source.
     */
    public MsgRecordSource getSource() {
        return this.Source;
    }

    /**
     * Set Source.
     * @param Source Source.
     */
    public void setSource(MsgRecordSource Source) {
        this.Source = Source;
    }

    /**
     * Get trace_id 
     * @return TraceId trace_id
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set trace_id
     * @param TraceId trace_id
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    public MsgRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecord(MsgRecord source) {
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Intent != null) {
            this.Intent = new String(source.Intent);
        }
        if (source.IntentCategory != null) {
            this.IntentCategory = new String(source.IntentCategory);
        }
        if (source.IsSmart != null) {
            this.IsSmart = new Boolean(source.IsSmart);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
        if (source.Result != null) {
            this.Result = new MsgRecordResult(source.Result);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Source != null) {
            this.Source = new MsgRecordSource(source.Source);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Intent", this.Intent);
        this.setParamSimple(map, prefix + "IntentCategory", this.IntentCategory);
        this.setParamSimple(map, prefix + "IsSmart", this.IsSmart);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);

    }
}

