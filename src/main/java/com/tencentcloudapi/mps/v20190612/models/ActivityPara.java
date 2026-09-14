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

public class ActivityPara extends AbstractModel {

    /**
    * <p>Video transcoding task</p>
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTaskInput TranscodeTask;

    /**
    * <p>Video-to-GIF task</p>
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private AnimatedGraphicTaskInput AnimatedGraphicTask;

    /**
    * <p>Video time point screenshot task</p>
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask;

    /**
    * <p>Video sampling screenshot task</p>
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private SampleSnapshotTaskInput SampleSnapshotTask;

    /**
    * <p>Video image sprite task</p>
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private ImageSpriteTaskInput ImageSpriteTask;

    /**
    * <p>Adaptive bitrate streaming task</p>
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask;

    /**
    * <p>Video content review task</p>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>Video content analysis task</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>Video content recognition task</p>
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>Media quality inspection task</p>
    */
    @SerializedName("QualityControlTask")
    @Expose
    private AiQualityControlTaskInput QualityControlTask;

    /**
    * <p>Conditional judgment of the task.</p>
    */
    @SerializedName("ExecRulesTask")
    @Expose
    private ExecRulesTask ExecRulesTask;

    /**
    * <p>Smart subtitle task.</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>Intelligent erasure task</p>
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskInput SmartEraseTask;

    /**
    * <p>AI Dubbing task.</p>
    */
    @SerializedName("AIDubbingTask")
    @Expose
    private AIDubbingTaskInput AIDubbingTask;

