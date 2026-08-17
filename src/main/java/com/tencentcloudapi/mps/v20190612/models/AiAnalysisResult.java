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
    * Task type. Valid values:
<li>Classification: intelligent classification.</li>
<li>Cover: intelligent cover</li>
<li>Tag: intelligent tagging.</li>
<li>FrameTag: intelligent frame tagging.</li>
<li>Highlight: Intelligent Highlights</li>
<li>DeLogo: intelligent removal.</li>
<li>Description: large model summarization.</li>
<li>Dubbing: Intelligent Dubbing</li>
<li>VideoRemake: Video deduplication</li>
<li>VideoComprehension: video (audio) recognition.</li>
<li>Cutout: Video matting</li>
<li>Reel: intelligent video editing.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("ClassificationTask")
    @Expose
    private AiAnalysisTaskClassificationResult ClassificationTask;

    /**
    * 
    */
    @SerializedName("CoverTask")
    @Expose
    private AiAnalysisTaskCoverResult CoverTask;

    /**
    * 
    */
    @SerializedName("TagTask")
    @Expose
    private AiAnalysisTaskTagResult TagTask;

    /**
    * 
    */
    @SerializedName("FrameTagTask")
    @Expose
    private AiAnalysisTaskFrameTagResult FrameTagTask;

    /**
    * 
    */
    @SerializedName("HighlightTask")
    @Expose
    private AiAnalysisTaskHighlightResult HighlightTask;

    /**
    * 
    */
    @SerializedName("DeLogoTask")
    @Expose
    private AiAnalysisTaskDelLogoResult DeLogoTask;

    /**
    * 
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiAnalysisTaskSegmentResult SegmentTask;

    /**
    * 
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiAnalysisTaskHeadTailResult HeadTailTask;

    /**
    * 
    */
    @SerializedName("DescriptionTask")
    @Expose
    private AiAnalysisTaskDescriptionResult DescriptionTask;

    /**
    * 
    */
    @SerializedName("HorizontalToVerticalTask")
    @Expose
    private AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask;

    /**
    * 
    */
    @SerializedName("DubbingTask")
    @Expose
    private AiAnalysisTaskDubbingResult DubbingTask;

    /**
    * 
    */
    @SerializedName("VideoRemakeTask")
    @Expose
    private AiAnalysisTaskVideoRemakeResult VideoRemakeTask;

    /**
    * 
    */
    @SerializedName("VideoComprehensionTask")
    @Expose
    private AiAnalysisTaskVideoComprehensionResult VideoComprehensionTask;

    /**
    * 
    */
    @SerializedName("CutoutTask")
    @Expose
    private AiAnalysisTaskCutoutResult CutoutTask;

    /**
    * 
    */
    @SerializedName("ReelTask")
    @Expose
    private AiAnalysisTaskReelResult ReelTask;

    /**
     * Get Task type. Valid values:
<li>Classification: intelligent classification.</li>
<li>Cover: intelligent cover</li>
<li>Tag: intelligent tagging.</li>
<li>FrameTag: intelligent frame tagging.</li>
<li>Highlight: Intelligent Highlights</li>
<li>DeLogo: intelligent removal.</li>
<li>Description: large model summarization.</li>
<li>Dubbing: Intelligent Dubbing</li>
<li>VideoRemake: Video deduplication</li>
<li>VideoComprehension: video (audio) recognition.</li>
<li>Cutout: Video matting</li>
<li>Reel: intelligent video editing.</li> 
     * @return Type Task type. Valid values:
<li>Classification: intelligent classification.</li>
<li>Cover: intelligent cover</li>
<li>Tag: intelligent tagging.</li>
<li>FrameTag: intelligent frame tagging.</li>
<li>Highlight: Intelligent Highlights</li>
<li>DeLogo: intelligent removal.</li>
<li>Description: large model summarization.</li>
<li>Dubbing: Intelligent Dubbing</li>
<li>VideoRemake: Video deduplication</li>
<li>VideoComprehension: video (audio) recognition.</li>
<li>Cutout: Video matting</li>
<li>Reel: intelligent video editing.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>Classification: intelligent classification.</li>
<li>Cover: intelligent cover</li>
<li>Tag: intelligent tagging.</li>
<li>FrameTag: intelligent frame tagging.</li>
<li>Highlight: Intelligent Highlights</li>
<li>DeLogo: intelligent removal.</li>
<li>Description: large model summarization.</li>
<li>Dubbing: Intelligent Dubbing</li>
<li>VideoRemake: Video deduplication</li>
<li>VideoComprehension: video (audio) recognition.</li>
<li>Cutout: Video matting</li>
<li>Reel: intelligent video editing.</li>
     * @param Type Task type. Valid values:
<li>Classification: intelligent classification.</li>
<li>Cover: intelligent cover</li>
<li>Tag: intelligent tagging.</li>
<li>FrameTag: intelligent frame tagging.</li>
<li>Highlight: Intelligent Highlights</li>
<li>DeLogo: intelligent removal.</li>
<li>Description: large model summarization.</li>
<li>Dubbing: Intelligent Dubbing</li>
<li>VideoRemake: Video deduplication</li>
<li>VideoComprehension: video (audio) recognition.</li>
<li>Cutout: Video matting</li>
<li>Reel: intelligent video editing.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return ClassificationTask 
     */
    public AiAnalysisTaskClassificationResult getClassificationTask() {
        return this.ClassificationTask;
    }

    /**
     * Set 
     * @param ClassificationTask 
     */
    public void setClassificationTask(AiAnalysisTaskClassificationResult ClassificationTask) {
        this.ClassificationTask = ClassificationTask;
    }

    /**
     * Get  
     * @return CoverTask 
     */
    public AiAnalysisTaskCoverResult getCoverTask() {
        return this.CoverTask;
    }

    /**
     * Set 
     * @param CoverTask 
     */
    public void setCoverTask(AiAnalysisTaskCoverResult CoverTask) {
        this.CoverTask = CoverTask;
    }

    /**
     * Get  
     * @return TagTask 
     */
    public AiAnalysisTaskTagResult getTagTask() {
        return this.TagTask;
    }

    /**
     * Set 
     * @param TagTask 
     */
    public void setTagTask(AiAnalysisTaskTagResult TagTask) {
        this.TagTask = TagTask;
    }

    /**
     * Get  
     * @return FrameTagTask 
     */
    public AiAnalysisTaskFrameTagResult getFrameTagTask() {
        return this.FrameTagTask;
    }

    /**
     * Set 
     * @param FrameTagTask 
     */
    public void setFrameTagTask(AiAnalysisTaskFrameTagResult FrameTagTask) {
        this.FrameTagTask = FrameTagTask;
    }

    /**
     * Get  
     * @return HighlightTask 
     */
    public AiAnalysisTaskHighlightResult getHighlightTask() {
        return this.HighlightTask;
    }

    /**
     * Set 
     * @param HighlightTask 
     */
    public void setHighlightTask(AiAnalysisTaskHighlightResult HighlightTask) {
        this.HighlightTask = HighlightTask;
    }

    /**
     * Get  
     * @return DeLogoTask 
     */
    public AiAnalysisTaskDelLogoResult getDeLogoTask() {
        return this.DeLogoTask;
    }

    /**
     * Set 
     * @param DeLogoTask 
     */
    public void setDeLogoTask(AiAnalysisTaskDelLogoResult DeLogoTask) {
        this.DeLogoTask = DeLogoTask;
    }

    /**
     * Get  
     * @return SegmentTask 
     */
    public AiAnalysisTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set 
     * @param SegmentTask 
     */
    public void setSegmentTask(AiAnalysisTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get  
     * @return HeadTailTask 
     */
    public AiAnalysisTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set 
     * @param HeadTailTask 
     */
    public void setHeadTailTask(AiAnalysisTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get  
     * @return DescriptionTask 
     */
    public AiAnalysisTaskDescriptionResult getDescriptionTask() {
        return this.DescriptionTask;
    }

    /**
     * Set 
     * @param DescriptionTask 
     */
    public void setDescriptionTask(AiAnalysisTaskDescriptionResult DescriptionTask) {
        this.DescriptionTask = DescriptionTask;
    }

    /**
     * Get  
     * @return HorizontalToVerticalTask 
     */
    public AiAnalysisTaskHorizontalToVerticalResult getHorizontalToVerticalTask() {
        return this.HorizontalToVerticalTask;
    }

    /**
     * Set 
     * @param HorizontalToVerticalTask 
     */
    public void setHorizontalToVerticalTask(AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask) {
        this.HorizontalToVerticalTask = HorizontalToVerticalTask;
    }

    /**
     * Get  
     * @return DubbingTask 
     */
    public AiAnalysisTaskDubbingResult getDubbingTask() {
        return this.DubbingTask;
    }

    /**
     * Set 
     * @param DubbingTask 
     */
    public void setDubbingTask(AiAnalysisTaskDubbingResult DubbingTask) {
        this.DubbingTask = DubbingTask;
    }

    /**
     * Get  
     * @return VideoRemakeTask 
     */
    public AiAnalysisTaskVideoRemakeResult getVideoRemakeTask() {
        return this.VideoRemakeTask;
    }

    /**
     * Set 
     * @param VideoRemakeTask 
     */
    public void setVideoRemakeTask(AiAnalysisTaskVideoRemakeResult VideoRemakeTask) {
        this.VideoRemakeTask = VideoRemakeTask;
    }

    /**
     * Get  
     * @return VideoComprehensionTask 
     */
    public AiAnalysisTaskVideoComprehensionResult getVideoComprehensionTask() {
        return this.VideoComprehensionTask;
    }

    /**
     * Set 
     * @param VideoComprehensionTask 
     */
    public void setVideoComprehensionTask(AiAnalysisTaskVideoComprehensionResult VideoComprehensionTask) {
        this.VideoComprehensionTask = VideoComprehensionTask;
    }

    /**
     * Get  
     * @return CutoutTask 
     */
    public AiAnalysisTaskCutoutResult getCutoutTask() {
        return this.CutoutTask;
    }

    /**
     * Set 
     * @param CutoutTask 
     */
    public void setCutoutTask(AiAnalysisTaskCutoutResult CutoutTask) {
        this.CutoutTask = CutoutTask;
    }

    /**
     * Get  
     * @return ReelTask 
     */
    public AiAnalysisTaskReelResult getReelTask() {
        return this.ReelTask;
    }

    /**
     * Set 
     * @param ReelTask 
     */
    public void setReelTask(AiAnalysisTaskReelResult ReelTask) {
        this.ReelTask = ReelTask;
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

    }
}

