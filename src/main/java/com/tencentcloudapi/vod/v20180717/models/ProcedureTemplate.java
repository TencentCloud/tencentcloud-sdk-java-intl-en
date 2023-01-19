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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcedureTemplate extends AbstractModel{

    /**
    * Task flow name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of a task flow template. Valid values:
<li>Preset: preset task flow template;</li>
<li>Custom: custom task flow template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Parameter of video processing task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * The information of the intelligent moderation task\*.
<font color=red>\*: This parameter is used by our old moderation templates and is not recommended. Please use `ReviewAudioVideoTask` instead.</font> 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * Parameter of AI-based content analysis task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * Type parameter of AI-based content recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * Parameter of a release on WeChat Mini Program task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTaskInput MiniProgramPublishTask;

    /**
    * The information of the moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask;

    /**
    * Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Task flow name. 
     * @return Name Task flow name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task flow name.
     * @param Name Task flow name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type of a task flow template. Valid values:
<li>Preset: preset task flow template;</li>
<li>Custom: custom task flow template.</li> 
     * @return Type Type of a task flow template. Valid values:
<li>Preset: preset task flow template;</li>
<li>Custom: custom task flow template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of a task flow template. Valid values:
<li>Preset: preset task flow template;</li>
<li>Custom: custom task flow template.</li>
     * @param Type Type of a task flow template. Valid values:
<li>Preset: preset task flow template;</li>
<li>Custom: custom task flow template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Parameter of video processing task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaProcessTask Parameter of video processing task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set Parameter of video processing task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaProcessTask Parameter of video processing task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get The information of the intelligent moderation task\*.
<font color=red>\*: This parameter is used by our old moderation templates and is not recommended. Please use `ReviewAudioVideoTask` instead.</font> 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AiContentReviewTask The information of the intelligent moderation task\*.
<font color=red>\*: This parameter is used by our old moderation templates and is not recommended. Please use `ReviewAudioVideoTask` instead.</font> 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set The information of the intelligent moderation task\*.
<font color=red>\*: This parameter is used by our old moderation templates and is not recommended. Please use `ReviewAudioVideoTask` instead.</font> 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AiContentReviewTask The information of the intelligent moderation task\*.
<font color=red>\*: This parameter is used by our old moderation templates and is not recommended. Please use `ReviewAudioVideoTask` instead.</font> 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get Parameter of AI-based content analysis task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AiAnalysisTask Parameter of AI-based content analysis task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set Parameter of AI-based content analysis task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AiAnalysisTask Parameter of AI-based content analysis task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get Type parameter of AI-based content recognition task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AiRecognitionTask Type parameter of AI-based content recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set Type parameter of AI-based content recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AiRecognitionTask Type parameter of AI-based content recognition task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get Parameter of a release on WeChat Mini Program task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MiniProgramPublishTask Parameter of a release on WeChat Mini Program task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WechatMiniProgramPublishTaskInput getMiniProgramPublishTask() {
        return this.MiniProgramPublishTask;
    }

    /**
     * Set Parameter of a release on WeChat Mini Program task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MiniProgramPublishTask Parameter of a release on WeChat Mini Program task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMiniProgramPublishTask(WechatMiniProgramPublishTaskInput MiniProgramPublishTask) {
        this.MiniProgramPublishTask = MiniProgramPublishTask;
    }

    /**
     * Get The information of the moderation task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReviewAudioVideoTask The information of the moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcedureReviewAudioVideoTaskInput getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set The information of the moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReviewAudioVideoTask The information of the moderation task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReviewAudioVideoTask(ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
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
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.MiniProgramPublishTask != null) {
            this.MiniProgramPublishTask = new WechatMiniProgramPublishTaskInput(source.MiniProgramPublishTask);
        }
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ProcedureReviewAudioVideoTaskInput(source.ReviewAudioVideoTask);
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
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "MiniProgramPublishTask.", this.MiniProgramPublishTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

