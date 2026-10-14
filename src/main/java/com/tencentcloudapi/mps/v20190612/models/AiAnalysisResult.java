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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisResult extends AbstractModel {

    /**
    * <p>Task type. Valid values:</p><li>Classification: intelligent classification</li><li>Cover: intelligent cover</li><li>Tag: intelligent tag</li><li>FrameTag: intelligent frame tagging</li><li>Highlight: intelligent highlights</li><li>DeLogo: smart erasing</li><li>Description: LLM summarization</li><li>Dubbing: intelligent dubbing</li><li>VideoRemake: video deduplication</li><li>VideoComprehension: video (audio) understanding</li><li>Cutout: video matting</li><li>Reel: intelligent video creation</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Query result of the video content analysis intelligent categorization task. Valid when the task type is Classification.</p>
    */
    @SerializedName("ClassificationTask")
    @Expose
    private AiAnalysisTaskClassificationResult ClassificationTask;

    /**
    * <p>Query result of the video content analysis Intelligent Cover Task. Valid when the task type is Cover.</p>
    */
    @SerializedName("CoverTask")
    @Expose
    private AiAnalysisTaskCoverResult CoverTask;

    /**
    * <p>Query result of the video content analysis intelligent tag task. Valid when the task type is Tag.</p>
    */
    @SerializedName("TagTask")
    @Expose
    private AiAnalysisTaskTagResult TagTask;

    /**
    * <p>Query result of the intelligent frame tagging task for video content analysis. Valid when the task type is FrameTag.</p>
    */
    @SerializedName("FrameTagTask")
    @Expose
    private AiAnalysisTaskFrameTagResult FrameTagTask;

    /**
    * <p>Query result of the video content analysis highlight task. Valid when the task type is Highlight.</p>
    */
    @SerializedName("HighlightTask")
    @Expose
    private AiAnalysisTaskHighlightResult HighlightTask;

    /**
    * <p>Query result of the video content analysis smart erasing task. Valid when the task type is DeLogo.</p>
    */
    @SerializedName("DeLogoTask")
    @Expose
    private AiAnalysisTaskDelLogoResult DeLogoTask;

    /**
    * <p>The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.</p>
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiAnalysisTaskSegmentResult SegmentTask;

    /**
    * <p>The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.</p>
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiAnalysisTaskHeadTailResult HeadTailTask;

    /**
    * <p>The query result of a video content analysis summary task, valid when the task type is Description.</p>
    */
    @SerializedName("DescriptionTask")
    @Expose
    private AiAnalysisTaskDescriptionResult DescriptionTask;

    /**
    * <p>The query result of a landscape-to-portrait task for video content analysis, which is valid when the task type is HorizontalToVertical.</p>
    */
    @SerializedName("HorizontalToVerticalTask")
    @Expose
    private AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask;

    /**
    * <p>Query result of the video content analysis dubbing task. Valid when the task type is Dubbing.</p>
    */
    @SerializedName("DubbingTask")
    @Expose
    private AiAnalysisTaskDubbingResult DubbingTask;

    /**
    * <p>The query result of a deduplication task for video content analysis, which is valid when the task type is VideoRemake.</p>
    */
    @SerializedName("VideoRemakeTask")
    @Expose
    private AiAnalysisTaskVideoRemakeResult VideoRemakeTask;

    /**
    * <p>Query result of the video (audio) understanding task. This parameter is valid when the task type is VideoComprehension.</p>
    */
    @SerializedName("VideoComprehensionTask")
    @Expose
    private AiAnalysisTaskVideoComprehensionResult VideoComprehensionTask;

    /**
    * <p>Query result of the video content analysis intelligent image masking task. Valid when the task type is Cutout.</p>
    */
    @SerializedName("CutoutTask")
    @Expose
    private AiAnalysisTaskCutoutResult CutoutTask;

    /**
    * <p>Query result of the video content analysis AI narration and video re-creation task. Valid when the task type is Reel.</p>
    */
    @SerializedName("ReelTask")
    @Expose
    private AiAnalysisTaskReelResult ReelTask;

    /**
    * <p>Query result of the intelligent analysis common task. Valid when the task type is Generic.</p>
    */
    @SerializedName("GenericTask")
    @Expose
    private AiAnalysisTaskGenericResult GenericTask;

    /**
     * Get <p>Task type. Valid values:</p><li>Classification: intelligent classification</li><li>Cover: intelligent cover</li><li>Tag: intelligent tag</li><li>FrameTag: intelligent frame tagging</li><li>Highlight: intelligent highlights</li><li>DeLogo: smart erasing</li><li>Description: LLM summarization</li><li>Dubbing: intelligent dubbing</li><li>VideoRemake: video deduplication</li><li>VideoComprehension: video (audio) understanding</li><li>Cutout: video matting</li><li>Reel: intelligent video creation</li> 
     * @return Type <p>Task type. Valid values:</p><li>Classification: intelligent classification</li><li>Cover: intelligent cover</li><li>Tag: intelligent tag</li><li>FrameTag: intelligent frame tagging</li><li>Highlight: intelligent highlights</li><li>DeLogo: smart erasing</li><li>Description: LLM summarization</li><li>Dubbing: intelligent dubbing</li><li>VideoRemake: video deduplication</li><li>VideoComprehension: video (audio) understanding</li><li>Cutout: video matting</li><li>Reel: intelligent video creation</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Task type. Valid values:</p><li>Classification: intelligent classification</li><li>Cover: intelligent cover</li><li>Tag: intelligent tag</li><li>FrameTag: intelligent frame tagging</li><li>Highlight: intelligent highlights</li><li>DeLogo: smart erasing</li><li>Description: LLM summarization</li><li>Dubbing: intelligent dubbing</li><li>VideoRemake: video deduplication</li><li>VideoComprehension: video (audio) understanding</li><li>Cutout: video matting</li><li>Reel: intelligent video creation</li>
     * @param Type <p>Task type. Valid values:</p><li>Classification: intelligent classification</li><li>Cover: intelligent cover</li><li>Tag: intelligent tag</li><li>FrameTag: intelligent frame tagging</li><li>Highlight: intelligent highlights</li><li>DeLogo: smart erasing</li><li>Description: LLM summarization</li><li>Dubbing: intelligent dubbing</li><li>VideoRemake: video deduplication</li><li>VideoComprehension: video (audio) understanding</li><li>Cutout: video matting</li><li>Reel: intelligent video creation</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Query result of the video content analysis intelligent categorization task. Valid when the task type is Classification.</p> 
     * @return ClassificationTask <p>Query result of the video content analysis intelligent categorization task. Valid when the task type is Classification.</p>
     */
    public AiAnalysisTaskClassificationResult getClassificationTask() {
        return this.ClassificationTask;
    }

    /**
     * Set <p>Query result of the video content analysis intelligent categorization task. Valid when the task type is Classification.</p>
     * @param ClassificationTask <p>Query result of the video content analysis intelligent categorization task. Valid when the task type is Classification.</p>
     */
    public void setClassificationTask(AiAnalysisTaskClassificationResult ClassificationTask) {
        this.ClassificationTask = ClassificationTask;
    }

    /**
     * Get <p>Query result of the video content analysis Intelligent Cover Task. Valid when the task type is Cover.</p> 
     * @return CoverTask <p>Query result of the video content analysis Intelligent Cover Task. Valid when the task type is Cover.</p>
     */
    public AiAnalysisTaskCoverResult getCoverTask() {
        return this.CoverTask;
    }

    /**
     * Set <p>Query result of the video content analysis Intelligent Cover Task. Valid when the task type is Cover.</p>
     * @param CoverTask <p>Query result of the video content analysis Intelligent Cover Task. Valid when the task type is Cover.</p>
     */
    public void setCoverTask(AiAnalysisTaskCoverResult CoverTask) {
        this.CoverTask = CoverTask;
    }

    /**
     * Get <p>Query result of the video content analysis intelligent tag task. Valid when the task type is Tag.</p> 
     * @return TagTask <p>Query result of the video content analysis intelligent tag task. Valid when the task type is Tag.</p>
     */
    public AiAnalysisTaskTagResult getTagTask() {
        return this.TagTask;
    }

    /**
     * Set <p>Query result of the video content analysis intelligent tag task. Valid when the task type is Tag.</p>
     * @param TagTask <p>Query result of the video content analysis intelligent tag task. Valid when the task type is Tag.</p>
     */
    public void setTagTask(AiAnalysisTaskTagResult TagTask) {
        this.TagTask = TagTask;
    }

    /**
     * Get <p>Query result of the intelligent frame tagging task for video content analysis. Valid when the task type is FrameTag.</p> 
     * @return FrameTagTask <p>Query result of the intelligent frame tagging task for video content analysis. Valid when the task type is FrameTag.</p>
     */
    public AiAnalysisTaskFrameTagResult getFrameTagTask() {
        return this.FrameTagTask;
    }

    /**
     * Set <p>Query result of the intelligent frame tagging task for video content analysis. Valid when the task type is FrameTag.</p>
     * @param FrameTagTask <p>Query result of the intelligent frame tagging task for video content analysis. Valid when the task type is FrameTag.</p>
     */
    public void setFrameTagTask(AiAnalysisTaskFrameTagResult FrameTagTask) {
        this.FrameTagTask = FrameTagTask;
    }

    /**
     * Get <p>Query result of the video content analysis highlight task. Valid when the task type is Highlight.</p> 
     * @return HighlightTask <p>Query result of the video content analysis highlight task. Valid when the task type is Highlight.</p>
     */
    public AiAnalysisTaskHighlightResult getHighlightTask() {
        return this.HighlightTask;
    }

    /**
     * Set <p>Query result of the video content analysis highlight task. Valid when the task type is Highlight.</p>
     * @param HighlightTask <p>Query result of the video content analysis highlight task. Valid when the task type is Highlight.</p>
     */
    public void setHighlightTask(AiAnalysisTaskHighlightResult HighlightTask) {
        this.HighlightTask = HighlightTask;
    }

    /**
     * Get <p>Query result of the video content analysis smart erasing task. Valid when the task type is DeLogo.</p> 
     * @return DeLogoTask <p>Query result of the video content analysis smart erasing task. Valid when the task type is DeLogo.</p>
     */
    public AiAnalysisTaskDelLogoResult getDeLogoTask() {
        return this.DeLogoTask;
    }

    /**
     * Set <p>Query result of the video content analysis smart erasing task. Valid when the task type is DeLogo.</p>
     * @param DeLogoTask <p>Query result of the video content analysis smart erasing task. Valid when the task type is DeLogo.</p>
     */
    public void setDeLogoTask(AiAnalysisTaskDelLogoResult DeLogoTask) {
        this.DeLogoTask = DeLogoTask;
    }

    /**
     * Get <p>The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.</p> 
     * @return SegmentTask <p>The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.</p>
     */
    public AiAnalysisTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set <p>The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.</p>
     * @param SegmentTask <p>The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.</p>
     */
    public void setSegmentTask(AiAnalysisTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get <p>The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.</p> 
     * @return HeadTailTask <p>The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.</p>
     */
    public AiAnalysisTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set <p>The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.</p>
     * @param HeadTailTask <p>The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.</p>
     */
    public void setHeadTailTask(AiAnalysisTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get <p>The query result of a video content analysis summary task, valid when the task type is Description.</p> 
     * @return DescriptionTask <p>The query result of a video content analysis summary task, valid when the task type is Description.</p>
     */
    public AiAnalysisTaskDescriptionResult getDescriptionTask() {
        return this.DescriptionTask;
    }

    /**
     * Set <p>The query result of a video content analysis summary task, valid when the task type is Description.</p>
     * @param DescriptionTask <p>The query result of a video content analysis summary task, valid when the task type is Description.</p>
     */
    public void setDescriptionTask(AiAnalysisTaskDescriptionResult DescriptionTask) {
        this.DescriptionTask = DescriptionTask;
    }

    /**
     * Get <p>The query result of a landscape-to-portrait task for video content analysis, which is valid when the task type is HorizontalToVertical.</p> 
     * @return HorizontalToVerticalTask <p>The query result of a landscape-to-portrait task for video content analysis, which is valid when the task type is HorizontalToVertical.</p>
     */
    public AiAnalysisTaskHorizontalToVerticalResult getHorizontalToVerticalTask() {
        return this.HorizontalToVerticalTask;
    }

    /**
     * Set <p>The query result of a landscape-to-portrait task for video content analysis, which is valid when the task type is HorizontalToVertical.</p>
     * @param HorizontalToVerticalTask <p>The query result of a landscape-to-portrait task for video content analysis, which is valid when the task type is HorizontalToVertical.</p>
     */
    public void setHorizontalToVerticalTask(AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask) {
        this.HorizontalToVerticalTask = HorizontalToVerticalTask;
    }

    /**
     * Get <p>Query result of the video content analysis dubbing task. Valid when the task type is Dubbing.</p> 
     * @return DubbingTask <p>Query result of the video content analysis dubbing task. Valid when the task type is Dubbing.</p>
     */
    public AiAnalysisTaskDubbingResult getDubbingTask() {
        return this.DubbingTask;
    }

    /**
     * Set <p>Query result of the video content analysis dubbing task. Valid when the task type is Dubbing.</p>
     * @param DubbingTask <p>Query result of the video content analysis dubbing task. Valid when the task type is Dubbing.</p>
     */
    public void setDubbingTask(AiAnalysisTaskDubbingResult DubbingTask) {
        this.DubbingTask = DubbingTask;
    }

    /**
     * Get <p>The query result of a deduplication task for video content analysis, which is valid when the task type is VideoRemake.</p> 
     * @return VideoRemakeTask <p>The query result of a deduplication task for video content analysis, which is valid when the task type is VideoRemake.</p>
     */
    public AiAnalysisTaskVideoRemakeResult getVideoRemakeTask() {
        return this.VideoRemakeTask;
    }

    /**
     * Set <p>The query result of a deduplication task for video content analysis, which is valid when the task type is VideoRemake.</p>
     * @param VideoRemakeTask <p>The query result of a deduplication task for video content analysis, which is valid when the task type is VideoRemake.</p>
     */
    public void setVideoRemakeTask(AiAnalysisTaskVideoRemakeResult VideoRemakeTask) {
        this.VideoRemakeTask = VideoRemakeTask;
    }

    /**
     * Get <p>Query result of the video (audio) understanding task. This parameter is valid when the task type is VideoComprehension.</p> 
     * @return VideoComprehensionTask <p>Query result of the video (audio) understanding task. This parameter is valid when the task type is VideoComprehension.</p>
     */
    public AiAnalysisTaskVideoComprehensionResult getVideoComprehensionTask() {
        return this.VideoComprehensionTask;
    }

    /**
     * Set <p>Query result of the video (audio) understanding task. This parameter is valid when the task type is VideoComprehension.</p>
     * @param VideoComprehensionTask <p>Query result of the video (audio) understanding task. This parameter is valid when the task type is VideoComprehension.</p>
     */
    public void setVideoComprehensionTask(AiAnalysisTaskVideoComprehensionResult VideoComprehensionTask) {
        this.VideoComprehensionTask = VideoComprehensionTask;
    }

    /**
     * Get <p>Query result of the video content analysis intelligent image masking task. Valid when the task type is Cutout.</p> 
     * @return CutoutTask <p>Query result of the video content analysis intelligent image masking task. Valid when the task type is Cutout.</p>
     */
    public AiAnalysisTaskCutoutResult getCutoutTask() {
        return this.CutoutTask;
    }

    /**
     * Set <p>Query result of the video content analysis intelligent image masking task. Valid when the task type is Cutout.</p>
     * @param CutoutTask <p>Query result of the video content analysis intelligent image masking task. Valid when the task type is Cutout.</p>
     */
    public void setCutoutTask(AiAnalysisTaskCutoutResult CutoutTask) {
        this.CutoutTask = CutoutTask;
    }

    /**
     * Get <p>Query result of the video content analysis AI narration and video re-creation task. Valid when the task type is Reel.</p> 
     * @return ReelTask <p>Query result of the video content analysis AI narration and video re-creation task. Valid when the task type is Reel.</p>
     */
    public AiAnalysisTaskReelResult getReelTask() {
        return this.ReelTask;
    }

    /**
     * Set <p>Query result of the video content analysis AI narration and video re-creation task. Valid when the task type is Reel.</p>
     * @param ReelTask <p>Query result of the video content analysis AI narration and video re-creation task. Valid when the task type is Reel.</p>
     */
    public void setReelTask(AiAnalysisTaskReelResult ReelTask) {
        this.ReelTask = ReelTask;
    }

    /**
     * Get <p>Query result of the intelligent analysis common task. Valid when the task type is Generic.</p> 
     * @return GenericTask <p>Query result of the intelligent analysis common task. Valid when the task type is Generic.</p>
     */
    public AiAnalysisTaskGenericResult getGenericTask() {
        return this.GenericTask;
    }

    /**
     * Set <p>Query result of the intelligent analysis common task. Valid when the task type is Generic.</p>
     * @param GenericTask <p>Query result of the intelligent analysis common task. Valid when the task type is Generic.</p>
     */
    public void setGenericTask(AiAnalysisTaskGenericResult GenericTask) {
        this.GenericTask = GenericTask;
    }

    public AiAnalysisResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisResult(AiAnalysisResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClassificationTask != null) {
            this.ClassificationTask = new AiAnalysisTaskClassificationResult(source.ClassificationTask);
        }
        if (source.CoverTask != null) {
            this.CoverTask = new AiAnalysisTaskCoverResult(source.CoverTask);
        }
        if (source.TagTask != null) {
            this.TagTask = new AiAnalysisTaskTagResult(source.TagTask);
        }
        if (source.FrameTagTask != null) {
            this.FrameTagTask = new AiAnalysisTaskFrameTagResult(source.FrameTagTask);
        }
        if (source.HighlightTask != null) {
            this.HighlightTask = new AiAnalysisTaskHighlightResult(source.HighlightTask);
        }
        if (source.DeLogoTask != null) {
            this.DeLogoTask = new AiAnalysisTaskDelLogoResult(source.DeLogoTask);
        }
        if (source.SegmentTask != null) {
            this.SegmentTask = new AiAnalysisTaskSegmentResult(source.SegmentTask);
        }
        if (source.HeadTailTask != null) {
            this.HeadTailTask = new AiAnalysisTaskHeadTailResult(source.HeadTailTask);
        }
        if (source.DescriptionTask != null) {
            this.DescriptionTask = new AiAnalysisTaskDescriptionResult(source.DescriptionTask);
        }
        if (source.HorizontalToVerticalTask != null) {
            this.HorizontalToVerticalTask = new AiAnalysisTaskHorizontalToVerticalResult(source.HorizontalToVerticalTask);
        }
        if (source.DubbingTask != null) {
            this.DubbingTask = new AiAnalysisTaskDubbingResult(source.DubbingTask);
        }
        if (source.VideoRemakeTask != null) {
            this.VideoRemakeTask = new AiAnalysisTaskVideoRemakeResult(source.VideoRemakeTask);
        }
        if (source.VideoComprehensionTask != null) {
            this.VideoComprehensionTask = new AiAnalysisTaskVideoComprehensionResult(source.VideoComprehensionTask);
        }
        if (source.CutoutTask != null) {
            this.CutoutTask = new AiAnalysisTaskCutoutResult(source.CutoutTask);
        }
        if (source.ReelTask != null) {
            this.ReelTask = new AiAnalysisTaskReelResult(source.ReelTask);
        }
        if (source.GenericTask != null) {
            this.GenericTask = new AiAnalysisTaskGenericResult(source.GenericTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ClassificationTask.", this.ClassificationTask);
        this.setParamObj(map, prefix + "CoverTask.", this.CoverTask);
        this.setParamObj(map, prefix + "TagTask.", this.TagTask);
        this.setParamObj(map, prefix + "FrameTagTask.", this.FrameTagTask);
        this.setParamObj(map, prefix + "HighlightTask.", this.HighlightTask);
        this.setParamObj(map, prefix + "DeLogoTask.", this.DeLogoTask);
        this.setParamObj(map, prefix + "SegmentTask.", this.SegmentTask);
        this.setParamObj(map, prefix + "HeadTailTask.", this.HeadTailTask);
        this.setParamObj(map, prefix + "DescriptionTask.", this.DescriptionTask);
        this.setParamObj(map, prefix + "HorizontalToVerticalTask.", this.HorizontalToVerticalTask);
        this.setParamObj(map, prefix + "DubbingTask.", this.DubbingTask);
        this.setParamObj(map, prefix + "VideoRemakeTask.", this.VideoRemakeTask);
        this.setParamObj(map, prefix + "VideoComprehensionTask.", this.VideoComprehensionTask);
        this.setParamObj(map, prefix + "CutoutTask.", this.CutoutTask);
        this.setParamObj(map, prefix + "ReelTask.", this.ReelTask);
        this.setParamObj(map, prefix + "GenericTask.", this.GenericTask);

    }
}

