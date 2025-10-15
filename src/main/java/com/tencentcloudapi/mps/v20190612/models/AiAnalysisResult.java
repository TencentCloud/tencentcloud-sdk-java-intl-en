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
    * Task type. valid values:.
<Li>Classification: intelligent classification.</li>.
<Li>Cover: specifies the intelligent cover.</li>.
<Li>Tag: intelligent tagging.</li>.
<Li>FrameTag: intelligent frame-by-frame tagging.</li>.
<Li>Highlight: intelligent highlights</li>.
<Li>DeLogo: intelligent removal.</li>.
<li>Description: large model summarization.</li>

<Li>Dubbing: intelligent dubbing.</li>.
<Li>VideoRemake: specifies video deduplication.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Query result of intelligent categorization task in video content analysis, which is valid if task type is `Classification`.
    */
    @SerializedName("ClassificationTask")
    @Expose
    private AiAnalysisTaskClassificationResult ClassificationTask;

    /**
    * Query result of intelligent cover generating task in video content analysis, which is valid if task type is `Cover`.
    */
    @SerializedName("CoverTask")
    @Expose
    private AiAnalysisTaskCoverResult CoverTask;

    /**
    * Query result of intelligent tagging task in video content analysis, which is valid if task type is `Tag`.
    */
    @SerializedName("TagTask")
    @Expose
    private AiAnalysisTaskTagResult TagTask;

    /**
    * Query result of intelligent frame-specific tagging task in video content analysis, which is valid if task type is `FrameTag`.
    */
    @SerializedName("FrameTagTask")
    @Expose
    private AiAnalysisTaskFrameTagResult FrameTagTask;

    /**
    * The result of a highlight generation task. This parameter is valid if `Type` is `Highlight`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HighlightTask")
    @Expose
    private AiAnalysisTaskHighlightResult HighlightTask;

    /**
    * The query result of an intelligent removal task for video analysis, which is valid when the task type is DeLogo.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeLogoTask")
    @Expose
    private AiAnalysisTaskDelLogoResult DeLogoTask;

    /**
    * The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiAnalysisTaskSegmentResult SegmentTask;

    /**
    * The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiAnalysisTaskHeadTailResult HeadTailTask;

    /**
    * The query result of a video analysis summarization task, which is valid when the task type is Description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DescriptionTask")
    @Expose
    private AiAnalysisTaskDescriptionResult DescriptionTask;

    /**
    * The query result of a landscape-to-portrait task for video analysis, which is valid when the task type is HorizontalToVertical.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HorizontalToVerticalTask")
    @Expose
    private AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask;

    /**
    * The query result of a Dubbing task for video content analysis, which is valid when the task type is Dubbing.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DubbingTask")
    @Expose
    private AiAnalysisTaskDubbingResult DubbingTask;

    /**
    * The query result of a video content deduplication task, which is valid when the task type is VideoRemake.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VideoRemakeTask")
    @Expose
    private AiAnalysisTaskVideoRemakeResult VideoRemakeTask;

    /**
     * Get Task type. valid values:.
<Li>Classification: intelligent classification.</li>.
<Li>Cover: specifies the intelligent cover.</li>.
<Li>Tag: intelligent tagging.</li>.
<Li>FrameTag: intelligent frame-by-frame tagging.</li>.
<Li>Highlight: intelligent highlights</li>.
<Li>DeLogo: intelligent removal.</li>.
<li>Description: large model summarization.</li>

<Li>Dubbing: intelligent dubbing.</li>.
<Li>VideoRemake: specifies video deduplication.</li>. 
     * @return Type Task type. valid values:.
<Li>Classification: intelligent classification.</li>.
<Li>Cover: specifies the intelligent cover.</li>.
<Li>Tag: intelligent tagging.</li>.
<Li>FrameTag: intelligent frame-by-frame tagging.</li>.
<Li>Highlight: intelligent highlights</li>.
<Li>DeLogo: intelligent removal.</li>.
<li>Description: large model summarization.</li>

<Li>Dubbing: intelligent dubbing.</li>.
<Li>VideoRemake: specifies video deduplication.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. valid values:.
<Li>Classification: intelligent classification.</li>.
<Li>Cover: specifies the intelligent cover.</li>.
<Li>Tag: intelligent tagging.</li>.
<Li>FrameTag: intelligent frame-by-frame tagging.</li>.
<Li>Highlight: intelligent highlights</li>.
<Li>DeLogo: intelligent removal.</li>.
<li>Description: large model summarization.</li>

<Li>Dubbing: intelligent dubbing.</li>.
<Li>VideoRemake: specifies video deduplication.</li>.
     * @param Type Task type. valid values:.
<Li>Classification: intelligent classification.</li>.
<Li>Cover: specifies the intelligent cover.</li>.
<Li>Tag: intelligent tagging.</li>.
<Li>FrameTag: intelligent frame-by-frame tagging.</li>.
<Li>Highlight: intelligent highlights</li>.
<Li>DeLogo: intelligent removal.</li>.
<li>Description: large model summarization.</li>

<Li>Dubbing: intelligent dubbing.</li>.
<Li>VideoRemake: specifies video deduplication.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Query result of intelligent categorization task in video content analysis, which is valid if task type is `Classification`. 
     * @return ClassificationTask Query result of intelligent categorization task in video content analysis, which is valid if task type is `Classification`.
     */
    public AiAnalysisTaskClassificationResult getClassificationTask() {
        return this.ClassificationTask;
    }

    /**
     * Set Query result of intelligent categorization task in video content analysis, which is valid if task type is `Classification`.
     * @param ClassificationTask Query result of intelligent categorization task in video content analysis, which is valid if task type is `Classification`.
     */
    public void setClassificationTask(AiAnalysisTaskClassificationResult ClassificationTask) {
        this.ClassificationTask = ClassificationTask;
    }

    /**
     * Get Query result of intelligent cover generating task in video content analysis, which is valid if task type is `Cover`. 
     * @return CoverTask Query result of intelligent cover generating task in video content analysis, which is valid if task type is `Cover`.
     */
    public AiAnalysisTaskCoverResult getCoverTask() {
        return this.CoverTask;
    }

    /**
     * Set Query result of intelligent cover generating task in video content analysis, which is valid if task type is `Cover`.
     * @param CoverTask Query result of intelligent cover generating task in video content analysis, which is valid if task type is `Cover`.
     */
    public void setCoverTask(AiAnalysisTaskCoverResult CoverTask) {
        this.CoverTask = CoverTask;
    }

    /**
     * Get Query result of intelligent tagging task in video content analysis, which is valid if task type is `Tag`. 
     * @return TagTask Query result of intelligent tagging task in video content analysis, which is valid if task type is `Tag`.
     */
    public AiAnalysisTaskTagResult getTagTask() {
        return this.TagTask;
    }

    /**
     * Set Query result of intelligent tagging task in video content analysis, which is valid if task type is `Tag`.
     * @param TagTask Query result of intelligent tagging task in video content analysis, which is valid if task type is `Tag`.
     */
    public void setTagTask(AiAnalysisTaskTagResult TagTask) {
        this.TagTask = TagTask;
    }

    /**
     * Get Query result of intelligent frame-specific tagging task in video content analysis, which is valid if task type is `FrameTag`. 
     * @return FrameTagTask Query result of intelligent frame-specific tagging task in video content analysis, which is valid if task type is `FrameTag`.
     */
    public AiAnalysisTaskFrameTagResult getFrameTagTask() {
        return this.FrameTagTask;
    }

    /**
     * Set Query result of intelligent frame-specific tagging task in video content analysis, which is valid if task type is `FrameTag`.
     * @param FrameTagTask Query result of intelligent frame-specific tagging task in video content analysis, which is valid if task type is `FrameTag`.
     */
    public void setFrameTagTask(AiAnalysisTaskFrameTagResult FrameTagTask) {
        this.FrameTagTask = FrameTagTask;
    }

    /**
     * Get The result of a highlight generation task. This parameter is valid if `Type` is `Highlight`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HighlightTask The result of a highlight generation task. This parameter is valid if `Type` is `Highlight`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHighlightResult getHighlightTask() {
        return this.HighlightTask;
    }

    /**
     * Set The result of a highlight generation task. This parameter is valid if `Type` is `Highlight`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HighlightTask The result of a highlight generation task. This parameter is valid if `Type` is `Highlight`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHighlightTask(AiAnalysisTaskHighlightResult HighlightTask) {
        this.HighlightTask = HighlightTask;
    }

    /**
     * Get The query result of an intelligent removal task for video analysis, which is valid when the task type is DeLogo.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeLogoTask The query result of an intelligent removal task for video analysis, which is valid when the task type is DeLogo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskDelLogoResult getDeLogoTask() {
        return this.DeLogoTask;
    }

    /**
     * Set The query result of an intelligent removal task for video analysis, which is valid when the task type is DeLogo.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeLogoTask The query result of an intelligent removal task for video analysis, which is valid when the task type is DeLogo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeLogoTask(AiAnalysisTaskDelLogoResult DeLogoTask) {
        this.DeLogoTask = DeLogoTask;
    }

    /**
     * Get The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentTask The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentTask The query result of a splitting task for video analysis, which is valid when the task type is SegmentRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentTask(AiAnalysisTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HeadTailTask The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HeadTailTask The query result of an opening and closing segments recognition task for video analysis, which is valid when the task type is HeadTailRecognition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeadTailTask(AiAnalysisTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get The query result of a video analysis summarization task, which is valid when the task type is Description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DescriptionTask The query result of a video analysis summarization task, which is valid when the task type is Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskDescriptionResult getDescriptionTask() {
        return this.DescriptionTask;
    }

    /**
     * Set The query result of a video analysis summarization task, which is valid when the task type is Description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DescriptionTask The query result of a video analysis summarization task, which is valid when the task type is Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescriptionTask(AiAnalysisTaskDescriptionResult DescriptionTask) {
        this.DescriptionTask = DescriptionTask;
    }

    /**
     * Get The query result of a landscape-to-portrait task for video analysis, which is valid when the task type is HorizontalToVertical.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HorizontalToVerticalTask The query result of a landscape-to-portrait task for video analysis, which is valid when the task type is HorizontalToVertical.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiAnalysisTaskHorizontalToVerticalResult getHorizontalToVerticalTask() {
        return this.HorizontalToVerticalTask;
    }

    /**
     * Set The query result of a landscape-to-portrait task for video analysis, which is valid when the task type is HorizontalToVertical.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HorizontalToVerticalTask The query result of a landscape-to-portrait task for video analysis, which is valid when the task type is HorizontalToVertical.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHorizontalToVerticalTask(AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask) {
        this.HorizontalToVerticalTask = HorizontalToVerticalTask;
    }

    /**
     * Get The query result of a Dubbing task for video content analysis, which is valid when the task type is Dubbing.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DubbingTask The query result of a Dubbing task for video content analysis, which is valid when the task type is Dubbing.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AiAnalysisTaskDubbingResult getDubbingTask() {
        return this.DubbingTask;
    }

    /**
     * Set The query result of a Dubbing task for video content analysis, which is valid when the task type is Dubbing.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DubbingTask The query result of a Dubbing task for video content analysis, which is valid when the task type is Dubbing.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDubbingTask(AiAnalysisTaskDubbingResult DubbingTask) {
        this.DubbingTask = DubbingTask;
    }

    /**
     * Get The query result of a video content deduplication task, which is valid when the task type is VideoRemake.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VideoRemakeTask The query result of a video content deduplication task, which is valid when the task type is VideoRemake.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AiAnalysisTaskVideoRemakeResult getVideoRemakeTask() {
        return this.VideoRemakeTask;
    }

    /**
     * Set The query result of a video content deduplication task, which is valid when the task type is VideoRemake.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VideoRemakeTask The query result of a video content deduplication task, which is valid when the task type is VideoRemake.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVideoRemakeTask(AiAnalysisTaskVideoRemakeResult VideoRemakeTask) {
        this.VideoRemakeTask = VideoRemakeTask;
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

    }
}

