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

public class MsgRecord extends AbstractModel {

    /**
    * Content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * The Session ID corresponding to the current record.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Associated record ID.
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * Whether it is from oneself.
    */
    @SerializedName("IsFromSelf")
    @Expose
    private Boolean IsFromSelf;

    /**
    * Sender name.
    */
    @SerializedName("FromName")
    @Expose
    private String FromName;

    /**
    * Avatar of the sender.
    */
    @SerializedName("FromAvatar")
    @Expose
    private String FromAvatar;

    /**
    * Timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Whether it is read.
    */
    @SerializedName("HasRead")
    @Expose
    private Boolean HasRead;

    /**
    * Evaluation.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Whether to rate.
    */
    @SerializedName("CanRating")
    @Expose
    private Boolean CanRating;

    /**
    * Whether to display the feedback button.
    */
    @SerializedName("CanFeedback")
    @Expose
    private Boolean CanFeedback;

    /**
    * Record type.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Reference source.
    */
    @SerializedName("References")
    @Expose
    private MsgRecordReference [] References;

    /**
    * Reason for evaluation.
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
    * Whether it is a large model.
    */
    @SerializedName("IsLlmGenerated")
    @Expose
    private Boolean IsLlmGenerated;

    /**
    * Image URL, which can be public read.
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * Statistical information of the current token.
    */
    @SerializedName("TokenStat")
    @Expose
    private TokenStat TokenStat;

    /**
    * Response method.
1: Large model directly replies.
2: Conservative reply, reply to unknown questions.
3: Reply to rejected question.
4: Sensitive response.
5: Directly reply to Q&A pairs. Priority will be given to answering the adopted Q&A pairs.
6: Reply with welcome words.
7: Reply for concurrency limit exceeded.
8: Global intervention knowledge.
9: Reply during the task flow process. When task_flow.type = 0 in history, it is a response from the large model.
10: Reply with task flow answer.
11: Reply from the search engine.
12: Reply after knowledge polishing.
13: Reply with image understanding.
14: Reply based on real-time document.
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
    * Option tab, used for multi-round dialogue.
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * Task information.
    */
    @SerializedName("TaskFlow")
    @Expose
    private TaskFlowInfo TaskFlow;

    /**
    * File information passed in by the user.
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * Location information of reference source .
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * Information on the thinking process of the agent.
    */
    @SerializedName("AgentThought")
    @Expose
    private AgentThought AgentThought;

    /**
    * Expanded information.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * Workflow information.
    */
    @SerializedName("WorkFlow")
    @Expose
    private WorkflowInfo WorkFlow;

    /**
     * Get Content. 
     * @return Content Content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content.
     * @param Content Content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get The Session ID corresponding to the current record. 
     * @return SessionId The Session ID corresponding to the current record.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The Session ID corresponding to the current record.
     * @param SessionId The Session ID corresponding to the current record.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Record ID. 
     * @return RecordId Record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID.
     * @param RecordId Record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Associated record ID. 
     * @return RelatedRecordId Associated record ID.
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set Associated record ID.
     * @param RelatedRecordId Associated record ID.
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get Whether it is from oneself. 
     * @return IsFromSelf Whether it is from oneself.
     */
    public Boolean getIsFromSelf() {
        return this.IsFromSelf;
    }

    /**
     * Set Whether it is from oneself.
     * @param IsFromSelf Whether it is from oneself.
     */
    public void setIsFromSelf(Boolean IsFromSelf) {
        this.IsFromSelf = IsFromSelf;
    }

    /**
     * Get Sender name. 
     * @return FromName Sender name.
     */
    public String getFromName() {
        return this.FromName;
    }

    /**
     * Set Sender name.
     * @param FromName Sender name.
     */
    public void setFromName(String FromName) {
        this.FromName = FromName;
    }

    /**
     * Get Avatar of the sender. 
     * @return FromAvatar Avatar of the sender.
     */
    public String getFromAvatar() {
        return this.FromAvatar;
    }

    /**
     * Set Avatar of the sender.
     * @param FromAvatar Avatar of the sender.
     */
    public void setFromAvatar(String FromAvatar) {
        this.FromAvatar = FromAvatar;
    }

    /**
     * Get Timestamp. 
     * @return Timestamp Timestamp.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp.
     * @param Timestamp Timestamp.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Whether it is read. 
     * @return HasRead Whether it is read.
     */
    public Boolean getHasRead() {
        return this.HasRead;
    }