    /**
     * Get <p>Video transcoding task</p> 
     * @return TranscodeTask <p>Video transcoding task</p>
     */
    public TranscodeTaskInput getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>Video transcoding task</p>
     * @param TranscodeTask <p>Video transcoding task</p>
     */
    public void setTranscodeTask(TranscodeTaskInput TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>Video-to-GIF task</p> 
     * @return AnimatedGraphicTask <p>Video-to-GIF task</p>
     */
    public AnimatedGraphicTaskInput getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set <p>Video-to-GIF task</p>
     * @param AnimatedGraphicTask <p>Video-to-GIF task</p>
     */
    public void setAnimatedGraphicTask(AnimatedGraphicTaskInput AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get <p>Video time point screenshot task</p> 
     * @return SnapshotByTimeOffsetTask <p>Video time point screenshot task</p>
     */
    public SnapshotByTimeOffsetTaskInput getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>Video time point screenshot task</p>
     * @param SnapshotByTimeOffsetTask <p>Video time point screenshot task</p>
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>Video sampling screenshot task</p> 
     * @return SampleSnapshotTask <p>Video sampling screenshot task</p>
     */
    public SampleSnapshotTaskInput getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set <p>Video sampling screenshot task</p>
     * @param SampleSnapshotTask <p>Video sampling screenshot task</p>
     */
    public void setSampleSnapshotTask(SampleSnapshotTaskInput SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get <p>Video image sprite task</p> 
     * @return ImageSpriteTask <p>Video image sprite task</p>
     */
    public ImageSpriteTaskInput getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set <p>Video image sprite task</p>
     * @param ImageSpriteTask <p>Video image sprite task</p>
     */
    public void setImageSpriteTask(ImageSpriteTaskInput ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get <p>Adaptive bitrate streaming task</p> 
     * @return AdaptiveDynamicStreamingTask <p>Adaptive bitrate streaming task</p>
     */
    public AdaptiveDynamicStreamingTaskInput getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>Adaptive bitrate streaming task</p>
     * @param AdaptiveDynamicStreamingTask <p>Adaptive bitrate streaming task</p>
     */
    public void setAdaptiveDynamicStreamingTask(AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get <p>Video content review task</p> 
     * @return AiContentReviewTask <p>Video content review task</p>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>Video content review task</p>
     * @param AiContentReviewTask <p>Video content review task</p>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>Video content analysis task</p> 
     * @return AiAnalysisTask <p>Video content analysis task</p>
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>Video content analysis task</p>
     * @param AiAnalysisTask <p>Video content analysis task</p>
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>Video content recognition task</p> 
     * @return AiRecognitionTask <p>Video content recognition task</p>
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>Video content recognition task</p>
     * @param AiRecognitionTask <p>Video content recognition task</p>
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>Media quality inspection task</p> 
     * @return QualityControlTask <p>Media quality inspection task</p>
     */
    public AiQualityControlTaskInput getQualityControlTask() {
        return this.QualityControlTask;
    }

    /**
     * Set <p>Media quality inspection task</p>
     * @param QualityControlTask <p>Media quality inspection task</p>
     */
    public void setQualityControlTask(AiQualityControlTaskInput QualityControlTask) {
        this.QualityControlTask = QualityControlTask;
    }

    /**
     * Get <p>Conditional judgment of the task.</p> 
     * @return ExecRulesTask <p>Conditional judgment of the task.</p>
     */
    public ExecRulesTask getExecRulesTask() {
        return this.ExecRulesTask;
    }

    /**
     * Set <p>Conditional judgment of the task.</p>
     * @param ExecRulesTask <p>Conditional judgment of the task.</p>
     */
    public void setExecRulesTask(ExecRulesTask ExecRulesTask) {
        this.ExecRulesTask = ExecRulesTask;
    }

    /**
     * Get <p>Smart subtitle task.</p> 
     * @return SmartSubtitlesTask <p>Smart subtitle task.</p>
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>Smart subtitle task.</p>
     * @param SmartSubtitlesTask <p>Smart subtitle task.</p>
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>Intelligent erasure task</p> 
     * @return SmartEraseTask <p>Intelligent erasure task</p>
     */
    public SmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>Intelligent erasure task</p>
     * @param SmartEraseTask <p>Intelligent erasure task</p>
     */
    public void setSmartEraseTask(SmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get <p>AI Dubbing task.</p> 
     * @return AIDubbingTask <p>AI Dubbing task.</p>
     */
    public AIDubbingTaskInput getAIDubbingTask() {
        return this.AIDubbingTask;
    }

    /**
     * Set <p>AI Dubbing task.</p>
     * @param AIDubbingTask <p>AI Dubbing task.</p>
     */
    public void setAIDubbingTask(AIDubbingTaskInput AIDubbingTask) {
        this.AIDubbingTask = AIDubbingTask;
    }

    public ActivityPara() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityPara(ActivityPara source) {
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new TranscodeTaskInput(source.TranscodeTask);
        }
        if (source.AnimatedGraphicTask != null) {
            this.AnimatedGraphicTask = new AnimatedGraphicTaskInput(source.AnimatedGraphicTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new SnapshotByTimeOffsetTaskInput(source.SnapshotByTimeOffsetTask);
        }
        if (source.SampleSnapshotTask != null) {
            this.SampleSnapshotTask = new SampleSnapshotTaskInput(source.SampleSnapshotTask);
        }
        if (source.ImageSpriteTask != null) {
            this.ImageSpriteTask = new ImageSpriteTaskInput(source.ImageSpriteTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new AdaptiveDynamicStreamingTaskInput(source.AdaptiveDynamicStreamingTask);
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
        if (source.QualityControlTask != null) {
            this.QualityControlTask = new AiQualityControlTaskInput(source.QualityControlTask);
        }
        if (source.ExecRulesTask != null) {
            this.ExecRulesTask = new ExecRulesTask(source.ExecRulesTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskInput(source.SmartEraseTask);
        }
        if (source.AIDubbingTask != null) {
            this.AIDubbingTask = new AIDubbingTaskInput(source.AIDubbingTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AnimatedGraphicTask.", this.AnimatedGraphicTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "SampleSnapshotTask.", this.SampleSnapshotTask);
        this.setParamObj(map, prefix + "ImageSpriteTask.", this.ImageSpriteTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "QualityControlTask.", this.QualityControlTask);
        this.setParamObj(map, prefix + "ExecRulesTask.", this.ExecRulesTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamObj(map, prefix + "AIDubbingTask.", this.AIDubbingTask);

    }
}

