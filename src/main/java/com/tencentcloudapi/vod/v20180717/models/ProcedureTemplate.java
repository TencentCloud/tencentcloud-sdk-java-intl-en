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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcedureTemplate extends AbstractModel {

    /**
    * <p>Task flow name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Task flow template type. Valid values:</p><li>Preset: system preset task flow template.</li><li>Custom: user-defined task flow template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Transcoding template description. Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Video processing type task parameters.</p>
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * <p>AI moderation type task parameter *.<br><font color="red">*: This parameter is used to initiate legacy review and is not recommended. It is recommended to use the ReviewAudioVideoTask parameter to initiate review.</font></p>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>Parameters for the AI intelligent content analysis task.</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>Parameters for the AI content detect-type task.</p>
    */
    @SerializedName("AiRecognitionTaskSet")
    @Expose
    private AiRecognitionTaskInput [] AiRecognitionTaskSet;

    /**
    * <p>This parameter is not recommended. Use AiRecognitionTaskSet instead.</p>
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>WeChat Mini Program publishing task parameter.</p>
    */
    @SerializedName("MiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTaskInput MiniProgramPublishTask;

    /**
    * <p>Parameters for the audio and video moderation task.</p>
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask;

    /**
    * <p>Parameters for importing the Intelligent Media Assets knowledge base.</p>
    */
    @SerializedName("ImportMediaKnowledgeTaskSet")
    @Expose
    private ImportMediaKnowledgeTaskInput [] ImportMediaKnowledgeTaskSet;

    /**
    * <p>Template creation time, use <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Task flow name.</p> 
     * @return Name <p>Task flow name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task flow name.</p>
     * @param Name <p>Task flow name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Task flow template type. Valid values:</p><li>Preset: system preset task flow template.</li><li>Custom: user-defined task flow template.</li> 
     * @return Type <p>Task flow template type. Valid values:</p><li>Preset: system preset task flow template.</li><li>Custom: user-defined task flow template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Task flow template type. Valid values:</p><li>Preset: system preset task flow template.</li><li>Custom: user-defined task flow template.</li>
     * @param Type <p>Task flow template type. Valid values:</p><li>Preset: system preset task flow template.</li><li>Custom: user-defined task flow template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Transcoding template description. Length limit: 256 characters.</p> 
     * @return Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Transcoding template description. Length limit: 256 characters.</p>
     * @param Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Video processing type task parameters.</p> 
     * @return MediaProcessTask <p>Video processing type task parameters.</p>
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set <p>Video processing type task parameters.</p>
     * @param MediaProcessTask <p>Video processing type task parameters.</p>
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get <p>AI moderation type task parameter *.<br><font color="red">*: This parameter is used to initiate legacy review and is not recommended. It is recommended to use the ReviewAudioVideoTask parameter to initiate review.</font></p> 
     * @return AiContentReviewTask <p>AI moderation type task parameter *.<br><font color="red">*: This parameter is used to initiate legacy review and is not recommended. It is recommended to use the ReviewAudioVideoTask parameter to initiate review.</font></p>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>AI moderation type task parameter *.<br><font color="red">*: This parameter is used to initiate legacy review and is not recommended. It is recommended to use the ReviewAudioVideoTask parameter to initiate review.</font></p>
     * @param AiContentReviewTask <p>AI moderation type task parameter *.<br><font color="red">*: This parameter is used to initiate legacy review and is not recommended. It is recommended to use the ReviewAudioVideoTask parameter to initiate review.</font></p>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>Parameters for the AI intelligent content analysis task.</p> 
     * @return AiAnalysisTask <p>Parameters for the AI intelligent content analysis task.</p>
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>Parameters for the AI intelligent content analysis task.</p>
     * @param AiAnalysisTask <p>Parameters for the AI intelligent content analysis task.</p>
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>Parameters for the AI content detect-type task.</p> 
     * @return AiRecognitionTaskSet <p>Parameters for the AI content detect-type task.</p>
     */
    public AiRecognitionTaskInput [] getAiRecognitionTaskSet() {
        return this.AiRecognitionTaskSet;
    }

    /**
     * Set <p>Parameters for the AI content detect-type task.</p>
     * @param AiRecognitionTaskSet <p>Parameters for the AI content detect-type task.</p>
     */
    public void setAiRecognitionTaskSet(AiRecognitionTaskInput [] AiRecognitionTaskSet) {
        this.AiRecognitionTaskSet = AiRecognitionTaskSet;
    }

    /**
     * Get <p>This parameter is not recommended. Use AiRecognitionTaskSet instead.</p> 
     * @return AiRecognitionTask <p>This parameter is not recommended. Use AiRecognitionTaskSet instead.</p>
     * @deprecated
     */
    @Deprecated
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>This parameter is not recommended. Use AiRecognitionTaskSet instead.</p>
     * @param AiRecognitionTask <p>This parameter is not recommended. Use AiRecognitionTaskSet instead.</p>
     * @deprecated
     */
    @Deprecated
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>WeChat Mini Program publishing task parameter.</p> 
     * @return MiniProgramPublishTask <p>WeChat Mini Program publishing task parameter.</p>
     */
    public WechatMiniProgramPublishTaskInput getMiniProgramPublishTask() {
        return this.MiniProgramPublishTask;
    }

    /**
     * Set <p>WeChat Mini Program publishing task parameter.</p>
     * @param MiniProgramPublishTask <p>WeChat Mini Program publishing task parameter.</p>
     */
    public void setMiniProgramPublishTask(WechatMiniProgramPublishTaskInput MiniProgramPublishTask) {
        this.MiniProgramPublishTask = MiniProgramPublishTask;
    }

    /**
     * Get <p>Parameters for the audio and video moderation task.</p> 
     * @return ReviewAudioVideoTask <p>Parameters for the audio and video moderation task.</p>
     */
    public ProcedureReviewAudioVideoTaskInput getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set <p>Parameters for the audio and video moderation task.</p>
     * @param ReviewAudioVideoTask <p>Parameters for the audio and video moderation task.</p>
     */
    public void setReviewAudioVideoTask(ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get <p>Parameters for importing the Intelligent Media Assets knowledge base.</p> 
     * @return ImportMediaKnowledgeTaskSet <p>Parameters for importing the Intelligent Media Assets knowledge base.</p>
     */
    public ImportMediaKnowledgeTaskInput [] getImportMediaKnowledgeTaskSet() {
        return this.ImportMediaKnowledgeTaskSet;
    }

    /**
     * Set <p>Parameters for importing the Intelligent Media Assets knowledge base.</p>
     * @param ImportMediaKnowledgeTaskSet <p>Parameters for importing the Intelligent Media Assets knowledge base.</p>
     */
    public void setImportMediaKnowledgeTaskSet(ImportMediaKnowledgeTaskInput [] ImportMediaKnowledgeTaskSet) {
        this.ImportMediaKnowledgeTaskSet = ImportMediaKnowledgeTaskSet;
    }

    /**
     * Get <p>Template creation time, use <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Template creation time, use <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Template creation time, use <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Template creation time, use <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProcedureTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedureTemplate(ProcedureTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.MediaProcessTask != null) {
            this.MediaProcessTask = new MediaProcessTaskInput(source.MediaProcessTask);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiRecognitionTaskSet != null) {
            this.AiRecognitionTaskSet = new AiRecognitionTaskInput[source.AiRecognitionTaskSet.length];
            for (int i = 0; i < source.AiRecognitionTaskSet.length; i++) {
                this.AiRecognitionTaskSet[i] = new AiRecognitionTaskInput(source.AiRecognitionTaskSet[i]);
            }
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.MiniProgramPublishTask != null) {
            this.MiniProgramPublishTask = new WechatMiniProgramPublishTaskInput(source.MiniProgramPublishTask);
        }
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ProcedureReviewAudioVideoTaskInput(source.ReviewAudioVideoTask);
        }
        if (source.ImportMediaKnowledgeTaskSet != null) {
            this.ImportMediaKnowledgeTaskSet = new ImportMediaKnowledgeTaskInput[source.ImportMediaKnowledgeTaskSet.length];
            for (int i = 0; i < source.ImportMediaKnowledgeTaskSet.length; i++) {
                this.ImportMediaKnowledgeTaskSet[i] = new ImportMediaKnowledgeTaskInput(source.ImportMediaKnowledgeTaskSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamArrayObj(map, prefix + "AiRecognitionTaskSet.", this.AiRecognitionTaskSet);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "MiniProgramPublishTask.", this.MiniProgramPublishTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);
        this.setParamArrayObj(map, prefix + "ImportMediaKnowledgeTaskSet.", this.ImportMediaKnowledgeTaskSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