    /**
     * Set Whether it is read.
     * @param HasRead Whether it is read.
     */
    public void setHasRead(Boolean HasRead) {
        this.HasRead = HasRead;
    }

    /**
     * Get Evaluation. 
     * @return Score Evaluation.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Evaluation.
     * @param Score Evaluation.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Whether to rate. 
     * @return CanRating Whether to rate.
     */
    public Boolean getCanRating() {
        return this.CanRating;
    }

    /**
     * Set Whether to rate.
     * @param CanRating Whether to rate.
     */
    public void setCanRating(Boolean CanRating) {
        this.CanRating = CanRating;
    }

    /**
     * Get Whether to display the feedback button. 
     * @return CanFeedback Whether to display the feedback button.
     */
    public Boolean getCanFeedback() {
        return this.CanFeedback;
    }

    /**
     * Set Whether to display the feedback button.
     * @param CanFeedback Whether to display the feedback button.
     */
    public void setCanFeedback(Boolean CanFeedback) {
        this.CanFeedback = CanFeedback;
    }

    /**
     * Get Record type. 
     * @return Type Record type.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Record type.
     * @param Type Record type.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Reference source. 
     * @return References Reference source.
     */
    public MsgRecordReference [] getReferences() {
        return this.References;
    }

    /**
     * Set Reference source.
     * @param References Reference source.
     */
    public void setReferences(MsgRecordReference [] References) {
        this.References = References;
    }

    /**
     * Get Reason for evaluation. 
     * @return Reasons Reason for evaluation.
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set Reason for evaluation.
     * @param Reasons Reason for evaluation.
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    /**
     * Get Whether it is a large model. 
     * @return IsLlmGenerated Whether it is a large model.
     */
    public Boolean getIsLlmGenerated() {
        return this.IsLlmGenerated;
    }

    /**
     * Set Whether it is a large model.
     * @param IsLlmGenerated Whether it is a large model.
     */
    public void setIsLlmGenerated(Boolean IsLlmGenerated) {
        this.IsLlmGenerated = IsLlmGenerated;
    }

    /**
     * Get Image URL, which can be public read. 
     * @return ImageUrls Image URL, which can be public read.
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set Image URL, which can be public read.
     * @param ImageUrls Image URL, which can be public read.
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get Statistical information of the current token. 
     * @return TokenStat Statistical information of the current token.
     */
    public TokenStat getTokenStat() {
        return this.TokenStat;
    }

    /**
     * Set Statistical information of the current token.
     * @param TokenStat Statistical information of the current token.
     */
    public void setTokenStat(TokenStat TokenStat) {
        this.TokenStat = TokenStat;
    }

    /**
     * Get Response method.
1: Large model directly replies.
2: Conservative reply, reply to unknown questions.
3: Reply to rejected question.
4: Sensitive response.
5: Directly reply to Q&A pairs. Priority will be given to answering the adopted Q&A pairs.
6: Reply with welcome words.
7: Reply for concurrency limit exceeded.
8: Global intervention knowledge.
9: Reply during the task flow process. When task_flow.type = 0 in history, it is a response from the large model.
10: Reply with task flow answer.
11: Reply from the search engine.
12: Reply after knowledge polishing.
13: Reply with image understanding.
14: Reply based on real-time document. 
     * @return ReplyMethod Response method.
1: Large model directly replies.
2: Conservative reply, reply to unknown questions.
3: Reply to rejected question.
4: Sensitive response.
5: Directly reply to Q&A pairs. Priority will be given to answering the adopted Q&A pairs.
6: Reply with welcome words.
7: Reply for concurrency limit exceeded.
8: Global intervention knowledge.
9: Reply during the task flow process. When task_flow.type = 0 in history, it is a response from the large model.
10: Reply with task flow answer.
11: Reply from the search engine.
12: Reply after knowledge polishing.
13: Reply with image understanding.
14: Reply based on real-time document.
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set Response method.
1: Large model directly replies.
2: Conservative reply, reply to unknown questions.
3: Reply to rejected question.
4: Sensitive response.
5: Directly reply to Q&A pairs. Priority will be given to answering the adopted Q&A pairs.
6: Reply with welcome words.
7: Reply for concurrency limit exceeded.
8: Global intervention knowledge.
9: Reply during the task flow process. When task_flow.type = 0 in history, it is a response from the large model.
10: Reply with task flow answer.
11: Reply from the search engine.
12: Reply after knowledge polishing.
13: Reply with image understanding.
14: Reply based on real-time document.
     * @param ReplyMethod Response method.
1: Large model directly replies.
2: Conservative reply, reply to unknown questions.
3: Reply to rejected question.
4: Sensitive response.
5: Directly reply to Q&A pairs. Priority will be given to answering the adopted Q&A pairs.
6: Reply with welcome words.
7: Reply for concurrency limit exceeded.
8: Global intervention knowledge.
9: Reply during the task flow process. When task_flow.type = 0 in history, it is a response from the large model.
10: Reply with task flow answer.
11: Reply from the search engine.
12: Reply after knowledge polishing.
13: Reply with image understanding.
14: Reply based on real-time document.
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    /**
     * Get Option tab, used for multi-round dialogue. 
     * @return OptionCards Option tab, used for multi-round dialogue.
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set Option tab, used for multi-round dialogue.
     * @param OptionCards Option tab, used for multi-round dialogue.
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get Task information. 
     * @return TaskFlow Task information.
     */
    public TaskFlowInfo getTaskFlow() {
        return this.TaskFlow;
    }

