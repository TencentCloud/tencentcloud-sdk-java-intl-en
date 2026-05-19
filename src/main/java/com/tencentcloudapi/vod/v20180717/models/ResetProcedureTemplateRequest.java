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

public class ResetProcedureTemplateRequest extends AbstractModel {

    /**
    * Task flow name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Parameters for the video processing task.
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * Parameters for the AI intelligent content moderation task.
<font color=red>\*: This parameter is used to trigger legacy review and is not recommended. Use the ReviewAudioVideoTask parameter to initiate review.</font>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * Parameters for the AI intelligent content analysis task.
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * Parameters for the AI content recognition task.
    */
    @SerializedName("AiRecognitionTaskSet")
    @Expose
    private AiRecognitionTaskInput [] AiRecognitionTaskSet;

    /**
    * This parameter is not recommended. Recommend using AiRecognitionTaskSet.
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * Parameters for the audio and video moderation task.
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask;

    /**
     * Get Task flow name 
     * @return Name Task flow name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task flow name
     * @param Name Task flow name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template description, with a length limit of 256 characters. 
     * @return Comment Template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters.
     * @param Comment Template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Parameters for the video processing task. 
     * @return MediaProcessTask Parameters for the video processing task.
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set Parameters for the video processing task.
     * @param MediaProcessTask Parameters for the video processing task.
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get Parameters for the AI intelligent content moderation task.
<font color=red>\*: This parameter is used to trigger legacy review and is not recommended. Use the ReviewAudioVideoTask parameter to initiate review.</font> 
     * @return AiContentReviewTask Parameters for the AI intelligent content moderation task.
<font color=red>\*: This parameter is used to trigger legacy review and is not recommended. Use the ReviewAudioVideoTask parameter to initiate review.</font>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set Parameters for the AI intelligent content moderation task.
<font color=red>\*: This parameter is used to trigger legacy review and is not recommended. Use the ReviewAudioVideoTask parameter to initiate review.</font>
     * @param AiContentReviewTask Parameters for the AI intelligent content moderation task.
<font color=red>\*: This parameter is used to trigger legacy review and is not recommended. Use the ReviewAudioVideoTask parameter to initiate review.</font>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get Parameters for the AI intelligent content analysis task. 
     * @return AiAnalysisTask Parameters for the AI intelligent content analysis task.
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set Parameters for the AI intelligent content analysis task.
     * @param AiAnalysisTask Parameters for the AI intelligent content analysis task.
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get Parameters for the AI content recognition task. 
     * @return AiRecognitionTaskSet Parameters for the AI content recognition task.
     */
    public AiRecognitionTaskInput [] getAiRecognitionTaskSet() {
        return this.AiRecognitionTaskSet;
    }

    /**
     * Set Parameters for the AI content recognition task.
     * @param AiRecognitionTaskSet Parameters for the AI content recognition task.
     */
    public void setAiRecognitionTaskSet(AiRecognitionTaskInput [] AiRecognitionTaskSet) {
        this.AiRecognitionTaskSet = AiRecognitionTaskSet;
    }

    /**
     * Get This parameter is not recommended. Recommend using AiRecognitionTaskSet. 
     * @return AiRecognitionTask This parameter is not recommended. Recommend using AiRecognitionTaskSet.
     * @deprecated
     */
    @Deprecated
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set This parameter is not recommended. Recommend using AiRecognitionTaskSet.
     * @param AiRecognitionTask This parameter is not recommended. Recommend using AiRecognitionTaskSet.
     * @deprecated
     */
    @Deprecated
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get Parameters for the audio and video moderation task. 
     * @return ReviewAudioVideoTask Parameters for the audio and video moderation task.
     */
    public ProcedureReviewAudioVideoTaskInput getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set Parameters for the audio and video moderation task.
     * @param ReviewAudioVideoTask Parameters for the audio and video moderation task.
     */
    public void setReviewAudioVideoTask(ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    public ResetProcedureTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetProcedureTemplateRequest(ResetProcedureTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ProcedureReviewAudioVideoTaskInput(source.ReviewAudioVideoTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamArrayObj(map, prefix + "AiRecognitionTaskSet.", this.AiRecognitionTaskSet);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);

    }
}