    /**
     * Set Task information.
     * @param TaskFlow Task information.
     */
    public void setTaskFlow(TaskFlowInfo TaskFlow) {
        this.TaskFlow = TaskFlow;
    }

    /**
     * Get File information passed in by the user. 
     * @return FileInfos File information passed in by the user.
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set File information passed in by the user.
     * @param FileInfos File information passed in by the user.
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Location information of reference source . 
     * @return QuoteInfos Location information of reference source .
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set Location information of reference source .
     * @param QuoteInfos Location information of reference source .
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get Information on the thinking process of the agent. 
     * @return AgentThought Information on the thinking process of the agent.
     */
    public AgentThought getAgentThought() {
        return this.AgentThought;
    }

    /**
     * Set Information on the thinking process of the agent.
     * @param AgentThought Information on the thinking process of the agent.
     */
    public void setAgentThought(AgentThought AgentThought) {
        this.AgentThought = AgentThought;
    }

    /**
     * Get Expanded information. 
     * @return ExtraInfo Expanded information.
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Expanded information.
     * @param ExtraInfo Expanded information.
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Workflow information. 
     * @return WorkFlow Workflow information.
     */
    public WorkflowInfo getWorkFlow() {
        return this.WorkFlow;
    }

    /**
     * Set Workflow information.
     * @param WorkFlow Workflow information.
     */
    public void setWorkFlow(WorkflowInfo WorkFlow) {
        this.WorkFlow = WorkFlow;
    }

    public MsgRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecord(MsgRecord source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.IsFromSelf != null) {
            this.IsFromSelf = new Boolean(source.IsFromSelf);
        }
        if (source.FromName != null) {
            this.FromName = new String(source.FromName);
        }
        if (source.FromAvatar != null) {
            this.FromAvatar = new String(source.FromAvatar);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.HasRead != null) {
            this.HasRead = new Boolean(source.HasRead);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.CanRating != null) {
            this.CanRating = new Boolean(source.CanRating);
        }
        if (source.CanFeedback != null) {
            this.CanFeedback = new Boolean(source.CanFeedback);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.References != null) {
            this.References = new MsgRecordReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new MsgRecordReference(source.References[i]);
            }
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
        if (source.IsLlmGenerated != null) {
            this.IsLlmGenerated = new Boolean(source.IsLlmGenerated);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.TokenStat != null) {
            this.TokenStat = new TokenStat(source.TokenStat);
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.TaskFlow != null) {
            this.TaskFlow = new TaskFlowInfo(source.TaskFlow);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new QuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new QuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.AgentThought != null) {
            this.AgentThought = new AgentThought(source.AgentThought);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.WorkFlow != null) {
            this.WorkFlow = new WorkflowInfo(source.WorkFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamSimple(map, prefix + "IsFromSelf", this.IsFromSelf);
        this.setParamSimple(map, prefix + "FromName", this.FromName);
        this.setParamSimple(map, prefix + "FromAvatar", this.FromAvatar);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "HasRead", this.HasRead);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "CanRating", this.CanRating);
        this.setParamSimple(map, prefix + "CanFeedback", this.CanFeedback);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);
        this.setParamSimple(map, prefix + "IsLlmGenerated", this.IsLlmGenerated);
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamObj(map, prefix + "TokenStat.", this.TokenStat);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamObj(map, prefix + "TaskFlow.", this.TaskFlow);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamObj(map, prefix + "AgentThought.", this.AgentThought);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamObj(map, prefix + "WorkFlow.", this.WorkFlow);

    }
}

